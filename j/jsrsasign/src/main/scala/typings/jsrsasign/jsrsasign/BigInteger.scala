package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigInteger extends js.Object {
  def abs(): BigInteger
  def bitLength(): Double
  def compareTo(a: BigInteger): Double
  def mod(a: BigInteger): BigInteger
  def modPowInt(e: Double, m: BigInteger): BigInteger
  def negate(): BigInteger
  def toString(b: Double): String
}

object BigInteger {
  @scala.inline
  def apply(
    abs: () => BigInteger,
    bitLength: () => Double,
    compareTo: BigInteger => Double,
    mod: BigInteger => BigInteger,
    modPowInt: (Double, BigInteger) => BigInteger,
    negate: () => BigInteger,
    toString: Double => String
  ): BigInteger = {
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction0(abs), bitLength = js.Any.fromFunction0(bitLength), compareTo = js.Any.fromFunction1(compareTo), mod = js.Any.fromFunction1(mod), modPowInt = js.Any.fromFunction2(modPowInt), negate = js.Any.fromFunction0(negate), toString = js.Any.fromFunction1(toString))
    __obj.asInstanceOf[BigInteger]
  }
}

