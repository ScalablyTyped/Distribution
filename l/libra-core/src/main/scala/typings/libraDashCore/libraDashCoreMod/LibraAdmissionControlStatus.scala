package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraAdmissionControlStatus extends js.Object

@JSImport("libra-core", "LibraAdmissionControlStatus")
@js.native
object LibraAdmissionControlStatus extends js.Object {
  @js.native
  sealed trait ACCEPTED extends LibraAdmissionControlStatus
  
  @js.native
  sealed trait BLACKLISTED extends LibraAdmissionControlStatus
  
  @js.native
  sealed trait REJECTED extends LibraAdmissionControlStatus
  
  @js.native
  sealed trait UNKNOWN extends LibraAdmissionControlStatus
  
  /* 0 */ val ACCEPTED: typings.libraDashCore.libraDashCoreMod.LibraAdmissionControlStatus.ACCEPTED with Double = js.native
  /* 1 */ val BLACKLISTED: typings.libraDashCore.libraDashCoreMod.LibraAdmissionControlStatus.BLACKLISTED with Double = js.native
  /* 2 */ val REJECTED: typings.libraDashCore.libraDashCoreMod.LibraAdmissionControlStatus.REJECTED with Double = js.native
  /* -1 */ val UNKNOWN: typings.libraDashCore.libraDashCoreMod.LibraAdmissionControlStatus.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LibraAdmissionControlStatus with Double] = js.native
}

