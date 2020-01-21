package typings.jqueryToastmessagePlugin.JQueryToastmessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice
  - typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning
  - typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error
  - typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success
*/
trait ToastType extends js.Object

object ToastType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error = this.cast("error")
  @scala.inline
  def notice: typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice = this.cast("notice")
  @scala.inline
  def success: typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning = this.cast("warning")
}

