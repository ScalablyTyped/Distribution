package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Resource$Users$Sessions")
@js.native
class ResourceUsersSessions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fitness.users.sessions.delete
    * @desc Deletes a session specified by the given session ID.
    * @alias fitness.users.sessions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.currentTimeMillis The client's current time in milliseconds since epoch.
    * @param {string} params.sessionId The ID of the session to be deleted.
    * @param {string} params.userId Delete a session for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceUsersSessionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSessionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSessionsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSessionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSessionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * fitness.users.sessions.list
    * @desc Lists sessions previously created.
    * @alias fitness.users.sessions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.endTime An RFC3339 timestamp. Only sessions ending between the start and end times will be included in the response.
    * @param {boolean=} params.includeDeleted If true, deleted sessions will be returned. When set to true, sessions returned in this response will only have an ID and will not have any other fields.
    * @param {string=} params.pageToken The continuation token, which is used for incremental syncing. To get the next batch of changes, set this parameter to the value of nextPageToken from the previous response. This token is treated as a timestamp (in millis since epoch). If specified, the API returns sessions modified since this time. The page token is ignored if either start or end time is specified. If none of start time, end time, and the page token is specified, sessions modified in the last 30 days are returned.
    * @param {string=} params.startTime An RFC3339 timestamp. Only sessions ending between the start and end times will be included in the response.
    * @param {string} params.userId List sessions for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSessionsResponse]): Unit = js.native
  def list(params: ParamsResourceUsersSessionsList): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(
    params: ParamsResourceUsersSessionsList,
    callback: BodyResponseCallback[SchemaListSessionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSessionsList,
    options: BodyResponseCallback[SchemaListSessionsResponse],
    callback: BodyResponseCallback[SchemaListSessionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSessionsList, options: MethodOptions): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(
    params: ParamsResourceUsersSessionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSessionsResponse]
  ): Unit = js.native
  /**
    * fitness.users.sessions.update
    * @desc Updates or insert a given session.
    * @alias fitness.users.sessions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.currentTimeMillis The client's current time in milliseconds since epoch.
    * @param {string} params.sessionId The ID of the session to be created.
    * @param {string} params.userId Create sessions for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    * @param {().Session} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaSession] = js.native
  def update(callback: BodyResponseCallback[SchemaSession]): Unit = js.native
  def update(params: ParamsResourceUsersSessionsUpdate): GaxiosPromise[SchemaSession] = js.native
  def update(params: ParamsResourceUsersSessionsUpdate, callback: BodyResponseCallback[SchemaSession]): Unit = js.native
  def update(
    params: ParamsResourceUsersSessionsUpdate,
    options: BodyResponseCallback[SchemaSession],
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
  def update(params: ParamsResourceUsersSessionsUpdate, options: MethodOptions): GaxiosPromise[SchemaSession] = js.native
  def update(
    params: ParamsResourceUsersSessionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
}

