package typings.googleapis.polyV1Mod.polyV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/poly/v1", "poly_v1.Resource$Assets")
@js.native
class ResourceAssets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * poly.assets.get
    * @desc Returns detailed information about an asset given its name. PRIVATE
    * assets are returned only if  the currently authenticated user (via OAuth
    * token) is the author of the asset.
    * @alias poly.assets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. An asset's name in the form `assets/{ASSET_ID}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAsset] = js.native
  def get(callback: BodyResponseCallback[SchemaAsset]): Unit = js.native
  def get(params: ParamsResourceAssetsGet): GaxiosPromise[SchemaAsset] = js.native
  def get(params: ParamsResourceAssetsGet, callback: BodyResponseCallback[SchemaAsset]): Unit = js.native
  def get(
    params: ParamsResourceAssetsGet,
    options: BodyResponseCallback[SchemaAsset],
    callback: BodyResponseCallback[SchemaAsset]
  ): Unit = js.native
  def get(params: ParamsResourceAssetsGet, options: MethodOptions): GaxiosPromise[SchemaAsset] = js.native
  def get(
    params: ParamsResourceAssetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAsset]
  ): Unit = js.native
  /**
    * poly.assets.list
    * @desc Lists all public, remixable assets. These are assets with an access
    * level of PUBLIC and published under the CC-By license.
    * @alias poly.assets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.category Filter assets based on the specified category. Supported values are: `animals`, `architecture`, `art`, `food`, `nature`, `objects`, `people`, `scenes`, `technology`, and `transport`.
    * @param {boolean=} params.curated Return only assets that have been curated by the Poly team.
    * @param {string=} params.format Return only assets with the matching format. Acceptable values are: `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, `TILT`.
    * @param {string=} params.keywords One or more search terms to be matched against all text that Poly has indexed for assets, which includes display_name, description, and tags. Multiple keywords should be separated by spaces.
    * @param {string=} params.maxComplexity Returns assets that are of the specified complexity or less. Defaults to COMPLEX. For example, a request for MEDIUM assets also includes SIMPLE assets.
    * @param {string=} params.orderBy Specifies an ordering for assets. Acceptable values are: `BEST`, `NEWEST`, `OLDEST`. Defaults to `BEST`, which ranks assets based on a combination of popularity and other features.
    * @param {integer=} params.pageSize The maximum number of assets to be returned. This value must be between `1` and `100`. Defaults to `20`.
    * @param {string=} params.pageToken Specifies a continuation token from a previous search whose results were split into multiple pages. To get the next page, submit the same request specifying the value from next_page_token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAssetsResponse]): Unit = js.native
  def list(params: ParamsResourceAssetsList): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(params: ParamsResourceAssetsList, callback: BodyResponseCallback[SchemaListAssetsResponse]): Unit = js.native
  def list(
    params: ParamsResourceAssetsList,
    options: BodyResponseCallback[SchemaListAssetsResponse],
    callback: BodyResponseCallback[SchemaListAssetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAssetsList, options: MethodOptions): GaxiosPromise[SchemaListAssetsResponse] = js.native
  def list(
    params: ParamsResourceAssetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAssetsResponse]
  ): Unit = js.native
}

