package typings.googleapis.vaultV1Mod.vaultV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMattersHoldsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * The number of holds to return in the response, between 0 and 100
    * inclusive. Leaving this empty, or as 0, is the same as page_size = 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The pagination token as returned in the response. An empty token means
    * start from the beginning.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Specifies which parts of the Hold to return.
    */
  var view: js.UndefOr[String] = js.native
}

