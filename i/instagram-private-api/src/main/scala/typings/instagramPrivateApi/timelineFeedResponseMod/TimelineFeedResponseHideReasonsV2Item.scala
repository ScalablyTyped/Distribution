package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponseHideReasonsV2Item extends StObject {
  
  var reason: String | Null = js.native
  
  var text: String = js.native
}
object TimelineFeedResponseHideReasonsV2Item {
  
  @scala.inline
  def apply(text: String): TimelineFeedResponseHideReasonsV2Item = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseHideReasonsV2Item]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseHideReasonsV2ItemMutableBuilder[Self <: TimelineFeedResponseHideReasonsV2Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNull: Self = StObject.set(x, "reason", null)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
