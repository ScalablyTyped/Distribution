package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Originator extends StObject
@JSImport("jssip/lib/RTCSession", "Originator")
@js.native
object Originator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Originator & String] = js.native
  
  @js.native
  sealed trait LOCAL
    extends StObject
       with Originator
  /* "local" */ val LOCAL: typings.jssip.libRtcsessionMod.Originator.LOCAL & String = js.native
  
  @js.native
  sealed trait REMOTE
    extends StObject
       with Originator
  /* "remote" */ val REMOTE: typings.jssip.libRtcsessionMod.Originator.REMOTE & String = js.native
  
  @js.native
  sealed trait SYSTEM
    extends StObject
       with Originator
  /* "system" */ val SYSTEM: typings.jssip.libRtcsessionMod.Originator.SYSTEM & String = js.native
}
