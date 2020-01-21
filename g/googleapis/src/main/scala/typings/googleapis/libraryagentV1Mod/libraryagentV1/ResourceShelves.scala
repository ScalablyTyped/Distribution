package typings.googleapis.libraryagentV1Mod.libraryagentV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Resource$Shelves")
@js.native
class ResourceShelves protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var books: ResourceShelvesBooks = js.native
  var context: APIRequestContext = js.native
  /**
    * libraryagent.shelves.get
    * @desc Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
    * @alias libraryagent.shelves.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the shelf to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]): Unit = js.native
  def get(params: ParamsResourceShelvesGet): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
  def get(
    params: ParamsResourceShelvesGet,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]
  ): Unit = js.native
  def get(
    params: ParamsResourceShelvesGet,
    options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf],
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]
  ): Unit = js.native
  def get(params: ParamsResourceShelvesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Shelf] = js.native
  def get(
    params: ParamsResourceShelvesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Shelf]
  ): Unit = js.native
  /**
    * libraryagent.shelves.list
    * @desc Lists shelves. The order is unspecified but deterministic. Newly
    * created shelves will not necessarily be added to the end of this list.
    * @alias libraryagent.shelves.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Requested page size. Server may return fewer shelves than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListShelvesResponse.next_page_token returned from the previous call to `ListShelves` method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]): Unit = js.native
  def list(params: ParamsResourceShelvesList): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
  def list(
    params: ParamsResourceShelvesList,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceShelvesList,
    options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse],
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceShelvesList, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListShelvesResponse] = js.native
  def list(
    params: ParamsResourceShelvesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListShelvesResponse]
  ): Unit = js.native
}

