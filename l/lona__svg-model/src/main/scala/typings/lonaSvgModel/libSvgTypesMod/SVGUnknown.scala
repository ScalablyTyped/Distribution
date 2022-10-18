package typings.lonaSvgModel.libSvgTypesMod

import typings.lonaSvgModel.lonaSvgModelStrings.desc
import typings.lonaSvgModel.lonaSvgModelStrings.element
import typings.lonaSvgModel.lonaSvgModelStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGUnknown
  extends StObject
     with SVGChildNode {
  
  var name: title | desc
  
  var `type`: element
}
object SVGUnknown {
  
  inline def apply(name: title | desc): SVGUnknown = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGUnknown]
  }
  
  extension [Self <: SVGUnknown](x: Self) {
    
    inline def setName(value: title | desc): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
