package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsTrayFeedResponseTalliesItem extends StObject {
  
  var count: Double
  
  var font_size: js.UndefOr[Double] = js.undefined
  
  var text: String
}
object ReelsTrayFeedResponseTalliesItem {
  
  inline def apply(count: Double, text: String): ReelsTrayFeedResponseTalliesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseTalliesItem]
  }
  
  extension [Self <: ReelsTrayFeedResponseTalliesItem](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFont_size(value: Double): Self = StObject.set(x, "font_size", value.asInstanceOf[js.Any])
    
    inline def setFont_sizeUndefined: Self = StObject.set(x, "font_size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
