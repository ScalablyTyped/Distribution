package typings.hubspotPace.HubSpotPaceInterfaces

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
  
}

