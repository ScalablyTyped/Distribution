package typings.jsts.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionMatrix extends js.Object {
  def add(im: IntersectionMatrix): Unit = js.native
  def get(row: Double, column: Double): Double = js.native
  def isContains(): Boolean = js.native
  def isCoveredBy(): Boolean = js.native
  def isCovers(): Boolean = js.native
  def isCrosses(dimensionOfGeometryA: Double, dimensionOfGeometryB: Double): Boolean = js.native
  def isDisjoint(): Boolean = js.native
  def isEquals(dimensionOfGeometryA: Double, dimensionOfGeometryB: Double): Boolean = js.native
  def isIntersects(): Boolean = js.native
  def isOverlaps(dimensionOfGeometryA: Double, dimensionOfGeometryB: Double): Boolean = js.native
  def isTouches(dimensionOfGeometryA: Double, dimensionOfGeometryB: Double): Boolean = js.native
  def isWithin(): Boolean = js.native
  def matches(
    requiredDimensionSymbols: js.Tuple9[String, String, String, String, String, String, String, String, String]
  ): Boolean = js.native
  def set(dimensionSymbols: js.Tuple3[String, String, String]): Unit = js.native
  def set(row: Double, col: Double, dimensionValue: Double): Unit = js.native
  def setAll(dimensionValue: Double): Unit = js.native
  def setAtLeast(dimensionSymbols: js.Tuple3[String, String, String]): Unit = js.native
  def setAtLeast(row: Double, col: Double, dimensionValue: Double): Unit = js.native
  def setAtLeastIfValid(row: Double, col: Double, minimumDimensionValue: Double): Unit = js.native
  def transpose(): IntersectionMatrix = js.native
}

