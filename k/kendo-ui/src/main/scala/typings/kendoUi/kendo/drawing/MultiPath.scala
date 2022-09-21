package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiPath
  extends StObject
     with Element {
  
  def close(): MultiPath = js.native
  
  def curveTo(controlOut: Any, controlIn: Any, endPoint: Any): MultiPath = js.native
  def curveTo(controlOut: Any, controlIn: Any, endPoint: Point): MultiPath = js.native
  def curveTo(controlOut: Any, controlIn: Point, endPoint: Any): MultiPath = js.native
  def curveTo(controlOut: Any, controlIn: Point, endPoint: Point): MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Any, endPoint: Any): MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Any, endPoint: Point): MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Any): MultiPath = js.native
  def curveTo(controlOut: Point, controlIn: Point, endPoint: Point): MultiPath = js.native
  
  def fill(color: String): MultiPath = js.native
  def fill(color: String, opacity: Double): MultiPath = js.native
  
  def lineTo(x: Any): MultiPath = js.native
  def lineTo(x: Any, y: Double): MultiPath = js.native
  def lineTo(x: Double): MultiPath = js.native
  def lineTo(x: Double, y: Double): MultiPath = js.native
  def lineTo(x: Point): MultiPath = js.native
  def lineTo(x: Point, y: Double): MultiPath = js.native
  
  def moveTo(x: Any): MultiPath = js.native
  def moveTo(x: Any, y: Double): MultiPath = js.native
  def moveTo(x: Double): MultiPath = js.native
  def moveTo(x: Double, y: Double): MultiPath = js.native
  def moveTo(x: Point): MultiPath = js.native
  def moveTo(x: Point, y: Double): MultiPath = js.native
  
  @JSName("options")
  var options_MultiPath: MultiPathOptions = js.native
  
  var paths: Any = js.native
  
  def stroke(color: String): MultiPath = js.native
  def stroke(color: String, width: Double): MultiPath = js.native
  def stroke(color: String, width: Double, opacity: Double): MultiPath = js.native
  def stroke(color: String, width: Unit, opacity: Double): MultiPath = js.native
}
