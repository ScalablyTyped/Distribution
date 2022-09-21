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

@JSImport("googleapis/build/src/apis/pubsublite/v1", "pubsublite_v1.Resource$Admin$Projects$Locations$Reservations")
@js.native
open class ResourceAdminProjectsLocationsReservations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaReservation] = js.native
  def create(callback: BodyResponseCallback[SchemaReservation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def create(params: ParamsResourceAdminProjectsLocationsReservationsCreate): GaxiosPromise[SchemaReservation] = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsReservationsCreate,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsReservationsCreate,
    options: BodyResponseCallback[Readable | SchemaReservation],
    callback: BodyResponseCallback[Readable | SchemaReservation]
  ): Unit = js.native
  def create(params: ParamsResourceAdminProjectsLocationsReservationsCreate, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsReservationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  /**
    * Creates a new reservation.
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
    *   const res = await pubsublite.admin.projects.locations.reservations.create({
    *     // Required. The parent location in which to create the reservation. Structured like `projects/{project_number\}/locations/{location\}`.
    *     parent: 'projects/my-project/locations/my-location',
    *     // Required. The ID to use for the reservation, which will become the final component of the reservation's name. This value is structured like: `my-reservation-name`.
    *     reservationId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "throughputCapacity": "my_throughputCapacity"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "throughputCapacity": "my_throughputCapacity"
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
  def create(params: ParamsResourceAdminProjectsLocationsReservationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdminProjectsLocationsReservationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceAdminProjectsLocationsReservationsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsReservationsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsReservationsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAdminProjectsLocationsReservationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsReservationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified reservation.
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
    *   const res = await pubsublite.admin.projects.locations.reservations.delete({
    *     // Required. The name of the reservation to delete. Structured like: projects/{project_number\}/locations/{location\}/reservations/{reservation_id\}
    *     name: 'projects/my-project/locations/my-location/reservations/my-reservation',
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
  def delete(params: ParamsResourceAdminProjectsLocationsReservationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAdminProjectsLocationsReservationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaReservation] = js.native
  def get(callback: BodyResponseCallback[SchemaReservation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def get(params: ParamsResourceAdminProjectsLocationsReservationsGet): GaxiosPromise[SchemaReservation] = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsReservationsGet,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsReservationsGet,
    options: BodyResponseCallback[Readable | SchemaReservation],
    callback: BodyResponseCallback[Readable | SchemaReservation]
  ): Unit = js.native
  def get(params: ParamsResourceAdminProjectsLocationsReservationsGet, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsReservationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  /**
    * Returns the reservation configuration.
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
    *   const res = await pubsublite.admin.projects.locations.reservations.get({
    *     // Required. The name of the reservation whose configuration to return. Structured like: projects/{project_number\}/locations/{location\}/reservations/{reservation_id\}
    *     name: 'projects/my-project/locations/my-location/reservations/my-reservation',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "throughputCapacity": "my_throughputCapacity"
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
  def get(params: ParamsResourceAdminProjectsLocationsReservationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdminProjectsLocationsReservationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReservationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(params: ParamsResourceAdminProjectsLocationsReservationsList): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsReservationsList,
    callback: BodyResponseCallback[SchemaListReservationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsReservationsList,
    options: BodyResponseCallback[Readable | SchemaListReservationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListReservationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdminProjectsLocationsReservationsList, options: MethodOptions): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsReservationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReservationsResponse]
  ): Unit = js.native
  /**
    * Returns the list of reservations for the given project.
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
    *   const res = await pubsublite.admin.projects.locations.reservations.list({
    *     // The maximum number of reservations to return. The service may return fewer than this value. If unset or zero, all reservations for the parent will be returned.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListReservations` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListReservations` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent whose reservations are to be listed. Structured like `projects/{project_number\}/locations/{location\}`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "reservations": []
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
  def list(params: ParamsResourceAdminProjectsLocationsReservationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdminProjectsLocationsReservationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaReservation] = js.native
  def patch(callback: BodyResponseCallback[SchemaReservation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def patch(params: ParamsResourceAdminProjectsLocationsReservationsPatch): GaxiosPromise[SchemaReservation] = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsReservationsPatch,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsReservationsPatch,
    options: BodyResponseCallback[Readable | SchemaReservation],
    callback: BodyResponseCallback[Readable | SchemaReservation]
  ): Unit = js.native
  def patch(params: ParamsResourceAdminProjectsLocationsReservationsPatch, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsReservationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  /**
    * Updates properties of the specified reservation.
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
    *   const res = await pubsublite.admin.projects.locations.reservations.patch({
    *     // The name of the reservation. Structured like: projects/{project_number\}/locations/{location\}/reservations/{reservation_id\}
    *     name: 'projects/my-project/locations/my-location/reservations/my-reservation',
    *     // Required. A mask specifying the reservation fields to change.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "throughputCapacity": "my_throughputCapacity"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "throughputCapacity": "my_throughputCapacity"
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
  def patch(params: ParamsResourceAdminProjectsLocationsReservationsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdminProjectsLocationsReservationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var topics: ResourceAdminProjectsLocationsReservationsTopics = js.native
}
