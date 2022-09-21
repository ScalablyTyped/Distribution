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

@JSImport("googleapis/build/src/apis/bigqueryreservation/v1alpha2", "bigqueryreservation_v1alpha2.Resource$Projects$Locations$Reservations$Slotpools")
@js.native
open class ResourceProjectsLocationsReservationsSlotpools protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsReservationsSlotpoolsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsReservationsSlotpoolsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a slot pool. Attempting to delete slot pool before its commitment_end_time will fail with the error code `google.rpc.Code.FAILED_PRECONDITION`.
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
    *   const res = await bigqueryreservation.projects.locations.reservations.slotPools.delete(
    *     {
    *       // Resource name of the slot pool to delete. E.g., projects/myproject/locations/us-central1/reservations/my_reservation/slotPools/123
    *       name:
    *         'projects/my-project/locations/my-location/reservations/my-reservation/slotPools/my-slotPool',
    *     }
    *   );
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
  def delete(params: ParamsResourceProjectsLocationsReservationsSlotpoolsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSlotPool] = js.native
  def get(callback: BodyResponseCallback[SchemaSlotPool]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSlotPool] = js.native
  def get(params: ParamsResourceProjectsLocationsReservationsSlotpoolsGet): GaxiosPromise[SchemaSlotPool] = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsGet,
    callback: BodyResponseCallback[SchemaSlotPool]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsGet,
    options: BodyResponseCallback[Readable | SchemaSlotPool],
    callback: BodyResponseCallback[Readable | SchemaSlotPool]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsReservationsSlotpoolsGet, options: MethodOptions): GaxiosPromise[SchemaSlotPool] = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSlotPool]
  ): Unit = js.native
  /**
    * Returns information about the slot pool.
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
    *   const res = await bigqueryreservation.projects.locations.reservations.slotPools.get(
    *     {
    *       // Resource name of the slot pool to retrieve. E.g., projects/myproject/locations/us-central1/reservations/my_reservation/slotPools/123
    *       name:
    *         'projects/my-project/locations/my-location/reservations/my-reservation/slotPools/my-slotPool',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "commitmentEndTime": "my_commitmentEndTime",
    *   //   "failureStatus": {},
    *   //   "name": "my_name",
    *   //   "plan": "my_plan",
    *   //   "slotCount": "my_slotCount",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceProjectsLocationsReservationsSlotpoolsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSlotPoolsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSlotPoolsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSlotPoolsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsReservationsSlotpoolsList): GaxiosPromise[SchemaListSlotPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsList,
    callback: BodyResponseCallback[SchemaListSlotPoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsList,
    options: BodyResponseCallback[Readable | SchemaListSlotPoolsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSlotPoolsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsReservationsSlotpoolsList, options: MethodOptions): GaxiosPromise[SchemaListSlotPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSlotPoolsResponse]
  ): Unit = js.native
  /**
    * Lists all the slot pools for the reservation.
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
    *   const res = await bigqueryreservation.projects.locations.reservations.slotPools.list(
    *     {
    *       // The maximum number of items to return.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous List request, if any.
    *       pageToken: 'placeholder-value',
    *       // Resource name of the parent reservation. Only top-level reservations can have slot pools. E.g., projects/myproject/locations/us-central1/reservations/my_reservation
    *       parent:
    *         'projects/my-project/locations/my-location/reservations/my-reservation',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "slotPools": []
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
  def list(params: ParamsResourceProjectsLocationsReservationsSlotpoolsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationsSlotpoolsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
