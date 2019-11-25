package typings.loginDashWithDashAmazonDashSdkDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Accepted values for `scope` member of `authorize` options.
  */
/* Rewritten from type alias, can be one of: 
  - typings.loginDashWithDashAmazonDashSdkDashBrowser.loginDashWithDashAmazonDashSdkDashBrowserStrings.profile
  - typings.loginDashWithDashAmazonDashSdkDashBrowser.loginDashWithDashAmazonDashSdkDashBrowserStrings.`profile:user_id`
  - typings.loginDashWithDashAmazonDashSdkDashBrowser.loginDashWithDashAmazonDashSdkDashBrowserStrings.postal_code
*/
trait AuthorizationScopeOptions extends js.Object

object AuthorizationScopeOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def postal_code: typings.loginDashWithDashAmazonDashSdkDashBrowser.loginDashWithDashAmazonDashSdkDashBrowserStrings.postal_code = this.cast("postal_code")
  @scala.inline
  def profile: typings.loginDashWithDashAmazonDashSdkDashBrowser.loginDashWithDashAmazonDashSdkDashBrowserStrings.profile = this.cast("profile")
  @scala.inline
  def `profile:user_id`: typings.loginDashWithDashAmazonDashSdkDashBrowser.loginDashWithDashAmazonDashSdkDashBrowserStrings.`profile:user_id` = this.cast("profile:user_id")
}

