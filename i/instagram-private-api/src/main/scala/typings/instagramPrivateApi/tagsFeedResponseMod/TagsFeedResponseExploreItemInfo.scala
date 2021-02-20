package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsFeedResponseExploreItemInfo extends StObject {
  
  var aspect_ratio: Double = js.native
  
  var autoplay: Boolean = js.native
  
  var num_columns: Double = js.native
  
  var total_num_columns: Double = js.native
}
object TagsFeedResponseExploreItemInfo {
  
  @scala.inline
  def apply(aspect_ratio: Double, autoplay: Boolean, num_columns: Double, total_num_columns: Double): TagsFeedResponseExploreItemInfo = {
    val __obj = js.Dynamic.literal(aspect_ratio = aspect_ratio.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], num_columns = num_columns.asInstanceOf[js.Any], total_num_columns = total_num_columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseExploreItemInfo]
  }
  
  @scala.inline
  implicit class TagsFeedResponseExploreItemInfoMutableBuilder[Self <: TagsFeedResponseExploreItemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspect_ratio(value: Double): Self = StObject.set(x, "aspect_ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_columns(value: Double): Self = StObject.set(x, "num_columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_num_columns(value: Double): Self = StObject.set(x, "total_num_columns", value.asInstanceOf[js.Any])
  }
}
