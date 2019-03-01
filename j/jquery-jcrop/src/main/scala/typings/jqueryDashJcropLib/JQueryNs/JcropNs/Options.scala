package typings
package jqueryDashJcropLib.JQueryNs.JcropNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var addClass: js.UndefOr[java.lang.String] = js.undefined
  var allowMove: js.UndefOr[scala.Boolean] = js.undefined
  var allowResize: js.UndefOr[scala.Boolean] = js.undefined
  // Basic Settings
  var allowSelect: js.UndefOr[scala.Boolean] = js.undefined
  var animationDelay: js.UndefOr[scala.Double] = js.undefined
  /** Aspect ratio of w/h (e.g. 1 for square)  */
  var aspectRatio: js.UndefOr[scala.Double] = js.undefined
  var baseClass: js.UndefOr[java.lang.String] = js.undefined
  /** Set color of background container @default 'black' */
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  var bgFade: js.UndefOr[scala.Boolean] = js.undefined
  /** Opacity of outer image when cropping; between 0 and 1 @default .6 */
  var bgOpacity: js.UndefOr[scala.Double] = js.undefined
  var borderOpacity: js.UndefOr[scala.Double] = js.undefined
  var boundary: js.UndefOr[scala.Double] = js.undefined
  /** Maximum height of cropping area @default 0 (no limit) */
  var boxHeight: js.UndefOr[scala.Double] = js.undefined
  /** Maximum width of cropping area @default 0 (no limit) */
  var boxWidth: js.UndefOr[scala.Double] = js.undefined
  var createBorders: js.UndefOr[js.Array[CardinalDirection]] = js.undefined
  var createDragbars: js.UndefOr[js.Array[CardinalDirection]] = js.undefined
  var createHandles: js.UndefOr[js.Array[CardinalDirection | IntermediateDirection]] = js.undefined
  var dragEdges: js.UndefOr[scala.Boolean] = js.undefined
  var drawBorders: js.UndefOr[scala.Boolean] = js.undefined
  var fadeTime: js.UndefOr[scala.Double] = js.undefined
  var fixedSupport: js.UndefOr[scala.Boolean] = js.undefined
  var handleOpacity: js.UndefOr[scala.Double] = js.undefined
  var handleSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var keySupport: js.UndefOr[scala.Boolean] = js.undefined
  /** Maximum width/height, use 0 for unbounded dimension; [width, height] */
  var maxSize: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var minSelect: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /** Minimum width/height, use 0 for unbounded dimension; [width, height] */
  var minSize: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  /** Called when the selection is moving */
  var onChange: js.UndefOr[JCropEventHandler] = js.undefined
  /** Called when double-clicked */
  var onDblClick: js.UndefOr[JCropEventHandler] = js.undefined
  /** Called when the selection is released */
  var onRelease: js.UndefOr[JCropEventHandler] = js.undefined
  /** Called when selection is completed */
  var onSelect: js.UndefOr[JCropEventHandler] = js.undefined
  /** Set an initial selection area; [x, y, x2, y2] */
  var setSelect: js.UndefOr[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]] = js.undefined
  var shade: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var swingSpeed: js.UndefOr[scala.Double] = js.undefined
  var touchSupport: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var trackDocument: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the true size of the image */
  var trueSize: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addClass: java.lang.String = null,
    allowMove: js.UndefOr[scala.Boolean] = js.undefined,
    allowResize: js.UndefOr[scala.Boolean] = js.undefined,
    allowSelect: js.UndefOr[scala.Boolean] = js.undefined,
    animationDelay: scala.Int | scala.Double = null,
    aspectRatio: scala.Int | scala.Double = null,
    baseClass: java.lang.String = null,
    bgColor: java.lang.String = null,
    bgFade: js.UndefOr[scala.Boolean] = js.undefined,
    bgOpacity: scala.Int | scala.Double = null,
    borderOpacity: scala.Int | scala.Double = null,
    boundary: scala.Int | scala.Double = null,
    boxHeight: scala.Int | scala.Double = null,
    boxWidth: scala.Int | scala.Double = null,
    createBorders: js.Array[CardinalDirection] = null,
    createDragbars: js.Array[CardinalDirection] = null,
    createHandles: js.Array[CardinalDirection | IntermediateDirection] = null,
    dragEdges: js.UndefOr[scala.Boolean] = js.undefined,
    drawBorders: js.UndefOr[scala.Boolean] = js.undefined,
    fadeTime: scala.Int | scala.Double = null,
    fixedSupport: js.UndefOr[scala.Boolean] = js.undefined,
    handleOpacity: scala.Int | scala.Double = null,
    handleSize: scala.Int | scala.Double = null,
    keySupport: js.UndefOr[scala.Boolean] = js.undefined,
    maxSize: js.Tuple2[scala.Double, scala.Double] = null,
    minSelect: js.Tuple2[scala.Double, scala.Double] = null,
    minSize: js.Tuple2[scala.Double, scala.Double] = null,
    onChange: JCropEventHandler = null,
    onDblClick: JCropEventHandler = null,
    onRelease: JCropEventHandler = null,
    onSelect: JCropEventHandler = null,
    setSelect: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double] = null,
    shade: js.UndefOr[scala.Boolean] = js.undefined,
    swingSpeed: scala.Int | scala.Double = null,
    touchSupport: js.UndefOr[scala.Boolean] = js.undefined,
    trackDocument: js.UndefOr[scala.Boolean] = js.undefined,
    trueSize: js.Tuple2[scala.Double, scala.Double] = null
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

