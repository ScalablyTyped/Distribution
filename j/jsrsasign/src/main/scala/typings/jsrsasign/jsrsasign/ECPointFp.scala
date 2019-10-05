package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.ECPointFp")
@js.native
class ECPointFp protected () extends js.Object {
  def this(curve: ECFieldElementFp, x: ECFieldElementFp, y: ECFieldElementFp) = this()
  def this(curve: ECFieldElementFp, x: ECFieldElementFp, y: ECFieldElementFp, z: BigInteger) = this()
  var curve: ECFieldElementFp = js.native
  var x: ECFieldElementFp = js.native
  var y: ECFieldElementFp = js.native
  var z: BigInteger = js.native
  var zinv: BigInteger | Null = js.native
}

