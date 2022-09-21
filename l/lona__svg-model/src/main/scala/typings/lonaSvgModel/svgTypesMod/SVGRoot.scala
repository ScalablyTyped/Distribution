package typings.lonaSvgModel.svgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.element
import typings.lonaSvgModel.lonaSvgModelStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGRoot
  extends StObject
     with SVGNode {
  
  var attributes: SVGRootAttributes
  
  var children: js.Array[SVGChildNode | SVGDefs]
  
  var name: svg
  
  var `type`: element
}
object SVGRoot {
  
  inline def apply(attributes: SVGRootAttributes, children: js.Array[SVGChildNode | SVGDefs]): SVGRoot = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = "svg")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGRoot]
  }
  
  extension [Self <: SVGRoot](x: Self) {
    
    inline def setAttributes(value: SVGRootAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[SVGChildNode | SVGDefs]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (SVGChildNode | SVGDefs)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setName(value: svg): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
