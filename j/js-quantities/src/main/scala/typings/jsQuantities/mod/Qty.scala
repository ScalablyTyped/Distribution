package typings.jsQuantities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Qty extends js.Object {
  val baseScalar: Double = js.native
  val denominator: js.Array[String] = js.native
  val initValue: String = js.native
  val numerator: js.Array[String] = js.native
  val scalar: Double = js.native
  def add(value: Source): Qty = js.native
  def compareTo(value: Qty): ComparisonResult = js.native
  def div(value: Source): Qty = js.native
  def eq(value: UnitSource): Boolean = js.native
  def format(): String = js.native
  def format(formatter: Formatter): String = js.native
  def format(value: String): String = js.native
  def format(value: String, formatter: Formatter): String = js.native
  def gt(value: UnitSource): Boolean = js.native
  def gte(value: UnitSource): Boolean = js.native
  def inverse(): Qty = js.native
  def isBase(): Boolean = js.native
  def isCompatible(value: UnitSource): Boolean = js.native
  def isUnitless(): Boolean = js.native
  def kind(): String = js.native
  def lt(value: UnitSource): Boolean = js.native
  def lte(value: UnitSource): Boolean = js.native
  def mul(value: Source): Qty = js.native
  def same(value: UnitSource): Boolean = js.native
  def sub(value: Source): Qty = js.native
  def to(value: UnitSource): Qty = js.native
  def toBase(): Qty = js.native
  def toFloat(): Double = js.native
  def toPrec(value: Source): Qty = js.native
  def toString(valueOrPrecision: Source): String = js.native
  def toString(value: String, precision: Double): String = js.native
  def units(): String = js.native
}

