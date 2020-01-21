package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEncodedfullhashesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A client ID that (hopefully) uniquely identifies the client
    * implementation of the Safe Browsing API.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The version of the client implementation.
    */
  var clientVersion: js.UndefOr[String] = js.native
  /**
    * A serialized FindFullHashesRequest proto.
    */
  var encodedRequest: js.UndefOr[String] = js.native
}

