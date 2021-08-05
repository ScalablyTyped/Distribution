package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseReach extends StObject {
  
  var follow_status: InsightsServicePostResponseFollowStatus
  
  var value: Double
}
object InsightsServicePostResponseReach {
  
  inline def apply(follow_status: InsightsServicePostResponseFollowStatus, value: Double): InsightsServicePostResponseReach = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseReach]
  }
  
  extension [Self <: InsightsServicePostResponseReach](x: Self) {
    
    inline def setFollow_status(value: InsightsServicePostResponseFollowStatus): Self = StObject.set(x, "follow_status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
