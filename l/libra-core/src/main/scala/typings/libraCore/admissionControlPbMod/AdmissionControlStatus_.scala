package typings.libraCore.admissionControlPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatus")
@js.native
class AdmissionControlStatus_ () extends Message {
  def getCode(): AdmissionControlStatusCode = js.native
  def getMessage(): String = js.native
  def setCode(value: AdmissionControlStatusCode): Unit = js.native
  def setMessage(value: String): Unit = js.native
}

