package typings.googleapis.vectortileV1Mod.vectortileV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vectortile/v1", "vectortile_v1.Resource$Terraintiles")
@js.native
open class ResourceTerraintiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTerrainTile] = js.native
  def get(callback: BodyResponseCallback[SchemaTerrainTile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTerrainTile] = js.native
  def get(params: ParamsResourceTerraintilesGet): GaxiosPromise[SchemaTerrainTile] = js.native
  def get(params: ParamsResourceTerraintilesGet, callback: BodyResponseCallback[SchemaTerrainTile]): Unit = js.native
  def get(
    params: ParamsResourceTerraintilesGet,
    options: BodyResponseCallback[Readable | SchemaTerrainTile],
    callback: BodyResponseCallback[Readable | SchemaTerrainTile]
  ): Unit = js.native
  def get(params: ParamsResourceTerraintilesGet, options: MethodOptions): GaxiosPromise[SchemaTerrainTile] = js.native
  def get(
    params: ParamsResourceTerraintilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTerrainTile]
  ): Unit = js.native
  /**
    * Gets a terrain tile by its tile resource name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vectortile.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vectortile = google.vectortile('v1');
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
    *   const res = await vectortile.terraintiles.get({
    *     // The precision of terrain altitudes in centimeters. Possible values: between 1 (cm level precision) and 1,000,000 (10-kilometer level precision).
    *     altitudePrecisionCentimeters: 'placeholder-value',
    *     // API client name and version. For example, the SDK calling the API. The exact format is up to the client.
    *     'clientInfo.apiClient': 'placeholder-value',
    *     // Application ID, such as the package name on Android and the bundle identifier on iOS platforms.
    *     'clientInfo.applicationId': 'placeholder-value',
    *     // Application version number, such as "1.2.3". The exact format is application-dependent.
    *     'clientInfo.applicationVersion': 'placeholder-value',
    *     // Device model as reported by the device. The exact format is platform-dependent.
    *     'clientInfo.deviceModel': 'placeholder-value',
    *     // Operating system name and version as reported by the OS. For example, "Mac OS X 10.10.4". The exact format is platform-dependent.
    *     'clientInfo.operatingSystem': 'placeholder-value',
    *     // Platform where the application is running.
    *     'clientInfo.platform': 'placeholder-value',
    *     // Required. A client-generated user ID. The ID should be generated and persisted during the first user session or whenever a pre-existing ID is not found. The exact format is up to the client. This must be non-empty in a GetFeatureTileRequest (whether via the header or GetFeatureTileRequest.client_info).
    *     'clientInfo.userId': 'placeholder-value',
    *     // The maximum allowed resolution for the returned elevation heightmap. Possible values: between 1 and 1024 (and not less than min_elevation_resolution_cells). Over-sized heightmaps will be non-uniformly down-sampled such that each edge is no longer than this value. Non-uniformity is chosen to maximise the amount of preserved data. For example: Original resolution: 100px (width) * 30px (height) max_elevation_resolution: 30 New resolution: 30px (width) * 30px (height)
    *     maxElevationResolutionCells: 'placeholder-value',
    *     //  api-linter: core::0131::request-unknown-fields=disabled aip.dev/not-precedent: Maintaining existing request parameter pattern. The minimum allowed resolution for the returned elevation heightmap. Possible values: between 0 and 1024 (and not more than max_elevation_resolution_cells). Zero is supported for backward compatibility. Under-sized heightmaps will be non-uniformly up-sampled such that each edge is no shorter than this value. Non-uniformity is chosen to maximise the amount of preserved data. For example: Original resolution: 30px (width) * 10px (height) min_elevation_resolution: 30 New resolution: 30px (width) * 30px (height)
    *     minElevationResolutionCells: 'placeholder-value',
    *     // Required. Resource name of the tile. The tile resource name is prefixed by its collection ID `terraintiles/` followed by the resource ID, which encodes the tile's global x and y coordinates and zoom level as `@,,z`. For example, `terraintiles/@1,2,3z`.
    *     name: 'terraintiles/my-terraintile',
    *     // Terrain formats that the client understands.
    *     terrainFormats: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "coordinates": {},
    *   //   "firstDerivative": {},
    *   //   "name": "my_name",
    *   //   "secondDerivative": {}
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
  def get(params: ParamsResourceTerraintilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTerraintilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
