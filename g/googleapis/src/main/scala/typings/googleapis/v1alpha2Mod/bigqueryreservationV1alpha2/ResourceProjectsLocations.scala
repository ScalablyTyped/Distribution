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

@JSImport("googleapis/build/src/apis/bigqueryreservation/v1alpha2", "bigqueryreservation_v1alpha2.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceProjectsLocationsOperations = js.native
  
  var reservationGrants: ResourceProjectsLocationsReservationgrants = js.native
  
  var reservations: ResourceProjectsLocationsReservations = js.native
  
  def searchReservationGrants(): GaxiosPromise[SchemaSearchReservationGrantsResponse] = js.native
  def searchReservationGrants(callback: BodyResponseCallback[SchemaSearchReservationGrantsResponse]): Unit = js.native
  def searchReservationGrants(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchReservationGrantsResponse] = js.native
  def searchReservationGrants(params: ParamsResourceProjectsLocationsSearchreservationgrants): GaxiosPromise[SchemaSearchReservationGrantsResponse] = js.native
  def searchReservationGrants(
    params: ParamsResourceProjectsLocationsSearchreservationgrants,
    callback: BodyResponseCallback[SchemaSearchReservationGrantsResponse]
  ): Unit = js.native
  def searchReservationGrants(
    params: ParamsResourceProjectsLocationsSearchreservationgrants,
    options: BodyResponseCallback[Readable | SchemaSearchReservationGrantsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchReservationGrantsResponse]
  ): Unit = js.native
  def searchReservationGrants(params: ParamsResourceProjectsLocationsSearchreservationgrants, options: MethodOptions): GaxiosPromise[SchemaSearchReservationGrantsResponse] = js.native
  def searchReservationGrants(
    params: ParamsResourceProjectsLocationsSearchreservationgrants,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchReservationGrantsResponse]
  ): Unit = js.native
  /**
    * Look up grants for a specified resource for a particular region. If the request is about a project: 1) Grants created on the project will be returned if they exist. 2) Otherwise grants created on the closest ancestor will be returned. 3) Grants for different JobTypes will all be returned. Same logic applies if the request is about a folder. If the request is about an organization, then grants created on the organization will be returned (organization doesn't have ancestors). Comparing to ListReservationGrants, there are two behavior differences: 1) permission on the grantee will be verified in this API. 2) Hierarchy lookup (project-\>folder-\>organization) happens in this API.
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
    *   const res = await bigqueryreservation.projects.locations.searchReservationGrants(
    *     {
    *       // The maximum number of items to return.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous List request, if any.
    *       pageToken: 'placeholder-value',
    *       // The parent resource name (containing project and location), which owns the grants. e.g.: "projects/myproject/locations/us-central1".
    *       parent: 'projects/my-project/locations/my-location',
    *       // Please specify resource name as grantee in the query. e.g., "grantee=projects/myproject" "grantee=folders/123" "grantee=organizations/456"
    *       query: 'placeholder-value',
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
  def searchReservationGrants(params: ParamsResourceProjectsLocationsSearchreservationgrants, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchReservationGrants(
    params: ParamsResourceProjectsLocationsSearchreservationgrants,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
