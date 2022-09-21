package typings.googleapis.eventarcV1Mod.eventarcV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/eventarc/v1", "eventarc_v1.Resource$Projects$Locations$Providers")
@js.native
open class ResourceProjectsLocationsProviders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaProvider] = js.native
  def get(callback: BodyResponseCallback[SchemaProvider]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProvider] = js.native
  def get(params: ParamsResourceProjectsLocationsProvidersGet): GaxiosPromise[SchemaProvider] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersGet,
    callback: BodyResponseCallback[SchemaProvider]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersGet,
    options: BodyResponseCallback[Readable | SchemaProvider],
    callback: BodyResponseCallback[Readable | SchemaProvider]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsProvidersGet, options: MethodOptions): GaxiosPromise[SchemaProvider] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProvider]
  ): Unit = js.native
  /**
    * Get a single Provider.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/eventarc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const eventarc = google.eventarc('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await eventarc.projects.locations.providers.get({
    *     // Required. The name of the provider to get.
    *     name: 'projects/my-project/locations/my-location/providers/my-provider',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "eventTypes": [],
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
  def get(params: ParamsResourceProjectsLocationsProvidersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvidersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListProvidersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProvidersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListProvidersResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProvidersList): GaxiosPromise[SchemaListProvidersResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersList,
    callback: BodyResponseCallback[SchemaListProvidersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersList,
    options: BodyResponseCallback[Readable | SchemaListProvidersResponse],
    callback: BodyResponseCallback[Readable | SchemaListProvidersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProvidersList, options: MethodOptions): GaxiosPromise[SchemaListProvidersResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProvidersResponse]
  ): Unit = js.native
  /**
    * List providers.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/eventarc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const eventarc = google.eventarc('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await eventarc.projects.locations.providers.list({
    *     // The filter field that the list request will filter on.
    *     filter: 'placeholder-value',
    *     // The sorting order of the resources returned. Value should be a comma-separated list of fields. The default sorting oder is ascending. To specify descending order for a field, append a `desc` suffix; for example: `name desc, _id`.
    *     orderBy: 'placeholder-value',
    *     // The maximum number of providers to return on each page.
    *     pageSize: 'placeholder-value',
    *     // The page token; provide the value from the `next_page_token` field in a previous `ListProviders` call to retrieve the subsequent page. When paginating, all other parameters provided to `ListProviders` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent of the provider to get.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "providers": [],
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsProvidersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProvidersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
