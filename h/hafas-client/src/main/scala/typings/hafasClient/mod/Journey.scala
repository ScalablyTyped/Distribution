package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.journey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A journey is a computed set of directions to get from A to B at a specific time.
  * It would typically be the result of a route planning algorithm.
  */
@js.native
trait Journey extends js.Object {
  
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
  implicit class JourneyOps[Self <: Journey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLegsVarargs(value: Leg*): Self = this.set("legs", js.Array(value :_*))
    
    @scala.inline
    def setLegs(value: js.Array[Leg]): Self = this.set("legs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: journey): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCycle(value: Cycle): Self = this.set("cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCycle: Self = this.set("cycle", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    
    @scala.inline
    def setRemarksVarargs(value: (Hint | Warning)*): Self = this.set("remarks", js.Array(value :_*))
    
    @scala.inline
    def setRemarks(value: js.Array[Hint | Warning]): Self = this.set("remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarks: Self = this.set("remarks", js.undefined)
    
    @scala.inline
    def setScheduledDays(value: ScheduledDays): Self = this.set("scheduledDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledDays: Self = this.set("scheduledDays", js.undefined)
  }
}
