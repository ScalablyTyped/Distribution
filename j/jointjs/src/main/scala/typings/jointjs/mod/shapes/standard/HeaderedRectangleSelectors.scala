package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderedRectangleSelectors extends StObject {
  
  var body: js.UndefOr[SVGRectAttributes] = js.undefined
  
  var bodyText: js.UndefOr[SVGTextAttributes] = js.undefined
  
  var header: js.UndefOr[SVGRectAttributes] = js.undefined
  
  var headerText: js.UndefOr[SVGTextAttributes] = js.undefined
  
  var root: js.UndefOr[SVGAttributes] = js.undefined
}
object HeaderedRectangleSelectors {
  
  inline def apply(): HeaderedRectangleSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderedRectangleSelectors]
  }
  
  extension [Self <: HeaderedRectangleSelectors](x: Self) {
    
    inline def setBody(value: SVGRectAttributes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyText(value: SVGTextAttributes): Self = StObject.set(x, "bodyText", value.asInstanceOf[js.Any])
    
    inline def setBodyTextUndefined: Self = StObject.set(x, "bodyText", js.undefined)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeader(value: SVGRectAttributes): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderText(value: SVGTextAttributes): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
