package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleLinkSelectors extends StObject {
  
  var line: js.UndefOr[SVGPathAttributes] = js.native
  
  var outline: js.UndefOr[SVGPathAttributes] = js.native
  
  var root: js.UndefOr[SVGAttributes] = js.native
}
object DoubleLinkSelectors {
  
  @scala.inline
  def apply(): DoubleLinkSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleLinkSelectors]
  }
  
  @scala.inline
  implicit class DoubleLinkSelectorsMutableBuilder[Self <: DoubleLinkSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: SVGPathAttributes): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOutline(value: SVGPathAttributes): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setRoot(value: SVGAttributes): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
