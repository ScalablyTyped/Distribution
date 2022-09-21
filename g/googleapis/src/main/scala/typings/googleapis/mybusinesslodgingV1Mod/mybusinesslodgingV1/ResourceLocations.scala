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

@JSImport("googleapis/build/src/apis/mybusinesslodging/v1", "mybusinesslodging_v1.Resource$Locations")
@js.native
open class ResourceLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getLodging(): GaxiosPromise[SchemaLodging] = js.native
  def getLodging(callback: BodyResponseCallback[SchemaLodging]): Unit = js.native
  def getLodging(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLodging] = js.native
  def getLodging(params: ParamsResourceLocationsGetlodging): GaxiosPromise[SchemaLodging] = js.native
  def getLodging(params: ParamsResourceLocationsGetlodging, callback: BodyResponseCallback[SchemaLodging]): Unit = js.native
  def getLodging(
    params: ParamsResourceLocationsGetlodging,
    options: BodyResponseCallback[Readable | SchemaLodging],
    callback: BodyResponseCallback[Readable | SchemaLodging]
  ): Unit = js.native
  def getLodging(params: ParamsResourceLocationsGetlodging, options: MethodOptions): GaxiosPromise[SchemaLodging] = js.native
  def getLodging(
    params: ParamsResourceLocationsGetlodging,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLodging]
  ): Unit = js.native
  /**
    * Returns the Lodging of a specific location.
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
    *   const res = await mybusinesslodging.locations.getLodging({
    *     // Required. Google identifier for this location in the form: `locations/{location_id\}/lodging`
    *     name: 'locations/my-location/lodging',
    *     // Required. The specific fields to return. Use "*" to include all fields. Repeated field items cannot be individually specified.
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessibility": {},
    *   //   "activities": {},
    *   //   "allUnits": {},
    *   //   "business": {},
    *   //   "commonLivingArea": {},
    *   //   "connectivity": {},
    *   //   "families": {},
    *   //   "foodAndDrink": {},
    *   //   "guestUnits": [],
    *   //   "healthAndSafety": {},
    *   //   "housekeeping": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "parking": {},
    *   //   "pets": {},
    *   //   "policies": {},
    *   //   "pools": {},
    *   //   "property": {},
    *   //   "services": {},
    *   //   "someUnits": {},
    *   //   "sustainability": {},
    *   //   "transportation": {},
    *   //   "wellness": {}
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
  def getLodging(params: ParamsResourceLocationsGetlodging, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getLodging(
    params: ParamsResourceLocationsGetlodging,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var lodging: ResourceLocationsLodging = js.native
  
  def updateLodging(): GaxiosPromise[SchemaLodging] = js.native
  def updateLodging(callback: BodyResponseCallback[SchemaLodging]): Unit = js.native
  def updateLodging(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLodging] = js.native
  def updateLodging(params: ParamsResourceLocationsUpdatelodging): GaxiosPromise[SchemaLodging] = js.native
  def updateLodging(params: ParamsResourceLocationsUpdatelodging, callback: BodyResponseCallback[SchemaLodging]): Unit = js.native
  def updateLodging(
    params: ParamsResourceLocationsUpdatelodging,
    options: BodyResponseCallback[Readable | SchemaLodging],
    callback: BodyResponseCallback[Readable | SchemaLodging]
  ): Unit = js.native
  def updateLodging(params: ParamsResourceLocationsUpdatelodging, options: MethodOptions): GaxiosPromise[SchemaLodging] = js.native
  def updateLodging(
    params: ParamsResourceLocationsUpdatelodging,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLodging]
  ): Unit = js.native
  /**
    * Updates the Lodging of a specific location.
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
    *   const res = await mybusinesslodging.locations.updateLodging({
    *     // Required. Google identifier for this location in the form: `locations/{location_id\}/lodging`
    *     name: 'locations/my-location/lodging',
    *     // Required. The specific fields to update. Use "*" to update all fields, which may include unsetting empty fields in the request. Repeated field items cannot be individually updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessibility": {},
    *       //   "activities": {},
    *       //   "allUnits": {},
    *       //   "business": {},
    *       //   "commonLivingArea": {},
    *       //   "connectivity": {},
    *       //   "families": {},
    *       //   "foodAndDrink": {},
    *       //   "guestUnits": [],
    *       //   "healthAndSafety": {},
    *       //   "housekeeping": {},
    *       //   "metadata": {},
    *       //   "name": "my_name",
    *       //   "parking": {},
    *       //   "pets": {},
    *       //   "policies": {},
    *       //   "pools": {},
    *       //   "property": {},
    *       //   "services": {},
    *       //   "someUnits": {},
    *       //   "sustainability": {},
    *       //   "transportation": {},
    *       //   "wellness": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessibility": {},
    *   //   "activities": {},
    *   //   "allUnits": {},
    *   //   "business": {},
    *   //   "commonLivingArea": {},
    *   //   "connectivity": {},
    *   //   "families": {},
    *   //   "foodAndDrink": {},
    *   //   "guestUnits": [],
    *   //   "healthAndSafety": {},
    *   //   "housekeeping": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "parking": {},
    *   //   "pets": {},
    *   //   "policies": {},
    *   //   "pools": {},
    *   //   "property": {},
    *   //   "services": {},
    *   //   "someUnits": {},
    *   //   "sustainability": {},
    *   //   "transportation": {},
    *   //   "wellness": {}
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
  def updateLodging(params: ParamsResourceLocationsUpdatelodging, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateLodging(
    params: ParamsResourceLocationsUpdatelodging,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
