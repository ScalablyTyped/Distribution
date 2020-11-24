package typings.materialUi.renderToLayerMod

import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderToLayerProps extends Props[RenderToLayer] {
  
  var componentClickAway: js.UndefOr[js.Function] = js.native
  
  var open: Boolean = js.native
  
  var render: js.Function = js.native
  
  var useLayerForClickAway: js.UndefOr[Boolean] = js.native
}
object RenderToLayerProps {
  
  @scala.inline
  def apply(open: Boolean, render: js.Function): RenderToLayerProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderToLayerProps]
  }
  
  @scala.inline
  implicit class RenderToLayerPropsOps[Self <: RenderToLayerProps] (val x: Self) extends AnyVal {
    
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
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: js.Function): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentClickAway(value: js.Function): Self = this.set("componentClickAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentClickAway: Self = this.set("componentClickAway", js.undefined)
    
    @scala.inline
    def setUseLayerForClickAway(value: Boolean): Self = this.set("useLayerForClickAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLayerForClickAway: Self = this.set("useLayerForClickAway", js.undefined)
  }
}
