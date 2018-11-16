package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashPath extends js.Object {
  /// Read-only; an integer representing the number of points in the path.
  var nPts: scala.Double = js.native
  var void: js.Any = js.native
  /// Appends a cubic Bézier curve segment to the path.
  def addCubicCurve(
    xAnchor: scala.Double,
    yAnchor: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double
  ): scala.Unit = js.native
  /// Appends a quadratic Bézier segment to the path.
  def addCurve(
    xAnchor: scala.Double,
    yAnchor: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double
  ): scala.Unit = js.native
  /// Adds a point to the path.
  def addPoint(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /// Removes all points from the path.
  def clear(): scala.Unit = js.native
  /// Appends a point at the location of the first point of the path and extends the path to that point, which closes the path.
  def close(): js.Any = js.native
  /// Creates a shape on the Stage by using the current stroke and fill settings.
  def makeShape(): scala.Unit = js.native
  /// Creates a shape on the Stage by using the current stroke and fill settings.
  def makeShape(bSupressFill: scala.Boolean): scala.Unit = js.native
  /// Creates a shape on the Stage by using the current stroke and fill settings.
  def makeShape(bSupressFill: scala.Boolean, bSupressStroke: scala.Boolean): scala.Unit = js.native
  /// Starts a new contour in the path.
  def newContour(): scala.Unit = js.native
}

