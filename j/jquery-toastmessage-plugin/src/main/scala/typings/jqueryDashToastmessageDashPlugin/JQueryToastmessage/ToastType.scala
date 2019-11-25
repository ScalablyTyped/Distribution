package typings.jqueryDashToastmessageDashPlugin.JQueryToastmessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jqueryDashToastmessageDashPlugin.jqueryDashToastmessageDashPluginStrings.notice
  - typings.jqueryDashToastmessageDashPlugin.jqueryDashToastmessageDashPluginStrings.warning
  - typings.jqueryDashToastmessageDashPlugin.jqueryDashToastmessageDashPluginStrings.error
  - typings.jqueryDashToastmessageDashPlugin.jqueryDashToastmessageDashPluginStrings.success
*/
trait ToastType extends js.Object

object ToastType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.jqueryDashToastmessageDashPlugin.jqueryDashToastmessageDashPluginStrings.error = this.cast("error")
  @scala.inline
  def notice: typings.jqueryDashToastmessageDashPlugin.jqueryDashToastmessageDashPluginStrings.notice = this.cast("notice")
  @scala.inline
  def success: typings.jqueryDashToastmessageDashPlugin.jqueryDashToastmessageDashPluginStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.jqueryDashToastmessageDashPlugin.jqueryDashToastmessageDashPluginStrings.warning = this.cast("warning")
}

