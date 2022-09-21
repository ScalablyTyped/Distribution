package typings.googleapis.versionhistoryV1Mod.versionhistoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/versionhistory/v1", "versionhistory_v1.Resource$Platforms")
@js.native
open class ResourcePlatforms protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var channels: ResourcePlatformsChannels = js.native
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListPlatformsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPlatformsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPlatformsResponse] = js.native
  def list(params: ParamsResourcePlatformsList): GaxiosPromise[SchemaListPlatformsResponse] = js.native
  def list(params: ParamsResourcePlatformsList, callback: BodyResponseCallback[SchemaListPlatformsResponse]): Unit = js.native
  def list(
    params: ParamsResourcePlatformsList,
    options: BodyResponseCallback[Readable | SchemaListPlatformsResponse],
    callback: BodyResponseCallback[Readable | SchemaListPlatformsResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlatformsList, options: MethodOptions): GaxiosPromise[SchemaListPlatformsResponse] = js.native
  def list(
    params: ParamsResourcePlatformsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPlatformsResponse]
  ): Unit = js.native
  /**
    * Returns list of platforms that are available for a given product. The resource "product" has no resource name in its name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/versionhistory.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const versionhistory = google.versionhistory('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await versionhistory.platforms.list({
    *     // Optional. Optional limit on the number of channels to include in the response. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListChannels` call. Provide this to retrieve the subsequent page.
    *     pageToken: 'placeholder-value',
    *     // Required. The product, which owns this collection of platforms. Format: {product\}
    *     parent: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "platforms": []
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
  def list(params: ParamsResourcePlatformsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePlatformsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
