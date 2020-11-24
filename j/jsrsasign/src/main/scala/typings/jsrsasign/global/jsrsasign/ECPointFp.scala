package typings.jsrsasign.global.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
