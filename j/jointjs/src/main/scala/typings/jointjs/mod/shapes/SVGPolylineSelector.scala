package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGPolylineAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPolylineSelector
  extends StObject
     with Selectors {
  
  var polyline: js.UndefOr[SVGPolylineAttributes] = js.undefined
}
object SVGPolylineSelector {
  
  inline def apply(): SVGPolylineSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolylineSelector]
  }
  
  extension [Self <: SVGPolylineSelector](x: Self) {
    
    inline def setPolyline(value: SVGPolylineAttributes): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
  }
}
