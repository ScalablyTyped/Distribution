package typings.googleapis.dialogflowV2Mod.dialogflowV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent$Entitytypes")
@js.native
class ResourceProjectsAgentEntitytypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * dialogflow.projects.agent.entityTypes.batchDelete
    * @desc Deletes entity types in the specified agent.  Operation <response:
    * google.protobuf.Empty>
    * @alias dialogflow.projects.agent.entityTypes.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the agent to delete all entities types for. Format: `projects/<Project ID>/agent`.
    * @param {().GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchDelete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(params: ParamsResourceProjectsAgentEntitytypesBatchdelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentEntitytypesBatchdelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentEntitytypesBatchdelete,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceProjectsAgentEntitytypesBatchdelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentEntitytypesBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.entityTypes.batchUpdate
    * @desc Updates/Creates multiple entity types in the specified agent.
    * Operation <response: BatchUpdateEntityTypesResponse>
    * @alias dialogflow.projects.agent.entityTypes.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the agent to update or create entity types in. Format: `projects/<Project ID>/agent`.
    * @param {().GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchUpdate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(params: ParamsResourceProjectsAgentEntitytypesBatchupdate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentEntitytypesBatchupdate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentEntitytypesBatchupdate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceProjectsAgentEntitytypesBatchupdate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentEntitytypesBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * dialogflow.projects.agent.entityTypes.create
    * @desc Creates an entity type in the specified agent.
    * @alias dialogflow.projects.agent.entityTypes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode Optional. The language of entity synonyms defined in `entity_type`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {string} params.parent Required. The agent to create a entity type for. Format: `projects/<Project ID>/agent`.
    * @param {().GoogleCloudDialogflowV2EntityType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def create(params: ParamsResourceProjectsAgentEntitytypesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def create(
    params: ParamsResourceProjectsAgentEntitytypesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentEntitytypesCreate,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAgentEntitytypesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def create(
    params: ParamsResourceProjectsAgentEntitytypesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.entityTypes.delete
    * @desc Deletes the specified entity type.
    * @alias dialogflow.projects.agent.entityTypes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the entity type to delete. Format: `projects/<Project ID>/agent/entityTypes/<EntityType ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsAgentEntitytypesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEntitytypesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentEntitytypesDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentEntitytypesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentEntitytypesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  
  var entities: ResourceProjectsAgentEntitytypesEntities = js.native
  
  /**
    * dialogflow.projects.agent.entityTypes.get
    * @desc Retrieves the specified entity type.
    * @alias dialogflow.projects.agent.entityTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode Optional. The language to retrieve entity synonyms for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {string} params.name Required. The name of the entity type. Format: `projects/<Project ID>/agent/entityTypes/<EntityType ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def get(params: ParamsResourceProjectsAgentEntitytypesGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def get(
    params: ParamsResourceProjectsAgentEntitytypesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentEntitytypesGet,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentEntitytypesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def get(
    params: ParamsResourceProjectsAgentEntitytypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.entityTypes.list
    * @desc Returns the list of all entity types in the specified agent.
    * @alias dialogflow.projects.agent.entityTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode Optional. The language to list entity synonyms for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The agent to list all entity types from. Format: `projects/<Project ID>/agent`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse] = js.native
  def list(params: ParamsResourceProjectsAgentEntitytypesList): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEntitytypesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentEntitytypesList,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAgentEntitytypesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentEntitytypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.entityTypes.patch
    * @desc Updates the specified entity type.
    * @alias dialogflow.projects.agent.entityTypes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode Optional. The language of entity synonyms defined in `entity_type`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {string} params.name The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`.
    * @param {string=} params.updateMask Optional. The mask to control which fields get updated.
    * @param {().GoogleCloudDialogflowV2EntityType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def patch(params: ParamsResourceProjectsAgentEntitytypesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEntitytypesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentEntitytypesPatch,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentEntitytypesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2EntityType] = js.native
  def patch(
    params: ParamsResourceProjectsAgentEntitytypesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2EntityType]
  ): Unit = js.native
}
