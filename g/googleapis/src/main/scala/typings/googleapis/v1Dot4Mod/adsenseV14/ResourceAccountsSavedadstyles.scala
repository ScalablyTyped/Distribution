package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Savedadstyles")
@js.native
open class ResourceAccountsSavedadstyles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(callback: BodyResponseCallback[SchemaSavedAdStyle]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(params: ParamsResourceAccountsSavedadstylesGet): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(params: ParamsResourceAccountsSavedadstylesGet, callback: BodyResponseCallback[SchemaSavedAdStyle]): Unit = js.native
  def get(
    params: ParamsResourceAccountsSavedadstylesGet,
    options: BodyResponseCallback[Readable | SchemaSavedAdStyle],
    callback: BodyResponseCallback[Readable | SchemaSavedAdStyle]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsSavedadstylesGet, options: MethodOptions): GaxiosPromise[SchemaSavedAdStyle] = js.native
  def get(
    params: ParamsResourceAccountsSavedadstylesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedAdStyle]
  ): Unit = js.native
  /**
    * List a specific saved ad style for the specified account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/adsense',
    *       'https://www.googleapis.com/auth/adsense.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.accounts.savedadstyles.get({
    *     // Account for which to get the saved ad style.
    *     accountId: 'placeholder-value',
    *     // Saved ad style to retrieve.
    *     savedAdStyleId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adStyle": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceAccountsSavedadstylesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsSavedadstylesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(callback: BodyResponseCallback[SchemaSavedAdStyles]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(params: ParamsResourceAccountsSavedadstylesList): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(
    params: ParamsResourceAccountsSavedadstylesList,
    callback: BodyResponseCallback[SchemaSavedAdStyles]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsSavedadstylesList,
    options: BodyResponseCallback[Readable | SchemaSavedAdStyles],
    callback: BodyResponseCallback[Readable | SchemaSavedAdStyles]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsSavedadstylesList, options: MethodOptions): GaxiosPromise[SchemaSavedAdStyles] = js.native
  def list(
    params: ParamsResourceAccountsSavedadstylesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedAdStyles]
  ): Unit = js.native
  /**
    * List all saved ad styles in the specified account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsense.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsense = google.adsense('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/adsense',
    *       'https://www.googleapis.com/auth/adsense.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsense.accounts.savedadstyles.list({
    *     // Account for which to list saved ad styles.
    *     accountId: 'placeholder-value',
    *     // The maximum number of saved ad styles to include in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // A continuation token, used to page through saved ad styles. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceAccountsSavedadstylesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsSavedadstylesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
