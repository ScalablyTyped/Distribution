package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path
  extends StObject
     with typings.kendoUi.kendo.drawing.Element {
  
  def close(): typings.kendoUi.kendo.drawing.Path = js.native
  
  def curveTo(controlOut: Any, controlIn: Any, endPoint: Any): typings.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Any, controlIn: Any, endPoint: Point): typings.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Any, controlIn: Point, endPoint: Any): typings.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Any, controlIn: Point, endPoint: Point): typings.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Any, endPoint: Any): typings.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Any, endPoint: Point): typings.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Any): typings.kendoUi.kendo.drawing.Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typings.kendoUi.kendo.drawing.Path = js.native
  
  def fill(color: String): typings.kendoUi.kendo.drawing.Path = js.native
  def fill(color: String, opacity: Double): typings.kendoUi.kendo.drawing.Path = js.native
  
  def lineTo(x: Any): typings.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Any, y: Double): typings.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Double): typings.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Double, y: Double): typings.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Point): typings.kendoUi.kendo.drawing.Path = js.native
  def lineTo(x: Point, y: Double): typings.kendoUi.kendo.drawing.Path = js.native
  
  def moveTo(x: Any): typings.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Any, y: Double): typings.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Double): typings.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Double, y: Double): typings.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Point): typings.kendoUi.kendo.drawing.Path = js.native
  def moveTo(x: Point, y: Double): typings.kendoUi.kendo.drawing.Path = js.native
  
  @JSName("options")
  var options_Path: PathOptions = js.native
  
  var segments: Any = js.native
  
  def stroke(color: String): typings.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double): typings.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoUi.kendo.drawing.Path = js.native
  def stroke(color: String, width: Unit, opacity: Double): typings.kendoUi.kendo.drawing.Path = js.native
}
