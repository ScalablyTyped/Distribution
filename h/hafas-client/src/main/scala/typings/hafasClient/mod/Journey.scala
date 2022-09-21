package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.journey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A journey is a computed set of directions to get from A to B at a specific time.
  * It would typically be the result of a route planning algorithm.
  */
trait Journey extends StObject {
  
  var cycle: js.UndefOr[Cycle] = js.undefined
  
  var legs: js.Array[Leg]
  
  var price: js.UndefOr[Price] = js.undefined
  
  var refreshToken: js.UndefOr[String] = js.undefined
  
  var remarks: js.UndefOr[js.Array[Hint | Status | Warning]] = js.undefined
  
  var scheduledDays: js.UndefOr[ScheduledDays] = js.undefined
  
  var `type`: journey
}
object Journey {
  
  inline def apply(legs: js.Array[Leg]): Journey = {
    val __obj = js.Dynamic.literal(legs = legs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("journey")
    __obj.asInstanceOf[Journey]
  }
  
  extension [Self <: Journey](x: Self) {
    
    inline def setCycle(value: Cycle): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    inline def setLegs(value: js.Array[Leg]): Self = StObject.set(x, "legs", value.asInstanceOf[js.Any])
    
    inline def setLegsVarargs(value: Leg*): Self = StObject.set(x, "legs", js.Array(value*))
    
    inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setRemarks(value: js.Array[Hint | Status | Warning]): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    inline def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    inline def setRemarksVarargs(value: (Hint | Status | Warning)*): Self = StObject.set(x, "remarks", js.Array(value*))
    
    inline def setScheduledDays(value: ScheduledDays): Self = StObject.set(x, "scheduledDays", value.asInstanceOf[js.Any])
    
    inline def setScheduledDaysUndefined: Self = StObject.set(x, "scheduledDays", js.undefined)
    
    inline def setType(value: journey): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
