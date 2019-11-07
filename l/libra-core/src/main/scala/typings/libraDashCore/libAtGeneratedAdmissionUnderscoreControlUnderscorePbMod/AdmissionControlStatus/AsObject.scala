package typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.AdmissionControlStatus

import typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.AdmissionControlStatusCode
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
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[AsObject]
  }
}

