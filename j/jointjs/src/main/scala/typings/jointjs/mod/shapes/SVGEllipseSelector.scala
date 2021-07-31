package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGEllipseAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGEllipseSelector
  extends StObject
     with Selectors {
  
  var ellipse: js.UndefOr[SVGEllipseAttributes] = js.undefined
}
object SVGEllipseSelector {
  
  @scala.inline
  def apply(): SVGEllipseSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGEllipseSelector]
  }
  
  @scala.inline
  implicit class SVGEllipseSelectorMutableBuilder[Self <: SVGEllipseSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipse(value: SVGEllipseAttributes): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
  }
}
