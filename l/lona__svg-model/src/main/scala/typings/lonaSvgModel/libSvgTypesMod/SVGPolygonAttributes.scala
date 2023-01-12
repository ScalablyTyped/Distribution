package typings.lonaSvgModel.libSvgTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPolygonAttributes] (val x: Self) extends AnyVal {
    
    inline def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
