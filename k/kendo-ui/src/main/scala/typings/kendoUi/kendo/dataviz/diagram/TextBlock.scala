package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable
import typings.kendoUi.kendo.drawing.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBlock
  extends StObject
     with Observable {
  
  def content(): String = js.native
  def content(content: String): Unit = js.native
  
  var drawingElement: Text = js.native
  
  var options: TextBlockOptions = js.native
  
  def position(): Unit = js.native
  def position(offset: Point): Unit = js.native
  
  def rotate(angle: Double, center: Point): Unit = js.native
  
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}
