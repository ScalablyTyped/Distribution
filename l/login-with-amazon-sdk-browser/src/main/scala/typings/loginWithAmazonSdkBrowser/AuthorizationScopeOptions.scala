package typings.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Accepted values for `scope` member of `authorize` options.
  */
/* Rewritten from type alias, can be one of: 
  - typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.profile
  - typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.profileColonuser_id
  - typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.postal_code
*/
trait AuthorizationScopeOptions extends js.Object

object AuthorizationScopeOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def postal_code: typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.postal_code = this.cast("postal_code")
  @scala.inline
  def profile: typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.profile = this.cast("profile")
  @scala.inline
  def profileColonuser_id: typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.profileColonuser_id = this.cast("profile:user_id")
}

