package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerPhotosDataItem extends StObject {
  
  var alt: String
  
  var pid: js.UndefOr[Double] = js.undefined
  
  var src: String
  
  var thumb: String
}
object LayerPhotosDataItem {
  
  inline def apply(alt: String, src: String, thumb: String): LayerPhotosDataItem = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPhotosDataItem]
  }
  
  extension [Self <: LayerPhotosDataItem](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
  }
}
