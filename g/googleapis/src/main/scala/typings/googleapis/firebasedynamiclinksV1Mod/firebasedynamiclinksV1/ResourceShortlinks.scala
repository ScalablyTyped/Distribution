package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebasedynamiclinks/v1", "firebasedynamiclinks_v1.Resource$Shortlinks")
@js.native
open class ResourceShortlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCreateShortDynamicLinkResponse] = js.native
  def create(callback: BodyResponseCallback[SchemaCreateShortDynamicLinkResponse]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreateShortDynamicLinkResponse] = js.native
  def create(params: ParamsResourceShortlinksCreate): GaxiosPromise[SchemaCreateShortDynamicLinkResponse] = js.native
  def create(
    params: ParamsResourceShortlinksCreate,
    callback: BodyResponseCallback[SchemaCreateShortDynamicLinkResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceShortlinksCreate,
    options: BodyResponseCallback[Readable | SchemaCreateShortDynamicLinkResponse],
    callback: BodyResponseCallback[Readable | SchemaCreateShortDynamicLinkResponse]
  ): Unit = js.native
  def create(params: ParamsResourceShortlinksCreate, options: MethodOptions): GaxiosPromise[SchemaCreateShortDynamicLinkResponse] = js.native
  def create(
    params: ParamsResourceShortlinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateShortDynamicLinkResponse]
  ): Unit = js.native
  /**
    * Creates a short Dynamic Link given either a valid long Dynamic Link or details such as Dynamic Link domain, Android and iOS app information. The created short Dynamic Link will not expire. Repeated calls with the same long Dynamic Link or Dynamic Link information will produce the same short Dynamic Link. The Dynamic Link domain in the request must be owned by requester's Firebase project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasedynamiclinks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasedynamiclinks = google.firebasedynamiclinks('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/firebase'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasedynamiclinks.shortLinks.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dynamicLinkInfo": {},
    *       //   "longDynamicLink": "my_longDynamicLink",
    *       //   "sdkVersion": "my_sdkVersion",
    *       //   "suffix": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "previewLink": "my_previewLink",
    *   //   "shortLink": "my_shortLink",
    *   //   "warning": []
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
  def create(params: ParamsResourceShortlinksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceShortlinksCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
