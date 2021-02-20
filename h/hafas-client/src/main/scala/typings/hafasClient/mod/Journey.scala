package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.journey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A journey is a computed set of directions to get from A to B at a specific time.
  * It would typically be the result of a route planning algorithm.
  */
@js.native
trait Journey extends StObject {
  
  var cycle: js.UndefOr[Cycle] = js.native
  
  var legs: js.Array[Leg] = js.native
  
  var price: js.UndefOr[Price] = js.native
  
  var refreshToken: js.UndefOr[String] = js.native
  
  var remarks: js.UndefOr[js.Array[Hint | Warning]] = js.native
  
  var scheduledDays: js.UndefOr[ScheduledDays] = js.native
  
  var `type`: journey = js.native
}
object Journey {
  
  @scala.inline
  def apply(legs: js.Array[Leg], `type`: journey): Journey = {
    val __obj = js.Dynamic.literal(legs = legs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Journey]
  }
  
  @scala.inline
  implicit class JourneyMutableBuilder[Self <: Journey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCycle(value: Cycle): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    @scala.inline
    def setLegs(value: js.Array[Leg]): Self = StObject.set(x, "legs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegsVarargs(value: Leg*): Self = StObject.set(x, "legs", js.Array(value :_*))
    
    @scala.inline
    def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    @scala.inline
    def setRemarks(value: js.Array[Hint | Warning]): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    @scala.inline
    def setRemarksVarargs(value: (Hint | Warning)*): Self = StObject.set(x, "remarks", js.Array(value :_*))
    
    @scala.inline
    def setScheduledDays(value: ScheduledDays): Self = StObject.set(x, "scheduledDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledDaysUndefined: Self = StObject.set(x, "scheduledDays", js.undefined)
    
    @scala.inline
    def setType(value: journey): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
