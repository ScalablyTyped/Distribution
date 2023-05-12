package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyWithRealtimeData
  extends StObject
     with RealtimeDataUpdatedAt {
  
  var journey: Journey
}
object JourneyWithRealtimeData {
  
  inline def apply(journey: Journey): JourneyWithRealtimeData = {
    val __obj = js.Dynamic.literal(journey = journey.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyWithRealtimeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneyWithRealtimeData] (val x: Self) extends AnyVal {
    
    inline def setJourney(value: Journey): Self = StObject.set(x, "journey", value.asInstanceOf[js.Any])
  }
}
