package typings
package jdenticonLib.jdenticonMod.Global

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
  def arc(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double
  ): scala.Unit = js.native
  def arc(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Boolean
  ): scala.Unit = js.native
  // CanvasDrawPath
  def beginPath(): scala.Unit = js.native
  // CanvasRect
  def clearRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def closePath(): scala.Unit = js.native
  def fill(): scala.Unit = js.native
  def fillRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  // CanvasState
  def restore(): scala.Unit = js.native
  def save(): scala.Unit = js.native
  // CanvasTransform
  def translate(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

