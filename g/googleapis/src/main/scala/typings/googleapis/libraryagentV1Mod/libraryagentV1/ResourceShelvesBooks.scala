package typings.googleapis.libraryagentV1Mod.libraryagentV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/libraryagent/v1", "libraryagent_v1.Resource$Shelves$Books")
@js.native
class ResourceShelvesBooks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * libraryagent.shelves.books.borrow
    * @desc Borrow a book from the library. Returns the book if it is borrowed
    * successfully. Returns NOT_FOUND if the book does not exist in the
    * library. Returns quota exceeded error if the amount of books borrowed
    * exceeds allocation quota in any dimensions.
    * @alias libraryagent.shelves.books.borrow
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the book to borrow.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def borrow(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def borrow(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]): Unit = js.native
  def borrow(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def borrow(params: ParamsResourceShelvesBooksBorrow): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def borrow(
    params: ParamsResourceShelvesBooksBorrow,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def borrow(
    params: ParamsResourceShelvesBooksBorrow,
    options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book],
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def borrow(params: ParamsResourceShelvesBooksBorrow, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def borrow(
    params: ParamsResourceShelvesBooksBorrow,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  /**
    * libraryagent.shelves.books.get
    * @desc Gets a book. Returns NOT_FOUND if the book does not exist.
    * @alias libraryagent.shelves.books.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the book to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def get(params: ParamsResourceShelvesBooksGet): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def get(
    params: ParamsResourceShelvesBooksGet,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def get(
    params: ParamsResourceShelvesBooksGet,
    options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book],
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def get(params: ParamsResourceShelvesBooksGet, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def get(
    params: ParamsResourceShelvesBooksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  /**
    * libraryagent.shelves.books.list
    * @desc Lists books in a shelf. The order is unspecified but deterministic.
    * Newly created books will not necessarily be added to the end of this
    * list. Returns NOT_FOUND if the shelf does not exist.
    * @alias libraryagent.shelves.books.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Requested page size. Server may return fewer books than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListBooksResponse.next_page_token. returned from the previous call to `ListBooks` method.
    * @param {string} params.parent The name of the shelf whose books we'd like to list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
  def list(params: ParamsResourceShelvesBooksList): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
  def list(
    params: ParamsResourceShelvesBooksList,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceShelvesBooksList,
    options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse],
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceShelvesBooksList, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1ListBooksResponse] = js.native
  def list(
    params: ParamsResourceShelvesBooksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1ListBooksResponse]
  ): Unit = js.native
  /**
    * libraryagent.shelves.books.return
    * @desc Return a book to the library. Returns the book if it is returned to
    * the library successfully. Returns error if the book does not belong to
    * the library or the users didn't borrow before.
    * @alias libraryagent.shelves.books.return
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the book to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `return`(): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def `return`(callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]): Unit = js.native
  def `return`(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def `return`(params: ParamsResourceShelvesBooksReturn): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def `return`(
    params: ParamsResourceShelvesBooksReturn,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def `return`(
    params: ParamsResourceShelvesBooksReturn,
    options: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book],
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
  ): Unit = js.native
  def `return`(params: ParamsResourceShelvesBooksReturn, options: MethodOptions): GaxiosPromise[SchemaGoogleExampleLibraryagentV1Book] = js.native
  def `return`(
    params: ParamsResourceShelvesBooksReturn,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleExampleLibraryagentV1Book]
  ): Unit = js.native
}

