package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkSelectors extends StObject {
  
  var line: js.UndefOr[SVGPathAttributes] = js.native
  
  var root: js.UndefOr[SVGAttributes] = js.native
  
  var wrapper: js.UndefOr[SVGPathAttributes] = js.native
}
object LinkSelectors {
  
  @scala.inline
  def apply(): LinkSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkSelectors]
  }
  
  @scala.inline
  implicit class LinkSelectorsMutableBuilder[Self <: LinkSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: SVGPathAttributes): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setWrapper(value: SVGPathAttributes): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
