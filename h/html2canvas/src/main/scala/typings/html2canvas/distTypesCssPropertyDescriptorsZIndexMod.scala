package typings.html2canvas

import typings.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyValueDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssPropertyDescriptorsZIndexMod {
  
  trait zIndex extends StObject {
    
    var auto: Boolean
    
    var order: Double
  }
  object zIndex {
    
    @JSImport("html2canvas/dist/types/css/property-descriptors/z-index", "zIndex")
    @js.native
    val ^ : IPropertyValueDescriptor[zIndex] = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: zIndex] (val x: Self) extends AnyVal {
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    }
  }
}
