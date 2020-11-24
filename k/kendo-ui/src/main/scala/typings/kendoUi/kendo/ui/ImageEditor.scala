package typings.kendoUi.kendo.ui

import typings.kendoUi.HTMLElement
import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditor extends Widget {
  
  def drawCanvas(image: js.Any): Unit = js.native
  
  def drawImage(imageUrl: String): JQueryPromise[_] = js.native
  
  def executeCommand(command: String): Unit = js.native
  def executeCommand(command: String, args: js.Any): Unit = js.native
  
  def getCanvasElement(): HTMLElement = js.native
  
  def getCurrent2dContext(): js.Any = js.native
  
  def getCurrentImage(): HTMLElement = js.native
  
  def getZoomLevel(): Double = js.native
  
  @JSName("options")
  var options_ImageEditor: ImageEditorOptions = js.native
  
  var wrapper: JQuery = js.native
}
