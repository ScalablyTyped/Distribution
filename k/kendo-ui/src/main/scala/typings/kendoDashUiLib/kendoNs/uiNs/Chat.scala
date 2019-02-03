package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Chat")
@js.native
class Chat protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ChatOptions) = this()
  @JSName("options")
  var options_Chat: ChatOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def getUser(): js.Any = js.native
  def postMessage(message: java.lang.String): scala.Unit = js.native
  def renderAttachments(options: js.Any, sender: js.Any): scala.Unit = js.native
  def renderMessage(message: js.Any, sender: js.Any): scala.Unit = js.native
  def renderSuggestedActions(suggestedActions: js.Any): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Chat")
@js.native
object Chat extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Chat = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Chat = js.native
}

