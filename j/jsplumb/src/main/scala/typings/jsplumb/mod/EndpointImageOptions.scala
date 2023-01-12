package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointImageOptions extends StObject {
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var hoverClass: js.UndefOr[String] = js.undefined
  
  var src: String
}
object EndpointImageOptions {
  
  inline def apply(src: String): EndpointImageOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointImageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointImageOptions] (val x: Self) extends AnyVal {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
    
    inline def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
