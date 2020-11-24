package typings.materialUi.expandTransitionMod

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandTransitionProps extends Props[ExpandTransition] {
  
  var enterDelay: js.UndefOr[Double] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var transitionDelay: js.UndefOr[Double] = js.native
  
  var transitionDuration: js.UndefOr[Double] = js.native
}
object ExpandTransitionProps {
  
  @scala.inline
  def apply(): ExpandTransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandTransitionProps]
  }
  
  @scala.inline
  implicit class ExpandTransitionPropsOps[Self <: ExpandTransitionProps] (val x: Self) extends AnyVal {
    
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
    def setEnterDelay(value: Double): Self = this.set("enterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterDelay: Self = this.set("enterDelay", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTransitionDelay(value: Double): Self = this.set("transitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDelay: Self = this.set("transitionDelay", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
  }
}
