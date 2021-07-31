package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGCircleSelector
  extends StObject
     with Selectors {
  
  var circle: js.UndefOr[SVGCircleAttributes] = js.undefined
}
object SVGCircleSelector {
  
  @scala.inline
  def apply(): SVGCircleSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCircleSelector]
  }
  
  @scala.inline
  implicit class SVGCircleSelectorMutableBuilder[Self <: SVGCircleSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircle(value: SVGCircleAttributes): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
  }
}
