package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createRender.RenderOptions> */
@js.native
trait PartialRenderOptions extends js.Object {
  
  var render: js.UndefOr[Fn0] = js.native
}
object PartialRenderOptions {
  
  @scala.inline
  def apply(): PartialRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRenderOptions]
  }
  
  @scala.inline
  implicit class PartialRenderOptionsOps[Self <: PartialRenderOptions] (val x: Self) extends AnyVal {
    
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
    def setRender(value: Fn0): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
