package typings.googleapis.documentaiV1Mod.documentaiV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/documentai/v1", "documentai_v1.Resource$Uiv1beta3$Projects$Locations")
@js.native
open class ResourceUiv1beta3ProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudLocationLocation] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudLocationLocation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudLocationLocation] = js.native
  def get(params: ParamsResourceUiv1beta3ProjectsLocationsGet): GaxiosPromise[SchemaGoogleCloudLocationLocation] = js.native
  def get(
    params: ParamsResourceUiv1beta3ProjectsLocationsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudLocationLocation]
  ): Unit = js.native
  def get(
    params: ParamsResourceUiv1beta3ProjectsLocationsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudLocationLocation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudLocationLocation]
  ): Unit = js.native
  def get(params: ParamsResourceUiv1beta3ProjectsLocationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudLocationLocation] = js.native
  def get(
    params: ParamsResourceUiv1beta3ProjectsLocationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudLocationLocation]
  ): Unit = js.native
  /**
    * Gets information about a location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/documentai.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const documentai = google.documentai('v1');
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
    *   const res = await documentai.uiv1beta3.projects.locations.get({
    *     // Resource name for the location.
    *     name: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "labels": {},
    *   //   "locationId": "my_locationId",
    *   //   "metadata": {},
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
  def get(params: ParamsResourceUiv1beta3ProjectsLocationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUiv1beta3ProjectsLocationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudLocationListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudLocationListLocationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudLocationListLocationsResponse] = js.native
  def list(params: ParamsResourceUiv1beta3ProjectsLocationsList): GaxiosPromise[SchemaGoogleCloudLocationListLocationsResponse] = js.native
  def list(
    params: ParamsResourceUiv1beta3ProjectsLocationsList,
    callback: BodyResponseCallback[SchemaGoogleCloudLocationListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUiv1beta3ProjectsLocationsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudLocationListLocationsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudLocationListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUiv1beta3ProjectsLocationsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudLocationListLocationsResponse] = js.native
  def list(
    params: ParamsResourceUiv1beta3ProjectsLocationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudLocationListLocationsResponse]
  ): Unit = js.native
  /**
    * Lists information about the supported locations for this service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/documentai.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const documentai = google.documentai('v1');
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
    *   const res = await documentai.uiv1beta3.projects.locations.list({
    *     // A filter to narrow down results to a preferred subset. The filtering language accepts strings like `"displayName=tokyo"`, and is documented in more detail in [AIP-160](https://google.aip.dev/160).
    *     filter: 'placeholder-value',
    *     // The resource that owns the locations collection, if applicable.
    *     name: 'projects/my-project',
    *     // The maximum number of results to return. If not set, the service selects a default.
    *     pageSize: 'placeholder-value',
    *     // A page token received from the `next_page_token` field in the response. Send that page token to receive the subsequent page.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "locations": [],
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
  def list(params: ParamsResourceUiv1beta3ProjectsLocationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUiv1beta3ProjectsLocationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceUiv1beta3ProjectsLocationsOperations = js.native
}
