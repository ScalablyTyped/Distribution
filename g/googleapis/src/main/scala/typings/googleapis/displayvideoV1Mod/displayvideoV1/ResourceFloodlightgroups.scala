package typings.googleapis.displayvideoV1Mod.displayvideoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Floodlightgroups")
@js.native
open class ResourceFloodlightgroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaFloodlightGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaFloodlightGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightGroup] = js.native
  def get(params: ParamsResourceFloodlightgroupsGet): GaxiosPromise[SchemaFloodlightGroup] = js.native
  def get(params: ParamsResourceFloodlightgroupsGet, callback: BodyResponseCallback[SchemaFloodlightGroup]): Unit = js.native
  def get(
    params: ParamsResourceFloodlightgroupsGet,
    options: BodyResponseCallback[Readable | SchemaFloodlightGroup],
    callback: BodyResponseCallback[Readable | SchemaFloodlightGroup]
  ): Unit = js.native
  def get(params: ParamsResourceFloodlightgroupsGet, options: MethodOptions): GaxiosPromise[SchemaFloodlightGroup] = js.native
  def get(
    params: ParamsResourceFloodlightgroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightGroup]
  ): Unit = js.native
  /**
    * Gets a Floodlight group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.floodlightGroups.get({
    *     // Required. The ID of the Floodlight group to fetch.
    *     floodlightGroupId: '[^/]+',
    *     // Required. The partner context by which the Floodlight group is being accessed.
    *     partnerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeViewConfig": {},
    *   //   "customVariables": {},
    *   //   "displayName": "my_displayName",
    *   //   "floodlightGroupId": "my_floodlightGroupId",
    *   //   "lookbackWindow": {},
    *   //   "name": "my_name",
    *   //   "webTagType": "my_webTagType"
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
  def get(params: ParamsResourceFloodlightgroupsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFloodlightgroupsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaFloodlightGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaFloodlightGroup]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightGroup] = js.native
  def patch(params: ParamsResourceFloodlightgroupsPatch): GaxiosPromise[SchemaFloodlightGroup] = js.native
  def patch(params: ParamsResourceFloodlightgroupsPatch, callback: BodyResponseCallback[SchemaFloodlightGroup]): Unit = js.native
  def patch(
    params: ParamsResourceFloodlightgroupsPatch,
    options: BodyResponseCallback[Readable | SchemaFloodlightGroup],
    callback: BodyResponseCallback[Readable | SchemaFloodlightGroup]
  ): Unit = js.native
  def patch(params: ParamsResourceFloodlightgroupsPatch, options: MethodOptions): GaxiosPromise[SchemaFloodlightGroup] = js.native
  def patch(
    params: ParamsResourceFloodlightgroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightGroup]
  ): Unit = js.native
  /**
    * Updates an existing Floodlight group. Returns the updated Floodlight group if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.floodlightGroups.patch({
    *     // Output only. The unique ID of the Floodlight group. Assigned by the system.
    *     floodlightGroupId: 'placeholder-value',
    *     // Required. The partner context by which the Floodlight group is being accessed.
    *     partnerId: 'placeholder-value',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activeViewConfig": {},
    *       //   "customVariables": {},
    *       //   "displayName": "my_displayName",
    *       //   "floodlightGroupId": "my_floodlightGroupId",
    *       //   "lookbackWindow": {},
    *       //   "name": "my_name",
    *       //   "webTagType": "my_webTagType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activeViewConfig": {},
    *   //   "customVariables": {},
    *   //   "displayName": "my_displayName",
    *   //   "floodlightGroupId": "my_floodlightGroupId",
    *   //   "lookbackWindow": {},
    *   //   "name": "my_name",
    *   //   "webTagType": "my_webTagType"
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
  def patch(params: ParamsResourceFloodlightgroupsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceFloodlightgroupsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
