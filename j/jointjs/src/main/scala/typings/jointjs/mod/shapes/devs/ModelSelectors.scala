package typings.jointjs.mod.shapes.devs

import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelSelectors extends Selectors {
  
  @JSName(".body")
  var Dotbody: js.UndefOr[SVGRectAttributes] = js.native
  
  @JSName(".label")
  var Dotlabel: js.UndefOr[SVGTextAttributes] = js.native
}
object ModelSelectors {
  
  @scala.inline
  def apply(): ModelSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelSelectors]
  }
  
  @scala.inline
  implicit class ModelSelectorsOps[Self <: ModelSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDotbody(value: SVGRectAttributes): Self = this.set(".body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotbody: Self = this.set(".body", js.undefined)
    
    @scala.inline
    def setDotlabel(value: SVGTextAttributes): Self = this.set(".label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotlabel: Self = this.set(".label", js.undefined)
  }
}
