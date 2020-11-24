package typings.jointjs.mod.shapes.basic

import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.shapes.SVGRectSelector
import typings.jointjs.mod.shapes.SVGTextSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBlockSelectors
  extends SVGTextSelector
     with SVGRectSelector {
  
  @JSName(".content")
  var Dotcontent: js.UndefOr[SVGTextAttributes] = js.native
}
object TextBlockSelectors {
  
  @scala.inline
  def apply(): TextBlockSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextBlockSelectors]
  }
  
  @scala.inline
  implicit class TextBlockSelectorsOps[Self <: TextBlockSelectors] (val x: Self) extends AnyVal {
    
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
    def setDotcontent(value: SVGTextAttributes): Self = this.set(".content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotcontent: Self = this.set(".content", js.undefined)
  }
}
