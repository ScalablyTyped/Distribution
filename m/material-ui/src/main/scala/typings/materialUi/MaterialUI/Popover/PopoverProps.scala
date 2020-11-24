package typings.materialUi.MaterialUI.Popover

import typings.materialUi.MaterialUI.propTypes.origin
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverProps extends js.Object {
  
  var anchorEl: js.UndefOr[ReactInstance] = js.native
  
  var anchorOrigin: js.UndefOr[origin] = js.native
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.native
  
  var autoCloseWhenOffScreen: js.UndefOr[Boolean] = js.native
  
  var canAutoPosition: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var onRequestClose: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var targetOrigin: js.UndefOr[origin] = js.native
  
  var useLayerForClickAway: js.UndefOr[Boolean] = js.native
  
  var zDepth: js.UndefOr[Double] = js.native
}
object PopoverProps {
  
  @scala.inline
  def apply(): PopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverProps]
  }
  
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
    
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
    def setAnchorEl(value: ReactInstance): Self = this.set("anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorEl: Self = this.set("anchorEl", js.undefined)
    
    @scala.inline
    def setAnchorOrigin(value: origin): Self = this.set("anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorOrigin: Self = this.set("anchorOrigin", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setAnimation(value: ComponentClass[PopoverAnimationProps, ComponentState]): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAutoCloseWhenOffScreen(value: Boolean): Self = this.set("autoCloseWhenOffScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCloseWhenOffScreen: Self = this.set("autoCloseWhenOffScreen", js.undefined)
    
    @scala.inline
    def setCanAutoPosition(value: Boolean): Self = this.set("canAutoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanAutoPosition: Self = this.set("canAutoPosition", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setOnRequestClose(value: /* reason */ String => Unit): Self = this.set("onRequestClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRequestClose: Self = this.set("onRequestClose", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTargetOrigin(value: origin): Self = this.set("targetOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetOrigin: Self = this.set("targetOrigin", js.undefined)
    
    @scala.inline
    def setUseLayerForClickAway(value: Boolean): Self = this.set("useLayerForClickAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLayerForClickAway: Self = this.set("useLayerForClickAway", js.undefined)
    
    @scala.inline
    def setZDepth(value: Double): Self = this.set("zDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZDepth: Self = this.set("zDepth", js.undefined)
  }
}
