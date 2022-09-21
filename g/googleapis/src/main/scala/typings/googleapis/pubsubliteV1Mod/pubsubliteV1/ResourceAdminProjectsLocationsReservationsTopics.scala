package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsublite/v1", "pubsublite_v1.Resource$Admin$Projects$Locations$Reservations$Topics")
@js.native
open class ResourceAdminProjectsLocationsReservationsTopics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListReservationTopicsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReservationTopicsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReservationTopicsResponse] = js.native
  def list(params: ParamsResourceAdminProjectsLocationsReservationsTopicsList): GaxiosPromise[SchemaListReservationTopicsResponse] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsReservationsTopicsList,
    callback: BodyResponseCallback[SchemaListReservationTopicsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsReservationsTopicsList,
    options: BodyResponseCallback[Readable | SchemaListReservationTopicsResponse],
    callback: BodyResponseCallback[Readable | SchemaListReservationTopicsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdminProjectsLocationsReservationsTopicsList, options: MethodOptions): GaxiosPromise[SchemaListReservationTopicsResponse] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsReservationsTopicsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReservationTopicsResponse]
  ): Unit = js.native
  /**
    * Lists the topics attached to the specified reservation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsublite.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsublite = google.pubsublite('v1');
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
    *     await pubsublite.admin.projects.locations.reservations.topics.list({
    *       // Required. The name of the reservation whose topics to list. Structured like: projects/{project_number\}/locations/{location\}/reservations/{reservation_id\}
    *       name: 'projects/my-project/locations/my-location/reservations/my-reservation',
    *       // The maximum number of topics to return. The service may return fewer than this value. If unset or zero, all topics for the given reservation will be returned.
    *       pageSize: 'placeholder-value',
    *       // A page token, received from a previous `ListReservationTopics` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListReservationTopics` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "topics": []
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
  def list(params: ParamsResourceAdminProjectsLocationsReservationsTopicsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsReservationsTopicsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
