package typings.lonaSvgModel.svgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGCircleAttributes
  extends StObject
     with SVGBaseAttributes {
  
  var cx: Double
  
  var cy: Double
  
  var r: Double
}
object SVGCircleAttributes {
  
  inline def apply(cx: Double, cy: Double, r: Double): SVGCircleAttributes = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGCircleAttributes]
  }
  
  extension [Self <: SVGCircleAttributes](x: Self) {
    
    inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
