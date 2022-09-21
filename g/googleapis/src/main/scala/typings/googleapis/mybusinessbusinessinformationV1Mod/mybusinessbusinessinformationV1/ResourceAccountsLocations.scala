package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessbusinessinformation/v1", "mybusinessbusinessinformation_v1.Resource$Accounts$Locations")
@js.native
open class ResourceAccountsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaLocation] = js.native
  def create(callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def create(params: ParamsResourceAccountsLocationsCreate): GaxiosPromise[SchemaLocation] = js.native
  def create(params: ParamsResourceAccountsLocationsCreate, callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def create(
    params: ParamsResourceAccountsLocationsCreate,
    options: BodyResponseCallback[Readable | SchemaLocation],
    callback: BodyResponseCallback[Readable | SchemaLocation]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsLocationsCreate, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def create(
    params: ParamsResourceAccountsLocationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  /**
    * Creates a new Location that will be owned by the logged in user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
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
    *   const res = await mybusinessbusinessinformation.accounts.locations.create({
    *     // Required. The name of the account in which to create this location.
    *     parent: 'accounts/my-account',
    *     // Optional. A unique request ID for the server to detect duplicated requests. We recommend using UUIDs. Max length is 50 characters.
    *     requestId: 'placeholder-value',
    *     // Optional. If true, the request is validated without actually creating the location.
    *     validateOnly: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adWordsLocationExtensions": {},
    *       //   "categories": {},
    *       //   "labels": [],
    *       //   "languageCode": "my_languageCode",
    *       //   "latlng": {},
    *       //   "metadata": {},
    *       //   "moreHours": [],
    *       //   "name": "my_name",
    *       //   "openInfo": {},
    *       //   "phoneNumbers": {},
    *       //   "profile": {},
    *       //   "regularHours": {},
    *       //   "relationshipData": {},
    *       //   "serviceArea": {},
    *       //   "serviceItems": [],
    *       //   "specialHours": {},
    *       //   "storeCode": "my_storeCode",
    *       //   "storefrontAddress": {},
    *       //   "title": "my_title",
    *       //   "websiteUri": "my_websiteUri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adWordsLocationExtensions": {},
    *   //   "categories": {},
    *   //   "labels": [],
    *   //   "languageCode": "my_languageCode",
    *   //   "latlng": {},
    *   //   "metadata": {},
    *   //   "moreHours": [],
    *   //   "name": "my_name",
    *   //   "openInfo": {},
    *   //   "phoneNumbers": {},
    *   //   "profile": {},
    *   //   "regularHours": {},
    *   //   "relationshipData": {},
    *   //   "serviceArea": {},
    *   //   "serviceItems": [],
    *   //   "specialHours": {},
    *   //   "storeCode": "my_storeCode",
    *   //   "storefrontAddress": {},
    *   //   "title": "my_title",
    *   //   "websiteUri": "my_websiteUri"
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
  def create(params: ParamsResourceAccountsLocationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsLocationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLocationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(params: ParamsResourceAccountsLocationsList): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsLocationsList,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsLocationsList,
    options: BodyResponseCallback[Readable | SchemaListLocationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsLocationsList, options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceAccountsLocationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  /**
    * Lists the locations for the specified account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
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
    *   const res = await mybusinessbusinessinformation.accounts.locations.list({
    *     // Optional. A filter constraining the locations to return. The response includes only entries that match the filter. If `filter` is empty, then constraints are applied and all locations (paginated) are retrieved for the requested account. For more information about valid fields and example usage, see [Work with Location Data Guide](https://developers.google.com/my-business/content/location-data#filter_results_when_you_list_locations).
    *     filter: 'placeholder-value',
    *     // Optional. Sorting order for the request. Multiple fields should be comma-separated, following SQL syntax. The default sorting order is ascending. To specify descending order, a suffix " desc" should be added. Valid fields to order_by are title and store_code. For example: "title, store_code desc" or "title" or "store_code desc"
    *     orderBy: 'placeholder-value',
    *     // Optional. How many locations to fetch per page. Default value is 10 if not set. Minimum is 1, and maximum page size is 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. If specified, it fetches the next `page` of locations. The page token is returned by previous calls to `ListLocations` when there were more locations than could fit in the requested page size.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the account to fetch locations from. If the parent Account is of AccountType PERSONAL, only Locations that are directly owned by the Account are returned, otherwise it will return all accessible locations from the Account, either directly or indirectly.
    *     parent: 'accounts/my-account',
    *     // Required. Read mask to specify what fields will be returned in the response.
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "locations": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0
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
  def list(params: ParamsResourceAccountsLocationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsLocationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
