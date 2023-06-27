package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSheet
  extends StObject
     with Widget {
  
  def close(): Unit = js.native
  
  def fullscreen(fullscreen: Boolean): Unit = js.native
  
  def open(): Unit = js.native
  
  @JSName("options")
  var options_ActionSheet: ActionSheetOptions = js.native
  
  def toggle(): Unit = js.native
  
  def visible(): Boolean = js.native
  
  var wrapper: JQuery = js.native
}
