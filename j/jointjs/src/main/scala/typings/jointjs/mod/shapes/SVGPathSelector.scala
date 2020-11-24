package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGPathAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSelector extends Selectors {
  
  var path: js.UndefOr[SVGPathAttributes] = js.native
}
object SVGPathSelector {
  
  @scala.inline
  def apply(): SVGPathSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPathSelector]
  }
  
  @scala.inline
  implicit class SVGPathSelectorOps[Self <: SVGPathSelector] (val x: Self) extends AnyVal {
    
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
    def setPath(value: SVGPathAttributes): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
