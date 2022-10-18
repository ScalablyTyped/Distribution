package typings.lonaSvgModel.libSvgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.element
import typings.lonaSvgModel.lonaSvgModelStrings.mask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGMask
  extends StObject
     with SVGChildNode {
  
  var attributes: SVGBaseAttributes
  
  var name: mask
  
  var `type`: element
}
object SVGMask {
  
  inline def apply(attributes: SVGBaseAttributes): SVGMask = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "mask")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGMask]
  }
  
  extension [Self <: SVGMask](x: Self) {
    
    inline def setAttributes(value: SVGBaseAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: mask): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
