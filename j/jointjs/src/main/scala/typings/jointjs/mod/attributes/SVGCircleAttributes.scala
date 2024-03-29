package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGCircleAttributes
  extends StObject
     with SVGAttributes {
  
  var cx: js.UndefOr[String | Double] = js.undefined
  
  var cy: js.UndefOr[String | Double] = js.undefined
  
  var r: js.UndefOr[String | Double] = js.undefined
}
object SVGCircleAttributes {
  
  inline def apply(): SVGCircleAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCircleAttributes]
  }
  
  extension [Self <: SVGCircleAttributes](x: Self) {
    
    inline def setCx(value: String | Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    inline def setCy(value: String | Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    inline def setR(value: String | Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
