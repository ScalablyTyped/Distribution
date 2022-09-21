package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Resource$Users$Sessions")
@js.native
open class ResourceUsersSessions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSessionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSessionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSessionsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSessionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSessionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a session specified by the given session ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/fitness.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const fitness = google.fitness('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/fitness.activity.write',
    *       'https://www.googleapis.com/auth/fitness.sleep.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await fitness.users.sessions.delete({
    *     // The ID of the session to be deleted.
    *     sessionId: 'placeholder-value',
    *     // Delete a session for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceUsersSessionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersSessionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSessionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(params: ParamsResourceUsersSessionsList): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(
    params: ParamsResourceUsersSessionsList,
    callback: BodyResponseCallback[SchemaListSessionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSessionsList,
    options: BodyResponseCallback[Readable | SchemaListSessionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSessionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSessionsList, options: MethodOptions): GaxiosPromise[SchemaListSessionsResponse] = js.native
  def list(
    params: ParamsResourceUsersSessionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSessionsResponse]
  ): Unit = js.native
  /**
    * Lists sessions previously created.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/fitness.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const fitness = google.fitness('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/fitness.activity.read',
    *       'https://www.googleapis.com/auth/fitness.activity.write',
    *       'https://www.googleapis.com/auth/fitness.blood_glucose.read',
    *       'https://www.googleapis.com/auth/fitness.blood_glucose.write',
    *       'https://www.googleapis.com/auth/fitness.blood_pressure.read',
    *       'https://www.googleapis.com/auth/fitness.blood_pressure.write',
    *       'https://www.googleapis.com/auth/fitness.body.read',
    *       'https://www.googleapis.com/auth/fitness.body.write',
    *       'https://www.googleapis.com/auth/fitness.body_temperature.read',
    *       'https://www.googleapis.com/auth/fitness.body_temperature.write',
    *       'https://www.googleapis.com/auth/fitness.heart_rate.read',
    *       'https://www.googleapis.com/auth/fitness.heart_rate.write',
    *       'https://www.googleapis.com/auth/fitness.location.read',
    *       'https://www.googleapis.com/auth/fitness.location.write',
    *       'https://www.googleapis.com/auth/fitness.nutrition.read',
    *       'https://www.googleapis.com/auth/fitness.nutrition.write',
    *       'https://www.googleapis.com/auth/fitness.oxygen_saturation.read',
    *       'https://www.googleapis.com/auth/fitness.oxygen_saturation.write',
    *       'https://www.googleapis.com/auth/fitness.reproductive_health.read',
    *       'https://www.googleapis.com/auth/fitness.reproductive_health.write',
    *       'https://www.googleapis.com/auth/fitness.sleep.read',
    *       'https://www.googleapis.com/auth/fitness.sleep.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await fitness.users.sessions.list({
    *     // If non-empty, only sessions with these activity types should be returned.
    *     activityType: 'placeholder-value',
    *     // An RFC3339 timestamp. Only sessions ending between the start and end times will be included in the response. If this time is omitted but startTime is specified, all sessions from startTime to the end of time will be returned.
    *     endTime: 'placeholder-value',
    *     // If true, and if both startTime and endTime are omitted, session deletions will be returned.
    *     includeDeleted: 'placeholder-value',
    *     // The continuation token, which is used for incremental syncing. To get the next batch of changes, set this parameter to the value of nextPageToken from the previous response. The page token is ignored if either start or end time is specified. If none of start time, end time, and the page token is specified, sessions modified in the last 30 days are returned.
    *     pageToken: 'placeholder-value',
    *     // An RFC3339 timestamp. Only sessions ending between the start and end times will be included in the response. If this time is omitted but endTime is specified, all sessions from the start of time up to endTime will be returned.
    *     startTime: 'placeholder-value',
    *     // List sessions for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deletedSession": [],
    *   //   "hasMoreData": false,
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "session": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceUsersSessionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersSessionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaSession] = js.native
  def update(callback: BodyResponseCallback[SchemaSession]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSession] = js.native
  def update(params: ParamsResourceUsersSessionsUpdate): GaxiosPromise[SchemaSession] = js.native
  def update(params: ParamsResourceUsersSessionsUpdate, callback: BodyResponseCallback[SchemaSession]): Unit = js.native
  def update(
    params: ParamsResourceUsersSessionsUpdate,
    options: BodyResponseCallback[Readable | SchemaSession],
    callback: BodyResponseCallback[Readable | SchemaSession]
  ): Unit = js.native
  def update(params: ParamsResourceUsersSessionsUpdate, options: MethodOptions): GaxiosPromise[SchemaSession] = js.native
  def update(
    params: ParamsResourceUsersSessionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSession]
  ): Unit = js.native
  /**
    * Updates or insert a given session.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/fitness.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const fitness = google.fitness('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/fitness.activity.write',
    *       'https://www.googleapis.com/auth/fitness.sleep.write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await fitness.users.sessions.update({
    *     // The ID of the session to be created.
    *     sessionId: 'placeholder-value',
    *     // Create sessions for the person identified. Use me to indicate the authenticated user. Only me is supported at this time.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeTimeMillis": "my_activeTimeMillis",
    *       //   "activityType": 0,
    *       //   "application": {},
    *       //   "description": "my_description",
    *       //   "endTimeMillis": "my_endTimeMillis",
    *       //   "id": "my_id",
    *       //   "modifiedTimeMillis": "my_modifiedTimeMillis",
    *       //   "name": "my_name",
    *       //   "startTimeMillis": "my_startTimeMillis"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeTimeMillis": "my_activeTimeMillis",
    *   //   "activityType": 0,
    *   //   "application": {},
    *   //   "description": "my_description",
    *   //   "endTimeMillis": "my_endTimeMillis",
    *   //   "id": "my_id",
    *   //   "modifiedTimeMillis": "my_modifiedTimeMillis",
    *   //   "name": "my_name",
    *   //   "startTimeMillis": "my_startTimeMillis"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def update(params: ParamsResourceUsersSessionsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceUsersSessionsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
