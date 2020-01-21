package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "ECPointFp")
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
}

