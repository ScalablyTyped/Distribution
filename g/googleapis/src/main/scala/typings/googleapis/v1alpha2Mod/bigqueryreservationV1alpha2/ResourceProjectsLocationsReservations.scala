package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigqueryreservation/v1alpha2", "bigqueryreservation_v1alpha2.Resource$Projects$Locations$Reservations")
@js.native
open class ResourceProjectsLocationsReservations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaReservation] = js.native
  def create(callback: BodyResponseCallback[SchemaReservation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def create(params: ParamsResourceProjectsLocationsReservationsCreate): GaxiosPromise[SchemaReservation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsCreate,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsCreate,
    options: BodyResponseCallback[Readable | SchemaReservation],
    callback: BodyResponseCallback[Readable | SchemaReservation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsReservationsCreate, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  /**
    * Creates a new reservation resource. Multiple reservations are created if the ancestor reservations do not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigqueryreservation.projects.locations.reservations.create({
    *     // Project, location, and (optionally) reservation name. E.g., projects/myproject/locations/us-central1/reservations/parent
    *     parent: 'projects/my-project/locations/my-location',
    *     // The reservation ID relative to the parent, e.g., "dev". This field must only contain alphanumeric characters.
    *     reservationId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "slotCapacity": "my_slotCapacity",
    *       //   "useParentReservation": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "slotCapacity": "my_slotCapacity",
    *   //   "useParentReservation": false
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
  def create(params: ParamsResourceProjectsLocationsReservationsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def createReservation(): GaxiosPromise[SchemaReservation] = js.native
  def createReservation(callback: BodyResponseCallback[SchemaReservation]): Unit = js.native
  def createReservation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def createReservation(params: ParamsResourceProjectsLocationsReservationsCreatereservation): GaxiosPromise[SchemaReservation] = js.native
  def createReservation(
    params: ParamsResourceProjectsLocationsReservationsCreatereservation,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  def createReservation(
    params: ParamsResourceProjectsLocationsReservationsCreatereservation,
    options: BodyResponseCallback[Readable | SchemaReservation],
    callback: BodyResponseCallback[Readable | SchemaReservation]
  ): Unit = js.native
  def createReservation(params: ParamsResourceProjectsLocationsReservationsCreatereservation, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def createReservation(
    params: ParamsResourceProjectsLocationsReservationsCreatereservation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  /**
    * Creates a new reservation resource. Multiple reservations are created if the ancestor reservations do not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigqueryreservation.projects.locations.reservations.createReservation(
    *     {
    *       // Project, location, and (optionally) reservation name. E.g., projects/myproject/locations/us-central1/reservations/parent
    *       parent: 'projects/my-project/locations/my-location/reservations/.*',
    *       // The reservation ID relative to the parent, e.g., "dev". This field must only contain alphanumeric characters.
    *       reservationId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "name": "my_name",
    *         //   "slotCapacity": "my_slotCapacity",
    *         //   "useParentReservation": false
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "slotCapacity": "my_slotCapacity",
    *   //   "useParentReservation": false
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
  def createReservation(params: ParamsResourceProjectsLocationsReservationsCreatereservation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createReservation(
    params: ParamsResourceProjectsLocationsReservationsCreatereservation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsReservationsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsReservationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a reservation. Returns `google.rpc.Code.FAILED_PRECONDITION` in the following cases: 1. When reservation has child reservations. This check can be bypassed by setting DeleteReservationRequest.force flag to true. 2. When top-level reservation with slot pools is being deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigqueryreservation.projects.locations.reservations.delete({
    *     // If true, deletes all the child reservations of the given reservation. Otherwise, attempting to delete a reservation that has child reservations will fail with error code `google.rpc.Code.FAILED_PRECONDITION`.
    *     force: 'placeholder-value',
    *     // Resource name of the reservation to retrieve. E.g., projects/myproject/locations/us-central1/reservations/my_reservation
    *     name: 'projects/my-project/locations/my-location/reservations/.*',
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
  def delete(params: ParamsResourceProjectsLocationsReservationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaReservation] = js.native
  def get(callback: BodyResponseCallback[SchemaReservation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def get(params: ParamsResourceProjectsLocationsReservationsGet): GaxiosPromise[SchemaReservation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsGet,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsGet,
    options: BodyResponseCallback[Readable | SchemaReservation],
    callback: BodyResponseCallback[Readable | SchemaReservation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsReservationsGet, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  /**
    * Returns information about the reservation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigqueryreservation.projects.locations.reservations.get({
    *     // Resource name of the reservation to retrieve. E.g., projects/myproject/locations/us-central1/reservations/path/to/reserv
    *     name: 'projects/my-project/locations/my-location/reservations/.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "slotCapacity": "my_slotCapacity",
    *   //   "useParentReservation": false
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
  def get(params: ParamsResourceProjectsLocationsReservationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReservationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsReservationsList): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsList,
    callback: BodyResponseCallback[SchemaListReservationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsList,
    options: BodyResponseCallback[Readable | SchemaListReservationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListReservationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsReservationsList, options: MethodOptions): GaxiosPromise[SchemaListReservationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReservationsResponse]
  ): Unit = js.native
  /**
    * Lists all the reservations for the project in the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigqueryreservation.projects.locations.reservations.list({
    *     // Can be used to filter out reservations based on names, capacity, etc, e.g.: filter="reservation.slot_capacity \> 200" filter="reservation.name = \"*dev/x\"" Advanced filtering syntax can be [here](https://cloud.google.com/logging/docs/view/advanced-filters).
    *     filter: 'placeholder-value',
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // The parent resource name containing project and location, e.g.: "projects/myproject/locations/us-central1"
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
  def list(params: ParamsResourceProjectsLocationsReservationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaReservation] = js.native
  def patch(callback: BodyResponseCallback[SchemaReservation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def patch(params: ParamsResourceProjectsLocationsReservationsPatch): GaxiosPromise[SchemaReservation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsPatch,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsPatch,
    options: BodyResponseCallback[Readable | SchemaReservation],
    callback: BodyResponseCallback[Readable | SchemaReservation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsReservationsPatch, options: MethodOptions): GaxiosPromise[SchemaReservation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservation]
  ): Unit = js.native
  /**
    * Updates an existing reservation resource. Applicable only for child reservations.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigqueryreservation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigqueryreservation = google.bigqueryreservation('v1alpha2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigqueryreservation.projects.locations.reservations.patch({
    *     // The resource name of the reservation, e.g., "projects/x/locations/x/reservations/dev/team/product". Reservation names (e.g., "dev/team/product") exceeding a depth of six will fail with `google.rpc.Code.INVALID_ARGUMENT`.
    *     name:
    *       'projects/my-project/locations/my-location/reservations/my-reservation/.*',
    *     // Standard field mask for the set of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "name": "my_name",
    *       //   "slotCapacity": "my_slotCapacity",
    *       //   "useParentReservation": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "slotCapacity": "my_slotCapacity",
    *   //   "useParentReservation": false
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
  def patch(params: ParamsResourceProjectsLocationsReservationsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsReservationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var slotPools: ResourceProjectsLocationsReservationsSlotpools = js.native
}
