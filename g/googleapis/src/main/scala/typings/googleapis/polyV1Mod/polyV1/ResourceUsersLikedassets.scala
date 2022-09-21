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

@JSImport("googleapis/build/src/apis/poly/v1", "poly_v1.Resource$Users$Likedassets")
@js.native
open class ResourceUsersLikedassets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListLikedAssetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLikedAssetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLikedAssetsResponse] = js.native
  def list(params: ParamsResourceUsersLikedassetsList): GaxiosPromise[SchemaListLikedAssetsResponse] = js.native
  def list(
    params: ParamsResourceUsersLikedassetsList,
    callback: BodyResponseCallback[SchemaListLikedAssetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersLikedassetsList,
    options: BodyResponseCallback[Readable | SchemaListLikedAssetsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLikedAssetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersLikedassetsList, options: MethodOptions): GaxiosPromise[SchemaListLikedAssetsResponse] = js.native
  def list(
    params: ParamsResourceUsersLikedassetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLikedAssetsResponse]
  ): Unit = js.native
  /**
    * Lists assets that the user has liked. Only the value 'me', representing the currently-authenticated user, is supported. May include assets with an access level of UNLISTED.
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
    *   const res = await poly.users.likedassets.list({
    *     // Return only assets with the matching format. Acceptable values are: `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, `TILT`.
    *     format: 'placeholder-value',
    *     // A valid user id. Currently, only the special value 'me', representing the currently-authenticated user is supported. To use 'me', you must pass an OAuth token with the request.
    *     name: 'users/my-user',
    *     // Specifies an ordering for assets. Acceptable values are: `BEST`, `NEWEST`, `OLDEST`, 'LIKED_TIME'. Defaults to `LIKED_TIME`, which ranks assets based on how recently they were liked.
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
  def list(params: ParamsResourceUsersLikedassetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersLikedassetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
