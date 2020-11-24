package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGEllipseAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGEllipseSelector extends Selectors {
  
  var ellipse: js.UndefOr[SVGEllipseAttributes] = js.native
}
object SVGEllipseSelector {
  
  @scala.inline
  def apply(): SVGEllipseSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGEllipseSelector]
  }
  
  @scala.inline
  implicit class SVGEllipseSelectorOps[Self <: SVGEllipseSelector] (val x: Self) extends AnyVal {
    
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
    def setEllipse(value: SVGEllipseAttributes): Self = this.set("ellipse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipse: Self = this.set("ellipse", js.undefined)
  }
}
