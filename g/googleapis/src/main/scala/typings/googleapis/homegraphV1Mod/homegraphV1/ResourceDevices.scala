package typings.googleapis.homegraphV1Mod.homegraphV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/homegraph/v1", "homegraph_v1.Resource$Devices")
@js.native
open class ResourceDevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def query(): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(params: ParamsResourceDevicesQuery): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(params: ParamsResourceDevicesQuery, callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
  def query(
    params: ParamsResourceDevicesQuery,
    options: BodyResponseCallback[Readable | SchemaQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaQueryResponse]
  ): Unit = js.native
  def query(params: ParamsResourceDevicesQuery, options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(
    params: ParamsResourceDevicesQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryResponse]
  ): Unit = js.native
  /**
    * Gets the current states in Home Graph for the given set of the third-party user's devices. The third-party user's identity is passed in via the `agent_user_id` (see QueryRequest). This request must be authorized using service account credentials from your Actions console project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/homegraph.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const homegraph = google.homegraph('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/homegraph'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await homegraph.devices.query({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "agentUserId": "my_agentUserId",
    *       //   "inputs": [],
    *       //   "requestId": "my_requestId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "payload": {},
    *   //   "requestId": "my_requestId"
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
  def query(params: ParamsResourceDevicesQuery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query(
    params: ParamsResourceDevicesQuery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reportStateAndNotification(): GaxiosPromise[SchemaReportStateAndNotificationResponse] = js.native
  def reportStateAndNotification(callback: BodyResponseCallback[SchemaReportStateAndNotificationResponse]): Unit = js.native
  def reportStateAndNotification(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReportStateAndNotificationResponse] = js.native
  def reportStateAndNotification(params: ParamsResourceDevicesReportstateandnotification): GaxiosPromise[SchemaReportStateAndNotificationResponse] = js.native
  def reportStateAndNotification(
    params: ParamsResourceDevicesReportstateandnotification,
    callback: BodyResponseCallback[SchemaReportStateAndNotificationResponse]
  ): Unit = js.native
  def reportStateAndNotification(
    params: ParamsResourceDevicesReportstateandnotification,
    options: BodyResponseCallback[Readable | SchemaReportStateAndNotificationResponse],
    callback: BodyResponseCallback[Readable | SchemaReportStateAndNotificationResponse]
  ): Unit = js.native
  def reportStateAndNotification(params: ParamsResourceDevicesReportstateandnotification, options: MethodOptions): GaxiosPromise[SchemaReportStateAndNotificationResponse] = js.native
  def reportStateAndNotification(
    params: ParamsResourceDevicesReportstateandnotification,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReportStateAndNotificationResponse]
  ): Unit = js.native
  /**
    * Reports device state and optionally sends device notifications. Called by your smart home Action when the state of a third-party device changes or you need to send a notification about the device. See [Implement Report State](https://developers.google.com/assistant/smarthome/develop/report-state) for more information. This method updates the device state according to its declared [traits](https://developers.google.com/assistant/smarthome/concepts/devices-traits). Publishing a new state value outside of these traits will result in an `INVALID_ARGUMENT` error response. The third-party user's identity is passed in via the `agent_user_id` (see ReportStateAndNotificationRequest). This request must be authorized using service account credentials from your Actions console project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/homegraph.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const homegraph = google.homegraph('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/homegraph'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await homegraph.devices.reportStateAndNotification({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "agentUserId": "my_agentUserId",
    *       //   "eventId": "my_eventId",
    *       //   "followUpToken": "my_followUpToken",
    *       //   "payload": {},
    *       //   "requestId": "my_requestId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "requestId": "my_requestId"
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
  def reportStateAndNotification(params: ParamsResourceDevicesReportstateandnotification, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reportStateAndNotification(
    params: ParamsResourceDevicesReportstateandnotification,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def requestSync(): GaxiosPromise[SchemaRequestSyncDevicesResponse] = js.native
  def requestSync(callback: BodyResponseCallback[SchemaRequestSyncDevicesResponse]): Unit = js.native
  def requestSync(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRequestSyncDevicesResponse] = js.native
  def requestSync(params: ParamsResourceDevicesRequestsync): GaxiosPromise[SchemaRequestSyncDevicesResponse] = js.native
  def requestSync(
    params: ParamsResourceDevicesRequestsync,
    callback: BodyResponseCallback[SchemaRequestSyncDevicesResponse]
  ): Unit = js.native
  def requestSync(
    params: ParamsResourceDevicesRequestsync,
    options: BodyResponseCallback[Readable | SchemaRequestSyncDevicesResponse],
    callback: BodyResponseCallback[Readable | SchemaRequestSyncDevicesResponse]
  ): Unit = js.native
  def requestSync(params: ParamsResourceDevicesRequestsync, options: MethodOptions): GaxiosPromise[SchemaRequestSyncDevicesResponse] = js.native
  def requestSync(
    params: ParamsResourceDevicesRequestsync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRequestSyncDevicesResponse]
  ): Unit = js.native
  /**
    * Requests Google to send an `action.devices.SYNC` [intent](https://developers.google.com/assistant/smarthome/reference/intent/sync) to your smart home Action to update device metadata for the given user. The third-party user's identity is passed via the `agent_user_id` (see RequestSyncDevicesRequest). This request must be authorized using service account credentials from your Actions console project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/homegraph.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const homegraph = google.homegraph('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/homegraph'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await homegraph.devices.requestSync({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "agentUserId": "my_agentUserId",
    *       //   "async": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def requestSync(params: ParamsResourceDevicesRequestsync, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def requestSync(
    params: ParamsResourceDevicesRequestsync,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def sync(): GaxiosPromise[SchemaSyncResponse] = js.native
  def sync(callback: BodyResponseCallback[SchemaSyncResponse]): Unit = js.native
  def sync(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSyncResponse] = js.native
  def sync(params: ParamsResourceDevicesSync): GaxiosPromise[SchemaSyncResponse] = js.native
  def sync(params: ParamsResourceDevicesSync, callback: BodyResponseCallback[SchemaSyncResponse]): Unit = js.native
  def sync(
    params: ParamsResourceDevicesSync,
    options: BodyResponseCallback[Readable | SchemaSyncResponse],
    callback: BodyResponseCallback[Readable | SchemaSyncResponse]
  ): Unit = js.native
  def sync(params: ParamsResourceDevicesSync, options: MethodOptions): GaxiosPromise[SchemaSyncResponse] = js.native
  def sync(
    params: ParamsResourceDevicesSync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSyncResponse]
  ): Unit = js.native
  /**
    * Gets all the devices associated with the given third-party user. The third-party user's identity is passed in via the `agent_user_id` (see SyncRequest). This request must be authorized using service account credentials from your Actions console project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/homegraph.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const homegraph = google.homegraph('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/homegraph'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await homegraph.devices.sync({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "agentUserId": "my_agentUserId",
    *       //   "requestId": "my_requestId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "payload": {},
    *   //   "requestId": "my_requestId"
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
  def sync(params: ParamsResourceDevicesSync, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def sync(
    params: ParamsResourceDevicesSync,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
