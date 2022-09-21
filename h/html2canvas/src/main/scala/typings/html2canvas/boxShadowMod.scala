package typings.html2canvas

import typings.html2canvas.ipropertydescriptorMod.IPropertyListDescriptor
import typings.html2canvas.lengthMod.Length
import typings.html2canvas.typesColorMod.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxShadowMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/box-shadow", "boxShadow")
  @js.native
  val boxShadow: IPropertyListDescriptor[BoxShadow_] = js.native
  
  trait BoxShadowItem extends StObject {
    
    var blur: Length
    
    var color: Color_
    
    var inset: Boolean
    
    var offsetX: Length
    
    var offsetY: Length
    
    var spread: Length
  }
  object BoxShadowItem {
    
    inline def apply(blur: Length, color: Color_, inset: Boolean, offsetX: Length, offsetY: Length, spread: Length): BoxShadowItem = {
      val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], inset = inset.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxShadowItem]
    }
    
    extension [Self <: BoxShadowItem](x: Self) {
      
      inline def setBlur(value: Length): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setOffsetX(value: Length): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Length): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setSpread(value: Length): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    }
  }
  
  type BoxShadow_ = js.Array[BoxShadowItem]
}
