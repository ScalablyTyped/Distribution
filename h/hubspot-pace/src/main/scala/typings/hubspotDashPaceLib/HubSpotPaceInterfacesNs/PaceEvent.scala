package typings
package hubspotDashPaceLib.HubSpotPaceInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaceEvent extends js.Object

@JSGlobal("HubSpotPaceInterfaces.PaceEvent")
@js.native
object PaceEvent extends js.Object {
  @js.native
  sealed trait done
    extends hubspotDashPaceLib.HubSpotPaceInterfacesNs.PaceEvent
  
  @js.native
  sealed trait hide
    extends hubspotDashPaceLib.HubSpotPaceInterfacesNs.PaceEvent
  
  @js.native
  sealed trait restart
    extends hubspotDashPaceLib.HubSpotPaceInterfacesNs.PaceEvent
  
  @js.native
  sealed trait start
    extends hubspotDashPaceLib.HubSpotPaceInterfacesNs.PaceEvent
  
  @js.native
  sealed trait stop
    extends hubspotDashPaceLib.HubSpotPaceInterfacesNs.PaceEvent
  
  /* 3 */ val done: done with scala.Double = js.native
  /* 4 */ val hide: hide with scala.Double = js.native
  /* 2 */ val restart: restart with scala.Double = js.native
  /* 0 */ val start: start with scala.Double = js.native
  /* 1 */ val stop: stop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[hubspotDashPaceLib.HubSpotPaceInterfacesNs.PaceEvent with scala.Double] = js.native
}

