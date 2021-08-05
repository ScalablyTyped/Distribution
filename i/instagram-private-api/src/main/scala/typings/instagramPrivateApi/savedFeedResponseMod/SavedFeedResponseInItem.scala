package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedFeedResponseInItem extends StObject {
  
  var duration_in_video_in_sec: js.UndefOr[Null] = js.undefined
  
  var position: js.Array[Double | String]
  
  var product: js.UndefOr[SavedFeedResponseProduct] = js.undefined
  
  var start_time_in_video_in_sec: js.UndefOr[Null] = js.undefined
  
  var user: js.UndefOr[SavedFeedResponseUser] = js.undefined
}
object SavedFeedResponseInItem {
  
  inline def apply(position: js.Array[Double | String]): SavedFeedResponseInItem = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseInItem]
  }
  
  extension [Self <: SavedFeedResponseInItem](x: Self) {
    
    inline def setPosition(value: js.Array[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionVarargs(value: (Double | String)*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    inline def setProduct(value: SavedFeedResponseProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setUser(value: SavedFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
