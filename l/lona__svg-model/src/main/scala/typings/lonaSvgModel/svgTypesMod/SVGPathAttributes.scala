package typings.lonaSvgModel.svgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathAttributes
  extends StObject
     with SVGBaseAttributes {
  
  var d: String
}
object SVGPathAttributes {
  
  inline def apply(d: String): SVGPathAttributes = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathAttributes]
  }
  
  extension [Self <: SVGPathAttributes](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
  }
}
