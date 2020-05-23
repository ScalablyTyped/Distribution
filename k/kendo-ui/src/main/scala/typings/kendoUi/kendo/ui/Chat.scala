package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chat extends Widget {
  @JSName("options")
  var options_Chat: ChatOptions = js.native
  var wrapper: JQuery = js.native
  def getUser(): js.Any = js.native
  def postMessage(message: String): Unit = js.native
  def renderAttachments(options: js.Any, sender: js.Any): Unit = js.native
  def renderMessage(message: js.Any, sender: js.Any): Unit = js.native
  def renderSuggestedActions(suggestedActions: js.Any): Unit = js.native
}

