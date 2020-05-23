package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsValid extends js.Object {
  var isValid: Boolean
  var parse: CertsIdx
  var signerInfos: js.Array[_]
}

object IsValid {
  @scala.inline
  def apply(isValid: Boolean, parse: CertsIdx, signerInfos: js.Array[_]): IsValid = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsValid]
  }
}

