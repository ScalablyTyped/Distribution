package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECCurveFp extends js.Object {
  var a: ECFieldElementFp
  var b: ECFieldElementFp
  var infinity: ECPointFp
  var q: BigInteger
  def decodePointHex(): ECPointFp | Null
  def equals(): Boolean
  def fromBigInteger(): ECFieldElementFp
  def getA(): ECFieldElementFp
  def getB(): ECFieldElementFp
  def getInfinity(): ECPointFp
  def getQ(): BigInteger
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
}

