package typings.libraCore.admissionControlPbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AdmissionControlStatusCode extends js.Object
@JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatusCode")
@js.native
object AdmissionControlStatusCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdmissionControlStatusCode with Double] = js.native
  
  @js.native
  sealed trait ACCEPTED extends AdmissionControlStatusCode
  /* 0 */ @js.native
  object ACCEPTED extends TopLevel[ACCEPTED with Double]
  
  @js.native
  sealed trait BLACKLISTED extends AdmissionControlStatusCode
  /* 1 */ @js.native
  object BLACKLISTED extends TopLevel[BLACKLISTED with Double]
  
  @js.native
  sealed trait REJECTED extends AdmissionControlStatusCode
  /* 2 */ @js.native
  object REJECTED extends TopLevel[REJECTED with Double]
}
