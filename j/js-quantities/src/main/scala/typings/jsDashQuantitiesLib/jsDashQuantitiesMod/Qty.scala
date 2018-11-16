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
  def add(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.Source): Qty = js.native
  def compareTo(value: Qty): jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.ComparisonResult = js.native
  def div(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.Source): Qty = js.native
  def eq(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.UnitSource): scala.Boolean = js.native
  def format(): java.lang.String = js.native
  def format(formatter: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.Formatter): java.lang.String = js.native
  def format(value: java.lang.String): java.lang.String = js.native
  def format(value: java.lang.String, formatter: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.Formatter): java.lang.String = js.native
  def gt(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.UnitSource): scala.Boolean = js.native
  def gte(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.UnitSource): scala.Boolean = js.native
  def inverse(): Qty = js.native
  def isBase(): scala.Boolean = js.native
  def isCompatible(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.UnitSource): scala.Boolean = js.native
  def isUnitless(): scala.Boolean = js.native
  def kind(): java.lang.String = js.native
  def lt(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.UnitSource): scala.Boolean = js.native
  def lte(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.UnitSource): scala.Boolean = js.native
  def mul(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.Source): Qty = js.native
  def same(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.UnitSource): scala.Boolean = js.native
  def sub(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.Source): Qty = js.native
  def to(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.UnitSource): Qty = js.native
  def toBase(): Qty = js.native
  def toFloat(): scala.Double = js.native
  def toPrec(value: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.Source): Qty = js.native
  def toString(valueOrPrecision: jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs.Source): java.lang.String = js.native
  def toString(value: java.lang.String, precision: scala.Double): java.lang.String = js.native
  def units(): java.lang.String = js.native
}

