package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertsIdx extends js.Object {
  var certsIdx: Double
  var signerInfos: js.Array[_]
}

object Anon_CertsIdx {
  @scala.inline
  def apply(certsIdx: Double, signerInfos: js.Array[_]): Anon_CertsIdx = {
    val __obj = js.Dynamic.literal(certsIdx = certsIdx.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CertsIdx]
  }
}

