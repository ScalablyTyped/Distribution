package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponseAdMetadataItem extends StObject {
  
  var `type`: Double = js.native
  
  var value: String = js.native
}
object TimelineFeedResponseAdMetadataItem {
  
  @scala.inline
  def apply(`type`: Double, value: String): TimelineFeedResponseAdMetadataItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseAdMetadataItem]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseAdMetadataItemMutableBuilder[Self <: TimelineFeedResponseAdMetadataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
