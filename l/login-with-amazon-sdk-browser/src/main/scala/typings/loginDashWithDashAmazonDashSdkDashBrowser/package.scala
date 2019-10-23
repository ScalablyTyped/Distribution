package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loginDashWithDashAmazonDashSdkDashBrowser {
  import typings.std.Partial

  type AuthorizeScope = AuthorizationScopeOptions | js.Array[AuthorizationScopeOptions]
  type AuthorizeScopeData = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ scope in login-with-amazon-sdk-browser.AuthorizationScopeOptions ]:? {  essential  :boolean}}
    */ typings.loginDashWithDashAmazonDashSdkDashBrowser.loginDashWithDashAmazonDashSdkDashBrowserStrings.AuthorizeScopeData with js.Any
  /**
    * Type of callback invoked after `authorize` completes.
    */
  type NextCallback[T /* <: AuthorizeRequest */] = js.Function1[/* response */ T, Unit]
  type RetrieveProfileCallback = js.Function1[/* response */ RetrieveProfileResponse, Unit]
  /**
    * Contains profile information.
    */
  type UserProfile = Partial[Anon_CustomerId]
}
