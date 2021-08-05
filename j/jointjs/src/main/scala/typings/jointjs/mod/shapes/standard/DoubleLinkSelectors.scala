package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleLinkSelectors extends StObject {
  
  var line: js.UndefOr[SVGPathAttributes] = js.undefined
  
  var outline: js.UndefOr[SVGPathAttributes] = js.undefined
  
  var root: js.UndefOr[SVGAttributes] = js.undefined
}
object DoubleLinkSelectors {
  
  inline def apply(): DoubleLinkSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleLinkSelectors]
  }
  
  extension [Self <: DoubleLinkSelectors](x: Self) {
    
    inline def setLine(value: SVGPathAttributes): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setOutline(value: SVGPathAttributes): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
