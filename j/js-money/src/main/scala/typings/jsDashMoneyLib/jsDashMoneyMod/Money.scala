package typings
package jsDashMoneyLib.jsDashMoneyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Money extends js.Object {
  var amount: scala.Double = js.native
  var currency: java.lang.String = js.native
  def add(other: Money): Money = js.native
  def allocate(ratios: js.Array[scala.Double]): js.Array[Money] = js.native
  def compare(other: Money): scala.Double = js.native
  def divide(divisor: scala.Double): Money = js.native
  def divide(divisor: scala.Double, rounder: RoundFunction): Money = js.native
  def equals(other: Money): scala.Boolean = js.native
  def getAmount(): scala.Double = js.native
  def getCurrency(): java.lang.String = js.native
  def greaterThan(other: Money): scala.Boolean = js.native
  def greaterThanOrEqual(other: Money): scala.Boolean = js.native
  def isNegative(): scala.Boolean = js.native
  def isPositive(): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def lessThan(other: Money): scala.Boolean = js.native
  def lessThanOrEqual(other: Money): scala.Boolean = js.native
  def multiply(multiplier: scala.Double): Money = js.native
  def multiply(multiplier: scala.Double, rounder: RoundFunction): Money = js.native
  def subtract(other: Money): Money = js.native
  def toDecimal(): scala.Double = js.native
  def toJSON(): MoneyObjectOut = js.native
}

