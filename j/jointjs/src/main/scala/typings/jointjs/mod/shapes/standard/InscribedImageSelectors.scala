package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGEllipseAttributes
import typings.jointjs.mod.attributes.SVGImageAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InscribedImageSelectors extends StObject {
  
  var background: js.UndefOr[SVGEllipseAttributes] = js.undefined
  
  var border: js.UndefOr[SVGEllipseAttributes] = js.undefined
  
  var image: js.UndefOr[SVGImageAttributes] = js.undefined
  
  var label: js.UndefOr[SVGTextAttributes] = js.undefined
  
  var root: js.UndefOr[SVGAttributes] = js.undefined
}
object InscribedImageSelectors {
  
  inline def apply(): InscribedImageSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InscribedImageSelectors]
  }
  
  extension [Self <: InscribedImageSelectors](x: Self) {
    
    inline def setBackground(value: SVGEllipseAttributes): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: SVGEllipseAttributes): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setImage(value: SVGImageAttributes): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLabel(value: SVGTextAttributes): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
