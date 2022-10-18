package typings.lonaSvgModel.libSvgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.element
import typings.lonaSvgModel.lonaSvgModelStrings.g
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGGroup
  extends StObject
     with SVGChildNode {
  
  var attributes: SVGBaseAttributes
  
  var children: js.Array[SVGChildNode]
  
  var name: g
  
  var `type`: element
}
object SVGGroup {
  
  inline def apply(attributes: SVGBaseAttributes, children: js.Array[SVGChildNode]): SVGGroup = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = "g")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGGroup]
  }
  
  extension [Self <: SVGGroup](x: Self) {
    
    inline def setAttributes(value: SVGBaseAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[SVGChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: SVGChildNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setName(value: g): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
