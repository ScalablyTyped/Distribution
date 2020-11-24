package typings.googleapis.runV1alpha1Mod.runV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Projects$Locations$Revisions")
@js.native
class ResourceProjectsLocationsRevisions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * run.projects.locations.revisions.delete
    * @desc Rpc to delete a revision.
    * @alias run.projects.locations.revisions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.apiVersion Cloud Run currently ignores this parameter.
    * @param {string=} params.kind Cloud Run currently ignores this parameter.
    * @param {string} params.name The name of the revision being deleted. If needed, replace {namespace_id} with the project ID.
    * @param {boolean=} params.orphanDependents Deprecated. Specifies the cascade behavior on delete. Cloud Run only supports cascading behavior, so this must be false. This attribute is deprecated, and is now replaced with PropagationPolicy See https://github.com/kubernetes/kubernetes/issues/46659 for more info.
    * @param {string=} params.propagationPolicy Specifies the propagation policy of delete. Cloud Run currently ignores this setting, and deletes in the background. Please see kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more information.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsRevisionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRevisionsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRevisionsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsRevisionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRevisionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * run.projects.locations.revisions.get
    * @desc Rpc to get information about a revision.
    * @alias run.projects.locations.revisions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the revision being retrieved. If needed, replace {namespace_id} with the project ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRevision] = js.native
  def get(callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def get(params: ParamsResourceProjectsLocationsRevisionsGet): GaxiosPromise[SchemaRevision] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRevisionsGet,
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRevisionsGet,
    options: BodyResponseCallback[SchemaRevision],
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRevisionsGet, options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRevisionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  
  /**
    * run.projects.locations.revisions.list
    * @desc Rpc to list revisions.
    * @alias run.projects.locations.revisions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.continue Optional encoded string to continue paging.
    * @param {string=} params.fieldSelector Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    * @param {boolean=} params.includeUninitialized Not currently used by Cloud Run.
    * @param {string=} params.labelSelector Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    * @param {integer=} params.limit The maximum number of records that should be returned.
    * @param {string} params.parent The project ID or project number from which the revisions should be listed.
    * @param {string=} params.resourceVersion The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    * @param {boolean=} params.watch Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListRevisionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRevisionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListRevisionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRevisionsList): GaxiosPromise[SchemaListRevisionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRevisionsList,
    callback: BodyResponseCallback[SchemaListRevisionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRevisionsList,
    options: BodyResponseCallback[SchemaListRevisionsResponse],
    callback: BodyResponseCallback[SchemaListRevisionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRevisionsList, options: MethodOptions): GaxiosPromise[SchemaListRevisionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRevisionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRevisionsResponse]
  ): Unit = js.native
}
