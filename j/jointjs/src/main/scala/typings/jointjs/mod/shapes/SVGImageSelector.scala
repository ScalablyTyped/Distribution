package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGImageAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGImageSelector
  extends StObject
     with Selectors {
  
  var image: js.UndefOr[SVGImageAttributes] = js.undefined
}
object SVGImageSelector {
  
  inline def apply(): SVGImageSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGImageSelector]
  }
  
  extension [Self <: SVGImageSelector](x: Self) {
    
    inline def setImage(value: SVGImageAttributes): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
