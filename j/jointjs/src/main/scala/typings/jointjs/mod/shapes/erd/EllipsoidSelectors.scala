package typings.jointjs.mod.shapes.erd

import typings.jointjs.mod.attributes.SVGEllipseAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EllipsoidSelectors extends Selectors {
  
  @JSName(".body")
  var Dotbody: js.UndefOr[SVGEllipseAttributes] = js.native
  
  @JSName(".label")
  var Dotlabel: js.UndefOr[SVGEllipseAttributes] = js.native
  
  var text: js.UndefOr[SVGTextAttributes] = js.native
}
object EllipsoidSelectors {
  
  @scala.inline
  def apply(): EllipsoidSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipsoidSelectors]
  }
  
  @scala.inline
  implicit class EllipsoidSelectorsOps[Self <: EllipsoidSelectors] (val x: Self) extends AnyVal {
    
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
    def setDotbody(value: SVGEllipseAttributes): Self = this.set(".body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotbody: Self = this.set(".body", js.undefined)
    
    @scala.inline
    def setDotlabel(value: SVGEllipseAttributes): Self = this.set(".label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotlabel: Self = this.set(".label", js.undefined)
    
    @scala.inline
    def setText(value: SVGTextAttributes): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
