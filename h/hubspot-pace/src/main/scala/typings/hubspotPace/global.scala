package typings.hubspotPace

import typings.hubspotPace.HubSpotPaceInterfaces.Pace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var pace: Pace = js.native
  @js.native
  object HubSpotPaceInterfaces extends js.Object {
    @js.native
    object PaceEvent extends js.Object {
      /* 3 */ val done: typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent.done with Double = js.native
      /* 4 */ val hide: typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent.hide with Double = js.native
      /* 2 */ val restart: typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent.restart with Double = js.native
      /* 0 */ val start: typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent.start with Double = js.native
      /* 1 */ val stop: typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent.stop with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent with Double] = js.native
    }
    
  }
  
}

