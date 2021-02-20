package typings.googleapis.polyV1Mod.polyV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/poly/v1", "poly_v1.Resource$Users$Likedassets")
@js.native
class ResourceUsersLikedassets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * poly.users.likedassets.list
    * @desc Lists assets that the user has liked. Only the value 'me',
    * representing the currently-authenticated user, is supported. May include
    * assets with an access level of UNLISTED.
    * @alias poly.users.likedassets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.format Return only assets with the matching format. Acceptable values are: `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, `TILT`.
    * @param {string} params.name A valid user id. Currently, only the special value 'me', representing the currently-authenticated user is supported. To use 'me', you must pass an OAuth token with the request.
    * @param {string=} params.orderBy Specifies an ordering for assets. Acceptable values are: `BEST`, `NEWEST`, `OLDEST`, 'LIKED_TIME'. Defaults to `LIKED_TIME`, which ranks assets based on how recently they were liked.
    * @param {integer=} params.pageSize The maximum number of assets to be returned. This value must be between `1` and `100`. Defaults to `20`.
    * @param {string=} params.pageToken Specifies a continuation token from a previous search whose results were split into multiple pages. To get the next page, submit the same request specifying the value from next_page_token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListLikedAssetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLikedAssetsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListLikedAssetsResponse] = js.native
  def list(params: ParamsResourceUsersLikedassetsList): GaxiosPromise[SchemaListLikedAssetsResponse] = js.native
  def list(
    params: ParamsResourceUsersLikedassetsList,
    callback: BodyResponseCallback[SchemaListLikedAssetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersLikedassetsList,
    options: BodyResponseCallback[SchemaListLikedAssetsResponse],
    callback: BodyResponseCallback[SchemaListLikedAssetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersLikedassetsList, options: MethodOptions): GaxiosPromise[SchemaListLikedAssetsResponse] = js.native
  def list(
    params: ParamsResourceUsersLikedassetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLikedAssetsResponse]
  ): Unit = js.native
}
