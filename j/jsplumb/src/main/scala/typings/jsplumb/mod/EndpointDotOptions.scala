package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointDotOptions extends StObject {
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var hoverClass: js.UndefOr[String] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
}
object EndpointDotOptions {
  
  inline def apply(): EndpointDotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDotOptions]
  }
  
  extension [Self <: EndpointDotOptions](x: Self) {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
    
    inline def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
