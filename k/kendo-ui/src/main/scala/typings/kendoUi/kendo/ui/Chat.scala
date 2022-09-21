package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chat
  extends StObject
     with Widget {
  
  def getUser(): Any = js.native
  
  @JSName("options")
  var options_Chat: ChatOptions = js.native
  
  def postMessage(message: String): Unit = js.native
  
  def renderAttachments(options: Any, sender: Any): Unit = js.native
  
  def renderMessage(message: Any, sender: Any): Unit = js.native
  
  def renderSuggestedActions(suggestedActions: Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
