package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessTokenRequest
  extends AuthorizeRequestBase[AccessTokenRequest]
     with AuthorizeRequest {
  /**
    * The access token issued by the authorization server.
    */
  var access_token: String = js.native
  /**
    * The number of seconds until the access token expires.
    */
  var expires_in: Double = js.native
  /**
    * The type of token issued. Must be `"bearer"`.
    */
  var token_type: bearer = js.native
}

