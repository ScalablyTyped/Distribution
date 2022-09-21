package typings.googleapis.v2Mod.adsenseV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v2", "adsense_v2.Resource$Accounts$Sites")
@js.native
open class ResourceAccountsSites protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSite] = js.native
  def get(callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def get(params: ParamsResourceAccountsSitesGet): GaxiosPromise[SchemaSite] = js.native
  def get(params: ParamsResourceAccountsSitesGet, callback: BodyResponseCallback[SchemaSite]): Unit = js.native
  def get(
    params: ParamsResourceAccountsSitesGet,
    options: BodyResponseCallback[Readable | SchemaSite],
    callback: BodyResponseCallback[Readable | SchemaSite]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsSitesGet, options: MethodOptions): GaxiosPromise[SchemaSite] = js.native
  def get(
    params: ParamsResourceAccountsSitesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSite]
  ): Unit = js.native
  /**
    * Gets information about the selected site.
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
    * const adsense = google.adsense('v2');
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
    *   const res = await adsense.accounts.sites.get({
    *     // Required. Name of the site. Format: accounts/{account\}/sites/{site\}
    *     name: 'accounts/my-account/sites/my-site',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoAdsEnabled": false,
    *   //   "domain": "my_domain",
    *   //   "name": "my_name",
    *   //   "reportingDimensionId": "my_reportingDimensionId",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceAccountsSitesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsSitesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSitesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(params: ParamsResourceAccountsSitesList): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(params: ParamsResourceAccountsSitesList, callback: BodyResponseCallback[SchemaListSitesResponse]): Unit = js.native
  def list(
    params: ParamsResourceAccountsSitesList,
    options: BodyResponseCallback[Readable | SchemaListSitesResponse],
    callback: BodyResponseCallback[Readable | SchemaListSitesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsSitesList, options: MethodOptions): GaxiosPromise[SchemaListSitesResponse] = js.native
  def list(
    params: ParamsResourceAccountsSitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSitesResponse]
  ): Unit = js.native
  /**
    * Lists all the sites available in an account.
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
    * const adsense = google.adsense('v2');
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
    *   const res = await adsense.accounts.sites.list({
    *     // The maximum number of sites to include in the response, used for paging. If unspecified, at most 10000 sites will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListSites` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListSites` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The account which owns the collection of sites. Format: accounts/{account\}
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sites": []
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
  def list(params: ParamsResourceAccountsSitesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsSitesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
