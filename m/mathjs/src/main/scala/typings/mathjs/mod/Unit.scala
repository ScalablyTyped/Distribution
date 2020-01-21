package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unit extends _MathType {
  def abs(unit: Unit): Unit
  def divide(unit: Unit): Unit
  def equalBase(unit: Unit): Boolean
  def equals(unit: Unit): Boolean
  def format(options: FormatOptions): String
  def formatUnits(): String
  def hasBase(base: js.Any): Boolean
  def multiply(unit: Unit): Unit
  def pow(unit: Unit): Unit
  def splitUnit(parts: js.Array[String | Unit]): js.Array[Unit]
  def to(unit: String): Unit
  def toJSON(): MathJSON
  def toNumber(unit: String): Double
  def toNumeric(unit: String): Double | Fraction | BigNumber
  def toSI(): Unit
}

object Unit {
  @scala.inline
  def apply(
    abs: Unit => Unit,
    divide: Unit => Unit,
    equalBase: Unit => Boolean,
    equals: Unit => Boolean,
    format: FormatOptions => String,
    formatUnits: () => String,
    hasBase: js.Any => Boolean,
    multiply: Unit => Unit,
    pow: Unit => Unit,
    splitUnit: js.Array[String | Unit] => js.Array[Unit],
    to: String => Unit,
    toJSON: () => MathJSON,
    toNumber: String => Double,
    toNumeric: String => Double | Fraction | BigNumber,
    toSI: () => Unit
  ): Unit = {
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction1(abs), divide = js.Any.fromFunction1(divide), equalBase = js.Any.fromFunction1(equalBase), equals = js.Any.fromFunction1(equals), format = js.Any.fromFunction1(format), formatUnits = js.Any.fromFunction0(formatUnits), hasBase = js.Any.fromFunction1(hasBase), multiply = js.Any.fromFunction1(multiply), pow = js.Any.fromFunction1(pow), splitUnit = js.Any.fromFunction1(splitUnit), to = js.Any.fromFunction1(to), toJSON = js.Any.fromFunction0(toJSON), toNumber = js.Any.fromFunction1(toNumber), toNumeric = js.Any.fromFunction1(toNumeric), toSI = js.Any.fromFunction0(toSI))
  
    __obj.asInstanceOf[Unit]
  }
}

