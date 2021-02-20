package typings.googleapis.docsV1Mod.docsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/docs/v1", "docs_v1.Resource$Documents")
@js.native
class ResourceDocuments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * docs.documents.batchUpdate
    * @desc Applies one or more updates to the document.  Each request is
    * validated before being applied. If any request is not valid, then the
    * entire request will fail and nothing will be applied.  Some requests have
    * replies to give you some information about how they are applied. Other
    * requests do not need to return information; these each return an empty
    * reply. The order of replies matches that of the requests.  For example,
    * suppose you call batchUpdate with four updates, and only the third one
    * returns information. The response would have two empty replies, the reply
    * to the third request, and another empty reply, in that order.  Because
    * other users may be editing the document, the document might not exactly
    * reflect your changes: your changes may be altered with respect to
    * collaborator changes. If there are no collaborators, the document should
    * reflect your changes. In any case, the updates in your request are
    * guaranteed to be applied together atomically.
    * @alias docs.documents.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.documentId The ID of the document to update.
    * @param {().BatchUpdateDocumentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdateDocumentResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdateDocumentResponse]): Unit = js.native
  def batchUpdate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBatchUpdateDocumentResponse] = js.native
  def batchUpdate(params: ParamsResourceDocumentsBatchupdate): GaxiosPromise[SchemaBatchUpdateDocumentResponse] = js.native
  def batchUpdate(
    params: ParamsResourceDocumentsBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdateDocumentResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceDocumentsBatchupdate,
    options: BodyResponseCallback[SchemaBatchUpdateDocumentResponse],
    callback: BodyResponseCallback[SchemaBatchUpdateDocumentResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceDocumentsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateDocumentResponse] = js.native
  def batchUpdate(
    params: ParamsResourceDocumentsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateDocumentResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * docs.documents.create
    * @desc Creates a blank document using the title given in the request.
    * Other fields in the request, including any provided content, are ignored.
    * Returns the created document.
    * @alias docs.documents.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Document} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaDocument] = js.native
  def create(callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def create(params: ParamsResourceDocumentsCreate): GaxiosPromise[SchemaDocument] = js.native
  def create(params: ParamsResourceDocumentsCreate, callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def create(
    params: ParamsResourceDocumentsCreate,
    options: BodyResponseCallback[SchemaDocument],
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def create(params: ParamsResourceDocumentsCreate, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def create(
    params: ParamsResourceDocumentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  
  /**
    * docs.documents.get
    * @desc Gets the latest version of the specified document.
    * @alias docs.documents.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.documentId The ID of the document to retrieve.
    * @param {string=} params.suggestionsViewMode The suggestions view mode to apply to the document. This allows viewing the document with all suggestions inline, accepted or rejected. If one is not specified, DEFAULT_FOR_CURRENT_ACCESS is used.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDocument] = js.native
  def get(callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def get(params: ParamsResourceDocumentsGet): GaxiosPromise[SchemaDocument] = js.native
  def get(params: ParamsResourceDocumentsGet, callback: BodyResponseCallback[SchemaDocument]): Unit = js.native
  def get(
    params: ParamsResourceDocumentsGet,
    options: BodyResponseCallback[SchemaDocument],
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
  def get(params: ParamsResourceDocumentsGet, options: MethodOptions): GaxiosPromise[SchemaDocument] = js.native
  def get(
    params: ParamsResourceDocumentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDocument]
  ): Unit = js.native
}
