package typings.hubspotDashPace.HubSpotPaceInterfaces

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaceEvent extends js.Object

@JSGlobal("HubSpotPaceInterfaces.PaceEvent")
@js.native
object PaceEvent extends js.Object {
  @js.native
  sealed trait done extends PaceEvent
  
  @js.native
  sealed trait hide extends PaceEvent
  
  @js.native
  sealed trait restart extends PaceEvent
  
  @js.native
  sealed trait start extends PaceEvent
  
  @js.native
  sealed trait stop extends PaceEvent
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaceEvent with Double] = js.native
  /* 3 */ @js.native
  object done extends TopLevel[done with Double]
  
  /* 4 */ @js.native
  object hide extends TopLevel[hide with Double]
  
  /* 2 */ @js.native
  object restart extends TopLevel[restart with Double]
  
  /* 0 */ @js.native
  object start extends TopLevel[start with Double]
  
  /* 1 */ @js.native
  object stop extends TopLevel[stop with Double]
  
}

