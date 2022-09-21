package typings.html2canvas

import typings.html2canvas.ipropertydescriptorMod.IPropertyListDescriptor
import typings.html2canvas.lengthMod.Length
import typings.html2canvas.typesColorMod.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textShadowMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/text-shadow", "textShadow")
  @js.native
  val textShadow: IPropertyListDescriptor[TextShadow_] = js.native
  
  trait TextShadowItem extends StObject {
    
    var blur: Length
    
    var color: Color_
    
    var offsetX: Length
    
    var offsetY: Length
  }
  object TextShadowItem {
    
    inline def apply(blur: Length, color: Color_, offsetX: Length, offsetY: Length): TextShadowItem = {
      val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextShadowItem]
    }
    
    extension [Self <: TextShadowItem](x: Self) {
      
      inline def setBlur(value: Length): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setOffsetX(value: Length): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Length): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    }
  }
  
  type TextShadow_ = js.Array[TextShadowItem]
}
