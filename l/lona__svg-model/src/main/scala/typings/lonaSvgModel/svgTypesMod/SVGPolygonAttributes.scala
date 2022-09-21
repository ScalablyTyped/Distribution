package typings.lonaSvgModel.svgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPolygonAttributes
  extends StObject
     with SVGBaseAttributes {
  
  var points: String
}
object SVGPolygonAttributes {
  
  inline def apply(points: String): SVGPolygonAttributes = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPolygonAttributes]
  }
  
  extension [Self <: SVGPolygonAttributes](x: Self) {
    
    inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
