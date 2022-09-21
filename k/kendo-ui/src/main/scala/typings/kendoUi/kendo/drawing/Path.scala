package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path
  extends StObject
     with Element {
  
  def close(): Path = js.native
  
  def curveTo(controlOut: Any, controlIn: Any, endPoint: Any): Path = js.native
  def curveTo(controlOut: Any, controlIn: Any, endPoint: Point): Path = js.native
  def curveTo(controlOut: Any, controlIn: Point, endPoint: Any): Path = js.native
  def curveTo(controlOut: Any, controlIn: Point, endPoint: Point): Path = js.native
  def curveTo(controlOut: Point, controlIn: Any, endPoint: Any): Path = js.native
  def curveTo(controlOut: Point, controlIn: Any, endPoint: Point): Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Any): Path = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): Path = js.native
  
  def fill(color: String): Path = js.native
  def fill(color: String, opacity: Double): Path = js.native
  
  def lineTo(x: Any): Path = js.native
  def lineTo(x: Any, y: Double): Path = js.native
  def lineTo(x: Double): Path = js.native
  def lineTo(x: Double, y: Double): Path = js.native
  def lineTo(x: Point): Path = js.native
  def lineTo(x: Point, y: Double): Path = js.native
  
  def moveTo(x: Any): Path = js.native
  def moveTo(x: Any, y: Double): Path = js.native
  def moveTo(x: Double): Path = js.native
  def moveTo(x: Double, y: Double): Path = js.native
  def moveTo(x: Point): Path = js.native
  def moveTo(x: Point, y: Double): Path = js.native
  
  @JSName("options")
  var options_Path: PathOptions = js.native
  
  var segments: Any = js.native
  
  def stroke(color: String): Path = js.native
  def stroke(color: String, width: Double): Path = js.native
  def stroke(color: String, width: Double, opacity: Double): Path = js.native
  def stroke(color: String, width: Unit, opacity: Double): Path = js.native
}
