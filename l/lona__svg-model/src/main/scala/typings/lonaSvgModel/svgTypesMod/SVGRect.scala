package typings.lonaSvgModel.svgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.element
import typings.lonaSvgModel.lonaSvgModelStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGRect
  extends StObject
     with SVGPathConvertibleNode {
  
  var attributes: SVGRectAttributes
  
  var name: rect
  
  var `type`: element
}
object SVGRect {
  
  inline def apply(attributes: SVGRectAttributes): SVGRect = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "rect")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGRect]
  }
  
  extension [Self <: SVGRect](x: Self) {
    
    inline def setAttributes(value: SVGRectAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: rect): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
