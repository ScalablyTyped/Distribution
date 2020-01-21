package typings.libraCore.admissionControlPbMod.AdmissionControlStatus

import typings.libraCore.admissionControlPbMod.AdmissionControlStatusCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var code: AdmissionControlStatusCode
  var message: String
}

object AsObject {
  @scala.inline
  def apply(code: AdmissionControlStatusCode, message: String): AsObject = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

