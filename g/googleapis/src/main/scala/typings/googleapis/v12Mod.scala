package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.anon.Date
import typings.googleapis.anon.Details
import typings.googleapis.anon.MaximumQps
import typings.googleapis.googleapisStrings.v1Dot2
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v12Mod {
  
  object adexchangebuyerV12 {
    
    @JSImport("googleapis/build/src/apis/adexchangebuyer/v1.2", "adexchangebuyer_v1_2.Adexchangebuyer")
    @js.native
    open class Adexchangebuyer protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var accounts: ResourceAccounts = js.native
      
      var context: APIRequestContext = js.native
      
      var creatives: ResourceCreatives = js.native
    }
    
    @JSImport("googleapis/build/src/apis/adexchangebuyer/v1.2", "adexchangebuyer_v1_2.Resource$Accounts")
    @js.native
    open class ResourceAccounts protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaAccount] = js.native
      def get(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
      def get(params: ParamsResourceAccountsGet): GaxiosPromise[SchemaAccount] = js.native
      def get(params: ParamsResourceAccountsGet, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
      def get(
        params: ParamsResourceAccountsGet,
        options: BodyResponseCallback[Readable | SchemaAccount],
        callback: BodyResponseCallback[Readable | SchemaAccount]
      ): Unit = js.native
      def get(params: ParamsResourceAccountsGet, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
      def get(
        params: ParamsResourceAccountsGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaAccount]
      ): Unit = js.native
      /**
        * Gets one account by ID.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const adexchangebuyer = google.adexchangebuyer('v1.2');
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
        *   const res = await adexchangebuyer.accounts.get({
        *     // The account id
        *     id: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "bidderLocation": [],
        *   //   "cookieMatchingNid": "my_cookieMatchingNid",
        *   //   "cookieMatchingUrl": "my_cookieMatchingUrl",
        *   //   "id": 0,
        *   //   "kind": "my_kind",
        *   //   "maximumActiveCreatives": 0,
        *   //   "maximumTotalQps": 0,
        *   //   "numberActiveCreatives": 0
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
      def get(params: ParamsResourceAccountsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceAccountsGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def list(): GaxiosPromise[SchemaAccountsList] = js.native
      def list(callback: BodyResponseCallback[SchemaAccountsList]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountsList] = js.native
      def list(params: ParamsResourceAccountsList): GaxiosPromise[SchemaAccountsList] = js.native
      def list(params: ParamsResourceAccountsList, callback: BodyResponseCallback[SchemaAccountsList]): Unit = js.native
      def list(
        params: ParamsResourceAccountsList,
        options: BodyResponseCallback[Readable | SchemaAccountsList],
        callback: BodyResponseCallback[Readable | SchemaAccountsList]
      ): Unit = js.native
      def list(params: ParamsResourceAccountsList, options: MethodOptions): GaxiosPromise[SchemaAccountsList] = js.native
      def list(
        params: ParamsResourceAccountsList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaAccountsList]
      ): Unit = js.native
      /**
        * Retrieves the authenticated user's list of accounts.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const adexchangebuyer = google.adexchangebuyer('v1.2');
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
        *   const res = await adexchangebuyer.accounts.list({});
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "items": [],
        *   //   "kind": "my_kind"
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
      def list(params: ParamsResourceAccountsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceAccountsList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def patch(): GaxiosPromise[SchemaAccount] = js.native
      def patch(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
      def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
      def patch(params: ParamsResourceAccountsPatch): GaxiosPromise[SchemaAccount] = js.native
      def patch(params: ParamsResourceAccountsPatch, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
      def patch(
        params: ParamsResourceAccountsPatch,
        options: BodyResponseCallback[Readable | SchemaAccount],
        callback: BodyResponseCallback[Readable | SchemaAccount]
      ): Unit = js.native
      def patch(params: ParamsResourceAccountsPatch, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
      def patch(
        params: ParamsResourceAccountsPatch,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaAccount]
      ): Unit = js.native
      /**
        * Updates an existing account. This method supports patch semantics.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const adexchangebuyer = google.adexchangebuyer('v1.2');
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
        *   const res = await adexchangebuyer.accounts.patch({
        *     // The account id
        *     id: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "bidderLocation": [],
        *       //   "cookieMatchingNid": "my_cookieMatchingNid",
        *       //   "cookieMatchingUrl": "my_cookieMatchingUrl",
        *       //   "id": 0,
        *       //   "kind": "my_kind",
        *       //   "maximumActiveCreatives": 0,
        *       //   "maximumTotalQps": 0,
        *       //   "numberActiveCreatives": 0
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "bidderLocation": [],
        *   //   "cookieMatchingNid": "my_cookieMatchingNid",
        *   //   "cookieMatchingUrl": "my_cookieMatchingUrl",
        *   //   "id": 0,
        *   //   "kind": "my_kind",
        *   //   "maximumActiveCreatives": 0,
        *   //   "maximumTotalQps": 0,
        *   //   "numberActiveCreatives": 0
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
      def patch(params: ParamsResourceAccountsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def patch(
        params: ParamsResourceAccountsPatch,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def update(): GaxiosPromise[SchemaAccount] = js.native
      def update(callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
      def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
      def update(params: ParamsResourceAccountsUpdate): GaxiosPromise[SchemaAccount] = js.native
      def update(params: ParamsResourceAccountsUpdate, callback: BodyResponseCallback[SchemaAccount]): Unit = js.native
      def update(
        params: ParamsResourceAccountsUpdate,
        options: BodyResponseCallback[Readable | SchemaAccount],
        callback: BodyResponseCallback[Readable | SchemaAccount]
      ): Unit = js.native
      def update(params: ParamsResourceAccountsUpdate, options: MethodOptions): GaxiosPromise[SchemaAccount] = js.native
      def update(
        params: ParamsResourceAccountsUpdate,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaAccount]
      ): Unit = js.native
      /**
        * Updates an existing account.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const adexchangebuyer = google.adexchangebuyer('v1.2');
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
        *   const res = await adexchangebuyer.accounts.update({
        *     // The account id
        *     id: 'placeholder-value',
        *
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "bidderLocation": [],
        *       //   "cookieMatchingNid": "my_cookieMatchingNid",
        *       //   "cookieMatchingUrl": "my_cookieMatchingUrl",
        *       //   "id": 0,
        *       //   "kind": "my_kind",
        *       //   "maximumActiveCreatives": 0,
        *       //   "maximumTotalQps": 0,
        *       //   "numberActiveCreatives": 0
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "bidderLocation": [],
        *   //   "cookieMatchingNid": "my_cookieMatchingNid",
        *   //   "cookieMatchingUrl": "my_cookieMatchingUrl",
        *   //   "id": 0,
        *   //   "kind": "my_kind",
        *   //   "maximumActiveCreatives": 0,
        *   //   "maximumTotalQps": 0,
        *   //   "numberActiveCreatives": 0
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
      def update(params: ParamsResourceAccountsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def update(
        params: ParamsResourceAccountsUpdate,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    @JSImport("googleapis/build/src/apis/adexchangebuyer/v1.2", "adexchangebuyer_v1_2.Resource$Creatives")
    @js.native
    open class ResourceCreatives protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def get(): GaxiosPromise[SchemaCreative] = js.native
      def get(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
      def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
      def get(params: ParamsResourceCreativesGet): GaxiosPromise[SchemaCreative] = js.native
      def get(params: ParamsResourceCreativesGet, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
      def get(
        params: ParamsResourceCreativesGet,
        options: BodyResponseCallback[Readable | SchemaCreative],
        callback: BodyResponseCallback[Readable | SchemaCreative]
      ): Unit = js.native
      def get(params: ParamsResourceCreativesGet, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
      def get(
        params: ParamsResourceCreativesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaCreative]
      ): Unit = js.native
      /**
        * Gets the status for a single creative. A creative will be available 30-40 minutes after submission.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const adexchangebuyer = google.adexchangebuyer('v1.2');
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
        *   const res = await adexchangebuyer.creatives.get({
        *     // The id for the account that will serve this creative.
        *     accountId: 'placeholder-value',
        *     // The buyer-specific id for this creative.
        *     buyerCreativeId: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "HTMLSnippet": "my_HTMLSnippet",
        *   //   "accountId": 0,
        *   //   "advertiserId": [],
        *   //   "advertiserName": "my_advertiserName",
        *   //   "agencyId": "my_agencyId",
        *   //   "apiUploadTimestamp": "my_apiUploadTimestamp",
        *   //   "attribute": [],
        *   //   "buyerCreativeId": "my_buyerCreativeId",
        *   //   "clickThroughUrl": [],
        *   //   "corrections": [],
        *   //   "disapprovalReasons": [],
        *   //   "filteringReasons": {},
        *   //   "height": 0,
        *   //   "impressionTrackingUrl": [],
        *   //   "kind": "my_kind",
        *   //   "productCategories": [],
        *   //   "restrictedCategories": [],
        *   //   "sensitiveCategories": [],
        *   //   "status": "my_status",
        *   //   "vendorType": [],
        *   //   "version": 0,
        *   //   "videoURL": "my_videoURL",
        *   //   "width": 0
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
      def get(params: ParamsResourceCreativesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def get(
        params: ParamsResourceCreativesGet,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def insert(): GaxiosPromise[SchemaCreative] = js.native
      def insert(callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
      def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
      def insert(params: ParamsResourceCreativesInsert): GaxiosPromise[SchemaCreative] = js.native
      def insert(params: ParamsResourceCreativesInsert, callback: BodyResponseCallback[SchemaCreative]): Unit = js.native
      def insert(
        params: ParamsResourceCreativesInsert,
        options: BodyResponseCallback[Readable | SchemaCreative],
        callback: BodyResponseCallback[Readable | SchemaCreative]
      ): Unit = js.native
      def insert(params: ParamsResourceCreativesInsert, options: MethodOptions): GaxiosPromise[SchemaCreative] = js.native
      def insert(
        params: ParamsResourceCreativesInsert,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaCreative]
      ): Unit = js.native
      /**
        * Submit a new creative.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const adexchangebuyer = google.adexchangebuyer('v1.2');
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
        *   const res = await adexchangebuyer.creatives.insert({
        *     // Request body metadata
        *     requestBody: {
        *       // request body parameters
        *       // {
        *       //   "HTMLSnippet": "my_HTMLSnippet",
        *       //   "accountId": 0,
        *       //   "advertiserId": [],
        *       //   "advertiserName": "my_advertiserName",
        *       //   "agencyId": "my_agencyId",
        *       //   "apiUploadTimestamp": "my_apiUploadTimestamp",
        *       //   "attribute": [],
        *       //   "buyerCreativeId": "my_buyerCreativeId",
        *       //   "clickThroughUrl": [],
        *       //   "corrections": [],
        *       //   "disapprovalReasons": [],
        *       //   "filteringReasons": {},
        *       //   "height": 0,
        *       //   "impressionTrackingUrl": [],
        *       //   "kind": "my_kind",
        *       //   "productCategories": [],
        *       //   "restrictedCategories": [],
        *       //   "sensitiveCategories": [],
        *       //   "status": "my_status",
        *       //   "vendorType": [],
        *       //   "version": 0,
        *       //   "videoURL": "my_videoURL",
        *       //   "width": 0
        *       // }
        *     },
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "HTMLSnippet": "my_HTMLSnippet",
        *   //   "accountId": 0,
        *   //   "advertiserId": [],
        *   //   "advertiserName": "my_advertiserName",
        *   //   "agencyId": "my_agencyId",
        *   //   "apiUploadTimestamp": "my_apiUploadTimestamp",
        *   //   "attribute": [],
        *   //   "buyerCreativeId": "my_buyerCreativeId",
        *   //   "clickThroughUrl": [],
        *   //   "corrections": [],
        *   //   "disapprovalReasons": [],
        *   //   "filteringReasons": {},
        *   //   "height": 0,
        *   //   "impressionTrackingUrl": [],
        *   //   "kind": "my_kind",
        *   //   "productCategories": [],
        *   //   "restrictedCategories": [],
        *   //   "sensitiveCategories": [],
        *   //   "status": "my_status",
        *   //   "vendorType": [],
        *   //   "version": 0,
        *   //   "videoURL": "my_videoURL",
        *   //   "width": 0
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
      def insert(params: ParamsResourceCreativesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def insert(
        params: ParamsResourceCreativesInsert,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
      
      def list(): GaxiosPromise[SchemaCreativesList] = js.native
      def list(callback: BodyResponseCallback[SchemaCreativesList]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreativesList] = js.native
      def list(params: ParamsResourceCreativesList): GaxiosPromise[SchemaCreativesList] = js.native
      def list(params: ParamsResourceCreativesList, callback: BodyResponseCallback[SchemaCreativesList]): Unit = js.native
      def list(
        params: ParamsResourceCreativesList,
        options: BodyResponseCallback[Readable | SchemaCreativesList],
        callback: BodyResponseCallback[Readable | SchemaCreativesList]
      ): Unit = js.native
      def list(params: ParamsResourceCreativesList, options: MethodOptions): GaxiosPromise[SchemaCreativesList] = js.native
      def list(
        params: ParamsResourceCreativesList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaCreativesList]
      ): Unit = js.native
      /**
        * Retrieves a list of the authenticated user's active creatives. A creative will be available 30-40 minutes after submission.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const adexchangebuyer = google.adexchangebuyer('v1.2');
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
        *   const res = await adexchangebuyer.creatives.list({
        *     // Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
        *     maxResults: 'placeholder-value',
        *     // A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
        *     pageToken: 'placeholder-value',
        *     // When specified, only creatives having the given status are returned.
        *     statusFilter: 'placeholder-value',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
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
      def list(params: ParamsResourceCreativesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceCreativesList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1Dot2
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1.2")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1Dot2): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceAccountsGet
      extends StObject
         with StandardParameters {
      
      /**
        * The account id
        */
      var id: js.UndefOr[Double] = js.undefined
    }
    object ParamsResourceAccountsGet {
      
      inline def apply(): ParamsResourceAccountsGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceAccountsGet]
      }
      
      extension [Self <: ParamsResourceAccountsGet](x: Self) {
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    type ParamsResourceAccountsList = StandardParameters
    
    trait ParamsResourceAccountsPatch
      extends StObject
         with StandardParameters {
      
      /**
        * The account id
        */
      var id: js.UndefOr[Double] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaAccount] = js.undefined
    }
    object ParamsResourceAccountsPatch {
      
      inline def apply(): ParamsResourceAccountsPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceAccountsPatch]
      }
      
      extension [Self <: ParamsResourceAccountsPatch](x: Self) {
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setRequestBody(value: SchemaAccount): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceAccountsUpdate
      extends StObject
         with StandardParameters {
      
      /**
        * The account id
        */
      var id: js.UndefOr[Double] = js.undefined
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaAccount] = js.undefined
    }
    object ParamsResourceAccountsUpdate {
      
      inline def apply(): ParamsResourceAccountsUpdate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceAccountsUpdate]
      }
      
      extension [Self <: ParamsResourceAccountsUpdate](x: Self) {
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setRequestBody(value: SchemaAccount): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceCreativesGet
      extends StObject
         with StandardParameters {
      
      /**
        * The id for the account that will serve this creative.
        */
      var accountId: js.UndefOr[Double] = js.undefined
      
      /**
        * The buyer-specific id for this creative.
        */
      var buyerCreativeId: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceCreativesGet {
      
      inline def apply(): ParamsResourceCreativesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceCreativesGet]
      }
      
      extension [Self <: ParamsResourceCreativesGet](x: Self) {
        
        inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setBuyerCreativeId(value: String): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
        
        inline def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
      }
    }
    
    trait ParamsResourceCreativesInsert
      extends StObject
         with StandardParameters {
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaCreative] = js.undefined
    }
    object ParamsResourceCreativesInsert {
      
      inline def apply(): ParamsResourceCreativesInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceCreativesInsert]
      }
      
      extension [Self <: ParamsResourceCreativesInsert](x: Self) {
        
        inline def setRequestBody(value: SchemaCreative): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    trait ParamsResourceCreativesList
      extends StObject
         with StandardParameters {
      
      /**
        * Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
        */
      var maxResults: js.UndefOr[Double] = js.undefined
      
      /**
        * A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * When specified, only creatives having the given status are returned.
        */
      var statusFilter: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceCreativesList {
      
      inline def apply(): ParamsResourceCreativesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceCreativesList]
      }
      
      extension [Self <: ParamsResourceCreativesList](x: Self) {
        
        inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setStatusFilter(value: String): Self = StObject.set(x, "statusFilter", value.asInstanceOf[js.Any])
        
        inline def setStatusFilterUndefined: Self = StObject.set(x, "statusFilter", js.undefined)
      }
    }
    
    trait SchemaAccount extends StObject {
      
      /**
        * Your bidder locations that have distinct URLs.
        */
      var bidderLocation: js.UndefOr[js.Array[MaximumQps] | Null] = js.undefined
      
      /**
        * The nid parameter value used in cookie match requests. Please contact your technical account manager if you need to change this.
        */
      var cookieMatchingNid: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The base URL used in cookie match requests.
        */
      var cookieMatchingUrl: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Account id.
        */
      var id: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Resource type.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The maximum number of active creatives that an account can have, where a creative is active if it was inserted or bid with in the last 30 days. Please contact your technical account manager if you need to change this.
        */
      var maximumActiveCreatives: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The sum of all bidderLocation.maximumQps values cannot exceed this. Please contact your technical account manager if you need to change this.
        */
      var maximumTotalQps: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The number of creatives that this account inserted or bid with in the last 30 days.
        */
      var numberActiveCreatives: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaAccount {
      
      inline def apply(): SchemaAccount = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAccount]
      }
      
      extension [Self <: SchemaAccount](x: Self) {
        
        inline def setBidderLocation(value: js.Array[MaximumQps]): Self = StObject.set(x, "bidderLocation", value.asInstanceOf[js.Any])
        
        inline def setBidderLocationNull: Self = StObject.set(x, "bidderLocation", null)
        
        inline def setBidderLocationUndefined: Self = StObject.set(x, "bidderLocation", js.undefined)
        
        inline def setBidderLocationVarargs(value: MaximumQps*): Self = StObject.set(x, "bidderLocation", js.Array(value*))
        
        inline def setCookieMatchingNid(value: String): Self = StObject.set(x, "cookieMatchingNid", value.asInstanceOf[js.Any])
        
        inline def setCookieMatchingNidNull: Self = StObject.set(x, "cookieMatchingNid", null)
        
        inline def setCookieMatchingNidUndefined: Self = StObject.set(x, "cookieMatchingNid", js.undefined)
        
        inline def setCookieMatchingUrl(value: String): Self = StObject.set(x, "cookieMatchingUrl", value.asInstanceOf[js.Any])
        
        inline def setCookieMatchingUrlNull: Self = StObject.set(x, "cookieMatchingUrl", null)
        
        inline def setCookieMatchingUrlUndefined: Self = StObject.set(x, "cookieMatchingUrl", js.undefined)
        
        inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdNull: Self = StObject.set(x, "id", null)
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMaximumActiveCreatives(value: Double): Self = StObject.set(x, "maximumActiveCreatives", value.asInstanceOf[js.Any])
        
        inline def setMaximumActiveCreativesNull: Self = StObject.set(x, "maximumActiveCreatives", null)
        
        inline def setMaximumActiveCreativesUndefined: Self = StObject.set(x, "maximumActiveCreatives", js.undefined)
        
        inline def setMaximumTotalQps(value: Double): Self = StObject.set(x, "maximumTotalQps", value.asInstanceOf[js.Any])
        
        inline def setMaximumTotalQpsNull: Self = StObject.set(x, "maximumTotalQps", null)
        
        inline def setMaximumTotalQpsUndefined: Self = StObject.set(x, "maximumTotalQps", js.undefined)
        
        inline def setNumberActiveCreatives(value: Double): Self = StObject.set(x, "numberActiveCreatives", value.asInstanceOf[js.Any])
        
        inline def setNumberActiveCreativesNull: Self = StObject.set(x, "numberActiveCreatives", null)
        
        inline def setNumberActiveCreativesUndefined: Self = StObject.set(x, "numberActiveCreatives", js.undefined)
      }
    }
    
    trait SchemaAccountsList extends StObject {
      
      /**
        * A list of accounts.
        */
      var items: js.UndefOr[js.Array[SchemaAccount]] = js.undefined
      
      /**
        * Resource type.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaAccountsList {
      
      inline def apply(): SchemaAccountsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAccountsList]
      }
      
      extension [Self <: SchemaAccountsList](x: Self) {
        
        inline def setItems(value: js.Array[SchemaAccount]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SchemaAccount*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait SchemaCreative extends StObject {
      
      /**
        * The HTML snippet that displays the ad when inserted in the web page. If set, videoURL should not be set.
        */
      var HTMLSnippet: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Account id.
        */
      var accountId: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Detected advertiser id, if any. Read-only. This field should not be set in requests.
        */
      var advertiserId: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * The name of the company being advertised in the creative.
        */
      var advertiserName: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The agency id for this creative.
        */
      var agencyId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The last upload timestamp of this creative if it was uploaded via API. Read-only. The value of this field is generated, and will be ignored for uploads. (formatted RFC 3339 timestamp).
        */
      var apiUploadTimestamp: js.UndefOr[String | Null] = js.undefined
      
      /**
        * All attributes for the ads that may be shown from this snippet.
        */
      var attribute: js.UndefOr[js.Array[Double] | Null] = js.undefined
      
      /**
        * A buyer-specific id identifying the creative in this ad.
        */
      var buyerCreativeId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The set of destination urls for the snippet.
        */
      var clickThroughUrl: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * Shows any corrections that were applied to this creative. Read-only. This field should not be set in requests.
        */
      var corrections: js.UndefOr[js.Array[Details] | Null] = js.undefined
      
      /**
        * The reasons for disapproval, if any. Note that not all disapproval reasons may be categorized, so it is possible for the creative to have a status of DISAPPROVED with an empty list for disapproval_reasons. In this case, please reach out to your TAM to help debug the issue. Read-only. This field should not be set in requests.
        */
      var disapprovalReasons: js.UndefOr[js.Array[Details] | Null] = js.undefined
      
      /**
        * The filtering reasons for the creative. Read-only. This field should not be set in requests.
        */
      var filteringReasons: js.UndefOr[Date | Null] = js.undefined
      
      /**
        * Ad height.
        */
      var height: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The set of urls to be called to record an impression.
        */
      var impressionTrackingUrl: js.UndefOr[js.Array[String] | Null] = js.undefined
      
      /**
        * Resource type.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Detected product categories, if any. Read-only. This field should not be set in requests.
        */
      var productCategories: js.UndefOr[js.Array[Double] | Null] = js.undefined
      
      /**
        * All restricted categories for the ads that may be shown from this snippet.
        */
      var restrictedCategories: js.UndefOr[js.Array[Double] | Null] = js.undefined
      
      /**
        * Detected sensitive categories, if any. Read-only. This field should not be set in requests.
        */
      var sensitiveCategories: js.UndefOr[js.Array[Double] | Null] = js.undefined
      
      /**
        * Creative serving status. Read-only. This field should not be set in requests.
        */
      var status: js.UndefOr[String | Null] = js.undefined
      
      /**
        * All vendor types for the ads that may be shown from this snippet.
        */
      var vendorType: js.UndefOr[js.Array[Double] | Null] = js.undefined
      
      /**
        * The version for this creative. Read-only. This field should not be set in requests.
        */
      var version: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The url to fetch a video ad. If set, HTMLSnippet should not be set.
        */
      var videoURL: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Ad width.
        */
      var width: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaCreative {
      
      inline def apply(): SchemaCreative = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaCreative]
      }
      
      extension [Self <: SchemaCreative](x: Self) {
        
        inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
        
        inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
        
        inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
        
        inline def setAdvertiserId(value: js.Array[String]): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
        
        inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
        
        inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
        
        inline def setAdvertiserIdVarargs(value: String*): Self = StObject.set(x, "advertiserId", js.Array(value*))
        
        inline def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
        
        inline def setAdvertiserNameNull: Self = StObject.set(x, "advertiserName", null)
        
        inline def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
        
        inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
        
        inline def setAgencyIdNull: Self = StObject.set(x, "agencyId", null)
        
        inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
        
        inline def setApiUploadTimestamp(value: String): Self = StObject.set(x, "apiUploadTimestamp", value.asInstanceOf[js.Any])
        
        inline def setApiUploadTimestampNull: Self = StObject.set(x, "apiUploadTimestamp", null)
        
        inline def setApiUploadTimestampUndefined: Self = StObject.set(x, "apiUploadTimestamp", js.undefined)
        
        inline def setAttribute(value: js.Array[Double]): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
        
        inline def setAttributeNull: Self = StObject.set(x, "attribute", null)
        
        inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
        
        inline def setAttributeVarargs(value: Double*): Self = StObject.set(x, "attribute", js.Array(value*))
        
        inline def setBuyerCreativeId(value: String): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
        
        inline def setBuyerCreativeIdNull: Self = StObject.set(x, "buyerCreativeId", null)
        
        inline def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
        
        inline def setClickThroughUrl(value: js.Array[String]): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
        
        inline def setClickThroughUrlNull: Self = StObject.set(x, "clickThroughUrl", null)
        
        inline def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
        
        inline def setClickThroughUrlVarargs(value: String*): Self = StObject.set(x, "clickThroughUrl", js.Array(value*))
        
        inline def setCorrections(value: js.Array[Details]): Self = StObject.set(x, "corrections", value.asInstanceOf[js.Any])
        
        inline def setCorrectionsNull: Self = StObject.set(x, "corrections", null)
        
        inline def setCorrectionsUndefined: Self = StObject.set(x, "corrections", js.undefined)
        
        inline def setCorrectionsVarargs(value: Details*): Self = StObject.set(x, "corrections", js.Array(value*))
        
        inline def setDisapprovalReasons(value: js.Array[Details]): Self = StObject.set(x, "disapprovalReasons", value.asInstanceOf[js.Any])
        
        inline def setDisapprovalReasonsNull: Self = StObject.set(x, "disapprovalReasons", null)
        
        inline def setDisapprovalReasonsUndefined: Self = StObject.set(x, "disapprovalReasons", js.undefined)
        
        inline def setDisapprovalReasonsVarargs(value: Details*): Self = StObject.set(x, "disapprovalReasons", js.Array(value*))
        
        inline def setFilteringReasons(value: Date): Self = StObject.set(x, "filteringReasons", value.asInstanceOf[js.Any])
        
        inline def setFilteringReasonsNull: Self = StObject.set(x, "filteringReasons", null)
        
        inline def setFilteringReasonsUndefined: Self = StObject.set(x, "filteringReasons", js.undefined)
        
        inline def setHTMLSnippet(value: String): Self = StObject.set(x, "HTMLSnippet", value.asInstanceOf[js.Any])
        
        inline def setHTMLSnippetNull: Self = StObject.set(x, "HTMLSnippet", null)
        
        inline def setHTMLSnippetUndefined: Self = StObject.set(x, "HTMLSnippet", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightNull: Self = StObject.set(x, "height", null)
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setImpressionTrackingUrl(value: js.Array[String]): Self = StObject.set(x, "impressionTrackingUrl", value.asInstanceOf[js.Any])
        
        inline def setImpressionTrackingUrlNull: Self = StObject.set(x, "impressionTrackingUrl", null)
        
        inline def setImpressionTrackingUrlUndefined: Self = StObject.set(x, "impressionTrackingUrl", js.undefined)
        
        inline def setImpressionTrackingUrlVarargs(value: String*): Self = StObject.set(x, "impressionTrackingUrl", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setProductCategories(value: js.Array[Double]): Self = StObject.set(x, "productCategories", value.asInstanceOf[js.Any])
        
        inline def setProductCategoriesNull: Self = StObject.set(x, "productCategories", null)
        
        inline def setProductCategoriesUndefined: Self = StObject.set(x, "productCategories", js.undefined)
        
        inline def setProductCategoriesVarargs(value: Double*): Self = StObject.set(x, "productCategories", js.Array(value*))
        
        inline def setRestrictedCategories(value: js.Array[Double]): Self = StObject.set(x, "restrictedCategories", value.asInstanceOf[js.Any])
        
        inline def setRestrictedCategoriesNull: Self = StObject.set(x, "restrictedCategories", null)
        
        inline def setRestrictedCategoriesUndefined: Self = StObject.set(x, "restrictedCategories", js.undefined)
        
        inline def setRestrictedCategoriesVarargs(value: Double*): Self = StObject.set(x, "restrictedCategories", js.Array(value*))
        
        inline def setSensitiveCategories(value: js.Array[Double]): Self = StObject.set(x, "sensitiveCategories", value.asInstanceOf[js.Any])
        
        inline def setSensitiveCategoriesNull: Self = StObject.set(x, "sensitiveCategories", null)
        
        inline def setSensitiveCategoriesUndefined: Self = StObject.set(x, "sensitiveCategories", js.undefined)
        
        inline def setSensitiveCategoriesVarargs(value: Double*): Self = StObject.set(x, "sensitiveCategories", js.Array(value*))
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusNull: Self = StObject.set(x, "status", null)
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setVendorType(value: js.Array[Double]): Self = StObject.set(x, "vendorType", value.asInstanceOf[js.Any])
        
        inline def setVendorTypeNull: Self = StObject.set(x, "vendorType", null)
        
        inline def setVendorTypeUndefined: Self = StObject.set(x, "vendorType", js.undefined)
        
        inline def setVendorTypeVarargs(value: Double*): Self = StObject.set(x, "vendorType", js.Array(value*))
        
        inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionNull: Self = StObject.set(x, "version", null)
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        
        inline def setVideoURL(value: String): Self = StObject.set(x, "videoURL", value.asInstanceOf[js.Any])
        
        inline def setVideoURLNull: Self = StObject.set(x, "videoURL", null)
        
        inline def setVideoURLUndefined: Self = StObject.set(x, "videoURL", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthNull: Self = StObject.set(x, "width", null)
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait SchemaCreativesList extends StObject {
      
      /**
        * A list of creatives.
        */
      var items: js.UndefOr[js.Array[SchemaCreative]] = js.undefined
      
      /**
        * Resource type.
        */
      var kind: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Continuation token used to page through creatives. To retrieve the next page of results, set the next request's "pageToken" value to this.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaCreativesList {
      
      inline def apply(): SchemaCreativesList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaCreativesList]
      }
      
      extension [Self <: SchemaCreativesList](x: Self) {
        
        inline def setItems(value: js.Array[SchemaCreative]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: SchemaCreative*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindNull: Self = StObject.set(x, "kind", null)
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.undefined
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * An opaque string that represents a user for quota purposes. Must not exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAuth(
          value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
        ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        inline def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        inline def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
