package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDescriptor extends StObject {
  
  var imageClass: js.UndefOr[String] = js.undefined
  
  var imageUrl: String
  
  var orderHint: js.UndefOr[Double] = js.undefined
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object ImageDescriptor {
  
  inline def apply(imageUrl: String): ImageDescriptor = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDescriptor] (val x: Self) extends AnyVal {
    
    inline def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
    
    inline def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
