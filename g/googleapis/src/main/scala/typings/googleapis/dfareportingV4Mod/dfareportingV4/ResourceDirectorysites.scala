package typings.googleapis.dfareportingV4Mod.dfareportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Directorysites")
@js.native
open class ResourceDirectorysites protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDirectorySite] = js.native
  def get(callback: BodyResponseCallback[SchemaDirectorySite]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDirectorySite] = js.native
  def get(params: ParamsResourceDirectorysitesGet): GaxiosPromise[SchemaDirectorySite] = js.native
  def get(params: ParamsResourceDirectorysitesGet, callback: BodyResponseCallback[SchemaDirectorySite]): Unit = js.native
  def get(
    params: ParamsResourceDirectorysitesGet,
    options: BodyResponseCallback[Readable | SchemaDirectorySite],
    callback: BodyResponseCallback[Readable | SchemaDirectorySite]
  ): Unit = js.native
  def get(params: ParamsResourceDirectorysitesGet, options: MethodOptions): GaxiosPromise[SchemaDirectorySite] = js.native
  def get(
    params: ParamsResourceDirectorysitesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectorySite]
  ): Unit = js.native
  /**
    * Gets one directory site by ID.
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
    * const dfareporting = google.dfareporting('v4');
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
    *   const res = await dfareporting.directorySites.get({
    *     // Directory site ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "inpageTagFormats": [],
    *   //   "interstitialTagFormats": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "settings": {},
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
  def get(params: ParamsResourceDirectorysitesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDirectorysitesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaDirectorySite] = js.native
  def insert(callback: BodyResponseCallback[SchemaDirectorySite]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDirectorySite] = js.native
  def insert(params: ParamsResourceDirectorysitesInsert): GaxiosPromise[SchemaDirectorySite] = js.native
  def insert(params: ParamsResourceDirectorysitesInsert, callback: BodyResponseCallback[SchemaDirectorySite]): Unit = js.native
  def insert(
    params: ParamsResourceDirectorysitesInsert,
    options: BodyResponseCallback[Readable | SchemaDirectorySite],
    callback: BodyResponseCallback[Readable | SchemaDirectorySite]
  ): Unit = js.native
  def insert(params: ParamsResourceDirectorysitesInsert, options: MethodOptions): GaxiosPromise[SchemaDirectorySite] = js.native
  def insert(
    params: ParamsResourceDirectorysitesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectorySite]
  ): Unit = js.native
  /**
    * Inserts a new directory site.
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
    * const dfareporting = google.dfareporting('v4');
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
    *   const res = await dfareporting.directorySites.insert({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "inpageTagFormats": [],
    *       //   "interstitialTagFormats": [],
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "settings": {},
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "inpageTagFormats": [],
    *   //   "interstitialTagFormats": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "settings": {},
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
  def insert(params: ParamsResourceDirectorysitesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceDirectorysitesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDirectorySitesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDirectorySitesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDirectorySitesListResponse] = js.native
  def list(params: ParamsResourceDirectorysitesList): GaxiosPromise[SchemaDirectorySitesListResponse] = js.native
  def list(
    params: ParamsResourceDirectorysitesList,
    callback: BodyResponseCallback[SchemaDirectorySitesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDirectorysitesList,
    options: BodyResponseCallback[Readable | SchemaDirectorySitesListResponse],
    callback: BodyResponseCallback[Readable | SchemaDirectorySitesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDirectorysitesList, options: MethodOptions): GaxiosPromise[SchemaDirectorySitesListResponse] = js.native
  def list(
    params: ParamsResourceDirectorysitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDirectorySitesListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of directory sites, possibly filtered. This method supports paging.
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
    * const dfareporting = google.dfareporting('v4');
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
    *   const res = await dfareporting.directorySites.list({
    *     // This search filter is no longer supported and will have no effect on the results returned.
    *     acceptsInStreamVideoPlacements: 'placeholder-value',
    *     // This search filter is no longer supported and will have no effect on the results returned.
    *     acceptsInterstitialPlacements: 'placeholder-value',
    *     // Select only directory sites that accept publisher paid placements. This field can be left blank.
    *     acceptsPublisherPaidPlacements: 'placeholder-value',
    *     // Select only active directory sites. Leave blank to retrieve both active and inactive directory sites.
    *     active: 'placeholder-value',
    *     // Select only directory sites with this Ad Manager network code.
    *     dfpNetworkCode: 'placeholder-value',
    *     // Select only directory sites with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name, ID or URL. Wildcards (*) are allowed. For example, "directory site*2015" will return objects with names like "directory site June 2015", "directory site April 2015", or simply "directory site 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "directory site" will match objects with name "my directory site", "directory site 2015" or simply, "directory site".
    *     searchString: 'placeholder-value',
    *     // Field by which to sort the list.
    *     sortField: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "directorySites": [],
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
  def list(params: ParamsResourceDirectorysitesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDirectorysitesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
