package typings.jointjs.mod.routers

import typings.jointjs.mod.dia.Sides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrthogonalRouterArguments extends js.Object {
  
  var elementPadding: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[Sides] = js.native
}
object OrthogonalRouterArguments {
  
  @scala.inline
  def apply(): OrthogonalRouterArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrthogonalRouterArguments]
  }
  
  @scala.inline
  implicit class OrthogonalRouterArgumentsOps[Self <: OrthogonalRouterArguments] (val x: Self) extends AnyVal {
    
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
    def setElementPadding(value: Double): Self = this.set("elementPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementPadding: Self = this.set("elementPadding", js.undefined)
    
    @scala.inline
    def setPadding(value: Sides): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
}
