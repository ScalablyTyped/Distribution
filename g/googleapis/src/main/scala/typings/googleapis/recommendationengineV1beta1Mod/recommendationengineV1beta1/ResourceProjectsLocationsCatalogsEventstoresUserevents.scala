package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/recommendationengine/v1beta1", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Eventstores$Userevents")
@js.native
open class ResourceProjectsLocationsCatalogsEventstoresUserevents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def collect(): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def collect(callback: BodyResponseCallback[SchemaGoogleApiHttpBody]): Unit = js.native
  def collect(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def collect(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def collect(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect,
    callback: BodyResponseCallback[SchemaGoogleApiHttpBody]
  ): Unit = js.native
  def collect(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect,
    options: BodyResponseCallback[Readable | SchemaGoogleApiHttpBody],
    callback: BodyResponseCallback[Readable | SchemaGoogleApiHttpBody]
  ): Unit = js.native
  def collect(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def collect(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleApiHttpBody]
  ): Unit = js.native
  /**
    * Writes a single user event from the browser. This uses a GET request to due to browser restriction of POST-ing to a 3rd party domain. This method is used only by the Recommendations AI JavaScript pixel. Users should not call this method directly.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommendationengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommendationengine = google.recommendationengine('v1beta1');
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
    *   const res =
    *     await recommendationengine.projects.locations.catalogs.eventStores.userEvents.collect(
    *       {
    *         // Optional. The event timestamp in milliseconds. This prevents browser caching of otherwise identical get requests. The name is abbreviated to reduce the payload bytes.
    *         ets: 'placeholder-value',
    *         // Required. The parent eventStore name, such as `projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store`.
    *         parent:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/eventStores/my-eventStore',
    *         // Optional. The url including cgi-parameters but excluding the hash fragment. The URL must be truncated to 1.5K bytes to conservatively be under the 2K bytes. This is often more useful than the referer url, because many browsers only send the domain for 3rd party requests.
    *         uri: 'placeholder-value',
    *         // Required. URL encoded UserEvent proto.
    *         userEvent: 'placeholder-value',
    *       }
    *     );
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
  def collect(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def collect(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsCollect,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def `import`(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsImport): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsImport,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsImport,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsImport, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Bulk import of User events. Request processing might be synchronous. Events that already exist are skipped. Use this method for backfilling historical user events. Operation.response is of type ImportResponse. Note that it is possible for a subset of the items to be successfully inserted. Operation.metadata is of type ImportMetadata.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommendationengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommendationengine = google.recommendationengine('v1beta1');
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
    *   const res =
    *     await recommendationengine.projects.locations.catalogs.eventStores.userEvents.import(
    *       {
    *         // Required. `projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store`
    *         parent:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/eventStores/my-eventStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "errorsConfig": {},
    *           //   "inputConfig": {},
    *           //   "requestId": "my_requestId"
    *           // }
    *         },
    *       }
    *     );
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
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsImport,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsList): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse]
  ): Unit = js.native
  /**
    * Gets a list of user events within a time range, with potential filtering. The method does not list unjoined user events. Unjoined user event definition: when a user event is ingested from Recommendations AI User Event APIs, the catalog item included in the user event is connected with the current catalog. If a catalog item of the ingested event is not in the current catalog, it could lead to degraded model quality. This is called an unjoined event.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommendationengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommendationengine = google.recommendationengine('v1beta1');
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
    *   const res =
    *     await recommendationengine.projects.locations.catalogs.eventStores.userEvents.list(
    *       {
    *         // Optional. Filtering expression to specify restrictions over returned events. This is a sequence of terms, where each term applies some kind of a restriction to the returned user events. Use this expression to restrict results to a specific time range, or filter events by eventType. eg: eventTime \> "2012-04-23T18:25:43.511Z" eventsMissingCatalogItems eventTime<"2012-04-23T18:25:43.511Z" eventType=search We expect only 3 types of fields: * eventTime: this can be specified a maximum of 2 times, once with a less than operator and once with a greater than operator. The eventTime restrict should result in one contiguous valid eventTime range. * eventType: only 1 eventType restriction can be specified. * eventsMissingCatalogItems: specififying this will restrict results to events for which catalog items were not found in the catalog. The default behavior is to return only those events for which catalog items were found. Some examples of valid filters expressions: * Example 1: eventTime \> "2012-04-23T18:25:43.511Z" eventTime < "2012-04-23T18:30:43.511Z" * Example 2: eventTime \> "2012-04-23T18:25:43.511Z" eventType = detail-page-view * Example 3: eventsMissingCatalogItems eventType = search eventTime < "2018-04-23T18:30:43.511Z" * Example 4: eventTime \> "2012-04-23T18:25:43.511Z" * Example 5: eventType = search * Example 6: eventsMissingCatalogItems
    *         filter: 'placeholder-value',
    *         // Optional. Maximum number of results to return per page. If zero, the service will choose a reasonable default.
    *         pageSize: 'placeholder-value',
    *         // Optional. The previous ListUserEventsResponse.next_page_token.
    *         pageToken: 'placeholder-value',
    *         // Required. The parent eventStore resource name, such as `projects/x/locations/x/catalogs/default_catalog/eventStores/default_event_store`.
    *         parent:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/eventStores/my-eventStore',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "userEvents": []
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
  def list(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def purge(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def purge(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def purge(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def purge(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def purge(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def purge(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def purge(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def purge(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deletes permanently all user events specified by the filter provided. Depending on the number of events specified by the filter, this operation could take hours or days to complete. To test a filter, use the list command first.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommendationengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommendationengine = google.recommendationengine('v1beta1');
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
    *   const res =
    *     await recommendationengine.projects.locations.catalogs.eventStores.userEvents.purge(
    *       {
    *         // Required. The resource name of the event_store under which the events are created. The format is `projects/${projectId\}/locations/global/catalogs/${catalogId\}/eventStores/${eventStoreId\}`
    *         parent:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/eventStores/my-eventStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "filter": "my_filter",
    *           //   "force": false
    *           // }
    *         },
    *       }
    *     );
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
  def purge(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def purge(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rejoin(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def rejoin(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def rejoin(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def rejoin(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsRejoin): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def rejoin(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsRejoin,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def rejoin(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsRejoin,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def rejoin(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsRejoin, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def rejoin(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsRejoin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Triggers a user event rejoin operation with latest catalog data. Events will not be annotated with detailed catalog information if catalog item is missing at the time the user event is ingested, and these events are stored as unjoined events with a limited usage on training and serving. This API can be used to trigger a 'join' operation on specified events with latest version of catalog items. It can also be used to correct events joined with wrong catalog items.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommendationengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommendationengine = google.recommendationengine('v1beta1');
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
    *   const res =
    *     await recommendationengine.projects.locations.catalogs.eventStores.userEvents.rejoin(
    *       {
    *         // Required. Full resource name of user event, such as `projects/x/locations/x/catalogs/default_catalog/eventStores/default_event_store`.
    *         parent:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/eventStores/my-eventStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "userEventRejoinScope": "my_userEventRejoinScope"
    *           // }
    *         },
    *       }
    *     );
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
  def rejoin(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsRejoin,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def rejoin(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsRejoin,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def write(): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1UserEvent] = js.native
  def write(callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1UserEvent]): Unit = js.native
  def write(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1UserEvent] = js.native
  def write(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsWrite): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1UserEvent] = js.native
  def write(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsWrite,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1UserEvent]
  ): Unit = js.native
  def write(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsWrite,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1UserEvent],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecommendationengineV1beta1UserEvent]
  ): Unit = js.native
  def write(params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsWrite, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecommendationengineV1beta1UserEvent] = js.native
  def write(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsWrite,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecommendationengineV1beta1UserEvent]
  ): Unit = js.native
  /**
    * Writes a single user event.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recommendationengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recommendationengine = google.recommendationengine('v1beta1');
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
    *   const res =
    *     await recommendationengine.projects.locations.catalogs.eventStores.userEvents.write(
    *       {
    *         // Required. The parent eventStore resource name, such as "projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store".
    *         parent:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/eventStores/my-eventStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "eventDetail": {},
    *           //   "eventSource": "my_eventSource",
    *           //   "eventTime": "my_eventTime",
    *           //   "eventType": "my_eventType",
    *           //   "productEventDetail": {},
    *           //   "userInfo": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "eventDetail": {},
    *   //   "eventSource": "my_eventSource",
    *   //   "eventTime": "my_eventTime",
    *   //   "eventType": "my_eventType",
    *   //   "productEventDetail": {},
    *   //   "userInfo": {}
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
  def write(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsWrite,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def write(
    params: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsWrite,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
