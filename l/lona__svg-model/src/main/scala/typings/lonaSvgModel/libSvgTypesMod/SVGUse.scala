package typings.lonaSvgModel.libSvgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.element
import typings.lonaSvgModel.lonaSvgModelStrings.use
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGUse
  extends StObject
     with SVGDrawableNode {
  
  var attributes: SVGUseAttributes
  
  var name: use
  
  var `type`: element
}
object SVGUse {
  
  inline def apply(attributes: SVGUseAttributes): SVGUse = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "use")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGUse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGUse] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: SVGUseAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: use): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
