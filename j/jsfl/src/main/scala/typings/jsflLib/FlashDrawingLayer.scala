package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashDrawingLayer extends js.Object {
  /// Puts Flash in drawing mode.
  def beginDraw(): scala.Unit = js.native
  /// Puts Flash in drawing mode.
  def beginDraw(persistentDraw: scala.Boolean): scala.Unit = js.native
  /// Erases what was previously drawn using the drawingLayer and prepares for more drawing commands.
  def beginFrame(): scala.Unit = js.native
  /// Draws a cubic curve from the current pen location using the parameters as the coordinates of the cubic segment.
  def cubicCurveTo(
    x1Ctrl: scala.Double,
    y1Ctrl: scala.Double,
    x2Ctl: scala.Double,
    y2Ctl: scala.Double,
    xEnd: scala.Double,
    yEnd: scala.Double
  ): scala.Unit = js.native
  /// Draws a quadratic curve segment starting at the current drawing position and ending at a specified point.
  def curveTo(xCtl: scala.Double, yCtl: scala.Double, xEnd: scala.Double, yEnd: scala.Double): scala.Unit = js.native
  /// Draws the specified path.
  def drawPath(path: FlashPath): scala.Unit = js.native
  /// Exits drawing mode.
  def endDraw(): scala.Unit = js.native
  /// Signals the end of a group of drawing commands.
  def endFrame(): scala.Unit = js.native
  /// Draws a line from the current drawing position to the point (x,y).
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /// Sets the current drawing position.
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /// Returns a new Path object.
  def newPath(): scala.Unit = js.native
  /// Sets the color of subsequently drawn data.
  def setColor(color: js.Any): scala.Unit = js.native
  /// This method is not available.
  def setFill(): scala.Unit = js.native
  /// This method is not available.
  def setStroke(): scala.Unit = js.native
}

