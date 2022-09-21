package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/playablelocations/v3", "playablelocations_v3.Resource$V3")
@js.native
open class ResourceV3 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def logImpressions(): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3LogImpressionsResponse] = js.native
  def logImpressions(callback: BodyResponseCallback[SchemaGoogleMapsPlayablelocationsV3LogImpressionsResponse]): Unit = js.native
  def logImpressions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3LogImpressionsResponse] = js.native
  def logImpressions(params: ParamsResourceV3Logimpressions): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3LogImpressionsResponse] = js.native
  def logImpressions(
    params: ParamsResourceV3Logimpressions,
    callback: BodyResponseCallback[SchemaGoogleMapsPlayablelocationsV3LogImpressionsResponse]
  ): Unit = js.native
  def logImpressions(
    params: ParamsResourceV3Logimpressions,
    options: BodyResponseCallback[Readable | SchemaGoogleMapsPlayablelocationsV3LogImpressionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleMapsPlayablelocationsV3LogImpressionsResponse]
  ): Unit = js.native
  def logImpressions(params: ParamsResourceV3Logimpressions, options: MethodOptions): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3LogImpressionsResponse] = js.native
  def logImpressions(
    params: ParamsResourceV3Logimpressions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleMapsPlayablelocationsV3LogImpressionsResponse]
  ): Unit = js.native
  /**
    * Logs new events when playable locations are displayed, and when they are interacted with. Impressions are not partially saved; either all impressions are saved and this request succeeds, or no impressions are saved, and this request fails.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/playablelocations.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const playablelocations = google.playablelocations('v3');
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
    *   const res = await playablelocations.logImpressions({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientInfo": {},
    *       //   "impressions": [],
    *       //   "requestId": "my_requestId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def logImpressions(params: ParamsResourceV3Logimpressions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def logImpressions(
    params: ParamsResourceV3Logimpressions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def logPlayerReports(): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsResponse] = js.native
  def logPlayerReports(callback: BodyResponseCallback[SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsResponse]): Unit = js.native
  def logPlayerReports(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsResponse] = js.native
  def logPlayerReports(params: ParamsResourceV3Logplayerreports): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsResponse] = js.native
  def logPlayerReports(
    params: ParamsResourceV3Logplayerreports,
    callback: BodyResponseCallback[SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsResponse]
  ): Unit = js.native
  def logPlayerReports(
    params: ParamsResourceV3Logplayerreports,
    options: BodyResponseCallback[Readable | SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsResponse]
  ): Unit = js.native
  def logPlayerReports(params: ParamsResourceV3Logplayerreports, options: MethodOptions): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsResponse] = js.native
  def logPlayerReports(
    params: ParamsResourceV3Logplayerreports,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsResponse]
  ): Unit = js.native
  /**
    * Logs bad playable location reports submitted by players. Reports are not partially saved; either all reports are saved and this request succeeds, or no reports are saved, and this request fails.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/playablelocations.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const playablelocations = google.playablelocations('v3');
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
    *   const res = await playablelocations.logPlayerReports({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientInfo": {},
    *       //   "playerReports": [],
    *       //   "requestId": "my_requestId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def logPlayerReports(params: ParamsResourceV3Logplayerreports, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def logPlayerReports(
    params: ParamsResourceV3Logplayerreports,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def samplePlayableLocations(): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse] = js.native
  def samplePlayableLocations(callback: BodyResponseCallback[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse]): Unit = js.native
  def samplePlayableLocations(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse] = js.native
  def samplePlayableLocations(params: ParamsResourceV3Sampleplayablelocations): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse] = js.native
  def samplePlayableLocations(
    params: ParamsResourceV3Sampleplayablelocations,
    callback: BodyResponseCallback[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse]
  ): Unit = js.native
  def samplePlayableLocations(
    params: ParamsResourceV3Sampleplayablelocations,
    options: BodyResponseCallback[Readable | SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse]
  ): Unit = js.native
  def samplePlayableLocations(params: ParamsResourceV3Sampleplayablelocations, options: MethodOptions): GaxiosPromise[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse] = js.native
  def samplePlayableLocations(
    params: ParamsResourceV3Sampleplayablelocations,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse]
  ): Unit = js.native
  /**
    * Returns a set of playable locations that lie within a specified area, that satisfy optional filter criteria. Note: Identical `SamplePlayableLocations` requests can return different results as the state of the world changes over time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/playablelocations.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const playablelocations = google.playablelocations('v3');
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
    *   const res = await playablelocations.samplePlayableLocations({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "areaFilter": {},
    *       //   "criteria": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "locationsPerGameObjectType": {},
    *   //   "ttl": "my_ttl"
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
  def samplePlayableLocations(params: ParamsResourceV3Sampleplayablelocations, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def samplePlayableLocations(
    params: ParamsResourceV3Sampleplayablelocations,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
