package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECCurveFp extends js.Object {
  var a: ECFieldElementFp = js.native
  var b: ECFieldElementFp = js.native
  var infinity: ECPointFp = js.native
  var q: BigInteger = js.native
  def decodePointHex(): ECPointFp | Null = js.native
  def equals(): Boolean = js.native
  def fromBigInteger(): ECFieldElementFp = js.native
  def getA(): ECFieldElementFp = js.native
  def getB(): ECFieldElementFp = js.native
  def getInfinity(): ECPointFp = js.native
  def getQ(): BigInteger = js.native
}

object ECCurveFp {
  @scala.inline
  def apply(
    a: ECFieldElementFp,
    b: ECFieldElementFp,
    decodePointHex: () => ECPointFp | Null,
    equals: () => Boolean,
    fromBigInteger: () => ECFieldElementFp,
    getA: () => ECFieldElementFp,
    getB: () => ECFieldElementFp,
    getInfinity: () => ECPointFp,
    getQ: () => BigInteger,
    infinity: ECPointFp,
    q: BigInteger
  ): ECCurveFp = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], decodePointHex = js.Any.fromFunction0(decodePointHex), equals = js.Any.fromFunction0(equals), fromBigInteger = js.Any.fromFunction0(fromBigInteger), getA = js.Any.fromFunction0(getA), getB = js.Any.fromFunction0(getB), getInfinity = js.Any.fromFunction0(getInfinity), getQ = js.Any.fromFunction0(getQ), infinity = infinity.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECCurveFp]
  }
  @scala.inline
  implicit class ECCurveFpOps[Self <: ECCurveFp] (val x: Self) extends AnyVal {
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
    def setA(value: ECFieldElementFp): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: ECFieldElementFp): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecodePointHex(value: () => ECPointFp | Null): Self = this.set("decodePointHex", js.Any.fromFunction0(value))
    @scala.inline
    def setEquals(value: () => Boolean): Self = this.set("equals", js.Any.fromFunction0(value))
    @scala.inline
    def setFromBigInteger(value: () => ECFieldElementFp): Self = this.set("fromBigInteger", js.Any.fromFunction0(value))
    @scala.inline
    def setGetA(value: () => ECFieldElementFp): Self = this.set("getA", js.Any.fromFunction0(value))
    @scala.inline
    def setGetB(value: () => ECFieldElementFp): Self = this.set("getB", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInfinity(value: () => ECPointFp): Self = this.set("getInfinity", js.Any.fromFunction0(value))
    @scala.inline
    def setGetQ(value: () => BigInteger): Self = this.set("getQ", js.Any.fromFunction0(value))
    @scala.inline
    def setInfinity(value: ECPointFp): Self = this.set("infinity", value.asInstanceOf[js.Any])
    @scala.inline
    def setQ(value: BigInteger): Self = this.set("q", value.asInstanceOf[js.Any])
  }
  
}

