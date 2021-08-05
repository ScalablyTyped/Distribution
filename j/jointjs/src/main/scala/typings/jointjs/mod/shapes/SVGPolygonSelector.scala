package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGPolygonAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPolygonSelector
  extends StObject
     with Selectors {
  
  var polygon: js.UndefOr[SVGPolygonAttributes] = js.undefined
}
object SVGPolygonSelector {
  
  inline def apply(): SVGPolygonSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolygonSelector]
  }
  
  extension [Self <: SVGPolygonSelector](x: Self) {
    
    inline def setPolygon(value: SVGPolygonAttributes): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
  }
}
