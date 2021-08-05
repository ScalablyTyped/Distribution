package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseHashtagsReach extends StObject {
  
  var follow_status: InsightsServiceAccountResponseFollowStatus
  
  var name: String
}
object InsightsServiceAccountResponseHashtagsReach {
  
  inline def apply(follow_status: InsightsServiceAccountResponseFollowStatus, name: String): InsightsServiceAccountResponseHashtagsReach = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseHashtagsReach]
  }
  
  extension [Self <: InsightsServiceAccountResponseHashtagsReach](x: Self) {
    
    inline def setFollow_status(value: InsightsServiceAccountResponseFollowStatus): Self = StObject.set(x, "follow_status", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
