package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashDrawingLayer extends StObject {
  
  /// Puts Flash in drawing mode.
  def beginDraw(): Unit = js.native
  def beginDraw(persistentDraw: Boolean): Unit = js.native
  
  /// Erases what was previously drawn using the drawingLayer and prepares for more drawing commands.
  def beginFrame(): Unit = js.native
  
  /// Draws a cubic curve from the current pen location using the parameters as the coordinates of the cubic segment.
  def cubicCurveTo(x1Ctrl: Double, y1Ctrl: Double, x2Ctl: Double, y2Ctl: Double, xEnd: Double, yEnd: Double): Unit = js.native
  
  /// Draws a quadratic curve segment starting at the current drawing position and ending at a specified point.
  def curveTo(xCtl: Double, yCtl: Double, xEnd: Double, yEnd: Double): Unit = js.native
  
  /// Draws the specified path.
  def drawPath(path: FlashPath): Unit = js.native
  
  /// Exits drawing mode.
  def endDraw(): Unit = js.native
  
  /// Signals the end of a group of drawing commands.
  def endFrame(): Unit = js.native
  
  /// Draws a line from the current drawing position to the point (x,y).
  def lineTo(x: Double, y: Double): Unit = js.native
  
  /// Sets the current drawing position.
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /// Returns a new Path object.
  def newPath(): Unit = js.native
  
  /// Sets the color of subsequently drawn data.
  def setColor(color: js.Any): Unit = js.native
  
  /// This method is not available.
  def setFill(): Unit = js.native
  
  /// This method is not available.
  def setStroke(): Unit = js.native
}
