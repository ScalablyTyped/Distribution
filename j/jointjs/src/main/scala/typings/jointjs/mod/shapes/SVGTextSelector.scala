package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGTextSelector
  extends StObject
     with Selectors {
  
  var text: js.UndefOr[SVGTextAttributes] = js.undefined
}
object SVGTextSelector {
  
  inline def apply(): SVGTextSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGTextSelector]
  }
  
  extension [Self <: SVGTextSelector](x: Self) {
    
    inline def setText(value: SVGTextAttributes): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
