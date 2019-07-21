package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraAdmissionControlStatus extends js.Object

@JSImport("libra-core", "LibraAdmissionControlStatus")
@js.native
object LibraAdmissionControlStatus extends js.Object {
  @js.native
  sealed trait ACCEPTED
    extends libraDashCoreLib.libraDashCoreMod.LibraAdmissionControlStatus
  
  @js.native
  sealed trait BLACKLISTED
    extends libraDashCoreLib.libraDashCoreMod.LibraAdmissionControlStatus
  
  @js.native
  sealed trait REJECTED
    extends libraDashCoreLib.libraDashCoreMod.LibraAdmissionControlStatus
  
  @js.native
  sealed trait UNKNOWN
    extends libraDashCoreLib.libraDashCoreMod.LibraAdmissionControlStatus
  
  /* 0 */ val ACCEPTED: ACCEPTED with scala.Double = js.native
  /* 1 */ val BLACKLISTED: BLACKLISTED with scala.Double = js.native
  /* 2 */ val REJECTED: REJECTED with scala.Double = js.native
  /* -1 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[libraDashCoreLib.libraDashCoreMod.LibraAdmissionControlStatus with scala.Double] = js.native
}

