package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGImageAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGImageSelector extends Selectors {
  
  var image: js.UndefOr[SVGImageAttributes] = js.native
}
object SVGImageSelector {
  
  @scala.inline
  def apply(): SVGImageSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGImageSelector]
  }
  
  @scala.inline
  implicit class SVGImageSelectorMutableBuilder[Self <: SVGImageSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: SVGImageAttributes): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
