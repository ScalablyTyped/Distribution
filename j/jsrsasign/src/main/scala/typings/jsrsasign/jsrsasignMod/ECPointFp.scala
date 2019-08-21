package typings.jsrsasign.jsrsasignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "ECPointFp")
@js.native
class ECPointFp protected ()
  extends typings.jsrsasign.jsrsasignNs.ECPointFp {
  def this(
    curve: typings.jsrsasign.jsrsasignNs.ECFieldElementFp,
    x: typings.jsrsasign.jsrsasignNs.ECFieldElementFp,
    y: typings.jsrsasign.jsrsasignNs.ECFieldElementFp
  ) = this()
  def this(
    curve: typings.jsrsasign.jsrsasignNs.ECFieldElementFp,
    x: typings.jsrsasign.jsrsasignNs.ECFieldElementFp,
    y: typings.jsrsasign.jsrsasignNs.ECFieldElementFp,
    z: typings.jsrsasign.jsrsasignNs.BigInteger
  ) = this()
}

