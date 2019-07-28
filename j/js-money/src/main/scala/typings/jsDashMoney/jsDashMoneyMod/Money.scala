package typings.jsDashMoney.jsDashMoneyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Money extends js.Object {
  var amount: Double = js.native
  var currency: String = js.native
  def add(other: Money): Money = js.native
  def allocate(ratios: js.Array[Double]): js.Array[Money] = js.native
  def compare(other: Money): Double = js.native
  def divide(divisor: Double): Money = js.native
  def divide(divisor: Double, rounder: RoundFunction): Money = js.native
  def equals(other: Money): Boolean = js.native
  def getAmount(): Double = js.native
  def getCurrency(): String = js.native
  def greaterThan(other: Money): Boolean = js.native
  def greaterThanOrEqual(other: Money): Boolean = js.native
  def isNegative(): Boolean = js.native
  def isPositive(): Boolean = js.native
  def isZero(): Boolean = js.native
  def lessThan(other: Money): Boolean = js.native
  def lessThanOrEqual(other: Money): Boolean = js.native
  def multiply(multiplier: Double): Money = js.native
  def multiply(multiplier: Double, rounder: RoundFunction): Money = js.native
  def subtract(other: Money): Money = js.native
  def toDecimal(): Double = js.native
  def toJSON(): MoneyObjectOut = js.native
}

