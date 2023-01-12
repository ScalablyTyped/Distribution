package typings.iscroll

import typings.iscroll.anon.Fn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScrollOptions extends StObject {
  
  var HWCompositing: js.UndefOr[Boolean] = js.undefined
  
  var bounce: js.UndefOr[Boolean] = js.undefined
  
  ///String or function
  var bounceEasing: js.UndefOr[String | Fn] = js.undefined
  
  var bounceLock: js.UndefOr[Boolean] = js.undefined
  
  var bounceTime: js.UndefOr[Double] = js.undefined
  
  var checkDOMChanges: js.UndefOr[Boolean] = js.undefined
  
  var click: js.UndefOr[Boolean] = js.undefined
  
  var directionLockThreshold: js.UndefOr[Double] = js.undefined
  
  // Pointer events
  var disableMouse: js.UndefOr[Boolean] = js.undefined
  
  var disablePointer: js.UndefOr[Boolean] = js.undefined
  
  var disableTouch: js.UndefOr[Boolean] = js.undefined
  
  var doubleTapZoom: js.UndefOr[Double] = js.undefined
  
  var eventPassthrough: js.UndefOr[String | Boolean] = js.undefined
  
  var fadeScrollbar: js.UndefOr[Boolean] = js.undefined
  
  var fadeScrollbars: js.UndefOr[Boolean] = js.undefined
  
  var fixedScrollbar: js.UndefOr[Boolean] = js.undefined
  
  var freeScroll: js.UndefOr[Boolean] = js.undefined
  
  // Scrollbar
  var hScrollbar: js.UndefOr[Boolean] = js.undefined
  
  var handleClick: js.UndefOr[Boolean] = js.undefined
  
  var hideScrollbar: js.UndefOr[Boolean] = js.undefined
  
  var interactiveScrollbars: js.UndefOr[Boolean] = js.undefined
  
  var invertWheelDirection: js.UndefOr[Boolean] = js.undefined
  
  var lockDirection: js.UndefOr[Boolean] = js.undefined
  
  var momentum: js.UndefOr[Boolean] = js.undefined
  
  var mouseWheel: js.UndefOr[Boolean] = js.undefined
  
  var mouseWheelSpeed: js.UndefOr[Double] = js.undefined
  
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  var preventDefaultException: js.UndefOr[js.Array[js.RegExp] | js.Object] = js.undefined
  
  // iScroll probe edition
  var probeType: js.UndefOr[Double] = js.undefined
  
  var releaseScroll: js.UndefOr[Boolean] = js.undefined
  
  // New in IScroll 5?
  var resizeIndicator: js.UndefOr[Boolean] = js.undefined
  
  var resizePolling: js.UndefOr[Double] = js.undefined
  
  //hScroll?: boolean;
  //vScroll?: boolean;
  var scrollX: js.UndefOr[Boolean] = js.undefined
  
  var scrollY: js.UndefOr[Boolean] = js.undefined
  
  var scrollbarClass: js.UndefOr[String] = js.undefined
  
  var scrollbars: js.UndefOr[Boolean | String] = js.undefined
  
  var shrinkScrollbars: js.UndefOr[String] = js.undefined
  
  var snap: js.UndefOr[String | Boolean] = js.undefined
  
  var snapThreshold: js.UndefOr[Double] = js.undefined
  
  var startX: js.UndefOr[Double] = js.undefined
  
  var startY: js.UndefOr[Double] = js.undefined
  
  var tap: js.UndefOr[Boolean] = js.undefined
  
  var topOffset: js.UndefOr[Double] = js.undefined
  
  var useTransform: js.UndefOr[Boolean] = js.undefined
  
  var useTransition: js.UndefOr[Boolean] = js.undefined
  
  var vScrollbar: js.UndefOr[Boolean] = js.undefined
  
  var wheelAction: js.UndefOr[String] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  // Zoom
  var zoom: js.UndefOr[Boolean] = js.undefined
  
  var zoomMax: js.UndefOr[Double] = js.undefined
  
  var zoomMin: js.UndefOr[Double] = js.undefined
}
object IScrollOptions {
  
