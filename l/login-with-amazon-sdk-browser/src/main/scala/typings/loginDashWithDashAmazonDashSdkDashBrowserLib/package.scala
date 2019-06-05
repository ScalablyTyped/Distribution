package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loginDashWithDashAmazonDashSdkDashBrowserLib {
  type AuthorizeScope = AuthorizationScopeOptions | js.Array[AuthorizationScopeOptions]
  /**
    * Type of callback invoked after `authorize` completes.
    */
  type NextCallback[T /* <: AuthorizeRequest */] = js.Function1[/* response */ T, scala.Unit]
  type RetrieveProfileCallback = js.Function1[/* response */ RetrieveProfileResponse, scala.Unit]
  /**
    * Contains profile information.
    */
  type UserProfile = stdLib.Partial[Anon_CustomerId]
}
