package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseReach extends StObject {
  
  var follow_status: InsightsServicePostResponseFollowStatus = js.native
  
  var value: Double = js.native
}
object InsightsServicePostResponseReach {
  
  @scala.inline
  def apply(follow_status: InsightsServicePostResponseFollowStatus, value: Double): InsightsServicePostResponseReach = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseReach]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseReachMutableBuilder[Self <: InsightsServicePostResponseReach] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollow_status(value: InsightsServicePostResponseFollowStatus): Self = StObject.set(x, "follow_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
