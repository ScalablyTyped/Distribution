package typings.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.queued
  - typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.in_progress
  - typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.complete
*/
trait AuthorizeRequestStatus extends js.Object

object AuthorizeRequestStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.complete = this.cast("complete")
  @scala.inline
  def in_progress: typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.in_progress = this.cast("in_progress")
  @scala.inline
  def queued: typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.queued = this.cast("queued")
}