  inline def apply(): IScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IScrollOptions] (val x: Self) extends AnyVal {
    
    inline def setBounce(value: Boolean): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    inline def setBounceEasing(value: String | Fn): Self = StObject.set(x, "bounceEasing", value.asInstanceOf[js.Any])
    
    inline def setBounceEasingUndefined: Self = StObject.set(x, "bounceEasing", js.undefined)
    
    inline def setBounceLock(value: Boolean): Self = StObject.set(x, "bounceLock", value.asInstanceOf[js.Any])
    
    inline def setBounceLockUndefined: Self = StObject.set(x, "bounceLock", js.undefined)
    
    inline def setBounceTime(value: Double): Self = StObject.set(x, "bounceTime", value.asInstanceOf[js.Any])
    
    inline def setBounceTimeUndefined: Self = StObject.set(x, "bounceTime", js.undefined)
    
    inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
    
    inline def setCheckDOMChanges(value: Boolean): Self = StObject.set(x, "checkDOMChanges", value.asInstanceOf[js.Any])
    
    inline def setCheckDOMChangesUndefined: Self = StObject.set(x, "checkDOMChanges", js.undefined)
    
    inline def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDirectionLockThreshold(value: Double): Self = StObject.set(x, "directionLockThreshold", value.asInstanceOf[js.Any])
    
    inline def setDirectionLockThresholdUndefined: Self = StObject.set(x, "directionLockThreshold", js.undefined)
    
    inline def setDisableMouse(value: Boolean): Self = StObject.set(x, "disableMouse", value.asInstanceOf[js.Any])
    
    inline def setDisableMouseUndefined: Self = StObject.set(x, "disableMouse", js.undefined)
    
    inline def setDisablePointer(value: Boolean): Self = StObject.set(x, "disablePointer", value.asInstanceOf[js.Any])
    
    inline def setDisablePointerUndefined: Self = StObject.set(x, "disablePointer", js.undefined)
    
    inline def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
    
    inline def setDisableTouchUndefined: Self = StObject.set(x, "disableTouch", js.undefined)
    
    inline def setDoubleTapZoom(value: Double): Self = StObject.set(x, "doubleTapZoom", value.asInstanceOf[js.Any])
    
    inline def setDoubleTapZoomUndefined: Self = StObject.set(x, "doubleTapZoom", js.undefined)
    
    inline def setEventPassthrough(value: String | Boolean): Self = StObject.set(x, "eventPassthrough", value.asInstanceOf[js.Any])
    
    inline def setEventPassthroughUndefined: Self = StObject.set(x, "eventPassthrough", js.undefined)
    
    inline def setFadeScrollbar(value: Boolean): Self = StObject.set(x, "fadeScrollbar", value.asInstanceOf[js.Any])
    
    inline def setFadeScrollbarUndefined: Self = StObject.set(x, "fadeScrollbar", js.undefined)
    
    inline def setFadeScrollbars(value: Boolean): Self = StObject.set(x, "fadeScrollbars", value.asInstanceOf[js.Any])
    
    inline def setFadeScrollbarsUndefined: Self = StObject.set(x, "fadeScrollbars", js.undefined)
    
    inline def setFixedScrollbar(value: Boolean): Self = StObject.set(x, "fixedScrollbar", value.asInstanceOf[js.Any])
    
    inline def setFixedScrollbarUndefined: Self = StObject.set(x, "fixedScrollbar", js.undefined)
    
    inline def setFreeScroll(value: Boolean): Self = StObject.set(x, "freeScroll", value.asInstanceOf[js.Any])
    
    inline def setFreeScrollUndefined: Self = StObject.set(x, "freeScroll", js.undefined)
    
    inline def setHScrollbar(value: Boolean): Self = StObject.set(x, "hScrollbar", value.asInstanceOf[js.Any])
    
    inline def setHScrollbarUndefined: Self = StObject.set(x, "hScrollbar", js.undefined)
    
    inline def setHWCompositing(value: Boolean): Self = StObject.set(x, "HWCompositing", value.asInstanceOf[js.Any])
    
    inline def setHWCompositingUndefined: Self = StObject.set(x, "HWCompositing", js.undefined)
    
    inline def setHandleClick(value: Boolean): Self = StObject.set(x, "handleClick", value.asInstanceOf[js.Any])
    
    inline def setHandleClickUndefined: Self = StObject.set(x, "handleClick", js.undefined)
    
    inline def setHideScrollbar(value: Boolean): Self = StObject.set(x, "hideScrollbar", value.asInstanceOf[js.Any])
    
    inline def setHideScrollbarUndefined: Self = StObject.set(x, "hideScrollbar", js.undefined)
    
    inline def setInteractiveScrollbars(value: Boolean): Self = StObject.set(x, "interactiveScrollbars", value.asInstanceOf[js.Any])
    
    inline def setInteractiveScrollbarsUndefined: Self = StObject.set(x, "interactiveScrollbars", js.undefined)
    
    inline def setInvertWheelDirection(value: Boolean): Self = StObject.set(x, "invertWheelDirection", value.asInstanceOf[js.Any])
    
    inline def setInvertWheelDirectionUndefined: Self = StObject.set(x, "invertWheelDirection", js.undefined)
    
    inline def setLockDirection(value: Boolean): Self = StObject.set(x, "lockDirection", value.asInstanceOf[js.Any])
    
    inline def setLockDirectionUndefined: Self = StObject.set(x, "lockDirection", js.undefined)
    
    inline def setMomentum(value: Boolean): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
    
    inline def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
    
    inline def setMouseWheel(value: Boolean): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelSpeed(value: Double): Self = StObject.set(x, "mouseWheelSpeed", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelSpeedUndefined: Self = StObject.set(x, "mouseWheelSpeed", js.undefined)
    
    inline def setMouseWheelUndefined: Self = StObject.set(x, "mouseWheel", js.undefined)
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultException(value: js.Array[js.RegExp] | js.Object): Self = StObject.set(x, "preventDefaultException", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultExceptionUndefined: Self = StObject.set(x, "preventDefaultException", js.undefined)
    
    inline def setPreventDefaultExceptionVarargs(value: js.RegExp*): Self = StObject.set(x, "preventDefaultException", js.Array(value*))
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setProbeType(value: Double): Self = StObject.set(x, "probeType", value.asInstanceOf[js.Any])
    
    inline def setProbeTypeUndefined: Self = StObject.set(x, "probeType", js.undefined)
    
    inline def setReleaseScroll(value: Boolean): Self = StObject.set(x, "releaseScroll", value.asInstanceOf[js.Any])
    
    inline def setReleaseScrollUndefined: Self = StObject.set(x, "releaseScroll", js.undefined)
    
    inline def setResizeIndicator(value: Boolean): Self = StObject.set(x, "resizeIndicator", value.asInstanceOf[js.Any])
    
    inline def setResizeIndicatorUndefined: Self = StObject.set(x, "resizeIndicator", js.undefined)
    
    inline def setResizePolling(value: Double): Self = StObject.set(x, "resizePolling", value.asInstanceOf[js.Any])
    
    inline def setResizePollingUndefined: Self = StObject.set(x, "resizePolling", js.undefined)
    
    inline def setScrollX(value: Boolean): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    inline def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
    
    inline def setScrollY(value: Boolean): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    inline def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
    
    inline def setScrollbarClass(value: String): Self = StObject.set(x, "scrollbarClass", value.asInstanceOf[js.Any])
    
    inline def setScrollbarClassUndefined: Self = StObject.set(x, "scrollbarClass", js.undefined)
    
    inline def setScrollbars(value: Boolean | String): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
    
    inline def setScrollbarsUndefined: Self = StObject.set(x, "scrollbars", js.undefined)
    
    inline def setShrinkScrollbars(value: String): Self = StObject.set(x, "shrinkScrollbars", value.asInstanceOf[js.Any])
    
    inline def setShrinkScrollbarsUndefined: Self = StObject.set(x, "shrinkScrollbars", js.undefined)
    
    inline def setSnap(value: String | Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapThreshold(value: Double): Self = StObject.set(x, "snapThreshold", value.asInstanceOf[js.Any])
    
    inline def setSnapThresholdUndefined: Self = StObject.set(x, "snapThreshold", js.undefined)
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    inline def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
    
    inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    
    inline def setStartYUndefined: Self = StObject.set(x, "startY", js.undefined)
    
    inline def setTap(value: Boolean): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
    
    inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
    
    inline def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
    
    inline def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
    
    inline def setUseTransform(value: Boolean): Self = StObject.set(x, "useTransform", value.asInstanceOf[js.Any])
    
    inline def setUseTransformUndefined: Self = StObject.set(x, "useTransform", js.undefined)
    
    inline def setUseTransition(value: Boolean): Self = StObject.set(x, "useTransition", value.asInstanceOf[js.Any])
    
    inline def setUseTransitionUndefined: Self = StObject.set(x, "useTransition", js.undefined)
    
    inline def setVScrollbar(value: Boolean): Self = StObject.set(x, "vScrollbar", value.asInstanceOf[js.Any])
    
    inline def setVScrollbarUndefined: Self = StObject.set(x, "vScrollbar", js.undefined)
    
    inline def setWheelAction(value: String): Self = StObject.set(x, "wheelAction", value.asInstanceOf[js.Any])
    
    inline def setWheelActionUndefined: Self = StObject.set(x, "wheelAction", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
    
    inline def setZoomMaxUndefined: Self = StObject.set(x, "zoomMax", js.undefined)
    
    inline def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    
    inline def setZoomMinUndefined: Self = StObject.set(x, "zoomMin", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
