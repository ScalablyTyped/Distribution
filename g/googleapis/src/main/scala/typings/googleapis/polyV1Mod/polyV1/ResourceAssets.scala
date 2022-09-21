package typings.googleapis.polyV1Mod.polyV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/poly/v1", "poly_v1.Resource$Assets")
@js.native
open class ResourceAssets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAsset] = js.native
  def get(callback: BodyResponseCallback[SchemaAsset]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAsset] = js.native
  def get(params: ParamsResourceAssetsGet): GaxiosPromise[SchemaAsset] = js.native
  def get(params: ParamsResourceAssetsGet, callback: BodyResponseCallback[SchemaAsset]): Unit = js.native
  def get(
    params: ParamsResourceAssetsGet,
    options: BodyResponseCallback[Readable | SchemaAsset],
    callback: BodyResponseCallback[Readable | SchemaAsset]
  ): Unit = js.native
  def get(params: ParamsResourceAssetsGet, options: MethodOptions): GaxiosPromise[SchemaAsset] = js.native
  def get(
    params: ParamsResourceAssetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAsset]
  ): Unit = js.native
  /**
    * Returns detailed information about an asset given its name. PRIVATE assets are returned only if the currently authenticated user (via OAuth token) is the author of the asset.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/poly.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const poly = google.poly('v1');
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
    *   const res = await poly.assets.get({
    *     // Required. An asset's name in the form `assets/{ASSET_ID\}`.
    *     name: 'assets/my-asset',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authorName": "my_authorName",
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "formats": [],
    *   //   "isCurated": false,
    *   //   "license": "my_license",
    *   //   "metadata": "my_metadata",
    *   //   "name": "my_name",
    *   //   "presentationParams": {},
    *   //   "remixInfo": {},
    *   //   "thumbnail": {},
    *   //   "updateTime": "my_updateTime",
    *   //   "visibility": "my_visibility"
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
  def get(params: ParamsResourceAssetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAssetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAssetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(params: ParamsResourceAssetsList): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(params: ParamsResourceAssetsList, callback: BodyResponseCallback[SchemaListAssetsResponse]): Unit = js.native
  def list(
    params: ParamsResourceAssetsList,
    options: BodyResponseCallback[Readable | SchemaListAssetsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAssetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAssetsList, options: MethodOptions): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(
    params: ParamsResourceAssetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAssetsResponse]
  ): Unit = js.native
  /**
    * Lists all public, remixable assets. These are assets with an access level of PUBLIC and published under the CC-By license.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/poly.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const poly = google.poly('v1');
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
    *   const res = await poly.assets.list({
    *     // Filter assets based on the specified category. Supported values are: `animals`, `architecture`, `art`, `food`, `nature`, `objects`, `people`, `scenes`, `technology`, and `transport`.
    *     category: 'placeholder-value',
    *     // Return only assets that have been curated by the Poly team.
    *     curated: 'placeholder-value',
    *     // Return only assets with the matching format. Acceptable values are: `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, `TILT`.
    *     format: 'placeholder-value',
    *     // One or more search terms to be matched against all text that Poly has indexed for assets, which includes display_name, description, and tags. Multiple keywords should be separated by spaces.
    *     keywords: 'placeholder-value',
    *     // Returns assets that are of the specified complexity or less. Defaults to COMPLEX. For example, a request for MEDIUM assets also includes SIMPLE assets.
    *     maxComplexity: 'placeholder-value',
    *     // Specifies an ordering for assets. Acceptable values are: `BEST`, `NEWEST`, `OLDEST`. Defaults to `BEST`, which ranks assets based on a combination of popularity and other features.
    *     orderBy: 'placeholder-value',
    *     // The maximum number of assets to be returned. This value must be between `1` and `100`. Defaults to `20`.
    *     pageSize: 'placeholder-value',
    *     // Specifies a continuation token from a previous search whose results were split into multiple pages. To get the next page, submit the same request specifying the value from next_page_token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assets": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0
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
  def list(params: ParamsResourceAssetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAssetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
