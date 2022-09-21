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

@JSImport("googleapis/build/src/apis/smartdevicemanagement/v1", "smartdevicemanagement_v1.Resource$Enterprises$Structures")
@js.native
open class ResourceEnterprisesStructures protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Structure] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1Structure]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Structure] = js.native
  def get(params: ParamsResourceEnterprisesStructuresGet): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Structure] = js.native
  def get(
    params: ParamsResourceEnterprisesStructuresGet,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1Structure]
  ): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesStructuresGet,
    options: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1Structure],
    callback: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1Structure]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesStructuresGet, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1Structure] = js.native
  def get(
    params: ParamsResourceEnterprisesStructuresGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1Structure]
  ): Unit = js.native
  /**
    * Gets a structure managed by the enterprise.
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
    *   const res = await smartdevicemanagement.enterprises.structures.get({
    *     // The name of the structure requested. For example: "enterprises/XYZ/structures/ABC".
    *     name: 'enterprises/my-enterprise/structures/my-structure',
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
  def get(params: ParamsResourceEnterprisesStructuresGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEnterprisesStructuresGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse] = js.native
  def list(params: ParamsResourceEnterprisesStructuresList): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesStructuresList,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesStructuresList,
    options: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesStructuresList, options: MethodOptions): GaxiosPromise[SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesStructuresList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleHomeEnterpriseSdmV1ListStructuresResponse]
  ): Unit = js.native
  /**
    * Lists structures managed by the enterprise.
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
    *   const res = await smartdevicemanagement.enterprises.structures.list({
    *     // Optional filter to list structures.
    *     filter: 'placeholder-value',
    *     // Requested page size. Server may return fewer structures than requested. If unspecified, server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // The token of the page to retrieve.
    *     pageToken: 'placeholder-value',
    *     // The parent enterprise to list structures under. E.g. "enterprises/XYZ".
    *     parent: 'enterprises/my-enterprise',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "structures": []
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
  def list(params: ParamsResourceEnterprisesStructuresList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEnterprisesStructuresList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var rooms: ResourceEnterprisesStructuresRooms = js.native
}
