package typings.matrixBotSdk

import typings.matrixBotSdk.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaInfoMod {
  
  trait MSC2380MediaInfo extends StObject {
    
    var content_type: String
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var size: Double
    
    var thumbnails: js.UndefOr[js.Array[Height]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object MSC2380MediaInfo {
    
    inline def apply(content_type: String, size: Double): MSC2380MediaInfo = {
      val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSC2380MediaInfo]
    }
    
    extension [Self <: MSC2380MediaInfo](x: Self) {
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setThumbnails(value: js.Array[Height]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
      
      inline def setThumbnailsVarargs(value: Height*): Self = StObject.set(x, "thumbnails", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
