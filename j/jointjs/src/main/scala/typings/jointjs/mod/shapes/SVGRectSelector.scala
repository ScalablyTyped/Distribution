package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGRectSelector
  extends StObject
     with Selectors {
  
  var rect: js.UndefOr[SVGRectAttributes] = js.undefined
}
object SVGRectSelector {
  
  @scala.inline
  def apply(): SVGRectSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGRectSelector]
  }
  
  @scala.inline
  implicit class SVGRectSelectorMutableBuilder[Self <: SVGRectSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRect(value: SVGRectAttributes): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
  }
}
