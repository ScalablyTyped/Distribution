package typings.materialRipple.typesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCRippleCapableSurface extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var root: Element = js.native
  
  var unbounded: js.UndefOr[Boolean] = js.native
}
object MDCRippleCapableSurface {
  
  @scala.inline
  def apply(root: Element): MDCRippleCapableSurface = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCRippleCapableSurface]
  }
  
  @scala.inline
  implicit class MDCRippleCapableSurfaceOps[Self <: MDCRippleCapableSurface] (val x: Self) extends AnyVal {
    
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
    def setRoot(value: Element): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setUnbounded(value: Boolean): Self = this.set("unbounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnbounded: Self = this.set("unbounded", js.undefined)
  }
}
