package typings.googleapis.dialogflowV2Mod.dialogflowV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent$Entitytypes$Entities")
@js.native
class ResourceProjectsAgentEntitytypesEntities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * dialogflow.projects.agent.entityTypes.entities.batchCreate
    * @desc Creates multiple new entities in the specified entity type.
    * Operation <response: google.protobuf.Empty>
    * @alias dialogflow.projects.agent.entityTypes.entities.batchCreate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the entity type to create entities in. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`.
    * @param {().GoogleCloudDialogflowV2BatchCreateEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchCreate(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchCreate(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchCreate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchCreate(params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchcreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchCreate(
    params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchcreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchcreate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchCreate(params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchcreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchCreate(
    params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.entityTypes.entities.batchDelete
    * @desc Deletes entities in the specified entity type.  Operation
    * <response: google.protobuf.Empty>
    * @alias dialogflow.projects.agent.entityTypes.entities.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the entity type to delete entries for. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`.
    * @param {().GoogleCloudDialogflowV2BatchDeleteEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchDelete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchdelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchdelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchdelete,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchdelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  /**
    * dialogflow.projects.agent.entityTypes.entities.batchUpdate
    * @desc Updates or creates multiple entities in the specified entity type.
    * This method does not affect entities in the entity type that aren't
    * explicitly specified in the request.  Operation <response:
    * google.protobuf.Empty>
    * @alias dialogflow.projects.agent.entityTypes.entities.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the entity type to update or create entities in. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`.
    * @param {().GoogleCloudDialogflowV2BatchUpdateEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchUpdate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchupdate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchupdate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchupdate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchupdate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsAgentEntitytypesEntitiesBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
