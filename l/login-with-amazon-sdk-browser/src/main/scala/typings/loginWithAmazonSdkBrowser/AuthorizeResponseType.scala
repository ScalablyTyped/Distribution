package typings.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.token
  - typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.code
*/
trait AuthorizeResponseType extends js.Object

object AuthorizeResponseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.code = this.cast("code")
  @scala.inline
  def token: typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.token = this.cast("token")
}

