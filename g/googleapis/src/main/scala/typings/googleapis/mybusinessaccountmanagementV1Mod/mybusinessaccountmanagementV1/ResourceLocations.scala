package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessaccountmanagement/v1", "mybusinessaccountmanagement_v1.Resource$Locations")
@js.native
open class ResourceLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var admins: ResourceLocationsAdmins = js.native
  
  var context: APIRequestContext = js.native
  
  def transfer(): GaxiosPromise[SchemaEmpty] = js.native
  def transfer(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def transfer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def transfer(params: ParamsResourceLocationsTransfer): GaxiosPromise[SchemaEmpty] = js.native
  def transfer(params: ParamsResourceLocationsTransfer, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def transfer(
    params: ParamsResourceLocationsTransfer,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def transfer(params: ParamsResourceLocationsTransfer, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def transfer(
    params: ParamsResourceLocationsTransfer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Moves a location from an account that the user owns to another account that the same user administers. The user must be an owner of the account the location is currently associated with and must also be at least a manager of the destination account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessaccountmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessaccountmanagement = google.mybusinessaccountmanagement('v1');
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
    *   const res = await mybusinessaccountmanagement.locations.transfer({
    *     // Required. The name of the location to transfer. `locations/{location_id\}`.
    *     name: 'locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "destinationAccount": "my_destinationAccount"
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
  def transfer(params: ParamsResourceLocationsTransfer, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def transfer(
    params: ParamsResourceLocationsTransfer,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
