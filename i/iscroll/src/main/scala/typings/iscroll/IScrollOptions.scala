package typings.iscroll

import typings.iscroll.anon.Fn
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScrollOptions extends js.Object {
  
  var HWCompositing: js.UndefOr[Boolean] = js.native
  
  var bounce: js.UndefOr[Boolean] = js.native
  
  ///String or function
  var bounceEasing: js.UndefOr[String | Fn] = js.native
  
  var bounceLock: js.UndefOr[Boolean] = js.native
  
  var bounceTime: js.UndefOr[Double] = js.native
  
  var checkDOMChanges: js.UndefOr[Boolean] = js.native
  
  var click: js.UndefOr[Boolean] = js.native
  
  var directionLockThreshold: js.UndefOr[Double] = js.native
  
  // Pointer events
  var disableMouse: js.UndefOr[Boolean] = js.native
  
  var disablePointer: js.UndefOr[Boolean] = js.native
  
  var disableTouch: js.UndefOr[Boolean] = js.native
  
  var doubleTapZoom: js.UndefOr[Double] = js.native
  
  var eventPassthrough: js.UndefOr[String | Boolean] = js.native
  
  var fadeScrollbar: js.UndefOr[Boolean] = js.native
  
  var fadeScrollbars: js.UndefOr[Boolean] = js.native
  
  var fixedScrollbar: js.UndefOr[Boolean] = js.native
  
  var freeScroll: js.UndefOr[Boolean] = js.native
  
  // Scrollbar
  var hScrollbar: js.UndefOr[Boolean] = js.native
  
  var handleClick: js.UndefOr[Boolean] = js.native
  
  var hideScrollbar: js.UndefOr[Boolean] = js.native
  
  var interactiveScrollbars: js.UndefOr[Boolean] = js.native
  
  var invertWheelDirection: js.UndefOr[Boolean] = js.native
  
  var lockDirection: js.UndefOr[Boolean] = js.native
  
  var momentum: js.UndefOr[Boolean] = js.native
  
  var mouseWheel: js.UndefOr[Boolean] = js.native
  
  var mouseWheelSpeed: js.UndefOr[Double] = js.native
  
  var preventDefault: js.UndefOr[Boolean] = js.native
  
  var preventDefaultException: js.UndefOr[js.Array[RegExp] | js.Object] = js.native
  
  // iScroll probe edition
  var probeType: js.UndefOr[Double] = js.native
  
  var releaseScroll: js.UndefOr[Boolean] = js.native
  
  // New in IScroll 5?
  var resizeIndicator: js.UndefOr[Boolean] = js.native
  
  var resizePolling: js.UndefOr[Double] = js.native
  
  //hScroll?: boolean;
  //vScroll?: boolean;
  var scrollX: js.UndefOr[Boolean] = js.native
  
  var scrollY: js.UndefOr[Boolean] = js.native
  
  var scrollbarClass: js.UndefOr[String] = js.native
  
  var scrollbars: js.UndefOr[Boolean | String] = js.native
  
  var shrinkScrollbars: js.UndefOr[String] = js.native
  
  var snap: js.UndefOr[String | Boolean] = js.native
  
  var snapThreshold: js.UndefOr[Double] = js.native
  
  var startX: js.UndefOr[Double] = js.native
  
  var startY: js.UndefOr[Double] = js.native
  
  var tap: js.UndefOr[Boolean] = js.native
  
  var topOffset: js.UndefOr[Double] = js.native
  
  var useTransform: js.UndefOr[Boolean] = js.native
  
  var useTransition: js.UndefOr[Boolean] = js.native
  
  var vScrollbar: js.UndefOr[Boolean] = js.native
  
  var wheelAction: js.UndefOr[String] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  // Zoom
  var zoom: js.UndefOr[Boolean] = js.native
  
  var zoomMax: js.UndefOr[Double] = js.native
  
  var zoomMin: js.UndefOr[Double] = js.native
}
object IScrollOptions {
  
