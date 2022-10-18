package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SessionDirection extends StObject
@JSImport("jssip/lib/RTCSession", "SessionDirection")
@js.native
object SessionDirection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionDirection & String] = js.native
  
  @js.native
  sealed trait INCOMING
    extends StObject
       with SessionDirection
  /* "incoming" */ val INCOMING: typings.jssip.libRtcsessionMod.SessionDirection.INCOMING & String = js.native
  
  @js.native
  sealed trait OUTGOING
    extends StObject
       with SessionDirection
  /* "outgoing" */ val OUTGOING: typings.jssip.libRtcsessionMod.SessionDirection.OUTGOING & String = js.native
}
