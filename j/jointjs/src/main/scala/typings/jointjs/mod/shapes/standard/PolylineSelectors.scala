package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGPolylineAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineSelectors extends StObject {
  
  var body: js.UndefOr[SVGPolylineAttributes] = js.native
  
  var label: js.UndefOr[SVGTextAttributes] = js.native
  
  var root: js.UndefOr[SVGAttributes] = js.native
}
object PolylineSelectors {
  
  @scala.inline
  def apply(): PolylineSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineSelectors]
  }
  
  @scala.inline
  implicit class PolylineSelectorsMutableBuilder[Self <: PolylineSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: SVGPolylineAttributes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
