package typings.iscroll

import typings.iscroll.anon.Fn
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollOptions extends js.Object {
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
    bounceEasing: String | Fn = null,
    bounceLock: js.UndefOr[Boolean] = js.undefined,
    bounceTime: js.UndefOr[Double] = js.undefined,
    checkDOMChanges: js.UndefOr[Boolean] = js.undefined,
    click: js.UndefOr[Boolean] = js.undefined,
    directionLockThreshold: js.UndefOr[Double] = js.undefined,
    disableMouse: js.UndefOr[Boolean] = js.undefined,
    disablePointer: js.UndefOr[Boolean] = js.undefined,
    disableTouch: js.UndefOr[Boolean] = js.undefined,
    doubleTapZoom: js.UndefOr[Double] = js.undefined,
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
    mouseWheelSpeed: js.UndefOr[Double] = js.undefined,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    preventDefaultException: js.Array[RegExp] | js.Object = null,
    probeType: js.UndefOr[Double] = js.undefined,
    releaseScroll: js.UndefOr[Boolean] = js.undefined,
    resizeIndicator: js.UndefOr[Boolean] = js.undefined,
    resizePolling: js.UndefOr[Double] = js.undefined,
    scrollX: js.UndefOr[Boolean] = js.undefined,
    scrollY: js.UndefOr[Boolean] = js.undefined,
    scrollbarClass: String = null,
    scrollbars: Boolean | String = null,
    shrinkScrollbars: String = null,
    snap: String | Boolean = null,
    snapThreshold: js.UndefOr[Double] = js.undefined,
    startX: js.UndefOr[Double] = js.undefined,
    startY: js.UndefOr[Double] = js.undefined,
    tap: js.UndefOr[Boolean] = js.undefined,
    topOffset: js.UndefOr[Double] = js.undefined,
    useTransform: js.UndefOr[Boolean] = js.undefined,
    useTransition: js.UndefOr[Boolean] = js.undefined,
    vScrollbar: js.UndefOr[Boolean] = js.undefined,
    wheelAction: String = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Boolean] = js.undefined,
    zoomMax: js.UndefOr[Double] = js.undefined,
    zoomMin: js.UndefOr[Double] = js.undefined
  ): IScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(HWCompositing)) __obj.updateDynamic("HWCompositing")(HWCompositing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounce)) __obj.updateDynamic("bounce")(bounce.get.asInstanceOf[js.Any])
    if (bounceEasing != null) __obj.updateDynamic("bounceEasing")(bounceEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceLock)) __obj.updateDynamic("bounceLock")(bounceLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceTime)) __obj.updateDynamic("bounceTime")(bounceTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkDOMChanges)) __obj.updateDynamic("checkDOMChanges")(checkDOMChanges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(click)) __obj.updateDynamic("click")(click.get.asInstanceOf[js.Any])
    if (!js.isUndefined(directionLockThreshold)) __obj.updateDynamic("directionLockThreshold")(directionLockThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMouse)) __obj.updateDynamic("disableMouse")(disableMouse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePointer)) __obj.updateDynamic("disablePointer")(disablePointer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouch)) __obj.updateDynamic("disableTouch")(disableTouch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleTapZoom)) __obj.updateDynamic("doubleTapZoom")(doubleTapZoom.get.asInstanceOf[js.Any])
    if (eventPassthrough != null) __obj.updateDynamic("eventPassthrough")(eventPassthrough.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeScrollbar)) __obj.updateDynamic("fadeScrollbar")(fadeScrollbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeScrollbars)) __obj.updateDynamic("fadeScrollbars")(fadeScrollbars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedScrollbar)) __obj.updateDynamic("fixedScrollbar")(fixedScrollbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(freeScroll)) __obj.updateDynamic("freeScroll")(freeScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hScrollbar)) __obj.updateDynamic("hScrollbar")(hScrollbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleClick)) __obj.updateDynamic("handleClick")(handleClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideScrollbar)) __obj.updateDynamic("hideScrollbar")(hideScrollbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interactiveScrollbars)) __obj.updateDynamic("interactiveScrollbars")(interactiveScrollbars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invertWheelDirection)) __obj.updateDynamic("invertWheelDirection")(invertWheelDirection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockDirection)) __obj.updateDynamic("lockDirection")(lockDirection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(momentum)) __obj.updateDynamic("momentum")(momentum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheel)) __obj.updateDynamic("mouseWheel")(mouseWheel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelSpeed)) __obj.updateDynamic("mouseWheelSpeed")(mouseWheelSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.get.asInstanceOf[js.Any])
    if (preventDefaultException != null) __obj.updateDynamic("preventDefaultException")(preventDefaultException.asInstanceOf[js.Any])
    if (!js.isUndefined(probeType)) __obj.updateDynamic("probeType")(probeType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(releaseScroll)) __obj.updateDynamic("releaseScroll")(releaseScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeIndicator)) __obj.updateDynamic("resizeIndicator")(resizeIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizePolling)) __obj.updateDynamic("resizePolling")(resizePolling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollX)) __obj.updateDynamic("scrollX")(scrollX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollY)) __obj.updateDynamic("scrollY")(scrollY.get.asInstanceOf[js.Any])
    if (scrollbarClass != null) __obj.updateDynamic("scrollbarClass")(scrollbarClass.asInstanceOf[js.Any])
    if (scrollbars != null) __obj.updateDynamic("scrollbars")(scrollbars.asInstanceOf[js.Any])
    if (shrinkScrollbars != null) __obj.updateDynamic("shrinkScrollbars")(shrinkScrollbars.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (!js.isUndefined(snapThreshold)) __obj.updateDynamic("snapThreshold")(snapThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startX)) __obj.updateDynamic("startX")(startX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startY)) __obj.updateDynamic("startY")(startY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffset)) __obj.updateDynamic("topOffset")(topOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransform)) __obj.updateDynamic("useTransform")(useTransform.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransition)) __obj.updateDynamic("useTransition")(useTransition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vScrollbar)) __obj.updateDynamic("vScrollbar")(vScrollbar.get.asInstanceOf[js.Any])
    if (wheelAction != null) __obj.updateDynamic("wheelAction")(wheelAction.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomMax)) __obj.updateDynamic("zoomMax")(zoomMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomMin)) __obj.updateDynamic("zoomMin")(zoomMin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollOptions]
  }
}