  @scala.inline
  def apply(): IScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollOptions]
  }
  
  @scala.inline
  implicit class IScrollOptionsOps[Self <: IScrollOptions] (val x: Self) extends AnyVal {
    
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
    def setHWCompositing(value: Boolean): Self = this.set("HWCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHWCompositing: Self = this.set("HWCompositing", js.undefined)
    
    @scala.inline
    def setBounce(value: Boolean): Self = this.set("bounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounce: Self = this.set("bounce", js.undefined)
    
    @scala.inline
    def setBounceEasing(value: String | Fn): Self = this.set("bounceEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceEasing: Self = this.set("bounceEasing", js.undefined)
    
    @scala.inline
    def setBounceLock(value: Boolean): Self = this.set("bounceLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceLock: Self = this.set("bounceLock", js.undefined)
    
    @scala.inline
    def setBounceTime(value: Double): Self = this.set("bounceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceTime: Self = this.set("bounceTime", js.undefined)
    
    @scala.inline
    def setCheckDOMChanges(value: Boolean): Self = this.set("checkDOMChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckDOMChanges: Self = this.set("checkDOMChanges", js.undefined)
    
    @scala.inline
    def setClick(value: Boolean): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setDirectionLockThreshold(value: Double): Self = this.set("directionLockThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionLockThreshold: Self = this.set("directionLockThreshold", js.undefined)
    
    @scala.inline
    def setDisableMouse(value: Boolean): Self = this.set("disableMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMouse: Self = this.set("disableMouse", js.undefined)
    
    @scala.inline
    def setDisablePointer(value: Boolean): Self = this.set("disablePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePointer: Self = this.set("disablePointer", js.undefined)
    
    @scala.inline
    def setDisableTouch(value: Boolean): Self = this.set("disableTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTouch: Self = this.set("disableTouch", js.undefined)
    
    @scala.inline
    def setDoubleTapZoom(value: Double): Self = this.set("doubleTapZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleTapZoom: Self = this.set("doubleTapZoom", js.undefined)
    
    @scala.inline
    def setEventPassthrough(value: String | Boolean): Self = this.set("eventPassthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventPassthrough: Self = this.set("eventPassthrough", js.undefined)
    
    @scala.inline
    def setFadeScrollbar(value: Boolean): Self = this.set("fadeScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeScrollbar: Self = this.set("fadeScrollbar", js.undefined)
    
    @scala.inline
    def setFadeScrollbars(value: Boolean): Self = this.set("fadeScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeScrollbars: Self = this.set("fadeScrollbars", js.undefined)
    
    @scala.inline
    def setFixedScrollbar(value: Boolean): Self = this.set("fixedScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedScrollbar: Self = this.set("fixedScrollbar", js.undefined)
    
    @scala.inline
    def setFreeScroll(value: Boolean): Self = this.set("freeScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreeScroll: Self = this.set("freeScroll", js.undefined)
    
    @scala.inline
    def setHScrollbar(value: Boolean): Self = this.set("hScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHScrollbar: Self = this.set("hScrollbar", js.undefined)
    
    @scala.inline
    def setHandleClick(value: Boolean): Self = this.set("handleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleClick: Self = this.set("handleClick", js.undefined)
    
    @scala.inline
    def setHideScrollbar(value: Boolean): Self = this.set("hideScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideScrollbar: Self = this.set("hideScrollbar", js.undefined)
    
    @scala.inline
    def setInteractiveScrollbars(value: Boolean): Self = this.set("interactiveScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractiveScrollbars: Self = this.set("interactiveScrollbars", js.undefined)
    
    @scala.inline
    def setInvertWheelDirection(value: Boolean): Self = this.set("invertWheelDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertWheelDirection: Self = this.set("invertWheelDirection", js.undefined)
    
    @scala.inline
    def setLockDirection(value: Boolean): Self = this.set("lockDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockDirection: Self = this.set("lockDirection", js.undefined)
    
    @scala.inline
    def setMomentum(value: Boolean): Self = this.set("momentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMomentum: Self = this.set("momentum", js.undefined)
    
    @scala.inline
    def setMouseWheel(value: Boolean): Self = this.set("mouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseWheel: Self = this.set("mouseWheel", js.undefined)
    
    @scala.inline
    def setMouseWheelSpeed(value: Double): Self = this.set("mouseWheelSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseWheelSpeed: Self = this.set("mouseWheelSpeed", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    
    @scala.inline
    def setPreventDefaultExceptionVarargs(value: RegExp*): Self = this.set("preventDefaultException", js.Array(value :_*))
    
    @scala.inline
    def setPreventDefaultException(value: js.Array[RegExp] | js.Object): Self = this.set("preventDefaultException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefaultException: Self = this.set("preventDefaultException", js.undefined)
    
    @scala.inline
    def setProbeType(value: Double): Self = this.set("probeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProbeType: Self = this.set("probeType", js.undefined)
    
    @scala.inline
    def setReleaseScroll(value: Boolean): Self = this.set("releaseScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseScroll: Self = this.set("releaseScroll", js.undefined)
    
    @scala.inline
    def setResizeIndicator(value: Boolean): Self = this.set("resizeIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeIndicator: Self = this.set("resizeIndicator", js.undefined)
    
    @scala.inline
    def setResizePolling(value: Double): Self = this.set("resizePolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizePolling: Self = this.set("resizePolling", js.undefined)
    
    @scala.inline
    def setScrollX(value: Boolean): Self = this.set("scrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollX: Self = this.set("scrollX", js.undefined)
    
    @scala.inline
    def setScrollY(value: Boolean): Self = this.set("scrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollY: Self = this.set("scrollY", js.undefined)
    
    @scala.inline
    def setScrollbarClass(value: String): Self = this.set("scrollbarClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbarClass: Self = this.set("scrollbarClass", js.undefined)
    
    @scala.inline
    def setScrollbars(value: Boolean | String): Self = this.set("scrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbars: Self = this.set("scrollbars", js.undefined)
    
    @scala.inline
    def setShrinkScrollbars(value: String): Self = this.set("shrinkScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShrinkScrollbars: Self = this.set("shrinkScrollbars", js.undefined)
    
    @scala.inline
    def setSnap(value: String | Boolean): Self = this.set("snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    
    @scala.inline
    def setSnapThreshold(value: Double): Self = this.set("snapThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapThreshold: Self = this.set("snapThreshold", js.undefined)
    
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartX: Self = this.set("startX", js.undefined)
    
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartY: Self = this.set("startY", js.undefined)
    
    @scala.inline
    def setTap(value: Boolean): Self = this.set("tap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTap: Self = this.set("tap", js.undefined)
    
    @scala.inline
    def setTopOffset(value: Double): Self = this.set("topOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopOffset: Self = this.set("topOffset", js.undefined)
    
    @scala.inline
    def setUseTransform(value: Boolean): Self = this.set("useTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTransform: Self = this.set("useTransform", js.undefined)
    
    @scala.inline
    def setUseTransition(value: Boolean): Self = this.set("useTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTransition: Self = this.set("useTransition", js.undefined)
    
    @scala.inline
    def setVScrollbar(value: Boolean): Self = this.set("vScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVScrollbar: Self = this.set("vScrollbar", js.undefined)
    
    @scala.inline
    def setWheelAction(value: String): Self = this.set("wheelAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelAction: Self = this.set("wheelAction", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomMax(value: Double): Self = this.set("zoomMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomMax: Self = this.set("zoomMax", js.undefined)
    
    @scala.inline
    def setZoomMin(value: Double): Self = this.set("zoomMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomMin: Self = this.set("zoomMin", js.undefined)
  }
}
