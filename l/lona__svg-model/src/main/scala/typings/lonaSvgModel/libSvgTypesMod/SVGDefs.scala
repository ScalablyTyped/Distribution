package typings.lonaSvgModel.libSvgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.defs
import typings.lonaSvgModel.lonaSvgModelStrings.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGDefs
  extends StObject
     with SVGChildNode {
  
  var children: js.Array[SVGChildNode]
  
  var name: defs
  
  var `type`: element
}
object SVGDefs {
  
  inline def apply(children: js.Array[SVGChildNode]): SVGDefs = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = "defs")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGDefs]
  }
  
  extension [Self <: SVGDefs](x: Self) {
    
    inline def setChildren(value: js.Array[SVGChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: SVGChildNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setName(value: defs): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
