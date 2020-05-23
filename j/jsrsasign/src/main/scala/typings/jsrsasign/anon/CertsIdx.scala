package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertsIdx extends js.Object {
  var certsIdx: Double
  var signerInfos: js.Array[_]
}

object CertsIdx {
  @scala.inline
  def apply(certsIdx: Double, signerInfos: js.Array[_]): CertsIdx = {
    val __obj = js.Dynamic.literal(certsIdx = certsIdx.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertsIdx]
  }
}

