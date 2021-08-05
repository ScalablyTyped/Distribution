package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkSelectors extends StObject {
  
  var line: js.UndefOr[SVGPathAttributes] = js.undefined
  
  var root: js.UndefOr[SVGAttributes] = js.undefined
  
  var wrapper: js.UndefOr[SVGPathAttributes] = js.undefined
}
object LinkSelectors {
  
  inline def apply(): LinkSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkSelectors]
  }
  
  extension [Self <: LinkSelectors](x: Self) {
    
    inline def setLine(value: SVGPathAttributes): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setWrapper(value: SVGPathAttributes): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
