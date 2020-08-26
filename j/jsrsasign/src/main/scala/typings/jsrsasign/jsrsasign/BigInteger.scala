package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigInteger extends js.Object {
  def abs(): BigInteger = js.native
  def bitLength(): Double = js.native
  def compareTo(a: BigInteger): Double = js.native
  def mod(a: BigInteger): BigInteger = js.native
  def modPowInt(e: Double, m: BigInteger): BigInteger = js.native
  def negate(): BigInteger = js.native
  def toString(b: Double): String = js.native
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
  @scala.inline
  implicit class BigIntegerOps[Self <: BigInteger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbs(value: () => BigInteger): Self = this.set("abs", js.Any.fromFunction0(value))
    @scala.inline
    def setBitLength(value: () => Double): Self = this.set("bitLength", js.Any.fromFunction0(value))
    @scala.inline
    def setCompareTo(value: BigInteger => Double): Self = this.set("compareTo", js.Any.fromFunction1(value))
    @scala.inline
    def setMod(value: BigInteger => BigInteger): Self = this.set("mod", js.Any.fromFunction1(value))
    @scala.inline
    def setModPowInt(value: (Double, BigInteger) => BigInteger): Self = this.set("modPowInt", js.Any.fromFunction2(value))
    @scala.inline
    def setNegate(value: () => BigInteger): Self = this.set("negate", js.Any.fromFunction0(value))
    @scala.inline
    def setToString(value: Double => String): Self = this.set("toString", js.Any.fromFunction1(value))
  }
  
}

