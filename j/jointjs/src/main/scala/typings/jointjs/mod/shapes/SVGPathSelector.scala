package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGPathAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSelector
  extends StObject
     with Selectors {
  
  var path: js.UndefOr[SVGPathAttributes] = js.undefined
}
object SVGPathSelector {
  
  @scala.inline
  def apply(): SVGPathSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPathSelector]
  }
  
  @scala.inline
  implicit class SVGPathSelectorMutableBuilder[Self <: SVGPathSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: SVGPathAttributes): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
