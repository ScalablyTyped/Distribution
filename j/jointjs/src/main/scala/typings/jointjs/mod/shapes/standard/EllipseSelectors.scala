package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EllipseSelectors extends StObject {
  
  var body: js.UndefOr[SVGCircleAttributes] = js.undefined
  
  var label: js.UndefOr[SVGTextAttributes] = js.undefined
  
  var root: js.UndefOr[SVGAttributes] = js.undefined
}
object EllipseSelectors {
  
  @scala.inline
  def apply(): EllipseSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipseSelectors]
  }
  
  @scala.inline
  implicit class EllipseSelectorsMutableBuilder[Self <: EllipseSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: SVGCircleAttributes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setLabel(value: SVGTextAttributes): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
