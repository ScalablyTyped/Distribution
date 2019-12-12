package typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod

import org.scalablytyped.runtime.TopLevel
import typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.AdmissionControlStatusCode.ACCEPTED
import typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.AdmissionControlStatusCode.BLACKLISTED
import typings.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.AdmissionControlStatusCode.REJECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdmissionControlStatusCode extends js.Object

@JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatusCode")
@js.native
object AdmissionControlStatusCode extends js.Object {
  @js.native
  sealed trait ACCEPTED extends AdmissionControlStatusCode
  
  @js.native
  sealed trait BLACKLISTED extends AdmissionControlStatusCode
  
  @js.native
  sealed trait REJECTED extends AdmissionControlStatusCode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdmissionControlStatusCode with Double] = js.native
  /* 0 */ @js.native
  object ACCEPTED extends TopLevel[ACCEPTED with Double]
  
  /* 1 */ @js.native
  object BLACKLISTED extends TopLevel[BLACKLISTED with Double]
  
  /* 2 */ @js.native
  object REJECTED extends TopLevel[REJECTED with Double]
  
}

