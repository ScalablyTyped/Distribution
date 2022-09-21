package typings.googleapis.retailV2alphaMod.retailV2alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/retail/v2alpha", "retail_v2alpha.Resource$Projects$Locations$Catalogs$Userevents")
@js.native
open class ResourceProjectsLocationsCatalogsUserevents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def collect(): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def collect(callback: BodyResponseCallback[SchemaGoogleApiHttpBody]): Unit = js.native
  def collect(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def collect(params: ParamsResourceProjectsLocationsCatalogsUsereventsCollect): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def collect(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsCollect,
    callback: BodyResponseCallback[SchemaGoogleApiHttpBody]
  ): Unit = js.native
  def collect(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsCollect,
    options: BodyResponseCallback[Readable | SchemaGoogleApiHttpBody],
    callback: BodyResponseCallback[Readable | SchemaGoogleApiHttpBody]
  ): Unit = js.native
  def collect(params: ParamsResourceProjectsLocationsCatalogsUsereventsCollect, options: MethodOptions): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def collect(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsCollect,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleApiHttpBody]
  ): Unit = js.native
  /**
    * Writes a single user event from the browser. This uses a GET request to due to browser restriction of POST-ing to a 3rd party domain. This method is used only by the Retail API JavaScript pixel and Google Tag Manager. Users should not call this method directly.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.userEvents.collect({
    *     // The event timestamp in milliseconds. This prevents browser caching of otherwise identical get requests. The name is abbreviated to reduce the payload bytes.
    *     ets: 'placeholder-value',
    *     // Required. The parent catalog name, such as `projects/1234/locations/global/catalogs/default_catalog`.
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *     // The URL including cgi-parameters but excluding the hash fragment with a length limit of 5,000 characters. This is often more useful than the referer URL, because many browsers only send the domain for 3rd party requests.
    *     uri: 'placeholder-value',
    *     // Required. URL encoded UserEvent proto with a length limit of 2,000,000 characters.
    *     userEvent: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def collect(params: ParamsResourceProjectsLocationsCatalogsUsereventsCollect, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def collect(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsCollect,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def `import`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(params: ParamsResourceProjectsLocationsCatalogsUsereventsImport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsImport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsImport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsCatalogsUsereventsImport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Bulk import of User events. Request processing might be synchronous. Events that already exist are skipped. Use this method for backfilling historical user events. `Operation.response` is of type `ImportResponse`. Note that it is possible for a subset of the items to be successfully inserted. `Operation.metadata` is of type `ImportMetadata`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.userEvents.import({
    *     // Required. `projects/1234/locations/global/catalogs/default_catalog`
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "errorsConfig": {},
    *       //   "inputConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def `import`(params: ParamsResourceProjectsLocationsCatalogsUsereventsImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def purge(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def purge(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def purge(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def purge(params: ParamsResourceProjectsLocationsCatalogsUsereventsPurge): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def purge(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsPurge,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def purge(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsPurge,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def purge(params: ParamsResourceProjectsLocationsCatalogsUsereventsPurge, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def purge(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsPurge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deletes permanently all user events specified by the filter provided. Depending on the number of events specified by the filter, this operation could take hours or days to complete. To test a filter, use the list command first.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.userEvents.purge({
    *     // Required. The resource name of the catalog under which the events are created. The format is `projects/${projectId\}/locations/global/catalogs/${catalogId\}`
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "filter": "my_filter",
    *       //   "force": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def purge(params: ParamsResourceProjectsLocationsCatalogsUsereventsPurge, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def purge(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsPurge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rejoin(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def rejoin(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def rejoin(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def rejoin(params: ParamsResourceProjectsLocationsCatalogsUsereventsRejoin): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def rejoin(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsRejoin,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def rejoin(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsRejoin,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def rejoin(params: ParamsResourceProjectsLocationsCatalogsUsereventsRejoin, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def rejoin(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsRejoin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Starts a user event rejoin operation with latest product catalog. Events will not be annotated with detailed product information if product is missing from the catalog at the time the user event is ingested, and these events are stored as unjoined events with a limited usage on training and serving. This method can be used to start a join operation on specified events with latest version of product catalog. It can also be used to correct events joined with the wrong product catalog. A rejoin operation can take hours or days to complete.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.userEvents.rejoin({
    *     // Required. The parent catalog resource name, such as `projects/1234/locations/global/catalogs/default_catalog`.
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "userEventRejoinScope": "my_userEventRejoinScope"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def rejoin(params: ParamsResourceProjectsLocationsCatalogsUsereventsRejoin, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rejoin(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsRejoin,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def write(): GaxiosPromise[SchemaGoogleCloudRetailV2alphaUserEvent] = js.native
  def write(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaUserEvent]): Unit = js.native
  def write(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaUserEvent] = js.native
  def write(params: ParamsResourceProjectsLocationsCatalogsUsereventsWrite): GaxiosPromise[SchemaGoogleCloudRetailV2alphaUserEvent] = js.native
  def write(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsWrite,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaUserEvent]
  ): Unit = js.native
  def write(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsWrite,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaUserEvent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2alphaUserEvent]
  ): Unit = js.native
  def write(params: ParamsResourceProjectsLocationsCatalogsUsereventsWrite, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2alphaUserEvent] = js.native
  def write(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsWrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2alphaUserEvent]
  ): Unit = js.native
  /**
    * Writes a single user event.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2alpha');
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
    *   const res = await retail.projects.locations.catalogs.userEvents.write({
    *     // Required. The parent catalog resource name, such as `projects/1234/locations/global/catalogs/default_catalog`.
    *     parent: 'projects/my-project/locations/my-location/catalogs/my-catalog',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attributes": {},
    *       //   "attributionToken": "my_attributionToken",
    *       //   "cartId": "my_cartId",
    *       //   "completionDetail": {},
    *       //   "eventTime": "my_eventTime",
    *       //   "eventType": "my_eventType",
    *       //   "experimentIds": [],
    *       //   "filter": "my_filter",
    *       //   "offset": 0,
    *       //   "orderBy": "my_orderBy",
    *       //   "pageCategories": [],
    *       //   "pageViewId": "my_pageViewId",
    *       //   "productDetails": [],
    *       //   "purchaseTransaction": {},
    *       //   "referrerUri": "my_referrerUri",
    *       //   "searchQuery": "my_searchQuery",
    *       //   "sessionId": "my_sessionId",
    *       //   "uri": "my_uri",
    *       //   "userInfo": {},
    *       //   "visitorId": "my_visitorId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributes": {},
    *   //   "attributionToken": "my_attributionToken",
    *   //   "cartId": "my_cartId",
    *   //   "completionDetail": {},
    *   //   "eventTime": "my_eventTime",
    *   //   "eventType": "my_eventType",
    *   //   "experimentIds": [],
    *   //   "filter": "my_filter",
    *   //   "offset": 0,
    *   //   "orderBy": "my_orderBy",
    *   //   "pageCategories": [],
    *   //   "pageViewId": "my_pageViewId",
    *   //   "productDetails": [],
    *   //   "purchaseTransaction": {},
    *   //   "referrerUri": "my_referrerUri",
    *   //   "searchQuery": "my_searchQuery",
    *   //   "sessionId": "my_sessionId",
    *   //   "uri": "my_uri",
    *   //   "userInfo": {},
    *   //   "visitorId": "my_visitorId"
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
  def write(params: ParamsResourceProjectsLocationsCatalogsUsereventsWrite, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def write(
    params: ParamsResourceProjectsLocationsCatalogsUsereventsWrite,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
