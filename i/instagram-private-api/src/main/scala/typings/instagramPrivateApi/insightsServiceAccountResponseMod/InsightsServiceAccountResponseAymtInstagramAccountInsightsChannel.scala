package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel extends StObject {
  
  var channel_id: String
  
  var id: String
  
  var tips: js.Array[js.Any]
}
object InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel {
  
  inline def apply(channel_id: String, id: String, tips: js.Array[js.Any]): InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel = {
    val __obj = js.Dynamic.literal(channel_id = channel_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel]
  }
  
  extension [Self <: InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel](x: Self) {
    
    inline def setChannel_id(value: String): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTips(value: js.Array[js.Any]): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    inline def setTipsVarargs(value: js.Any*): Self = StObject.set(x, "tips", js.Array(value :_*))
  }
}
