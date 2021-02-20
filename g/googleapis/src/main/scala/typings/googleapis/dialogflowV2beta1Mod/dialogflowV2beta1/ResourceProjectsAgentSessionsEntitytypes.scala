package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Sessions$Entitytypes")
@js.native
class ResourceProjectsAgentSessionsEntitytypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dialogflow.projects.agent.sessions.entityTypes.create
    * @desc Creates a session entity type.  If the specified session entity
    * type already exists, overrides the session entity type.
    * @alias dialogflow.projects.agent.sessions.entityTypes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The session to create a session entity type for. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/ sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {().GoogleCloudDialogflowV2beta1SessionEntityType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(params: ParamsResourceProjectsAgentSessionsEntitytypesCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(
    params: ParamsResourceProjectsAgentSessionsEntitytypesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAgentSessionsEntitytypesCreate,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAgentSessionsEntitytypesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(
    params: ParamsResourceProjectsAgentSessionsEntitytypesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.sessions.entityTypes.delete
    * @desc Deletes the specified session entity type.
    * @alias dialogflow.projects.agent.sessions.entityTypes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the entity type to delete. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsAgentSessionsEntitytypesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentSessionsEntitytypesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAgentSessionsEntitytypesDelete,
    options: BodyResponseCallback[SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAgentSessionsEntitytypesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAgentSessionsEntitytypesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.sessions.entityTypes.get
    * @desc Retrieves the specified session entity type.
    * @alias dialogflow.projects.agent.sessions.entityTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the session entity type. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(params: ParamsResourceProjectsAgentSessionsEntitytypesGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(
    params: ParamsResourceProjectsAgentSessionsEntitytypesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsAgentSessionsEntitytypesGet,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAgentSessionsEntitytypesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(
    params: ParamsResourceProjectsAgentSessionsEntitytypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.sessions.entityTypes.list
    * @desc Returns the list of all session entity types in the specified
    * session.
    * @alias dialogflow.projects.agent.sessions.entityTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The session to list all session entity types from. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/ sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(params: ParamsResourceProjectsAgentSessionsEntitytypesList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentSessionsEntitytypesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAgentSessionsEntitytypesList,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAgentSessionsEntitytypesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAgentSessionsEntitytypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.sessions.entityTypes.patch
    * @desc Updates the specified session entity type.
    * @alias dialogflow.projects.agent.sessions.entityTypes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The unique identifier of this session entity type. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`, or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.  `<Entity Type Display Name>` must be the display name of an existing entity type in the same agent that will be overridden or supplemented.
    * @param {string=} params.updateMask Optional. The mask to control which fields get updated.
    * @param {().GoogleCloudDialogflowV2beta1SessionEntityType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(params: ParamsResourceProjectsAgentSessionsEntitytypesPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(
    params: ParamsResourceProjectsAgentSessionsEntitytypesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAgentSessionsEntitytypesPatch,
    options: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType],
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAgentSessionsEntitytypesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(
    params: ParamsResourceProjectsAgentSessionsEntitytypesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
}
