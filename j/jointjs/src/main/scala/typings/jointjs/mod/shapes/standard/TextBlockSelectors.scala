package typings.jointjs.mod.shapes.standard

import typings.jointjs.anon.Style
import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGRectAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBlockSelectors extends StObject {
  
  var body: js.UndefOr[SVGRectAttributes] = js.native
  
  var label: js.UndefOr[Style] = js.native
  
  var root: js.UndefOr[SVGAttributes] = js.native
}
object TextBlockSelectors {
  
  @scala.inline
  def apply(): TextBlockSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextBlockSelectors]
  }
  
  @scala.inline
  implicit class TextBlockSelectorsMutableBuilder[Self <: TextBlockSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: SVGRectAttributes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setLabel(value: Style): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
