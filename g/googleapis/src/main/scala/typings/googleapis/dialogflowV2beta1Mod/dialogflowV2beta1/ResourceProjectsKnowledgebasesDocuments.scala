package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Knowledgebases$Documents")
@js.native
class ResourceProjectsKnowledgebasesDocuments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.create
    * @desc Creates a new document.  Operation <response: Document, metadata:
    * KnowledgeOperationMetadata>
    * @alias dialogflow.projects.knowledgeBases.documents.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The knoweldge base to create a document for. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`.
    * @param {().GoogleCloudDialogflowV2beta1Document} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsKnowledgebasesDocumentsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsKnowledgebasesDocumentsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsKnowledgebasesDocumentsCreate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsKnowledgebasesDocumentsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsKnowledgebasesDocumentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.delete
    * @desc Deletes the specified document.  Operation <response:
    * google.protobuf.Empty,            metadata: KnowledgeOperationMetadata>
    * @alias dialogflow.projects.knowledgeBases.documents.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the document to delete. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>/documents/<Document ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsKnowledgebasesDocumentsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsKnowledgebasesDocumentsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsKnowledgebasesDocumentsDelete,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsKnowledgebasesDocumentsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsKnowledgebasesDocumentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.get
    * @desc Retrieves the specified document.
    * @alias dialogflow.projects.knowledgeBases.documents.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the document to retrieve. Format `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>/documents/<Document ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Document] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Document]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Document] = js.native
  def get(params: ParamsResourceProjectsKnowledgebasesDocumentsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Document] = js.native
  def get(
    params: ParamsResourceProjectsKnowledgebasesDocumentsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Document]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsKnowledgebasesDocumentsGet,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Document],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Document]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsKnowledgebasesDocumentsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Document] = js.native
  def get(
    params: ParamsResourceProjectsKnowledgebasesDocumentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Document]
  ): Unit = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.list
    * @desc Returns the list of all documents of the knowledge base.
    * @alias dialogflow.projects.knowledgeBases.documents.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 10 and at most 100.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The knowledge base to list all documents for. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse] = js.native
  def list(params: ParamsResourceProjectsKnowledgebasesDocumentsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsKnowledgebasesDocumentsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsKnowledgebasesDocumentsList,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsKnowledgebasesDocumentsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsKnowledgebasesDocumentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse]
  ): Unit = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.patch
    * @desc Updates the specified document. Operation <response: Document,
    * metadata: KnowledgeOperationMetadata>
    * @alias dialogflow.projects.knowledgeBases.documents.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The document resource name. The name must be empty when creating a document. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>/documents/<Document ID>`.
    * @param {string=} params.updateMask Optional. Not specified means `update all`. Currently, only `display_name` can be updated, an InvalidArgument will be returned for attempting to update other fields.
    * @param {().GoogleCloudDialogflowV2beta1Document} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(params: ParamsResourceProjectsKnowledgebasesDocumentsPatch): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsKnowledgebasesDocumentsPatch,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsKnowledgebasesDocumentsPatch,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsKnowledgebasesDocumentsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsKnowledgebasesDocumentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.reload
    * @desc Reloads the specified document from its specified source,
    * content_uri or content. The previously loaded content of the document
    * will be deleted. Note: Even when the content of the document has not
    * changed, there still may be side effects because of internal
    * implementation changes. Operation <response: Document, metadata:
    * KnowledgeOperationMetadata>
    * @alias dialogflow.projects.knowledgeBases.documents.reload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the document to reload. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>/documents/<Document ID>`
    * @param {().GoogleCloudDialogflowV2beta1ReloadDocumentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reload(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def reload(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def reload(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def reload(params: ParamsResourceProjectsKnowledgebasesDocumentsReload): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def reload(
    params: ParamsResourceProjectsKnowledgebasesDocumentsReload,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def reload(
    params: ParamsResourceProjectsKnowledgebasesDocumentsReload,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def reload(params: ParamsResourceProjectsKnowledgebasesDocumentsReload, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def reload(
    params: ParamsResourceProjectsKnowledgebasesDocumentsReload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}

