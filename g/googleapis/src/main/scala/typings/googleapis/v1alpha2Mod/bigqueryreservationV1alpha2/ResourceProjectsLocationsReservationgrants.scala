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

@JSImport("googleapis/build/src/apis/bigqueryreservation/v1alpha2", "bigqueryreservation_v1alpha2.Resource$Projects$Locations$Reservationgrants")
@js.native
open class ResourceProjectsLocationsReservationgrants protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaReservationGrant] = js.native
  def create(callback: BodyResponseCallback[SchemaReservationGrant]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReservationGrant] = js.native
  def create(params: ParamsResourceProjectsLocationsReservationgrantsCreate): GaxiosPromise[SchemaReservationGrant] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationgrantsCreate,
    callback: BodyResponseCallback[SchemaReservationGrant]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationgrantsCreate,
    options: BodyResponseCallback[Readable | SchemaReservationGrant],
    callback: BodyResponseCallback[Readable | SchemaReservationGrant]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsReservationgrantsCreate, options: MethodOptions): GaxiosPromise[SchemaReservationGrant] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationgrantsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReservationGrant]
  ): Unit = js.native
  /**
    * Returns `google.rpc.Code.PERMISSION_DENIED` if user does not have 'bigquery.admin' permissions on the project using the reservation and the project that owns this reservation. Returns `google.rpc.Code.INVALID_ARGUMENT` when location of the grant does not match location of the reservation.
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
    *   const res = await bigqueryreservation.projects.locations.reservationGrants.create(
    *     {
    *       // The parent resource name of the reservation grant E.g.: projects/myproject/location/eu.
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "grantee": "my_grantee",
    *         //   "jobType": "my_jobType",
    *         //   "name": "my_name",
    *         //   "reservation": "my_reservation",
    *         //   "state": "my_state"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "grantee": "my_grantee",
    *   //   "jobType": "my_jobType",
    *   //   "name": "my_name",
    *   //   "reservation": "my_reservation",
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
  def create(params: ParamsResourceProjectsLocationsReservationgrantsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsReservationgrantsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsReservationgrantsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationgrantsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationgrantsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsReservationgrantsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationgrantsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a reservation grant. No expansion will happen. E.g: organizationA contains project1 and project2. Reservation res1 exists. CreateReservationGrant was invoked previously and following grants were created explicitly: Then deletion of won't affect . After deletion of , queries from project1 will still use res1, while queries from project2 will use on-demand mode.
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
    *   const res = await bigqueryreservation.projects.locations.reservationGrants.delete(
    *     {
    *       // Name of the resource, e.g.: projects/myproject/locations/eu/reservationGrants/123
    *       name:
    *         'projects/my-project/locations/my-location/reservationGrants/my-reservationGrant',
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
  def delete(params: ParamsResourceProjectsLocationsReservationgrantsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsReservationgrantsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReservationGrantsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReservationGrantsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReservationGrantsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsReservationgrantsList): GaxiosPromise[SchemaListReservationGrantsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationgrantsList,
    callback: BodyResponseCallback[SchemaListReservationGrantsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationgrantsList,
    options: BodyResponseCallback[Readable | SchemaListReservationGrantsResponse],
    callback: BodyResponseCallback[Readable | SchemaListReservationGrantsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsReservationgrantsList, options: MethodOptions): GaxiosPromise[SchemaListReservationGrantsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationgrantsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReservationGrantsResponse]
  ): Unit = js.native
  /**
    * Lists reservation grants. Only explicitly created grants will be returned. E.g: organizationA contains project1 and project2. Reservation res1 exists. CreateReservationGrant was invoked previously and following grants were created explicitly: Then this API will just return the above two grants for reservation res1, and no expansion/merge will happen.
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
    *   const res = await bigqueryreservation.projects.locations.reservationGrants.list(
    *     {
    *       // The maximum number of items to return.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous List request, if any.
    *       pageToken: 'placeholder-value',
    *       // The parent resource name e.g.: projects/myproject/location/eu.
    *       parent: 'projects/my-project/locations/my-location',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "reservationGrants": []
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
  def list(params: ParamsResourceProjectsLocationsReservationgrantsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsReservationgrantsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
