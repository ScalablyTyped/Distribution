package typings
package mathjsLib.mathjsMod.mathNs

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
    abs: js.Function1[Unit, Unit],
    clone: js.Function0[Unit],
    divide: js.Function1[Unit, Unit],
    equalBase: js.Function1[Unit, scala.Boolean],
    equals: js.Function1[Unit, scala.Boolean],
    format: js.Function1[FormatOptions, java.lang.String],
    formatUnits: js.Function0[java.lang.String],
    hasBase: js.Function1[js.Any, scala.Boolean],
    multiply: js.Function1[Unit, Unit],
    pow: js.Function1[Unit, Unit],
    splitUnit: js.Function1[js.Array[java.lang.String | Unit], js.Array[Unit]],
    to: js.Function1[java.lang.String, Unit],
    toJSON: js.Function0[MathJSON],
    toNumber: js.Function1[java.lang.String, scala.Double],
    toNumeric: js.Function1[java.lang.String, scala.Double | Fraction | BigNumber],
    toSI: js.Function0[Unit],
    toString: js.Function0[java.lang.String],
    valueOf: js.Function0[java.lang.String]
  ): Unit = {
    val __obj = js.Dynamic.literal(abs = abs, clone = clone, divide = divide, equalBase = equalBase, equals = equals, format = format, formatUnits = formatUnits, hasBase = hasBase, multiply = multiply, pow = pow, splitUnit = splitUnit, to = to, toJSON = toJSON, toNumber = toNumber, toNumeric = toNumeric, toSI = toSI, toString = toString, valueOf = valueOf)
  
    __obj.asInstanceOf[Unit]
  }
}

