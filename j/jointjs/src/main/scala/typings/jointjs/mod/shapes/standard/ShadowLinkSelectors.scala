package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowLinkSelectors extends StObject {
  
  var line: js.UndefOr[SVGPathAttributes] = js.undefined
  
  var root: js.UndefOr[SVGAttributes] = js.undefined
  
  var shadow: js.UndefOr[SVGPathAttributes] = js.undefined
}
object ShadowLinkSelectors {
  
  @scala.inline
  def apply(): ShadowLinkSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowLinkSelectors]
  }
  
  @scala.inline
  implicit class ShadowLinkSelectorsMutableBuilder[Self <: ShadowLinkSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: SVGPathAttributes): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setShadow(value: SVGPathAttributes): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
  }
}
