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

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Mobileapps")
@js.native
open class ResourceMobileapps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaMobileApp] = js.native
  def get(callback: BodyResponseCallback[SchemaMobileApp]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMobileApp] = js.native
  def get(params: ParamsResourceMobileappsGet): GaxiosPromise[SchemaMobileApp] = js.native
  def get(params: ParamsResourceMobileappsGet, callback: BodyResponseCallback[SchemaMobileApp]): Unit = js.native
  def get(
    params: ParamsResourceMobileappsGet,
    options: BodyResponseCallback[Readable | SchemaMobileApp],
    callback: BodyResponseCallback[Readable | SchemaMobileApp]
  ): Unit = js.native
  def get(params: ParamsResourceMobileappsGet, options: MethodOptions): GaxiosPromise[SchemaMobileApp] = js.native
  def get(
    params: ParamsResourceMobileappsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileApp]
  ): Unit = js.native
  /**
    * Gets one mobile app by ID.
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
    *   const res = await dfareporting.mobileApps.get({
    *     // Mobile app ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "directory": "my_directory",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "publisherName": "my_publisherName",
    *   //   "title": "my_title"
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
  def get(params: ParamsResourceMobileappsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMobileappsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaMobileAppsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaMobileAppsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMobileAppsListResponse] = js.native
  def list(params: ParamsResourceMobileappsList): GaxiosPromise[SchemaMobileAppsListResponse] = js.native
  def list(params: ParamsResourceMobileappsList, callback: BodyResponseCallback[SchemaMobileAppsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceMobileappsList,
    options: BodyResponseCallback[Readable | SchemaMobileAppsListResponse],
    callback: BodyResponseCallback[Readable | SchemaMobileAppsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMobileappsList, options: MethodOptions): GaxiosPromise[SchemaMobileAppsListResponse] = js.native
  def list(
    params: ParamsResourceMobileappsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileAppsListResponse]
  ): Unit = js.native
  /**
    * Retrieves list of available mobile apps.
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
    *   const res = await dfareporting.mobileApps.list({
    *     // Select only apps from these directories.
    *     directories: 'placeholder-value',
    *     // Select only apps with these IDs.
    *     ids: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "app*2015" will return objects with names like "app Jan 2018", "app Jan 2018", or simply "app 2018". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "app" will match objects with name "my app", "app 2018", or simply "app".
    *     searchString: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "mobileApps": [],
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
  def list(params: ParamsResourceMobileappsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMobileappsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
