package typings.lonaSvgModel.libSvgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.element
import typings.lonaSvgModel.lonaSvgModelStrings.polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPolygon
  extends StObject
     with SVGPathConvertibleNode {
  
  var attributes: SVGPolygonAttributes
  
  var name: polygon
  
  var `type`: element
}
object SVGPolygon {
  
  inline def apply(attributes: SVGPolygonAttributes): SVGPolygon = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "polygon")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGPolygon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPolygon] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: SVGPolygonAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: polygon): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
