package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGEllipseAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CylinderSelectors extends StObject {
  
  var body: js.UndefOr[CylinderBodyAttributes] = js.undefined
  
  var root: js.UndefOr[SVGAttributes] = js.undefined
  
  var top: js.UndefOr[SVGEllipseAttributes] = js.undefined
}
object CylinderSelectors {
  
  inline def apply(): CylinderSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CylinderSelectors]
  }
  
  extension [Self <: CylinderSelectors](x: Self) {
    
    inline def setBody(value: CylinderBodyAttributes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setTop(value: SVGEllipseAttributes): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
