package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageDescriptor extends StObject {
  
  var imageClass: js.UndefOr[String] = js.native
  
  var imageUrl: String = js.native
  
  var orderHint: js.UndefOr[Double] = js.native
  
  var tooltip: js.UndefOr[String] = js.native
}
object ImageDescriptor {
  
  @scala.inline
  def apply(imageUrl: String): ImageDescriptor = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDescriptor]
  }
  
  @scala.inline
  implicit class ImageDescriptorMutableBuilder[Self <: ImageDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
