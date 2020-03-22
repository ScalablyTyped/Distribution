package typings.jqueryCropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropperOptions extends js.Object {
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var autoCrop: js.UndefOr[Boolean] = js.undefined
  var autoCropArea: js.UndefOr[Double] = js.undefined
  var background: js.UndefOr[Boolean] = js.undefined
  var center: js.UndefOr[Boolean] = js.undefined
  var checkCrossOrigin: js.UndefOr[Boolean] = js.undefined
  var checkOrientation: js.UndefOr[String] = js.undefined
  var crop: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  var cropBoxMovable: js.UndefOr[Double] = js.undefined
  var cropBoxResizable: js.UndefOr[Double] = js.undefined
  var cropend: js.UndefOr[js.Function0[_]] = js.undefined
  var cropmove: js.UndefOr[js.Function0[_]] = js.undefined
  var cropstart: js.UndefOr[js.Function0[_]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dragMode: js.UndefOr[String] = js.undefined
  var guides: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var initialAspectRatio: js.UndefOr[Double] = js.undefined
  var minCanvasHeight: js.UndefOr[Double] = js.undefined
  var minCanvasWidth: js.UndefOr[Double] = js.undefined
  var minContainerHeight: js.UndefOr[Double] = js.undefined
  var minContainerWidth: js.UndefOr[Double] = js.undefined
  var minCropBoxHeight: js.UndefOr[Double] = js.undefined
  var minCropBoxWidth: js.UndefOr[Double] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var movable: js.UndefOr[Boolean] = js.undefined
  var preview: js.UndefOr[js.Any] = js.undefined
  var ready: js.UndefOr[js.Function0[_]] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var restore: js.UndefOr[Boolean] = js.undefined
  var rotatable: js.UndefOr[Boolean] = js.undefined
  var scalable: js.UndefOr[Boolean] = js.undefined
  var toggleDragModeOnDblclick: js.UndefOr[Double] = js.undefined
  var viewMode: js.UndefOr[Double] = js.undefined
  var wheelZoomRatio: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[js.Function0[_]] = js.undefined
  var zoomOnTouch: js.UndefOr[Boolean] = js.undefined
  var zoomOnWheel: js.UndefOr[Boolean] = js.undefined
  var zoomable: js.UndefOr[Boolean] = js.undefined
}

object CropperOptions {
  @scala.inline
  def apply(
    aspectRatio: Int | Double = null,
    autoCrop: js.UndefOr[Boolean] = js.undefined,
    autoCropArea: Int | Double = null,
    background: js.UndefOr[Boolean] = js.undefined,
    center: js.UndefOr[Boolean] = js.undefined,
    checkCrossOrigin: js.UndefOr[Boolean] = js.undefined,
    checkOrientation: String = null,
    crop: /* data */ js.UndefOr[js.Any] => Unit = null,
    cropBoxMovable: Int | Double = null,
    cropBoxResizable: Int | Double = null,
    cropend: () => _ = null,
    cropmove: () => _ = null,
    cropstart: () => _ = null,
    data: js.Any = null,
    dragMode: String = null,
    guides: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    initialAspectRatio: Int | Double = null,
    minCanvasHeight: Int | Double = null,
    minCanvasWidth: Int | Double = null,
    minContainerHeight: Int | Double = null,
    minContainerWidth: Int | Double = null,
    minCropBoxHeight: Int | Double = null,
    minCropBoxWidth: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    movable: js.UndefOr[Boolean] = js.undefined,
    preview: js.Any = null,
    ready: () => _ = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    restore: js.UndefOr[Boolean] = js.undefined,
    rotatable: js.UndefOr[Boolean] = js.undefined,
    scalable: js.UndefOr[Boolean] = js.undefined,
    toggleDragModeOnDblclick: Int | Double = null,
    viewMode: Int | Double = null,
    wheelZoomRatio: Int | Double = null,
    zoom: () => _ = null,
    zoomOnTouch: js.UndefOr[Boolean] = js.undefined,
    zoomOnWheel: js.UndefOr[Boolean] = js.undefined,
    zoomable: js.UndefOr[Boolean] = js.undefined
  ): CropperOptions = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCrop)) __obj.updateDynamic("autoCrop")(autoCrop.asInstanceOf[js.Any])
    if (autoCropArea != null) __obj.updateDynamic("autoCropArea")(autoCropArea.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(checkCrossOrigin)) __obj.updateDynamic("checkCrossOrigin")(checkCrossOrigin.asInstanceOf[js.Any])
    if (checkOrientation != null) __obj.updateDynamic("checkOrientation")(checkOrientation.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(js.Any.fromFunction1(crop))
    if (cropBoxMovable != null) __obj.updateDynamic("cropBoxMovable")(cropBoxMovable.asInstanceOf[js.Any])
    if (cropBoxResizable != null) __obj.updateDynamic("cropBoxResizable")(cropBoxResizable.asInstanceOf[js.Any])
    if (cropend != null) __obj.updateDynamic("cropend")(js.Any.fromFunction0(cropend))
    if (cropmove != null) __obj.updateDynamic("cropmove")(js.Any.fromFunction0(cropmove))
    if (cropstart != null) __obj.updateDynamic("cropstart")(js.Any.fromFunction0(cropstart))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dragMode != null) __obj.updateDynamic("dragMode")(dragMode.asInstanceOf[js.Any])
    if (!js.isUndefined(guides)) __obj.updateDynamic("guides")(guides.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (initialAspectRatio != null) __obj.updateDynamic("initialAspectRatio")(initialAspectRatio.asInstanceOf[js.Any])
    if (minCanvasHeight != null) __obj.updateDynamic("minCanvasHeight")(minCanvasHeight.asInstanceOf[js.Any])
    if (minCanvasWidth != null) __obj.updateDynamic("minCanvasWidth")(minCanvasWidth.asInstanceOf[js.Any])
    if (minContainerHeight != null) __obj.updateDynamic("minContainerHeight")(minContainerHeight.asInstanceOf[js.Any])
    if (minContainerWidth != null) __obj.updateDynamic("minContainerWidth")(minContainerWidth.asInstanceOf[js.Any])
    if (minCropBoxHeight != null) __obj.updateDynamic("minCropBoxHeight")(minCropBoxHeight.asInstanceOf[js.Any])
    if (minCropBoxWidth != null) __obj.updateDynamic("minCropBoxWidth")(minCropBoxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(restore)) __obj.updateDynamic("restore")(restore.asInstanceOf[js.Any])
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable.asInstanceOf[js.Any])
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable.asInstanceOf[js.Any])
    if (toggleDragModeOnDblclick != null) __obj.updateDynamic("toggleDragModeOnDblclick")(toggleDragModeOnDblclick.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    if (wheelZoomRatio != null) __obj.updateDynamic("wheelZoomRatio")(wheelZoomRatio.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction0(zoom))
    if (!js.isUndefined(zoomOnTouch)) __obj.updateDynamic("zoomOnTouch")(zoomOnTouch.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomOnWheel)) __obj.updateDynamic("zoomOnWheel")(zoomOnWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropperOptions]
  }
}

