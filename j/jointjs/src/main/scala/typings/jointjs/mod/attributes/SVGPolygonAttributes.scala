package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPolygonAttributes
  extends StObject
     with SVGAttributes {
  
  var points: js.UndefOr[String] = js.undefined
}
object SVGPolygonAttributes {
  
  inline def apply(): SVGPolygonAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolygonAttributes]
  }
  
  extension [Self <: SVGPolygonAttributes](x: Self) {
    
    inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
  }
}
