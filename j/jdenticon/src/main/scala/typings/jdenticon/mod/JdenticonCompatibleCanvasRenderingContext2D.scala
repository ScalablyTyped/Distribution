package typings.jdenticon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JdenticonCompatibleCanvasRenderingContext2D extends js.Object {
  
  // CanvasPath
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
  
  // CanvasDrawPath
  def beginPath(): Unit = js.native
  
  // CanvasRenderingContext2D
  val canvas: JdenticonCompatibleCanvas = js.native
  
  // CanvasRect
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  def closePath(): Unit = js.native
  
  def fill(): Unit = js.native
  
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  // CanvasFillStrokeStyles
  var fillStyle: js.Any = js.native
  
  def lineTo(x: Double, y: Double): Unit = js.native
  
  def moveTo(x: Double, y: Double): Unit = js.native
  
  // CanvasState
  def restore(): Unit = js.native
  
  def save(): Unit = js.native
  
  // CanvasTransform
  def translate(x: Double, y: Double): Unit = js.native
}
