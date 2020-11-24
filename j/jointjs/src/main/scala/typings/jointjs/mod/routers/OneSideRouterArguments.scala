package typings.jointjs.mod.routers

import typings.jointjs.mod.dia.OrthogonalDirection
import typings.jointjs.mod.dia.Sides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneSideRouterArguments extends js.Object {
  
  var padding: js.UndefOr[Sides] = js.native
  
  var side: js.UndefOr[OrthogonalDirection] = js.native
}
object OneSideRouterArguments {
  
  @scala.inline
  def apply(): OneSideRouterArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneSideRouterArguments]
  }
  
  @scala.inline
  implicit class OneSideRouterArgumentsOps[Self <: OneSideRouterArguments] (val x: Self) extends AnyVal {
    
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
    def setPadding(value: Sides): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setSide(value: OrthogonalDirection): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
  }
}
