package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGTextSelector extends Selectors {
  
  var text: js.UndefOr[SVGTextAttributes] = js.native
}
object SVGTextSelector {
  
  @scala.inline
  def apply(): SVGTextSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGTextSelector]
  }
  
  @scala.inline
  implicit class SVGTextSelectorMutableBuilder[Self <: SVGTextSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: SVGTextAttributes): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
