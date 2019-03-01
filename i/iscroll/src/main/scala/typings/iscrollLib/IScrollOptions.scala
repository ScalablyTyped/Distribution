package typings
package iscrollLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollOptions extends js.Object {
  var HWCompositing: js.UndefOr[scala.Boolean] = js.undefined
  var bounce: js.UndefOr[scala.Boolean] = js.undefined
  ///String or function
  var bounceEasing: js.UndefOr[java.lang.String | Anon_Fn] = js.undefined
  var bounceLock: js.UndefOr[scala.Boolean] = js.undefined
  var bounceTime: js.UndefOr[scala.Double] = js.undefined
  var checkDOMChanges: js.UndefOr[scala.Boolean] = js.undefined
  var click: js.UndefOr[scala.Boolean] = js.undefined
  var directionLockThreshold: js.UndefOr[scala.Double] = js.undefined
  // Pointer events
  var disableMouse: js.UndefOr[scala.Boolean] = js.undefined
  var disablePointer: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouch: js.UndefOr[scala.Boolean] = js.undefined
  var doubleTapZoom: js.UndefOr[scala.Double] = js.undefined
  var eventPassthrough: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var fadeScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  var fadeScrollbars: js.UndefOr[scala.Boolean] = js.undefined
  var fixedScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  var freeScroll: js.UndefOr[scala.Boolean] = js.undefined
  // Scrollbar
  var hScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  var handleClick: js.UndefOr[scala.Boolean] = js.undefined
  var hideScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  var interactiveScrollbars: js.UndefOr[scala.Boolean] = js.undefined
  var invertWheelDirection: js.UndefOr[scala.Boolean] = js.undefined
  var lockDirection: js.UndefOr[scala.Boolean] = js.undefined
  var momentum: js.UndefOr[scala.Boolean] = js.undefined
  var mouseWheel: js.UndefOr[scala.Boolean] = js.undefined
  var mouseWheelSpeed: js.UndefOr[scala.Double] = js.undefined
  var preventDefault: js.UndefOr[scala.Boolean] = js.undefined
  var preventDefaultException: js.UndefOr[js.Array[stdLib.RegExp] | js.Object] = js.undefined
  // iScroll probe edition
  var probeType: js.UndefOr[scala.Double] = js.undefined
  var releaseScroll: js.UndefOr[scala.Boolean] = js.undefined
  // New in IScroll 5?
  var resizeIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var resizePolling: js.UndefOr[scala.Double] = js.undefined
  var scrollX: js.UndefOr[scala.Boolean] = js.undefined
  var scrollY: js.UndefOr[scala.Boolean] = js.undefined
  var scrollbarClass: js.UndefOr[java.lang.String] = js.undefined
  var scrollbars: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var shrinkScrollbars: js.UndefOr[java.lang.String] = js.undefined
  var snap: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var snapThreshold: js.UndefOr[scala.Double] = js.undefined
  var startX: js.UndefOr[scala.Double] = js.undefined
  var startY: js.UndefOr[scala.Double] = js.undefined
  var tap: js.UndefOr[scala.Boolean] = js.undefined
  var topOffset: js.UndefOr[scala.Double] = js.undefined
  var useTransform: js.UndefOr[scala.Boolean] = js.undefined
  var useTransition: js.UndefOr[scala.Boolean] = js.undefined
  var vScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  var wheelAction: js.UndefOr[java.lang.String] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
  // Zoom
  var zoom: js.UndefOr[scala.Boolean] = js.undefined
  var zoomMax: js.UndefOr[scala.Double] = js.undefined
  var zoomMin: js.UndefOr[scala.Double] = js.undefined
}

