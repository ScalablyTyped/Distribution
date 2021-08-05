package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGCircleSelector
  extends StObject
     with Selectors {
  
  var circle: js.UndefOr[SVGCircleAttributes] = js.undefined
}
object SVGCircleSelector {
  
  inline def apply(): SVGCircleSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCircleSelector]
  }
  
  extension [Self <: SVGCircleSelector](x: Self) {
    
    inline def setCircle(value: SVGCircleAttributes): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
  }
}
