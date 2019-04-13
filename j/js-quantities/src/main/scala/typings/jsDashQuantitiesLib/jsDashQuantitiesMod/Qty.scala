package typings
package jsDashQuantitiesLib.jsDashQuantitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Qty extends js.Object {
  val baseScalar: scala.Double = js.native
  val denominator: js.Array[java.lang.String] = js.native
  val initValue: java.lang.String = js.native
  val numerator: js.Array[java.lang.String] = js.native
  val scalar: scala.Double = js.native
  def add(value: Source): Qty = js.native
  def compareTo(value: Qty): ComparisonResult = js.native
  def div(value: Source): Qty = js.native
  def eq(value: UnitSource): scala.Boolean = js.native
  def format(): java.lang.String = js.native
  def format(formatter: Formatter): java.lang.String = js.native
  def format(value: java.lang.String): java.lang.String = js.native
  def format(value: java.lang.String, formatter: Formatter): java.lang.String = js.native
  def gt(value: UnitSource): scala.Boolean = js.native
  def gte(value: UnitSource): scala.Boolean = js.native
  def inverse(): Qty = js.native
  def isBase(): scala.Boolean = js.native
  def isCompatible(value: UnitSource): scala.Boolean = js.native
  def isUnitless(): scala.Boolean = js.native
  def kind(): java.lang.String = js.native
  def lt(value: UnitSource): scala.Boolean = js.native
  def lte(value: UnitSource): scala.Boolean = js.native
  def mul(value: Source): Qty = js.native
  def same(value: UnitSource): scala.Boolean = js.native
  def sub(value: Source): Qty = js.native
  def to(value: UnitSource): Qty = js.native
  def toBase(): Qty = js.native
  def toFloat(): scala.Double = js.native
  def toPrec(value: Source): Qty = js.native
  def toString(valueOrPrecision: Source): java.lang.String = js.native
  def toString(value: java.lang.String, precision: scala.Double): java.lang.String = js.native
  def units(): java.lang.String = js.native
}

