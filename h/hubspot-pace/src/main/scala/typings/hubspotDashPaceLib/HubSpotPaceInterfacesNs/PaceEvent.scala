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
  
  val done: done with java.lang.String = js.native
  val hide: hide with java.lang.String = js.native
  val restart: restart with java.lang.String = js.native
  val start: start with java.lang.String = js.native
  val stop: stop with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[hubspotDashPaceLib.HubSpotPaceInterfacesNs.PaceEvent with java.lang.String] = js.native
}

