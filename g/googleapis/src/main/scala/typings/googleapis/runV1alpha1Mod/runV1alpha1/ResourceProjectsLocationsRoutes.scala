package typings.googleapis.runV1alpha1Mod.runV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Projects$Locations$Routes")
@js.native
class ResourceProjectsLocationsRoutes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * run.projects.locations.routes.get
    * @desc Rpc to get information about a route.
    * @alias run.projects.locations.routes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the route being retrieved. If needed, replace {namespace_id} with the project ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRoute] = js.native
  def get(callback: BodyResponseCallback[SchemaRoute]): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRoutesGet): GaxiosPromise[SchemaRoute] = js.native
  def get(params: ParamsResourceProjectsLocationsRoutesGet, callback: BodyResponseCallback[SchemaRoute]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRoutesGet,
    options: BodyResponseCallback[SchemaRoute],
    callback: BodyResponseCallback[SchemaRoute]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRoutesGet, options: MethodOptions): GaxiosPromise[SchemaRoute] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRoutesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoute]
  ): Unit = js.native
  /**
    * run.projects.locations.routes.list
    * @desc Rpc to list routes.
    * @alias run.projects.locations.routes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.continue Optional encoded string to continue paging.
    * @param {string=} params.fieldSelector Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    * @param {boolean=} params.includeUninitialized Not currently used by Cloud Run.
    * @param {string=} params.labelSelector Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    * @param {integer=} params.limit The maximum number of records that should be returned.
    * @param {string} params.parent The project ID or project number from which the routes should be listed.
    * @param {string=} params.resourceVersion The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    * @param {boolean=} params.watch Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListRoutesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRoutesResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRoutesList): GaxiosPromise[SchemaListRoutesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRoutesList,
    callback: BodyResponseCallback[SchemaListRoutesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRoutesList,
    options: BodyResponseCallback[SchemaListRoutesResponse],
    callback: BodyResponseCallback[SchemaListRoutesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRoutesList, options: MethodOptions): GaxiosPromise[SchemaListRoutesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRoutesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRoutesResponse]
  ): Unit = js.native
}

