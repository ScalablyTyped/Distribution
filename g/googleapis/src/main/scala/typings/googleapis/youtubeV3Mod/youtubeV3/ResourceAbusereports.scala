package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Abusereports")
@js.native
open class ResourceAbusereports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def insert(): GaxiosPromise[SchemaAbuseReport] = js.native
  def insert(callback: BodyResponseCallback[SchemaAbuseReport]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAbuseReport] = js.native
  def insert(params: ParamsResourceAbusereportsInsert): GaxiosPromise[SchemaAbuseReport] = js.native
  def insert(params: ParamsResourceAbusereportsInsert, callback: BodyResponseCallback[SchemaAbuseReport]): Unit = js.native
  def insert(
    params: ParamsResourceAbusereportsInsert,
    options: BodyResponseCallback[Readable | SchemaAbuseReport],
    callback: BodyResponseCallback[Readable | SchemaAbuseReport]
  ): Unit = js.native
  def insert(params: ParamsResourceAbusereportsInsert, options: MethodOptions): GaxiosPromise[SchemaAbuseReport] = js.native
  def insert(
    params: ParamsResourceAbusereportsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAbuseReport]
  ): Unit = js.native
  /**
    * Inserts a new resource into this collection.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/youtube.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const youtube = google.youtube('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/youtube',
    *       'https://www.googleapis.com/auth/youtube.force-ssl',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await youtube.abuseReports.insert({
    *     // The *part* parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
    *     part: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "abuseTypes": [],
    *       //   "description": "my_description",
    *       //   "relatedEntities": [],
    *       //   "subject": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "abuseTypes": [],
    *   //   "description": "my_description",
    *   //   "relatedEntities": [],
    *   //   "subject": {}
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
  def insert(params: ParamsResourceAbusereportsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceAbusereportsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
