package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinesslodging/v1", "mybusinesslodging_v1.Resource$Locations$Lodging")
@js.native
open class ResourceLocationsLodging protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getGoogleUpdated(): GaxiosPromise[SchemaGetGoogleUpdatedLodgingResponse] = js.native
  def getGoogleUpdated(callback: BodyResponseCallback[SchemaGetGoogleUpdatedLodgingResponse]): Unit = js.native
  def getGoogleUpdated(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetGoogleUpdatedLodgingResponse] = js.native
  def getGoogleUpdated(params: ParamsResourceLocationsLodgingGetgoogleupdated): GaxiosPromise[SchemaGetGoogleUpdatedLodgingResponse] = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsLodgingGetgoogleupdated,
    callback: BodyResponseCallback[SchemaGetGoogleUpdatedLodgingResponse]
  ): Unit = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsLodgingGetgoogleupdated,
    options: BodyResponseCallback[Readable | SchemaGetGoogleUpdatedLodgingResponse],
    callback: BodyResponseCallback[Readable | SchemaGetGoogleUpdatedLodgingResponse]
  ): Unit = js.native
  def getGoogleUpdated(params: ParamsResourceLocationsLodgingGetgoogleupdated, options: MethodOptions): GaxiosPromise[SchemaGetGoogleUpdatedLodgingResponse] = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsLodgingGetgoogleupdated,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetGoogleUpdatedLodgingResponse]
  ): Unit = js.native
  /**
    * Returns the Google updated Lodging of a specific location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinesslodging.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinesslodging = google.mybusinesslodging('v1');
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
    *   const res = await mybusinesslodging.locations.lodging.getGoogleUpdated({
    *     // Required. Google identifier for this location in the form: `accounts/{account_id\}/locations/{location_id\}/lodging`
    *     name: 'locations/my-location/lodging',
    *     // Required. The specific fields to return. Use "*" to include all fields. Repeated field items cannot be individually specified.
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "diffMask": "my_diffMask",
    *   //   "lodging": {}
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
  def getGoogleUpdated(params: ParamsResourceLocationsLodgingGetgoogleupdated, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsLodgingGetgoogleupdated,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
