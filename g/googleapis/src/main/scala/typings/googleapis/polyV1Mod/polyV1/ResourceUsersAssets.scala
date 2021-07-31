package typings.googleapis.polyV1Mod.polyV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/poly/v1", "poly_v1.Resource$Users$Assets")
@js.native
class ResourceUsersAssets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * poly.users.assets.list
    * @desc Lists assets authored by the given user. Only the value 'me',
    * representing the currently-authenticated user, is supported. May include
    * assets with an access level of PRIVATE or UNLISTED and assets which are
    * All Rights Reserved for the currently-authenticated user.
    * @alias poly.users.assets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.format Return only assets with the matching format. Acceptable values are: `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, and `TILT`.
    * @param {string} params.name A valid user id. Currently, only the special value 'me', representing the currently-authenticated user is supported. To use 'me', you must pass an OAuth token with the request.
    * @param {string=} params.orderBy Specifies an ordering for assets. Acceptable values are: `BEST`, `NEWEST`, `OLDEST`. Defaults to `BEST`, which ranks assets based on a combination of popularity and other features.
    * @param {integer=} params.pageSize The maximum number of assets to be returned. This value must be between `1` and `100`. Defaults to `20`.
    * @param {string=} params.pageToken Specifies a continuation token from a previous search whose results were split into multiple pages. To get the next page, submit the same request specifying the value from next_page_token.
    * @param {string=} params.visibility The visibility of the assets to be returned. Defaults to VISIBILITY_UNSPECIFIED which returns all assets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListUserAssetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUserAssetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUserAssetsResponse] = js.native
  def list(params: ParamsResourceUsersAssetsList): GaxiosPromise[SchemaListUserAssetsResponse] = js.native
  def list(
    params: ParamsResourceUsersAssetsList,
    callback: BodyResponseCallback[SchemaListUserAssetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersAssetsList,
    options: BodyResponseCallback[SchemaListUserAssetsResponse],
    callback: BodyResponseCallback[SchemaListUserAssetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersAssetsList, options: MethodOptions): GaxiosPromise[SchemaListUserAssetsResponse] = js.native
  def list(
    params: ParamsResourceUsersAssetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUserAssetsResponse]
  ): Unit = js.native
}
