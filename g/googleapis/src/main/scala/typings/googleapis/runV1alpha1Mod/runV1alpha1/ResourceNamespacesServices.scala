package typings.googleapis.runV1alpha1Mod.runV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Namespaces$Services")
@js.native
class ResourceNamespacesServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * run.namespaces.services.create
    * @desc Rpc to create a service.
    * @alias run.namespaces.services.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project ID or project number in which this service should be created.
    * @param {().Service} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaService] = js.native
  def create(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def create(params: ParamsResourceNamespacesServicesCreate): GaxiosPromise[SchemaService] = js.native
  def create(params: ParamsResourceNamespacesServicesCreate, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def create(
    params: ParamsResourceNamespacesServicesCreate,
    options: BodyResponseCallback[SchemaService],
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  def create(params: ParamsResourceNamespacesServicesCreate, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def create(
    params: ParamsResourceNamespacesServicesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  
  /**
    * run.namespaces.services.delete
    * @desc Rpc to delete a service. This will cause the Service to stop
    * serving traffic and will delete the child entities like Routes,
    * Configurations and Revisions.
    * @alias run.namespaces.services.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.apiVersion Cloud Run currently ignores this parameter.
    * @param {string=} params.kind Cloud Run currently ignores this parameter.
    * @param {string} params.name The name of the service being deleted. If needed, replace {namespace_id} with the project ID.
    * @param {boolean=} params.orphanDependents Deprecated. Specifies the cascade behavior on delete. Cloud Run only supports cascading behavior, so this must be false. This attribute is deprecated, and is now replaced with PropagationPolicy See https://github.com/kubernetes/kubernetes/issues/46659 for more info.
    * @param {string=} params.propagationPolicy Specifies the propagation policy of delete. Cloud Run currently ignores this setting, and deletes in the background. Please see kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more information.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceNamespacesServicesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceNamespacesServicesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceNamespacesServicesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceNamespacesServicesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceNamespacesServicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * run.namespaces.services.get
    * @desc Rpc to get information about a service.
    * @alias run.namespaces.services.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the service being retrieved. If needed, replace {namespace_id} with the project ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaService] = js.native
  def get(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceNamespacesServicesGet): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceNamespacesServicesGet, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(
    params: ParamsResourceNamespacesServicesGet,
    options: BodyResponseCallback[SchemaService],
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  def get(params: ParamsResourceNamespacesServicesGet, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(
    params: ParamsResourceNamespacesServicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  
  /**
    * run.namespaces.services.list
    * @desc Rpc to list services.
    * @alias run.namespaces.services.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.continue Optional encoded string to continue paging.
    * @param {string=} params.fieldSelector Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    * @param {boolean=} params.includeUninitialized Not currently used by Cloud Run.
    * @param {string=} params.labelSelector Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    * @param {integer=} params.limit The maximum number of records that should be returned.
    * @param {string} params.parent The project ID or project number from which the services should be listed.
    * @param {string=} params.resourceVersion The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    * @param {boolean=} params.watch Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServicesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(params: ParamsResourceNamespacesServicesList): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(
    params: ParamsResourceNamespacesServicesList,
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceNamespacesServicesList,
    options: BodyResponseCallback[SchemaListServicesResponse],
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceNamespacesServicesList, options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(
    params: ParamsResourceNamespacesServicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  
  /**
    * run.namespaces.services.replaceService
    * @desc Rpc to replace a service.  Only the spec and metadata labels and
    * annotations are modifiable. After the Update request, Cloud Run will work
    * to make the 'status' match the requested 'spec'.  May provide
    * metadata.resourceVersion to enforce update from last read for optimistic
    * concurrency control.
    * @alias run.namespaces.services.replaceService
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the service being replaced. If needed, replace {namespace_id} with the project ID.
    * @param {().Service} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def replaceService(): GaxiosPromise[SchemaService] = js.native
  def replaceService(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def replaceService(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def replaceService(params: ParamsResourceNamespacesServicesReplaceservice): GaxiosPromise[SchemaService] = js.native
  def replaceService(
    params: ParamsResourceNamespacesServicesReplaceservice,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  def replaceService(
    params: ParamsResourceNamespacesServicesReplaceservice,
    options: BodyResponseCallback[SchemaService],
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  def replaceService(params: ParamsResourceNamespacesServicesReplaceservice, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def replaceService(
    params: ParamsResourceNamespacesServicesReplaceservice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
}
