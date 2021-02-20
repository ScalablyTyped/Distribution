package typings.hubspotPace

import typings.hubspotPace.HubSpotPaceInterfaces.Pace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object HubSpotPaceInterfaces {
    
    @JSGlobal("HubSpotPaceInterfaces.PaceEvent")
    @js.native
    object PaceEvent extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent with Double] = js.native
      
      /* 3 */ val done: typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent.done with Double = js.native
      
      /* 4 */ val hide: typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent.hide with Double = js.native
      
      /* 2 */ val restart: typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent.restart with Double = js.native
      
      /* 0 */ val start: typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent.start with Double = js.native
      
      /* 1 */ val stop: typings.hubspotPace.HubSpotPaceInterfaces.PaceEvent.stop with Double = js.native
    }
  }
  
  @JSGlobal("pace")
  @js.native
  def pace: Pace = js.native
  @scala.inline
  def pace_=(x: Pace): Unit = js.Dynamic.global.updateDynamic("pace")(x.asInstanceOf[js.Any])
}