object IScrollOptions {
  @scala.inline
  def apply(
    HWCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    bounce: js.UndefOr[scala.Boolean] = js.undefined,
    bounceEasing: java.lang.String | Anon_Fn = null,
    bounceLock: js.UndefOr[scala.Boolean] = js.undefined,
    bounceTime: scala.Int | scala.Double = null,
    checkDOMChanges: js.UndefOr[scala.Boolean] = js.undefined,
    click: js.UndefOr[scala.Boolean] = js.undefined,
    directionLockThreshold: scala.Int | scala.Double = null,
    disableMouse: js.UndefOr[scala.Boolean] = js.undefined,
    disablePointer: js.UndefOr[scala.Boolean] = js.undefined,
    disableTouch: js.UndefOr[scala.Boolean] = js.undefined,
    doubleTapZoom: scala.Int | scala.Double = null,
    eventPassthrough: java.lang.String | scala.Boolean = null,
    fadeScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    fadeScrollbars: js.UndefOr[scala.Boolean] = js.undefined,
    fixedScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    freeScroll: js.UndefOr[scala.Boolean] = js.undefined,
    hScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    handleClick: js.UndefOr[scala.Boolean] = js.undefined,
    hideScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    interactiveScrollbars: js.UndefOr[scala.Boolean] = js.undefined,
    invertWheelDirection: js.UndefOr[scala.Boolean] = js.undefined,
    lockDirection: js.UndefOr[scala.Boolean] = js.undefined,
    momentum: js.UndefOr[scala.Boolean] = js.undefined,
    mouseWheel: js.UndefOr[scala.Boolean] = js.undefined,
    mouseWheelSpeed: scala.Int | scala.Double = null,
    preventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    preventDefaultException: js.Array[stdLib.RegExp] | js.Object = null,
    probeType: scala.Int | scala.Double = null,
    releaseScroll: js.UndefOr[scala.Boolean] = js.undefined,
    resizeIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    resizePolling: scala.Int | scala.Double = null,
    scrollX: js.UndefOr[scala.Boolean] = js.undefined,
    scrollY: js.UndefOr[scala.Boolean] = js.undefined,
    scrollbarClass: java.lang.String = null,
    scrollbars: scala.Boolean | java.lang.String = null,
    shrinkScrollbars: java.lang.String = null,
    snap: java.lang.String | scala.Boolean = null,
    snapThreshold: scala.Int | scala.Double = null,
    startX: scala.Int | scala.Double = null,
    startY: scala.Int | scala.Double = null,
    tap: js.UndefOr[scala.Boolean] = js.undefined,
    topOffset: scala.Int | scala.Double = null,
    useTransform: js.UndefOr[scala.Boolean] = js.undefined,
    useTransition: js.UndefOr[scala.Boolean] = js.undefined,
    vScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    wheelAction: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    zoom: js.UndefOr[scala.Boolean] = js.undefined,
    zoomMax: scala.Int | scala.Double = null,
    zoomMin: scala.Int | scala.Double = null
  ): IScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(HWCompositing)) __obj.updateDynamic("HWCompositing")(HWCompositing)
    if (!js.isUndefined(bounce)) __obj.updateDynamic("bounce")(bounce)
    if (bounceEasing != null) __obj.updateDynamic("bounceEasing")(bounceEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceLock)) __obj.updateDynamic("bounceLock")(bounceLock)
    if (bounceTime != null) __obj.updateDynamic("bounceTime")(bounceTime.asInstanceOf[js.Any])
    if (!js.isUndefined(checkDOMChanges)) __obj.updateDynamic("checkDOMChanges")(checkDOMChanges)
    if (!js.isUndefined(click)) __obj.updateDynamic("click")(click)
    if (directionLockThreshold != null) __obj.updateDynamic("directionLockThreshold")(directionLockThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMouse)) __obj.updateDynamic("disableMouse")(disableMouse)
    if (!js.isUndefined(disablePointer)) __obj.updateDynamic("disablePointer")(disablePointer)
    if (!js.isUndefined(disableTouch)) __obj.updateDynamic("disableTouch")(disableTouch)
    if (doubleTapZoom != null) __obj.updateDynamic("doubleTapZoom")(doubleTapZoom.asInstanceOf[js.Any])
    if (eventPassthrough != null) __obj.updateDynamic("eventPassthrough")(eventPassthrough.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeScrollbar)) __obj.updateDynamic("fadeScrollbar")(fadeScrollbar)
    if (!js.isUndefined(fadeScrollbars)) __obj.updateDynamic("fadeScrollbars")(fadeScrollbars)
    if (!js.isUndefined(fixedScrollbar)) __obj.updateDynamic("fixedScrollbar")(fixedScrollbar)
    if (!js.isUndefined(freeScroll)) __obj.updateDynamic("freeScroll")(freeScroll)
    if (!js.isUndefined(hScrollbar)) __obj.updateDynamic("hScrollbar")(hScrollbar)
    if (!js.isUndefined(handleClick)) __obj.updateDynamic("handleClick")(handleClick)
    if (!js.isUndefined(hideScrollbar)) __obj.updateDynamic("hideScrollbar")(hideScrollbar)
    if (!js.isUndefined(interactiveScrollbars)) __obj.updateDynamic("interactiveScrollbars")(interactiveScrollbars)
    if (!js.isUndefined(invertWheelDirection)) __obj.updateDynamic("invertWheelDirection")(invertWheelDirection)
    if (!js.isUndefined(lockDirection)) __obj.updateDynamic("lockDirection")(lockDirection)
    if (!js.isUndefined(momentum)) __obj.updateDynamic("momentum")(momentum)
    if (!js.isUndefined(mouseWheel)) __obj.updateDynamic("mouseWheel")(mouseWheel)
    if (mouseWheelSpeed != null) __obj.updateDynamic("mouseWheelSpeed")(mouseWheelSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault)
    if (preventDefaultException != null) __obj.updateDynamic("preventDefaultException")(preventDefaultException.asInstanceOf[js.Any])
    if (probeType != null) __obj.updateDynamic("probeType")(probeType.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseScroll)) __obj.updateDynamic("releaseScroll")(releaseScroll)
    if (!js.isUndefined(resizeIndicator)) __obj.updateDynamic("resizeIndicator")(resizeIndicator)
    if (resizePolling != null) __obj.updateDynamic("resizePolling")(resizePolling.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollX)) __obj.updateDynamic("scrollX")(scrollX)
    if (!js.isUndefined(scrollY)) __obj.updateDynamic("scrollY")(scrollY)
    if (scrollbarClass != null) __obj.updateDynamic("scrollbarClass")(scrollbarClass)
    if (scrollbars != null) __obj.updateDynamic("scrollbars")(scrollbars.asInstanceOf[js.Any])
    if (shrinkScrollbars != null) __obj.updateDynamic("shrinkScrollbars")(shrinkScrollbars)
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (snapThreshold != null) __obj.updateDynamic("snapThreshold")(snapThreshold.asInstanceOf[js.Any])
    if (startX != null) __obj.updateDynamic("startX")(startX.asInstanceOf[js.Any])
    if (startY != null) __obj.updateDynamic("startY")(startY.asInstanceOf[js.Any])
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap)
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransform)) __obj.updateDynamic("useTransform")(useTransform)
    if (!js.isUndefined(useTransition)) __obj.updateDynamic("useTransition")(useTransition)
    if (!js.isUndefined(vScrollbar)) __obj.updateDynamic("vScrollbar")(vScrollbar)
    if (wheelAction != null) __obj.updateDynamic("wheelAction")(wheelAction)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom)
    if (zoomMax != null) __obj.updateDynamic("zoomMax")(zoomMax.asInstanceOf[js.Any])
    if (zoomMin != null) __obj.updateDynamic("zoomMin")(zoomMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollOptions]
  }
}

