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

@JSImport("googleapis/build/src/apis/dfareporting/v3.4", "dfareporting_v3_4.Resource$Advertiserlandingpages")
@js.native
open class ResourceAdvertiserlandingpages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaLandingPage] = js.native
  def get(callback: BodyResponseCallback[SchemaLandingPage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def get(params: ParamsResourceAdvertiserlandingpagesGet): GaxiosPromise[SchemaLandingPage] = js.native
  def get(params: ParamsResourceAdvertiserlandingpagesGet, callback: BodyResponseCallback[SchemaLandingPage]): Unit = js.native
  def get(
    params: ParamsResourceAdvertiserlandingpagesGet,
    options: BodyResponseCallback[Readable | SchemaLandingPage],
    callback: BodyResponseCallback[Readable | SchemaLandingPage]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertiserlandingpagesGet, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def get(
    params: ParamsResourceAdvertiserlandingpagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  /**
    * Gets one landing page by ID.
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
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.advertiserLandingPages.get({
    *     // Landing page ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "archived": false,
    *   //   "deepLinks": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "url": "my_url"
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
  def get(params: ParamsResourceAdvertiserlandingpagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertiserlandingpagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaLandingPage] = js.native
  def insert(callback: BodyResponseCallback[SchemaLandingPage]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def insert(params: ParamsResourceAdvertiserlandingpagesInsert): GaxiosPromise[SchemaLandingPage] = js.native
  def insert(
    params: ParamsResourceAdvertiserlandingpagesInsert,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  def insert(
    params: ParamsResourceAdvertiserlandingpagesInsert,
    options: BodyResponseCallback[Readable | SchemaLandingPage],
    callback: BodyResponseCallback[Readable | SchemaLandingPage]
  ): Unit = js.native
  def insert(params: ParamsResourceAdvertiserlandingpagesInsert, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def insert(
    params: ParamsResourceAdvertiserlandingpagesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  /**
    * Inserts a new landing page.
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
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.advertiserLandingPages.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "archived": false,
    *       //   "deepLinks": [],
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "archived": false,
    *   //   "deepLinks": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "url": "my_url"
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
  def insert(params: ParamsResourceAdvertiserlandingpagesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceAdvertiserlandingpagesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAdvertiserLandingPagesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAdvertiserLandingPagesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdvertiserLandingPagesListResponse] = js.native
  def list(params: ParamsResourceAdvertiserlandingpagesList): GaxiosPromise[SchemaAdvertiserLandingPagesListResponse] = js.native
  def list(
    params: ParamsResourceAdvertiserlandingpagesList,
    callback: BodyResponseCallback[SchemaAdvertiserLandingPagesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertiserlandingpagesList,
    options: BodyResponseCallback[Readable | SchemaAdvertiserLandingPagesListResponse],
    callback: BodyResponseCallback[Readable | SchemaAdvertiserLandingPagesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertiserlandingpagesList, options: MethodOptions): GaxiosPromise[SchemaAdvertiserLandingPagesListResponse] = js.native
  def list(
    params: ParamsResourceAdvertiserlandingpagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserLandingPagesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of landing pages.
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
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.advertiserLandingPages.list({
    *     // Select only landing pages that belong to these advertisers.
    *     advertiserIds: 'placeholder-value',
    *     // Select only archived landing pages. Don't set this field to select both archived and non-archived landing pages.
    *     archived: 'placeholder-value',
    *     // Select only landing pages that are associated with these campaigns.
    *     campaignIds: 'placeholder-value',
    *     // Select only landing pages with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for landing pages by name or ID. Wildcards (*) are allowed. For example, "landingpage*2017" will return landing pages with names like "landingpage July 2017", "landingpage March 2017", or simply "landingpage 2017". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "landingpage" will match campaigns with name "my landingpage", "landingpage 2015", or simply "landingpage".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *     // Select only landing pages that belong to this subaccount.
    *     subaccountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "landingPages": [],
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
  def list(params: ParamsResourceAdvertiserlandingpagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertiserlandingpagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaLandingPage] = js.native
  def patch(callback: BodyResponseCallback[SchemaLandingPage]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def patch(params: ParamsResourceAdvertiserlandingpagesPatch): GaxiosPromise[SchemaLandingPage] = js.native
  def patch(
    params: ParamsResourceAdvertiserlandingpagesPatch,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAdvertiserlandingpagesPatch,
    options: BodyResponseCallback[Readable | SchemaLandingPage],
    callback: BodyResponseCallback[Readable | SchemaLandingPage]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertiserlandingpagesPatch, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def patch(
    params: ParamsResourceAdvertiserlandingpagesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  /**
    * Updates an existing advertiser landing page. This method supports patch semantics.
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
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.advertiserLandingPages.patch({
    *     // LandingPage ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "archived": false,
    *       //   "deepLinks": [],
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "archived": false,
    *   //   "deepLinks": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "url": "my_url"
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
  def patch(params: ParamsResourceAdvertiserlandingpagesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertiserlandingpagesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaLandingPage] = js.native
  def update(callback: BodyResponseCallback[SchemaLandingPage]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def update(params: ParamsResourceAdvertiserlandingpagesUpdate): GaxiosPromise[SchemaLandingPage] = js.native
  def update(
    params: ParamsResourceAdvertiserlandingpagesUpdate,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  def update(
    params: ParamsResourceAdvertiserlandingpagesUpdate,
    options: BodyResponseCallback[Readable | SchemaLandingPage],
    callback: BodyResponseCallback[Readable | SchemaLandingPage]
  ): Unit = js.native
  def update(params: ParamsResourceAdvertiserlandingpagesUpdate, options: MethodOptions): GaxiosPromise[SchemaLandingPage] = js.native
  def update(
    params: ParamsResourceAdvertiserlandingpagesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLandingPage]
  ): Unit = js.native
  /**
    * Updates an existing landing page.
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
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.advertiserLandingPages.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "advertiserId": "my_advertiserId",
    *       //   "archived": false,
    *       //   "deepLinks": [],
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "advertiserId": "my_advertiserId",
    *   //   "archived": false,
    *   //   "deepLinks": [],
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "url": "my_url"
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
  def update(params: ParamsResourceAdvertiserlandingpagesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAdvertiserlandingpagesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
