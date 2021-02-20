package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel extends StObject {
  
  var channel_id: String = js.native
  
  var id: String = js.native
  
  var tips: js.Array[_] = js.native
}
object InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel {
  
  @scala.inline
  def apply(channel_id: String, id: String, tips: js.Array[_]): InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel = {
    val __obj = js.Dynamic.literal(channel_id = channel_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAymtInstagramAccountInsightsChannelMutableBuilder[Self <: InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel_id(value: String): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTips(value: js.Array[_]): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsVarargs(value: js.Any*): Self = StObject.set(x, "tips", js.Array(value :_*))
  }
}
