package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiPath
  extends typings.kendoUi.kendo.drawing.Element {
  
  def close(): typings.kendoUi.kendo.drawing.MultiPath = js.native
  
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: js.Any): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: js.Any, endPoint: Point): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: js.Any): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: js.Any, controlIn: Point, endPoint: Point): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: js.Any): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: js.Any, endPoint: Point): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: js.Any): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): typings.kendoUi.kendo.drawing.MultiPath = js.native
  
  def fill(color: String): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def fill(color: String, opacity: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  
  def lineTo(x: js.Any): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: js.Any, y: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Double, y: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Point): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def lineTo(x: Point, y: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  
  def moveTo(x: js.Any): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: js.Any, y: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Double, y: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Point): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def moveTo(x: Point, y: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  
  @JSName("options")
  var options_MultiPath: MultiPathOptions = js.native
  
  var paths: js.Any = js.native
  
  def stroke(color: String): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: js.UndefOr[scala.Nothing], opacity: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoUi.kendo.drawing.MultiPath = js.native
}
