package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCertsIdx extends js.Object {
  var certsIdx: Double
  var signerInfos: js.Array[_]
}

object AnonCertsIdx {
  @scala.inline
  def apply(certsIdx: Double, signerInfos: js.Array[_]): AnonCertsIdx = {
    val __obj = js.Dynamic.literal(certsIdx = certsIdx.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCertsIdx]
  }
}

