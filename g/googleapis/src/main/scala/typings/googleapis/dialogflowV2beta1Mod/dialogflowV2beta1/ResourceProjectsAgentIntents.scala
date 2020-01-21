package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Intents")
@js.native
class ResourceProjectsAgentIntents protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dialogflow.projects.agent.intents.batchDelete
    * @desc Deletes intents in the specified agent.  Operation <response:
    * google.protobuf.Empty>
    * @alias dialogflow.projects.agent.intents.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the agent to delete all entities types for. Format: `projects/<Project ID>/agent`.
    * @param {().GoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchDelete(params: ParamsResourceProjectsAgentIntentsBatchdelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentIntentsBatchdelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentIntentsBatchdelete,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceProjectsAgentIntentsBatchdelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentIntentsBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.intents.batchUpdate
    * @desc Updates/Creates multiple intents in the specified agent.  Operation
    * <response: BatchUpdateIntentsResponse>
    * @alias dialogflow.projects.agent.intents.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the agent to update or create intents in. Format: `projects/<Project ID>/agent`.
    * @param {().GoogleCloudDialogflowV2beta1BatchUpdateIntentsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchUpdate(params: ParamsResourceProjectsAgentIntentsBatchupdate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentIntentsBatchupdate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentIntentsBatchupdate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceProjectsAgentIntentsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentIntentsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.intents.create
    * @desc Creates an intent in the specified agent.
    * @alias dialogflow.projects.agent.intents.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.intentView Optional. The resource view to apply to the returned intent.
    * @param {string=} params.languageCode Optional. The language of training phrases, parameters and rich messages defined in `intent`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {string} params.parent Required. The agent to create a intent for. Format: `projects/<Project ID>/agent`.
    * @param {().GoogleCloudDialogflowV2beta1Intent} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]): Unit = js.native
  def create(params: ParamsResourceProjectsAgentIntentsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
  def create(
    params: ParamsResourceProjectsAgentIntentsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentIntentsCreate,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAgentIntentsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
  def create(
    params: ParamsResourceProjectsAgentIntentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.intents.delete
    * @desc Deletes the specified intent and its direct or indirect followup
    * intents.
    * @alias dialogflow.projects.agent.intents.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the intent to delete. If this intent has direct or indirect followup intents, we also delete them.  Format: `projects/<Project ID>/agent/intents/<Intent ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentIntentsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentIntentsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentIntentsDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentIntentsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentIntentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.intents.get
    * @desc Retrieves the specified intent.
    * @alias dialogflow.projects.agent.intents.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.intentView Optional. The resource view to apply to the returned intent.
    * @param {string=} params.languageCode Optional. The language to retrieve training phrases, parameters and rich messages for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {string} params.name Required. The name of the intent. Format: `projects/<Project ID>/agent/intents/<Intent ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]): Unit = js.native
  def get(params: ParamsResourceProjectsAgentIntentsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
  def get(
    params: ParamsResourceProjectsAgentIntentsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentIntentsGet,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentIntentsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
  def get(
    params: ParamsResourceProjectsAgentIntentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.intents.list
    * @desc Returns the list of all intents in the specified agent.
    * @alias dialogflow.projects.agent.intents.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.intentView Optional. The resource view to apply to the returned intent.
    * @param {string=} params.languageCode Optional. The language to list training phrases, parameters and rich messages for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The agent to list all intents from. Format: `projects/<Project ID>/agent`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListIntentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListIntentsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsAgentIntentsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListIntentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentIntentsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListIntentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentIntentsList,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListIntentsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListIntentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAgentIntentsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListIntentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentIntentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListIntentsResponse]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.intents.patch
    * @desc Updates the specified intent.
    * @alias dialogflow.projects.agent.intents.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.intentView Optional. The resource view to apply to the returned intent.
    * @param {string=} params.languageCode Optional. The language of training phrases, parameters and rich messages defined in `intent`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {string} params.name The unique identifier of this intent. Required for Intents.UpdateIntent and Intents.BatchUpdateIntents methods. Format: `projects/<Project ID>/agent/intents/<Intent ID>`.
    * @param {string=} params.updateMask Optional. The mask to control which fields get updated.
    * @param {().GoogleCloudDialogflowV2beta1Intent} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentIntentsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
  def patch(
    params: ParamsResourceProjectsAgentIntentsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentIntentsPatch,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentIntentsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Intent] = js.native
  def patch(
    params: ParamsResourceProjectsAgentIntentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Intent]
  ): Unit = js.native
}

