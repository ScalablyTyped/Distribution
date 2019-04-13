package typings
package integerLib.integerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("integer", "IntClass")
@js.native
class IntClass protected () extends js.Object {
  def this(`val`: IntLike) = this()
  var high: scala.Double = js.native
  var low: scala.Double = js.native
  def abs(): IntClass = js.native
  def absoluteValue(): IntClass = js.native
  def add(augend: IntLike): IntClass = js.native
  def and(bits: IntLike): IntClass = js.native
  def bitSizeAbs(): scala.Double = js.native
  def compare(`val`: IntLike): integerLib.integerLibNumbers.`-1` | integerLib.integerLibNumbers.`0` | integerLib.integerLibNumbers.`1` = js.native
  def div(divisor: IntLike): IntClass = js.native
  def divide(divisor: IntLike): IntClass = js.native
  def divideBy(divisor: IntLike): IntClass = js.native
  def dividedBy(divisor: IntLike): IntClass = js.native
  def doesNotEqual(`val`: IntLike): scala.Boolean = js.native
  def eq(`val`: IntLike): scala.Boolean = js.native
  def equals(`val`: IntLike): scala.Boolean = js.native
  def greaterThan(`val`: IntLike): scala.Boolean = js.native
  def greaterThanOrEquals(`val`: IntLike): scala.Boolean = js.native
  def gt(`val`: IntLike): scala.Boolean = js.native
  def gte(`val`: IntLike): scala.Boolean = js.native
  def isEqualTo(`val`: IntLike): scala.Boolean = js.native
  def isEven(): scala.Boolean = js.native
  def isGreaterThan(`val`: IntLike): scala.Boolean = js.native
  def isGreaterThanOrEqualTo(`val`: IntLike): scala.Boolean = js.native
  def isLessThan(`val`: IntLike): scala.Boolean = js.native
  def isLessThanOrEqualTo(`val`: IntLike): scala.Boolean = js.native
  def isNegative(): scala.Boolean = js.native
  def isNonZero(): scala.Boolean = js.native
  def isNotEqualTo(`val`: IntLike): scala.Boolean = js.native
  def isNotZero(): scala.Boolean = js.native
  def isOdd(): scala.Boolean = js.native
  def isPositive(): scala.Boolean = js.native
  def isSafe(): scala.Boolean = js.native
  def isUnsafe(): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def lessThan(`val`: IntLike): scala.Boolean = js.native
  def lessThanOrEquals(`val`: IntLike): scala.Boolean = js.native
  def lt(`val`: IntLike): scala.Boolean = js.native
  def lte(`val`: IntLike): scala.Boolean = js.native
  def minus(subtrahend: IntLike): IntClass = js.native
  def mod(divisor: IntLike): IntClass = js.native
  def modulo(divisor: IntLike): IntClass = js.native
  def mul(multiplier: IntLike): IntClass = js.native
  def multiply(multiplier: IntLike): IntClass = js.native
  def neg(): IntClass = js.native
  def negate(): IntClass = js.native
  def neq(`val`: IntLike): scala.Boolean = js.native
  def not(): IntClass = js.native
  def notEquals(`val`: IntLike): scala.Boolean = js.native
  def or(bits: IntLike): IntClass = js.native
  def over(divisor: IntLike): IntClass = js.native
  def plus(augend: IntLike): IntClass = js.native
  def shiftLeft(bits: scala.Double): IntClass = js.native
  def shiftRight(bits: scala.Double): IntClass = js.native
  def shl(bits: scala.Double): IntClass = js.native
  def shr(bits: scala.Double): IntClass = js.native
  def sub(subtrahend: IntLike): IntClass = js.native
  def subtract(subtrahend: IntLike): IntClass = js.native
  def times(multiplier: IntLike): IntClass = js.native
  def toNumber(): scala.Double = js.native
  def toNumberUnsafe(): scala.Double = js.native
  def toString(radix: scala.Double): java.lang.String = js.native
  def xor(bits: IntLike): IntClass = js.native
}

