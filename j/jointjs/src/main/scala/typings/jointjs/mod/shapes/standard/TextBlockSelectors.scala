package typings.jointjs.mod.shapes.standard

import typings.jointjs.anon.Style
import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGRectAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBlockSelectors extends StObject {
  
  var body: js.UndefOr[SVGRectAttributes] = js.undefined
  
  var label: js.UndefOr[Style] = js.undefined
  
  var root: js.UndefOr[SVGAttributes] = js.undefined
}
object TextBlockSelectors {
  
  inline def apply(): TextBlockSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextBlockSelectors]
  }
  
  extension [Self <: TextBlockSelectors](x: Self) {
    
    inline def setBody(value: SVGRectAttributes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setLabel(value: Style): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
