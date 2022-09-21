package typings.kendoUi.kendo.ui

import typings.kendoUi.HTMLElement
import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditor
  extends StObject
     with Widget {
  
  def drawCanvas(image: Any): Unit = js.native
  
  def drawImage(imageUrl: String): JQueryPromise[Any] = js.native
  
  def executeCommand(command: String): Unit = js.native
  def executeCommand(command: String, args: Any): Unit = js.native
  
  def getCanvasElement(): HTMLElement = js.native
  
  def getCurrent2dContext(): Any = js.native
  
  def getCurrentImage(): HTMLElement = js.native
  
  def getZoomLevel(): Double = js.native
  
  @JSName("options")
  var options_ImageEditor: ImageEditorOptions = js.native
  
  var wrapper: JQuery = js.native
}
