package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsValid extends js.Object {
  var isValid: Boolean
  var parse: AnonCertsIdx
  var signerInfos: js.Array[_]
}

object AnonIsValid {
  @scala.inline
  def apply(isValid: Boolean, parse: AnonCertsIdx, signerInfos: js.Array[_]): AnonIsValid = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsValid]
  }
}

