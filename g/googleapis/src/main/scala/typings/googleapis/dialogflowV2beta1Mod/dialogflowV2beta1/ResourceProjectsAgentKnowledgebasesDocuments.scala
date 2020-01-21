package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Knowledgebases$Documents")
@js.native
class ResourceProjectsAgentKnowledgebasesDocuments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.documents.create
    * @desc Creates a new document.  Operation <response: Document, metadata:
    * KnowledgeOperationMetadata>
    * @alias dialogflow.projects.agent.knowledgeBases.documents.create
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
  def create(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsCreate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.documents.delete
    * @desc Deletes the specified document.  Operation <response:
    * google.protobuf.Empty,            metadata: KnowledgeOperationMetadata>
    * @alias dialogflow.projects.agent.knowledgeBases.documents.delete
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
  def delete(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsDelete,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.documents.get
    * @desc Retrieves the specified document.
    * @alias dialogflow.projects.agent.knowledgeBases.documents.get
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
  def get(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Document] = js.native
  def get(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Document]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsGet,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Document],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Document]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Document] = js.native
  def get(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Document]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.documents.list
    * @desc Returns the list of all documents of the knowledge base.
    * @alias dialogflow.projects.agent.knowledgeBases.documents.list
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
  def list(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsList,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListDocumentsResponse]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.documents.patch
    * @desc Updates the specified document. Operation <response: Document,
    * metadata: KnowledgeOperationMetadata>
    * @alias dialogflow.projects.agent.knowledgeBases.documents.patch
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
  def patch(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsPatch): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsPatch,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsPatch,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.documents.reload
    * @desc Reloads the specified document from its specified source,
    * content_uri or content. The previously loaded content of the document
    * will be deleted. Note: Even when the content of the document has not
    * changed, there still may be side effects because of internal
    * implementation changes. Operation <response: Document, metadata:
    * KnowledgeOperationMetadata>
    * @alias dialogflow.projects.agent.knowledgeBases.documents.reload
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
  def reload(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsReload): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def reload(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsReload,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def reload(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsReload,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def reload(params: ParamsResourceProjectsAgentKnowledgebasesDocumentsReload, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def reload(
    params: ParamsResourceProjectsAgentKnowledgebasesDocumentsReload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}

