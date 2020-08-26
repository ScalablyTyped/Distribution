package typings.googleapis.datastoreV1Mod.datastoreV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/datastore/v1", "datastore_v1.Resource$Projects$Indexes")
@js.native
class ResourceProjectsIndexes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * datastore.projects.indexes.get
    * @desc Gets an index.
    * @alias datastore.projects.indexes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.indexId The resource ID of the index to get.
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleDatastoreAdminV1Index] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleDatastoreAdminV1Index]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleDatastoreAdminV1Index] = js.native
  def get(params: ParamsResourceProjectsIndexesGet): GaxiosPromise[SchemaGoogleDatastoreAdminV1Index] = js.native
  def get(
    params: ParamsResourceProjectsIndexesGet,
    callback: BodyResponseCallback[SchemaGoogleDatastoreAdminV1Index]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsIndexesGet,
    options: BodyResponseCallback[SchemaGoogleDatastoreAdminV1Index],
    callback: BodyResponseCallback[SchemaGoogleDatastoreAdminV1Index]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsIndexesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleDatastoreAdminV1Index] = js.native
  def get(
    params: ParamsResourceProjectsIndexesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleDatastoreAdminV1Index]
  ): Unit = js.native
  /**
    * datastore.projects.indexes.list
    * @desc Lists the indexes that match the specified filters.  Datastore uses
    * an eventually consistent query to fetch the list of indexes and may
    * occasionally return stale results.
    * @alias datastore.projects.indexes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter
    * @param {integer=} params.pageSize The maximum number of items to return.  If zero, then all results will be returned.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleDatastoreAdminV1ListIndexesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleDatastoreAdminV1ListIndexesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleDatastoreAdminV1ListIndexesResponse] = js.native
  def list(params: ParamsResourceProjectsIndexesList): GaxiosPromise[SchemaGoogleDatastoreAdminV1ListIndexesResponse] = js.native
  def list(
    params: ParamsResourceProjectsIndexesList,
    callback: BodyResponseCallback[SchemaGoogleDatastoreAdminV1ListIndexesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsIndexesList,
    options: BodyResponseCallback[SchemaGoogleDatastoreAdminV1ListIndexesResponse],
    callback: BodyResponseCallback[SchemaGoogleDatastoreAdminV1ListIndexesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsIndexesList, options: MethodOptions): GaxiosPromise[SchemaGoogleDatastoreAdminV1ListIndexesResponse] = js.native
  def list(
    params: ParamsResourceProjectsIndexesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleDatastoreAdminV1ListIndexesResponse]
  ): Unit = js.native
}

