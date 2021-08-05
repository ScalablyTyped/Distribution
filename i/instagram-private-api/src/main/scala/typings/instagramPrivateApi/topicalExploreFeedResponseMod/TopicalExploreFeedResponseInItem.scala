package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseInItem extends StObject {
  
  var duration_in_video_in_sec: js.UndefOr[Null] = js.undefined
  
  var position: js.Array[Double | String]
  
  var product: js.UndefOr[TopicalExploreFeedResponseProduct] = js.undefined
  
  var start_time_in_video_in_sec: js.UndefOr[Null] = js.undefined
  
  var user: js.UndefOr[TopicalExploreFeedResponseUser] = js.undefined
}
object TopicalExploreFeedResponseInItem {
  
  inline def apply(position: js.Array[Double | String]): TopicalExploreFeedResponseInItem = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseInItem]
  }
  
  extension [Self <: TopicalExploreFeedResponseInItem](x: Self) {
    
    inline def setPosition(value: js.Array[Double | String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionVarargs(value: (Double | String)*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    inline def setProduct(value: TopicalExploreFeedResponseProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setUser(value: TopicalExploreFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
