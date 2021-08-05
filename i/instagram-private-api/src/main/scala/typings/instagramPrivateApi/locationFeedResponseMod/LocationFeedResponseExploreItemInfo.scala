package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseExploreItemInfo extends StObject {
  
  var aspect_ratio: Double
  
  var autoplay: Boolean
  
  var num_columns: Double
  
  var total_num_columns: Double
}
object LocationFeedResponseExploreItemInfo {
  
  inline def apply(aspect_ratio: Double, autoplay: Boolean, num_columns: Double, total_num_columns: Double): LocationFeedResponseExploreItemInfo = {
    val __obj = js.Dynamic.literal(aspect_ratio = aspect_ratio.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], num_columns = num_columns.asInstanceOf[js.Any], total_num_columns = total_num_columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseExploreItemInfo]
  }
  
  extension [Self <: LocationFeedResponseExploreItemInfo](x: Self) {
    
    inline def setAspect_ratio(value: Double): Self = StObject.set(x, "aspect_ratio", value.asInstanceOf[js.Any])
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setNum_columns(value: Double): Self = StObject.set(x, "num_columns", value.asInstanceOf[js.Any])
    
    inline def setTotal_num_columns(value: Double): Self = StObject.set(x, "total_num_columns", value.asInstanceOf[js.Any])
  }
}
