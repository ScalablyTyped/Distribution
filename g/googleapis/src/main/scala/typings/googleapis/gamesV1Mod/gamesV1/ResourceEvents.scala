package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Events")
@js.native
class ResourceEvents protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.events.listByPlayer
    * @desc Returns a list showing the current progress on events in this
    * application for the currently authenticated user.
    * @alias games.events.listByPlayer
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of events to return in the response, used for paging. For any response, the actual number of events to return may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listByPlayer(): GaxiosPromise[SchemaPlayerEventListResponse] = js.native
  def listByPlayer(callback: BodyResponseCallback[SchemaPlayerEventListResponse]): Unit = js.native
  def listByPlayer(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPlayerEventListResponse] = js.native
  def listByPlayer(params: ParamsResourceEventsListbyplayer): GaxiosPromise[SchemaPlayerEventListResponse] = js.native
  def listByPlayer(
    params: ParamsResourceEventsListbyplayer,
    callback: BodyResponseCallback[SchemaPlayerEventListResponse]
  ): Unit = js.native
  def listByPlayer(
    params: ParamsResourceEventsListbyplayer,
    options: BodyResponseCallback[SchemaPlayerEventListResponse],
    callback: BodyResponseCallback[SchemaPlayerEventListResponse]
  ): Unit = js.native
  def listByPlayer(params: ParamsResourceEventsListbyplayer, options: MethodOptions): GaxiosPromise[SchemaPlayerEventListResponse] = js.native
  def listByPlayer(
    params: ParamsResourceEventsListbyplayer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPlayerEventListResponse]
  ): Unit = js.native
  /**
    * games.events.listDefinitions
    * @desc Returns a list of the event definitions in this application.
    * @alias games.events.listDefinitions
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of event definitions to return in the response, used for paging. For any response, the actual number of event definitions to return may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listDefinitions(): GaxiosPromise[SchemaEventDefinitionListResponse] = js.native
  def listDefinitions(callback: BodyResponseCallback[SchemaEventDefinitionListResponse]): Unit = js.native
  def listDefinitions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEventDefinitionListResponse] = js.native
  def listDefinitions(params: ParamsResourceEventsListdefinitions): GaxiosPromise[SchemaEventDefinitionListResponse] = js.native
  def listDefinitions(
    params: ParamsResourceEventsListdefinitions,
    callback: BodyResponseCallback[SchemaEventDefinitionListResponse]
  ): Unit = js.native
  def listDefinitions(
    params: ParamsResourceEventsListdefinitions,
    options: BodyResponseCallback[SchemaEventDefinitionListResponse],
    callback: BodyResponseCallback[SchemaEventDefinitionListResponse]
  ): Unit = js.native
  def listDefinitions(params: ParamsResourceEventsListdefinitions, options: MethodOptions): GaxiosPromise[SchemaEventDefinitionListResponse] = js.native
  def listDefinitions(
    params: ParamsResourceEventsListdefinitions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventDefinitionListResponse]
  ): Unit = js.native
  /**
    * games.events.record
    * @desc Records a batch of changes to the number of times events have
    * occurred for the currently authenticated user of this application.
    * @alias games.events.record
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {().EventRecordRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def record(): GaxiosPromise[SchemaEventUpdateResponse] = js.native
  def record(callback: BodyResponseCallback[SchemaEventUpdateResponse]): Unit = js.native
  def record(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEventUpdateResponse] = js.native
  def record(params: ParamsResourceEventsRecord): GaxiosPromise[SchemaEventUpdateResponse] = js.native
  def record(params: ParamsResourceEventsRecord, callback: BodyResponseCallback[SchemaEventUpdateResponse]): Unit = js.native
  def record(
    params: ParamsResourceEventsRecord,
    options: BodyResponseCallback[SchemaEventUpdateResponse],
    callback: BodyResponseCallback[SchemaEventUpdateResponse]
  ): Unit = js.native
  def record(params: ParamsResourceEventsRecord, options: MethodOptions): GaxiosPromise[SchemaEventUpdateResponse] = js.native
  def record(
    params: ParamsResourceEventsRecord,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventUpdateResponse]
  ): Unit = js.native
}

