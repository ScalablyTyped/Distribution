package typings.googleapis.v34Mod.dfareportingV34

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Customevents")
@js.native
open class ResourceCustomevents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchinsert(): GaxiosPromise[SchemaCustomEventsBatchInsertResponse] = js.native
  def batchinsert(callback: BodyResponseCallback[SchemaCustomEventsBatchInsertResponse]): Unit = js.native
  def batchinsert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomEventsBatchInsertResponse] = js.native
  def batchinsert(params: ParamsResourceCustomeventsBatchinsert): GaxiosPromise[SchemaCustomEventsBatchInsertResponse] = js.native
  def batchinsert(
    params: ParamsResourceCustomeventsBatchinsert,
    callback: BodyResponseCallback[SchemaCustomEventsBatchInsertResponse]
  ): Unit = js.native
  def batchinsert(
    params: ParamsResourceCustomeventsBatchinsert,
    options: BodyResponseCallback[Readable | SchemaCustomEventsBatchInsertResponse],
    callback: BodyResponseCallback[Readable | SchemaCustomEventsBatchInsertResponse]
  ): Unit = js.native
  def batchinsert(params: ParamsResourceCustomeventsBatchinsert, options: MethodOptions): GaxiosPromise[SchemaCustomEventsBatchInsertResponse] = js.native
  def batchinsert(
    params: ParamsResourceCustomeventsBatchinsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomEventsBatchInsertResponse]
  ): Unit = js.native
  /**
    * Inserts custom events.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/ddmconversions'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.customEvents.batchinsert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "customEvents": [],
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "hasFailures": false,
    *   //   "kind": "my_kind",
    *   //   "status": []
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
  def batchinsert(params: ParamsResourceCustomeventsBatchinsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchinsert(
    params: ParamsResourceCustomeventsBatchinsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
