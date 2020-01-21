package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Chat")
@js.native
class Chat protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ChatOptions) = this()
  @JSName("options")
  var options_Chat: ChatOptions = js.native
  var wrapper: JQuery = js.native
  def getUser(): js.Any = js.native
  def postMessage(message: String): Unit = js.native
  def renderAttachments(options: js.Any, sender: js.Any): Unit = js.native
  def renderMessage(message: js.Any, sender: js.Any): Unit = js.native
  def renderSuggestedActions(suggestedActions: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Chat")
@js.native
object Chat extends js.Object {
  var fn: Chat = js.native
  def extend(proto: js.Object): Chat = js.native
}

