package typings
package loginDashWithDashAmazonDashSdkDashBrowserLib

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
  var access_token: java.lang.String = js.native
  /**
    * The number of seconds until the access token expires.
    */
  var expires_in: scala.Double = js.native
  /**
    * The scope granted by the authorization server for the access token.
    */
  var scope: AuthorizationScopeOptions | js.Array[AuthorizationScopeOptions] = js.native
  /**
    * The type of token issued. Must be `"bearer"`.
    */
  var token_type: loginDashWithDashAmazonDashSdkDashBrowserLib.loginDashWithDashAmazonDashSdkDashBrowserLibStrings.bearer = js.native
}

