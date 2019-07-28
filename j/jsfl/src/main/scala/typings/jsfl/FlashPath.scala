package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashPath extends js.Object {
  /// Read-only; an integer representing the number of points in the path.
  var nPts: Double = js.native
  var void: js.Any = js.native
  /// Appends a cubic Bézier curve segment to the path.
  def addCubicCurve(
    xAnchor: Double,
    yAnchor: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double
  ): Unit = js.native
  /// Appends a quadratic Bézier segment to the path.
  def addCurve(xAnchor: Double, yAnchor: Double, x2: Double, y2: Double, x3: Double, y3: Double): Unit = js.native
  /// Adds a point to the path.
  def addPoint(x: Double, y: Double): Unit = js.native
  /// Removes all points from the path.
  def clear(): Unit = js.native
  /// Appends a point at the location of the first point of the path and extends the path to that point, which closes the path.
  def close(): js.Any = js.native
  /// Creates a shape on the Stage by using the current stroke and fill settings.
  def makeShape(): Unit = js.native
  def makeShape(bSupressFill: Boolean): Unit = js.native
  def makeShape(bSupressFill: Boolean, bSupressStroke: Boolean): Unit = js.native
  /// Starts a new contour in the path.
  def newContour(): Unit = js.native
}

