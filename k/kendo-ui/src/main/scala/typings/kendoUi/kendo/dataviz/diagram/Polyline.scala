package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline extends Observable {
  
  var drawingElement: typings.kendoUi.kendo.drawing.Path = js.native
  
  var options: PolylineOptions = js.native
  
  def points(): js.Any = js.native
  def points(points: js.Any): Unit = js.native
  
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}
