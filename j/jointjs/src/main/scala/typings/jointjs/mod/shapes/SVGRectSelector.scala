package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGRectSelector extends Selectors {
  
  var rect: js.UndefOr[SVGRectAttributes] = js.native
}
object SVGRectSelector {
  
  @scala.inline
  def apply(): SVGRectSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGRectSelector]
  }
  
  @scala.inline
  implicit class SVGRectSelectorOps[Self <: SVGRectSelector] (val x: Self) extends AnyVal {
    
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
    def setRect(value: SVGRectAttributes): Self = this.set("rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRect: Self = this.set("rect", js.undefined)
  }
}
