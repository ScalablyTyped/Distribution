package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.ECCurveFp")
@js.native
class ECCurveFp protected () extends js.Object {
  def this(q: BigInteger, a: BigInteger, b: BigInteger) = this()
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

