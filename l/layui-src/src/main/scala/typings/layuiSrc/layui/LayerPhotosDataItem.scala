package typings.layuiSrc.layui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerPhotosDataItem extends StObject {
  
  var alt: String = js.native
  
  var pid: js.UndefOr[Double] = js.native
  
  var src: String = js.native
  
  var thumb: String = js.native
}
object LayerPhotosDataItem {
  
  @scala.inline
  def apply(alt: String, src: String, thumb: String): LayerPhotosDataItem = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPhotosDataItem]
  }
  
  @scala.inline
  implicit class LayerPhotosDataItemMutableBuilder[Self <: LayerPhotosDataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
  }
}
