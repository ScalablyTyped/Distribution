package typings.iscroll

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollOptions extends js.Object {
  var HWCompositing: js.UndefOr[Boolean] = js.undefined
  var bounce: js.UndefOr[Boolean] = js.undefined
  ///String or function
  var bounceEasing: js.UndefOr[String | Anon_Fn] = js.undefined
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
  var preventDefaultException: js.UndefOr[js.Array[RegExp] | js.Object] = js.undefined
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
  @scala.inline
  def apply(
    HWCompositing: js.UndefOr[Boolean] = js.undefined,
    bounce: js.UndefOr[Boolean] = js.undefined,
    bounceEasing: String | Anon_Fn = null,
    bounceLock: js.UndefOr[Boolean] = js.undefined,
    bounceTime: Int | Double = null,
    checkDOMChanges: js.UndefOr[Boolean] = js.undefined,
    click: js.UndefOr[Boolean] = js.undefined,
    directionLockThreshold: Int | Double = null,
    disableMouse: js.UndefOr[Boolean] = js.undefined,
    disablePointer: js.UndefOr[Boolean] = js.undefined,
    disableTouch: js.UndefOr[Boolean] = js.undefined,
    doubleTapZoom: Int | Double = null,
    eventPassthrough: String | Boolean = null,
    fadeScrollbar: js.UndefOr[Boolean] = js.undefined,
    fadeScrollbars: js.UndefOr[Boolean] = js.undefined,
    fixedScrollbar: js.UndefOr[Boolean] = js.undefined,
    freeScroll: js.UndefOr[Boolean] = js.undefined,
    hScrollbar: js.UndefOr[Boolean] = js.undefined,
    handleClick: js.UndefOr[Boolean] = js.undefined,
    hideScrollbar: js.UndefOr[Boolean] = js.undefined,
    interactiveScrollbars: js.UndefOr[Boolean] = js.undefined,
    invertWheelDirection: js.UndefOr[Boolean] = js.undefined,
    lockDirection: js.UndefOr[Boolean] = js.undefined,
    momentum: js.UndefOr[Boolean] = js.undefined,
    mouseWheel: js.UndefOr[Boolean] = js.undefined,
    mouseWheelSpeed: Int | Double = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    preventDefaultException: js.Array[RegExp] | js.Object = null,
    probeType: Int | Double = null,
    releaseScroll: js.UndefOr[Boolean] = js.undefined,
    resizeIndicator: js.UndefOr[Boolean] = js.undefined,
    resizePolling: Int | Double = null,
    scrollX: js.UndefOr[Boolean] = js.undefined,
    scrollY: js.UndefOr[Boolean] = js.undefined,
    scrollbarClass: String = null,
    scrollbars: Boolean | String = null,
    shrinkScrollbars: String = null,
    snap: String | Boolean = null,
    snapThreshold: Int | Double = null,
    startX: Int | Double = null,
    startY: Int | Double = null,
    tap: js.UndefOr[Boolean] = js.undefined,
    topOffset: Int | Double = null,
    useTransform: js.UndefOr[Boolean] = js.undefined,
    useTransition: js.UndefOr[Boolean] = js.undefined,
    vScrollbar: js.UndefOr[Boolean] = js.undefined,
    wheelAction: String = null,
    x: Int | Double = null,
    y: Int | Double = null,
    zoom: js.UndefOr[Boolean] = js.undefined,
    zoomMax: Int | Double = null,
    zoomMin: Int | Double = null
  ): IScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(HWCompositing)) __obj.updateDynamic("HWCompositing")(HWCompositing.asInstanceOf[js.Any])
    if (!js.isUndefined(bounce)) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (bounceEasing != null) __obj.updateDynamic("bounceEasing")(bounceEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceLock)) __obj.updateDynamic("bounceLock")(bounceLock.asInstanceOf[js.Any])
    if (bounceTime != null) __obj.updateDynamic("bounceTime")(bounceTime.asInstanceOf[js.Any])
    if (!js.isUndefined(checkDOMChanges)) __obj.updateDynamic("checkDOMChanges")(checkDOMChanges.asInstanceOf[js.Any])
    if (!js.isUndefined(click)) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (directionLockThreshold != null) __obj.updateDynamic("directionLockThreshold")(directionLockThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMouse)) __obj.updateDynamic("disableMouse")(disableMouse.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePointer)) __obj.updateDynamic("disablePointer")(disablePointer.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouch)) __obj.updateDynamic("disableTouch")(disableTouch.asInstanceOf[js.Any])
    if (doubleTapZoom != null) __obj.updateDynamic("doubleTapZoom")(doubleTapZoom.asInstanceOf[js.Any])
    if (eventPassthrough != null) __obj.updateDynamic("eventPassthrough")(eventPassthrough.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeScrollbar)) __obj.updateDynamic("fadeScrollbar")(fadeScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeScrollbars)) __obj.updateDynamic("fadeScrollbars")(fadeScrollbars.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedScrollbar)) __obj.updateDynamic("fixedScrollbar")(fixedScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(freeScroll)) __obj.updateDynamic("freeScroll")(freeScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(hScrollbar)) __obj.updateDynamic("hScrollbar")(hScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(handleClick)) __obj.updateDynamic("handleClick")(handleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(hideScrollbar)) __obj.updateDynamic("hideScrollbar")(hideScrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(interactiveScrollbars)) __obj.updateDynamic("interactiveScrollbars")(interactiveScrollbars.asInstanceOf[js.Any])
    if (!js.isUndefined(invertWheelDirection)) __obj.updateDynamic("invertWheelDirection")(invertWheelDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(lockDirection)) __obj.updateDynamic("lockDirection")(lockDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(momentum)) __obj.updateDynamic("momentum")(momentum.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheel)) __obj.updateDynamic("mouseWheel")(mouseWheel.asInstanceOf[js.Any])
    if (mouseWheelSpeed != null) __obj.updateDynamic("mouseWheelSpeed")(mouseWheelSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (preventDefaultException != null) __obj.updateDynamic("preventDefaultException")(preventDefaultException.asInstanceOf[js.Any])
    if (probeType != null) __obj.updateDynamic("probeType")(probeType.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseScroll)) __obj.updateDynamic("releaseScroll")(releaseScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeIndicator)) __obj.updateDynamic("resizeIndicator")(resizeIndicator.asInstanceOf[js.Any])
    if (resizePolling != null) __obj.updateDynamic("resizePolling")(resizePolling.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollX)) __obj.updateDynamic("scrollX")(scrollX.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollY)) __obj.updateDynamic("scrollY")(scrollY.asInstanceOf[js.Any])
    if (scrollbarClass != null) __obj.updateDynamic("scrollbarClass")(scrollbarClass.asInstanceOf[js.Any])
    if (scrollbars != null) __obj.updateDynamic("scrollbars")(scrollbars.asInstanceOf[js.Any])
    if (shrinkScrollbars != null) __obj.updateDynamic("shrinkScrollbars")(shrinkScrollbars.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (snapThreshold != null) __obj.updateDynamic("snapThreshold")(snapThreshold.asInstanceOf[js.Any])
    if (startX != null) __obj.updateDynamic("startX")(startX.asInstanceOf[js.Any])
    if (startY != null) __obj.updateDynamic("startY")(startY.asInstanceOf[js.Any])
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap.asInstanceOf[js.Any])
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransform)) __obj.updateDynamic("useTransform")(useTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransition)) __obj.updateDynamic("useTransition")(useTransition.asInstanceOf[js.Any])
    if (!js.isUndefined(vScrollbar)) __obj.updateDynamic("vScrollbar")(vScrollbar.asInstanceOf[js.Any])
    if (wheelAction != null) __obj.updateDynamic("wheelAction")(wheelAction.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomMax != null) __obj.updateDynamic("zoomMax")(zoomMax.asInstanceOf[js.Any])
    if (zoomMin != null) __obj.updateDynamic("zoomMin")(zoomMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollOptions]
  }
}

