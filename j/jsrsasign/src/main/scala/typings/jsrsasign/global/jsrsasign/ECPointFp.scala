package typings.jsrsasign.global.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.ECPointFp")
@js.native
class ECPointFp protected ()
  extends typings.jsrsasign.jsrsasign.ECPointFp {
  def this(
    curve: typings.jsrsasign.jsrsasign.ECFieldElementFp,
    x: typings.jsrsasign.jsrsasign.ECFieldElementFp,
    y: typings.jsrsasign.jsrsasign.ECFieldElementFp
  ) = this()
  def this(
    curve: typings.jsrsasign.jsrsasign.ECFieldElementFp,
    x: typings.jsrsasign.jsrsasign.ECFieldElementFp,
    y: typings.jsrsasign.jsrsasign.ECFieldElementFp,
    z: typings.jsrsasign.jsrsasign.BigInteger
  ) = this()
  /* CompleteClass */
  override var curve: typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override var x: typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override var y: typings.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  /* CompleteClass */
  override var z: typings.jsrsasign.jsrsasign.BigInteger = js.native
  /* CompleteClass */
  override var zinv: typings.jsrsasign.jsrsasign.BigInteger | Null = js.native
}

