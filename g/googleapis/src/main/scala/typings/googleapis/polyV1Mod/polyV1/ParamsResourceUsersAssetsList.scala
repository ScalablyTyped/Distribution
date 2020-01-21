package typings.googleapis.polyV1Mod.polyV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUsersAssetsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Return only assets with the matching format. Acceptable values are:
    * `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, and `TILT`.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * A valid user id. Currently, only the special value 'me', representing the
    * currently-authenticated user is supported. To use 'me', you must pass an
    * OAuth token with the request.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies an ordering for assets. Acceptable values are: `BEST`,
    * `NEWEST`, `OLDEST`. Defaults to `BEST`, which ranks assets based on a
    * combination of popularity and other features.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of assets to be returned. This value must be between
    * `1` and `100`. Defaults to `20`.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Specifies a continuation token from a previous search whose results were
    * split into multiple pages. To get the next page, submit the same request
    * specifying the value from next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The visibility of the assets to be returned. Defaults to
    * VISIBILITY_UNSPECIFIED which returns all assets.
    */
  var visibility: js.UndefOr[String] = js.native
}

