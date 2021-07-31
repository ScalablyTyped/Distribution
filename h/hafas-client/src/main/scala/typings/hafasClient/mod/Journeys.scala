package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Journeys extends StObject {
  
  var earlierRef: js.UndefOr[String] = js.undefined
  
  var journeys: js.UndefOr[js.Array[Journey]] = js.undefined
  
  var laterRef: js.UndefOr[String] = js.undefined
  
  var realtimeDataFrom: js.UndefOr[Double] = js.undefined
}
object Journeys {
  
  @scala.inline
  def apply(): Journeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Journeys]
  }
  
  @scala.inline
  implicit class JourneysMutableBuilder[Self <: Journeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEarlierRef(value: String): Self = StObject.set(x, "earlierRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlierRefUndefined: Self = StObject.set(x, "earlierRef", js.undefined)
    
    @scala.inline
    def setJourneys(value: js.Array[Journey]): Self = StObject.set(x, "journeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJourneysUndefined: Self = StObject.set(x, "journeys", js.undefined)
    
    @scala.inline
    def setJourneysVarargs(value: Journey*): Self = StObject.set(x, "journeys", js.Array(value :_*))
    
    @scala.inline
    def setLaterRef(value: String): Self = StObject.set(x, "laterRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaterRefUndefined: Self = StObject.set(x, "laterRef", js.undefined)
    
    @scala.inline
    def setRealtimeDataFrom(value: Double): Self = StObject.set(x, "realtimeDataFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeDataFromUndefined: Self = StObject.set(x, "realtimeDataFrom", js.undefined)
  }
}
