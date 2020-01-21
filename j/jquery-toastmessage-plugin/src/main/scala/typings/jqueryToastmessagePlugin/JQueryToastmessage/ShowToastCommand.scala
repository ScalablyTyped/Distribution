package typings.jqueryToastmessagePlugin.JQueryToastmessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showNoticeToast
  - typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showSuccessToast
  - typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showWarningToast
  - typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showErrorToast
*/
trait ShowToastCommand extends js.Object

object ShowToastCommand {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def showErrorToast: typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showErrorToast = this.cast("showErrorToast")
  @scala.inline
  def showNoticeToast: typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showNoticeToast = this.cast("showNoticeToast")
  @scala.inline
  def showSuccessToast: typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showSuccessToast = this.cast("showSuccessToast")
  @scala.inline
  def showWarningToast: typings.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showWarningToast = this.cast("showWarningToast")
}

