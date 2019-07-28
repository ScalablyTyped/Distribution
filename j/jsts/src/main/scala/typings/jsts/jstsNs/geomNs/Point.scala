package typings.jsts.jstsNs.geomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.Point")
@js.native
class Point protected () extends Geometry {
  /**
    * @constructor
    */
  def this(coordinate: Coordinate) = this()
  def this(coordinate: Coordinate, factory: js.Any) = this()
  /**
    * @return {number} x-axis value of this Point.
    */
  def getX(): Double = js.native
  /**
    * @return {number} y-axis value of this Point.
    */
  def getY(): Double = js.native
  /**
    * @return {Point} Reversed point is a cloned point.
    */
  def reverse(): Point = js.native
}

