package typings.jdenticon.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a subset of `CanvasRenderingContext2D` to allow using incomplete canvas implementations, 
  * like `canvas-renderer`.
  */
@js.native
trait JdenticonCompatibleCanvasRenderingContext2D extends js.Object {
  // CanvasRenderingContext2D
  val canvas: JdenticonCompatibleCanvas = js.native
  // CanvasFillStrokeStyles
  var fillStyle: js.Any = js.native
  // CanvasPath
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
  // CanvasDrawPath
  def beginPath(): Unit = js.native
  // CanvasRect
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def closePath(): Unit = js.native
  def fill(): Unit = js.native
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  def lineTo(x: Double, y: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  // CanvasState
  def restore(): Unit = js.native
  def save(): Unit = js.native
  // CanvasTransform
  def translate(x: Double, y: Double): Unit = js.native
}

