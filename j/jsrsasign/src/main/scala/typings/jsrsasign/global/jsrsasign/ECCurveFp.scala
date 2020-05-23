package typings.jsrsasign.global.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.ECCurveFp")
@js.native
class ECCurveFp protected ()
  extends typings.jsrsasign.jsrsasign.ECCurveFp {
  def this(
    q: typings.jsrsasign.jsrsasign.BigInteger,
    a: typings.jsrsasign.jsrsasign.BigInteger,
    b: typings.jsrsasign.jsrsasign.BigInteger
  ) = this()
  /* CompleteClass */
  override var a: typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override var b: typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override var infinity: typings.jsrsasign.jsrsasign.ECPointFp = js.native
  /* CompleteClass */
  override var q: typings.jsrsasign.jsrsasign.BigInteger = js.native
  /* CompleteClass */
  override def decodePointHex(): typings.jsrsasign.jsrsasign.ECPointFp | Null = js.native
  /* CompleteClass */
  override def equals(): Boolean = js.native
  /* CompleteClass */
  override def fromBigInteger(): typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override def getA(): typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override def getB(): typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override def getInfinity(): typings.jsrsasign.jsrsasign.ECPointFp = js.native
  /* CompleteClass */
  override def getQ(): typings.jsrsasign.jsrsasign.BigInteger = js.native
}

