package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gkehub/v1alpha", "gkehub_v1alpha.Resource$Organizations$Locations$Fleets")
@js.native
open class ResourceOrganizationsLocationsFleets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListFleetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFleetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFleetsResponse] = js.native
  def list(params: ParamsResourceOrganizationsLocationsFleetsList): GaxiosPromise[SchemaListFleetsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsFleetsList,
    callback: BodyResponseCallback[SchemaListFleetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsFleetsList,
    options: BodyResponseCallback[Readable | SchemaListFleetsResponse],
    callback: BodyResponseCallback[Readable | SchemaListFleetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsLocationsFleetsList, options: MethodOptions): GaxiosPromise[SchemaListFleetsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsFleetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFleetsResponse]
  ): Unit = js.native
  /**
    * Returns all fleets within an organization or a project that the caller has access to.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gkehub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gkehub = google.gkehub('v1alpha');
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
    *   const res = await gkehub.organizations.locations.fleets.list({
    *     // Optional. The maximum number of fleets to return. The service may return fewer than this value. If unspecified, at most 200 fleets will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListFleets` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListFleets` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The organization or project to list for Fleets under, in the format `organizations/x/locations/x` or `projects/x/locations/x`.
    *     parent: 'organizations/my-organization/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fleets": [],
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
  def list(params: ParamsResourceOrganizationsLocationsFleetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsFleetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
