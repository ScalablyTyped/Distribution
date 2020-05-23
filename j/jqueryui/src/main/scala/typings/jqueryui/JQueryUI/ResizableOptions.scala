package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Resizable //////////////////////////////////////////////////
trait ResizableOptions extends ResizableEvents {
  var alsoResize: js.UndefOr[js.Any] = js.undefined
   // Selector, JQuery or Element
  var animate: js.UndefOr[Boolean] = js.undefined
  var animateDuration: js.UndefOr[js.Any] = js.undefined
   // number or string
  var animateEasing: js.UndefOr[String] = js.undefined
  var aspectRatio: js.UndefOr[js.Any] = js.undefined
   // boolean or number
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var containment: js.UndefOr[js.Any] = js.undefined
   // Selector, Element or string
  var delay: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var ghost: js.UndefOr[Boolean] = js.undefined
  var grid: js.UndefOr[js.Any] = js.undefined
  var handles: js.UndefOr[js.Any] = js.undefined
   // string or object
  var helper: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
}

object ResizableOptions {
  @scala.inline
  def apply(
    alsoResize: js.Any = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    animateDuration: js.Any = null,
    animateEasing: String = null,
    aspectRatio: js.Any = null,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    cancel: String = null,
    containment: js.Any = null,
    create: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Unit = null,
    delay: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    distance: js.UndefOr[Double] = js.undefined,
    ghost: js.UndefOr[Boolean] = js.undefined,
    grid: js.Any = null,
    handles: js.Any = null,
    helper: String = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    resize: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Unit = null,
    stop: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Unit = null
  ): ResizableOptions = {
    val __obj = js.Dynamic.literal()
    if (alsoResize != null) __obj.updateDynamic("alsoResize")(alsoResize.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (animateDuration != null) __obj.updateDynamic("animateDuration")(animateDuration.asInstanceOf[js.Any])
    if (animateEasing != null) __obj.updateDynamic("animateEasing")(animateEasing.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.get.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost.get.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (helper != null) __obj.updateDynamic("helper")(helper.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction2(resize))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    __obj.asInstanceOf[ResizableOptions]
  }
}

