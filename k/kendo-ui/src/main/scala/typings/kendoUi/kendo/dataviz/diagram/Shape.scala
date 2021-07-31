package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shape
  extends StObject
     with Observable {
  
  def connections(`type`: String): Unit = js.native
  
  var connectors: js.Any = js.native
  
  var dataItem: js.Any = js.native
  
  def getConnector(): Unit = js.native
  
  def getPosition(side: String): Unit = js.native
  
  var options: ShapeOptions = js.native
  
  def position(): Unit = js.native
  def position(point: Point): Unit = js.native
  
  def redraw(options: js.Any): Unit = js.native
  
  def redrawVisual(): Unit = js.native
  
  def select(value: Boolean): Unit = js.native
  
  var shapeVisual: js.Any = js.native
  
  var visual: Group = js.native
}
