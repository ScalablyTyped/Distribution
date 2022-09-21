package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/smartdevicemanagement/v1", "smartdevicemanagement_v1.Resource$Enterprises$Structures$Rooms")
@js.native
open class ResourceEnterprisesStructuresRooms protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Room] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1Room]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Room] = js.native
  def get(params: ParamsResourceEnterprisesStructuresRoomsGet): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Room] = js.native
  def get(
    params: ParamsResourceEnterprisesStructuresRoomsGet,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1Room]
  ): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesStructuresRoomsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1Room],
    callback: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1Room]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesStructuresRoomsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Room] = js.native
  def get(
    params: ParamsResourceEnterprisesStructuresRoomsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1Room]
  ): Unit = js.native
  /**
    * Gets a room managed by the enterprise.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/smartdevicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const smartdevicemanagement = google.smartdevicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sdm.service',
    *       'https://www.googleapis.com/auth/sdm.thermostat.service',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await smartdevicemanagement.enterprises.structures.rooms.get({
    *     // The name of the room requested. For example: "enterprises/XYZ/structures/ABC/rooms/123".
    *     name: 'enterprises/my-enterprise/structures/my-structure/rooms/my-room',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "traits": {}
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
  def get(params: ParamsResourceEnterprisesStructuresRoomsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEnterprisesStructuresRoomsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse] = js.native
  def list(params: ParamsResourceEnterprisesStructuresRoomsList): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesStructuresRoomsList,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesStructuresRoomsList,
    options: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesStructuresRoomsList, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesStructuresRoomsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ListRoomsResponse]
  ): Unit = js.native
  /**
    * Lists rooms managed by the enterprise.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/smartdevicemanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const smartdevicemanagement = google.smartdevicemanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sdm.service',
    *       'https://www.googleapis.com/auth/sdm.thermostat.service',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await smartdevicemanagement.enterprises.structures.rooms.list({
    *     // Requested page size. Server may return fewer rooms than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // The token of the page to retrieve.
    *     pageToken: 'placeholder-value',
    *     // The parent resource name of the rooms requested. For example: "enterprises/XYZ/structures/ABC".
    *     parent: 'enterprises/my-enterprise/structures/my-structure',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "rooms": []
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
  def list(params: ParamsResourceEnterprisesStructuresRoomsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEnterprisesStructuresRoomsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
