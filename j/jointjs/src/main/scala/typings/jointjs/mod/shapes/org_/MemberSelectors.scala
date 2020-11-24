package typings.jointjs.mod.shapes.org_

import typings.jointjs.mod.attributes.SVGImageAttributes
import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberSelectors extends Selectors {
  
  @JSName(".card")
  var Dotcard: js.UndefOr[SVGRectAttributes] = js.native
  
  @JSName(".name")
  var Dotname: js.UndefOr[SVGTextAttributes] = js.native
  
  @JSName(".rank")
  var Dotrank: js.UndefOr[SVGTextAttributes] = js.native
  
  var image: js.UndefOr[SVGImageAttributes] = js.native
}
object MemberSelectors {
  
  @scala.inline
  def apply(): MemberSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberSelectors]
  }
  
  @scala.inline
  implicit class MemberSelectorsOps[Self <: MemberSelectors] (val x: Self) extends AnyVal {
    
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
    def setDotcard(value: SVGRectAttributes): Self = this.set(".card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotcard: Self = this.set(".card", js.undefined)
    
    @scala.inline
    def setDotname(value: SVGTextAttributes): Self = this.set(".name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotname: Self = this.set(".name", js.undefined)
    
    @scala.inline
    def setDotrank(value: SVGTextAttributes): Self = this.set(".rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotrank: Self = this.set(".rank", js.undefined)
    
    @scala.inline
    def setImage(value: SVGImageAttributes): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
}
