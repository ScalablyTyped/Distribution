package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Publisherprofiles")
@js.native
open class ResourceAccountsPublisherprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaPublisherProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(params: ParamsResourceAccountsPublisherprofilesGet): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(
    params: ParamsResourceAccountsPublisherprofilesGet,
    callback: BodyResponseCallback[SchemaPublisherProfile]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsPublisherprofilesGet,
    options: BodyResponseCallback[Readable | SchemaPublisherProfile],
    callback: BodyResponseCallback[Readable | SchemaPublisherProfile]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsPublisherprofilesGet, options: MethodOptions): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(
    params: ParamsResourceAccountsPublisherprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublisherProfile]
  ): Unit = js.native
  /**
    * Gets the requested publisher profile by id.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer2.accounts.publisherProfiles.get({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The id for the publisher profile to get.
    *     publisherProfileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "audienceDescription": "my_audienceDescription",
    *   //   "buyerPitchStatement": "my_buyerPitchStatement",
    *   //   "directDealsContact": "my_directDealsContact",
    *   //   "displayName": "my_displayName",
    *   //   "domains": [],
    *   //   "googlePlusUrl": "my_googlePlusUrl",
    *   //   "isParent": false,
    *   //   "logoUrl": "my_logoUrl",
    *   //   "mediaKitUrl": "my_mediaKitUrl",
    *   //   "mobileApps": [],
    *   //   "overview": "my_overview",
    *   //   "programmaticDealsContact": "my_programmaticDealsContact",
    *   //   "publisherProfileId": "my_publisherProfileId",
    *   //   "rateCardInfoUrl": "my_rateCardInfoUrl",
    *   //   "samplePageUrl": "my_samplePageUrl",
    *   //   "seller": {},
    *   //   "topHeadlines": []
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
  def get(params: ParamsResourceAccountsPublisherprofilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsPublisherprofilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPublisherProfilesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(params: ParamsResourceAccountsPublisherprofilesList): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(
    params: ParamsResourceAccountsPublisherprofilesList,
    callback: BodyResponseCallback[SchemaListPublisherProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsPublisherprofilesList,
    options: BodyResponseCallback[Readable | SchemaListPublisherProfilesResponse],
    callback: BodyResponseCallback[Readable | SchemaListPublisherProfilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsPublisherprofilesList, options: MethodOptions): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(
    params: ParamsResourceAccountsPublisherprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPublisherProfilesResponse]
  ): Unit = js.native
  /**
    * List all publisher profiles visible to the buyer
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer2.accounts.publisherProfiles.list({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // Specify the number of results to include per page.
    *     pageSize: 'placeholder-value',
    *     // The page token as return from ListPublisherProfilesResponse.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "publisherProfiles": []
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
  def list(params: ParamsResourceAccountsPublisherprofilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsPublisherprofilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
