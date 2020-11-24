package typings.materialMenuSurface.anon

import typings.materialMenuSurface.typesMod.MDCMenuDimensions
import typings.materialMenuSurface.typesMod.MDCMenuPoint
import typings.std.ClientRect
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/menu-surface.@material/menu-surface/adapter.MDCMenuSurfaceAdapter> */
@js.native
trait PartialMDCMenuSurfaceAdap extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var getAnchorDimensions: js.UndefOr[js.Function0[ClientRect | Null]] = js.native
  
  var getBodyDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.native
  
  var getInnerDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.native
  
  var getWindowDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.native
  
  var getWindowScroll: js.UndefOr[js.Function0[MDCMenuPoint]] = js.native
  
  var hasAnchor: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var isElementInContainer: js.UndefOr[js.Function1[/* el */ Element, Boolean]] = js.native
  
  var isFocused: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isRtl: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var notifyClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var notifyOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var restoreFocus: js.UndefOr[js.Function0[Unit]] = js.native
  
  var saveFocus: js.UndefOr[js.Function0[Unit]] = js.native
  
  var setMaxHeight: js.UndefOr[js.Function1[/* height */ String, Unit]] = js.native
  
  var setPosition: js.UndefOr[js.Function1[/* position */ PartialMDCMenuDistance, Unit]] = js.native
  
  var setTransformOrigin: js.UndefOr[js.Function1[/* origin */ String, Unit]] = js.native
}
object PartialMDCMenuSurfaceAdap {
  
  @scala.inline
  def apply(): PartialMDCMenuSurfaceAdap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCMenuSurfaceAdap]
  }
  
  @scala.inline
  implicit class PartialMDCMenuSurfaceAdapOps[Self <: PartialMDCMenuSurfaceAdap] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    
    @scala.inline
    def setGetAnchorDimensions(value: () => ClientRect | Null): Self = this.set("getAnchorDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAnchorDimensions: Self = this.set("getAnchorDimensions", js.undefined)
    
    @scala.inline
    def setGetBodyDimensions(value: () => MDCMenuDimensions): Self = this.set("getBodyDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBodyDimensions: Self = this.set("getBodyDimensions", js.undefined)
    
    @scala.inline
    def setGetInnerDimensions(value: () => MDCMenuDimensions): Self = this.set("getInnerDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInnerDimensions: Self = this.set("getInnerDimensions", js.undefined)
    
    @scala.inline
    def setGetWindowDimensions(value: () => MDCMenuDimensions): Self = this.set("getWindowDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetWindowDimensions: Self = this.set("getWindowDimensions", js.undefined)
    
    @scala.inline
    def setGetWindowScroll(value: () => MDCMenuPoint): Self = this.set("getWindowScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetWindowScroll: Self = this.set("getWindowScroll", js.undefined)
    
    @scala.inline
    def setHasAnchor(value: () => Boolean): Self = this.set("hasAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHasAnchor: Self = this.set("hasAnchor", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setIsElementInContainer(value: /* el */ Element => Boolean): Self = this.set("isElementInContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsElementInContainer: Self = this.set("isElementInContainer", js.undefined)
    
    @scala.inline
    def setIsFocused(value: () => Boolean): Self = this.set("isFocused", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    
    @scala.inline
    def setIsRtl(value: () => Boolean): Self = this.set("isRtl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsRtl: Self = this.set("isRtl", js.undefined)
    
    @scala.inline
    def setNotifyClose(value: () => Unit): Self = this.set("notifyClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyClose: Self = this.set("notifyClose", js.undefined)
    
    @scala.inline
    def setNotifyOpen(value: () => Unit): Self = this.set("notifyOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyOpen: Self = this.set("notifyOpen", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setRestoreFocus(value: () => Unit): Self = this.set("restoreFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRestoreFocus: Self = this.set("restoreFocus", js.undefined)
    
    @scala.inline
    def setSaveFocus(value: () => Unit): Self = this.set("saveFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSaveFocus: Self = this.set("saveFocus", js.undefined)
    
    @scala.inline
    def setSetMaxHeight(value: /* height */ String => Unit): Self = this.set("setMaxHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxHeight: Self = this.set("setMaxHeight", js.undefined)
    
    @scala.inline
    def setSetPosition(value: /* position */ PartialMDCMenuDistance => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPosition: Self = this.set("setPosition", js.undefined)
    
    @scala.inline
    def setSetTransformOrigin(value: /* origin */ String => Unit): Self = this.set("setTransformOrigin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTransformOrigin: Self = this.set("setTransformOrigin", js.undefined)
  }
}
