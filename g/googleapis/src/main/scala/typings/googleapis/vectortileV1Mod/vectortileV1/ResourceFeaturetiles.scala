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

@JSImport("googleapis/build/src/apis/vectortile/v1", "vectortile_v1.Resource$Featuretiles")
@js.native
open class ResourceFeaturetiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaFeatureTile] = js.native
  def get(callback: BodyResponseCallback[SchemaFeatureTile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFeatureTile] = js.native
  def get(params: ParamsResourceFeaturetilesGet): GaxiosPromise[SchemaFeatureTile] = js.native
  def get(params: ParamsResourceFeaturetilesGet, callback: BodyResponseCallback[SchemaFeatureTile]): Unit = js.native
  def get(
    params: ParamsResourceFeaturetilesGet,
    options: BodyResponseCallback[Readable | SchemaFeatureTile],
    callback: BodyResponseCallback[Readable | SchemaFeatureTile]
  ): Unit = js.native
  def get(params: ParamsResourceFeaturetilesGet, options: MethodOptions): GaxiosPromise[SchemaFeatureTile] = js.native
  def get(
    params: ParamsResourceFeaturetilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFeatureTile]
  ): Unit = js.native
  /**
    * Gets a feature tile by its tile resource name.
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
    *   const res = await vectortile.featuretiles.get({
    *     // Flag indicating whether the returned tile will always contain 2.5D footprints for structures. If enabled_modeled_volumes is set, this will mean that structures will have both their 3D models and 2.5D footprints returned.
    *     alwaysIncludeBuildingFootprints: 'placeholder-value',
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
    *     // Optional version id identifying the tile that is already in the client's cache. This field should be populated with the most recent version_id value returned by the API for the requested tile. If the version id is empty the server always returns a newly rendered tile. If it is provided the server checks if the tile contents would be identical to one that's already on the client, and if so, returns a stripped-down response tile with STATUS_OK_DATA_UNCHANGED instead.
    *     clientTileVersionId: 'placeholder-value',
    *     // Flag indicating whether detailed highway types should be returned. If this is set, the CONTROLLED_ACCESS_HIGHWAY type may be returned. If not, then these highways will have the generic HIGHWAY type. This exists for backwards compatibility reasons.
    *     enableDetailedHighwayTypes: 'placeholder-value',
    *     // Flag indicating whether human-readable names should be returned for features. If this is set, the display_name field on the feature will be filled out.
    *     enableFeatureNames: 'placeholder-value',
    *     // Flag indicating whether 3D building models should be enabled. If this is set structures will be returned as 3D modeled volumes rather than 2.5D extruded areas where possible.
    *     enableModeledVolumes: 'placeholder-value',
    *     // Flag indicating whether political features should be returned.
    *     enablePoliticalFeatures: 'placeholder-value',
    *     // Flag indicating whether the returned tile will contain road features that are marked private. Private roads are indicated by the Feature.segment_info.road_info.is_private field.
    *     enablePrivateRoads: 'placeholder-value',
    *     // Flag indicating whether unclipped buildings should be returned. If this is set, building render ops will extend beyond the tile boundary. Buildings will only be returned on the tile that contains their centroid.
    *     enableUnclippedBuildings: 'placeholder-value',
    *     // Required. The BCP-47 language code corresponding to the language in which the name was requested, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    *     languageCode: 'placeholder-value',
    *     // Required. Resource name of the tile. The tile resource name is prefixed by its collection ID `tiles/` followed by the resource ID, which encodes the tile's global x and y coordinates and zoom level as `@,,z`. For example, `tiles/@1,2,3z`.
    *     name: 'featuretiles/my-featuretile',
    *     // Required. The Unicode country/region code (CLDR) of the location from which the request is coming from, such as "US" and "419". For more information, see http://www.unicode.org/reports/tr35/#unicode_region_subtag.
    *     regionCode: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "coordinates": {},
    *   //   "features": [],
    *   //   "name": "my_name",
    *   //   "providers": [],
    *   //   "status": "my_status",
    *   //   "versionId": "my_versionId"
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
  def get(params: ParamsResourceFeaturetilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFeaturetilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
