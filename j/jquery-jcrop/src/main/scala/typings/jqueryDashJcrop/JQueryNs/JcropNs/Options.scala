package typings.jqueryDashJcrop.JQueryNs.JcropNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var addClass: js.UndefOr[String] = js.undefined
  var allowMove: js.UndefOr[Boolean] = js.undefined
  var allowResize: js.UndefOr[Boolean] = js.undefined
  // Basic Settings
  var allowSelect: js.UndefOr[Boolean] = js.undefined
  var animationDelay: js.UndefOr[Double] = js.undefined
  /** Aspect ratio of w/h (e.g. 1 for square)  */
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var baseClass: js.UndefOr[String] = js.undefined
  /** Set color of background container @default 'black' */
  var bgColor: js.UndefOr[String] = js.undefined
  var bgFade: js.UndefOr[Boolean] = js.undefined
  /** Opacity of outer image when cropping; between 0 and 1 @default .6 */
  var bgOpacity: js.UndefOr[Double] = js.undefined
  var borderOpacity: js.UndefOr[Double] = js.undefined
  var boundary: js.UndefOr[Double] = js.undefined
  /** Maximum height of cropping area @default 0 (no limit) */
  var boxHeight: js.UndefOr[Double] = js.undefined
  /** Maximum width of cropping area @default 0 (no limit) */
  var boxWidth: js.UndefOr[Double] = js.undefined
  var createBorders: js.UndefOr[js.Array[CardinalDirection]] = js.undefined
  var createDragbars: js.UndefOr[js.Array[CardinalDirection]] = js.undefined
  var createHandles: js.UndefOr[js.Array[CardinalDirection | IntermediateDirection]] = js.undefined
  var dragEdges: js.UndefOr[Boolean] = js.undefined
  var drawBorders: js.UndefOr[Boolean] = js.undefined
  var fadeTime: js.UndefOr[Double] = js.undefined
  var fixedSupport: js.UndefOr[Boolean] = js.undefined
  var handleOpacity: js.UndefOr[Double] = js.undefined
  var handleSize: js.UndefOr[Double | Null] = js.undefined
  var keySupport: js.UndefOr[Boolean] = js.undefined
  /** Maximum width/height, use 0 for unbounded dimension; [width, height] */
  var maxSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var minSelect: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /** Minimum width/height, use 0 for unbounded dimension; [width, height] */
  var minSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /** Called when the selection is moving */
  var onChange: js.UndefOr[JCropEventHandler] = js.undefined
  /** Called when double-clicked */
  var onDblClick: js.UndefOr[JCropEventHandler] = js.undefined
  /** Called when the selection is released */
  var onRelease: js.UndefOr[JCropEventHandler] = js.undefined
  /** Called when selection is completed */
  var onSelect: js.UndefOr[JCropEventHandler] = js.undefined
  /** Set an initial selection area; [x, y, x2, y2] */
  var setSelect: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  var shade: js.UndefOr[Boolean | Null] = js.undefined
  var swingSpeed: js.UndefOr[Double] = js.undefined
  var touchSupport: js.UndefOr[Boolean | Null] = js.undefined
  var trackDocument: js.UndefOr[Boolean] = js.undefined
  /** Specify the true size of the image */
  var trueSize: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addClass: String = null,
    allowMove: js.UndefOr[Boolean] = js.undefined,
    allowResize: js.UndefOr[Boolean] = js.undefined,
    allowSelect: js.UndefOr[Boolean] = js.undefined,
    animationDelay: Int | Double = null,
    aspectRatio: Int | Double = null,
    baseClass: String = null,
    bgColor: String = null,
    bgFade: js.UndefOr[Boolean] = js.undefined,
    bgOpacity: Int | Double = null,
    borderOpacity: Int | Double = null,
    boundary: Int | Double = null,
    boxHeight: Int | Double = null,
    boxWidth: Int | Double = null,
    createBorders: js.Array[CardinalDirection] = null,
    createDragbars: js.Array[CardinalDirection] = null,
    createHandles: js.Array[CardinalDirection | IntermediateDirection] = null,
    dragEdges: js.UndefOr[Boolean] = js.undefined,
    drawBorders: js.UndefOr[Boolean] = js.undefined,
    fadeTime: Int | Double = null,
    fixedSupport: js.UndefOr[Boolean] = js.undefined,
    handleOpacity: Int | Double = null,
    handleSize: Int | Double = null,
    keySupport: js.UndefOr[Boolean] = js.undefined,
    maxSize: js.Tuple2[Double, Double] = null,
    minSelect: js.Tuple2[Double, Double] = null,
    minSize: js.Tuple2[Double, Double] = null,
    onChange: JCropEventHandler = null,
    onDblClick: JCropEventHandler = null,
    onRelease: JCropEventHandler = null,
    onSelect: JCropEventHandler = null,
    setSelect: js.Tuple4[Double, Double, Double, Double] = null,
    shade: js.UndefOr[Boolean] = js.undefined,
    swingSpeed: Int | Double = null,
    touchSupport: js.UndefOr[Boolean] = js.undefined,
    trackDocument: js.UndefOr[Boolean] = js.undefined,
    trueSize: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(addClass)
    if (!js.isUndefined(allowMove)) __obj.updateDynamic("allowMove")(allowMove)
    if (!js.isUndefined(allowResize)) __obj.updateDynamic("allowResize")(allowResize)
    if (!js.isUndefined(allowSelect)) __obj.updateDynamic("allowSelect")(allowSelect)
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (!js.isUndefined(bgFade)) __obj.updateDynamic("bgFade")(bgFade)
    if (bgOpacity != null) __obj.updateDynamic("bgOpacity")(bgOpacity.asInstanceOf[js.Any])
    if (borderOpacity != null) __obj.updateDynamic("borderOpacity")(borderOpacity.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (boxHeight != null) __obj.updateDynamic("boxHeight")(boxHeight.asInstanceOf[js.Any])
    if (boxWidth != null) __obj.updateDynamic("boxWidth")(boxWidth.asInstanceOf[js.Any])
    if (createBorders != null) __obj.updateDynamic("createBorders")(createBorders)
    if (createDragbars != null) __obj.updateDynamic("createDragbars")(createDragbars)
    if (createHandles != null) __obj.updateDynamic("createHandles")(createHandles)
    if (!js.isUndefined(dragEdges)) __obj.updateDynamic("dragEdges")(dragEdges)
    if (!js.isUndefined(drawBorders)) __obj.updateDynamic("drawBorders")(drawBorders)
    if (fadeTime != null) __obj.updateDynamic("fadeTime")(fadeTime.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedSupport)) __obj.updateDynamic("fixedSupport")(fixedSupport)
    if (handleOpacity != null) __obj.updateDynamic("handleOpacity")(handleOpacity.asInstanceOf[js.Any])
    if (handleSize != null) __obj.updateDynamic("handleSize")(handleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(keySupport)) __obj.updateDynamic("keySupport")(keySupport)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize)
    if (minSelect != null) __obj.updateDynamic("minSelect")(minSelect)
    if (minSize != null) __obj.updateDynamic("minSize")(minSize)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(onDblClick)
    if (onRelease != null) __obj.updateDynamic("onRelease")(onRelease)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (setSelect != null) __obj.updateDynamic("setSelect")(setSelect)
    if (!js.isUndefined(shade)) __obj.updateDynamic("shade")(shade)
    if (swingSpeed != null) __obj.updateDynamic("swingSpeed")(swingSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(touchSupport)) __obj.updateDynamic("touchSupport")(touchSupport)
    if (!js.isUndefined(trackDocument)) __obj.updateDynamic("trackDocument")(trackDocument)
    if (trueSize != null) __obj.updateDynamic("trueSize")(trueSize)
    __obj.asInstanceOf[Options]
  }
}

