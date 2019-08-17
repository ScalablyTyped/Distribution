package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loginDashWithDashAmazonDashSdkDashBrowser {
  import typings.std.Partial

  type AuthorizeScope = AuthorizationScopeOptions | js.Array[AuthorizationScopeOptions]
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
