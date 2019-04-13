package typings
package mathjsLib.mathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unit extends _MathType {
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

object Unit {
  @scala.inline
  def apply(
    abs: Unit => Unit,
    clone: () => Unit,
    divide: Unit => Unit,
    equalBase: Unit => scala.Boolean,
    equals: Unit => scala.Boolean,
    format: FormatOptions => java.lang.String,
    formatUnits: () => java.lang.String,
    hasBase: js.Any => scala.Boolean,
    multiply: Unit => Unit,
    pow: Unit => Unit,
    splitUnit: js.Array[java.lang.String | Unit] => js.Array[Unit],
    to: java.lang.String => Unit,
    toJSON: () => MathJSON,
    toNumber: java.lang.String => scala.Double,
    toNumeric: java.lang.String => scala.Double | Fraction | BigNumber,
    toSI: () => Unit,
    toString: () => java.lang.String,
    valueOf: () => java.lang.String
  ): Unit = {
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction1(abs), clone = js.Any.fromFunction0(clone), divide = js.Any.fromFunction1(divide), equalBase = js.Any.fromFunction1(equalBase), equals = js.Any.fromFunction1(equals), format = js.Any.fromFunction1(format), formatUnits = js.Any.fromFunction0(formatUnits), hasBase = js.Any.fromFunction1(hasBase), multiply = js.Any.fromFunction1(multiply), pow = js.Any.fromFunction1(pow), splitUnit = js.Any.fromFunction1(splitUnit), to = js.Any.fromFunction1(to), toJSON = js.Any.fromFunction0(toJSON), toNumber = js.Any.fromFunction1(toNumber), toNumeric = js.Any.fromFunction1(toNumeric), toSI = js.Any.fromFunction0(toSI), toString = js.Any.fromFunction0(toString), valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[Unit]
  }
}

