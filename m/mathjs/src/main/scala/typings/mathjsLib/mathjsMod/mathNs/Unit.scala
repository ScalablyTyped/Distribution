package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Unit extends js.Object {
  def abs(unit: Unit): Unit
  def divide(unit: Unit): Unit
  def equalBase(unit: Unit): scala.Boolean
  def equals(unit: Unit): scala.Boolean
  def format(options: FormatOptions): java.lang.String
  def formatUnits(): java.lang.String
  def hasBase(base: js.Any): scala.Boolean
  def multiply(unit: Unit): Unit
  def pow(unit: Unit): Unit
  def splitUnit(parts: js.Array[java.lang.String | Unit]): js.Array[Unit]
  def to(unit: java.lang.String): Unit
  def toJSON(): MathJSON
  def toNumber(unit: java.lang.String): scala.Double
  def toNumeric(unit: java.lang.String): scala.Double | Fraction | BigNumber
  def toSI(): Unit
}

