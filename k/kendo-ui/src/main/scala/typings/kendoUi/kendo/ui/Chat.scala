package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chat extends Widget {
  
  def getUser(): js.Any = js.native
  
  @JSName("options")
  var options_Chat: ChatOptions = js.native
  
  def postMessage(message: String): Unit = js.native
  
  def renderAttachments(options: js.Any, sender: js.Any): Unit = js.native
  
  def renderMessage(message: js.Any, sender: js.Any): Unit = js.native
  
  def renderSuggestedActions(suggestedActions: js.Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
