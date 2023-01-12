package typings.lonaSvgModel.libSvgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.element
import typings.lonaSvgModel.lonaSvgModelStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPolyline
  extends StObject
     with SVGPathConvertibleNode {
  
  var attributes: SVGPolylineAttributes
  
  var name: polyline
  
  var `type`: element
}
object SVGPolyline {
  
  inline def apply(attributes: SVGPolylineAttributes): SVGPolyline = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "polyline")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGPolyline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGPolyline] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: SVGPolylineAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: polyline): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
