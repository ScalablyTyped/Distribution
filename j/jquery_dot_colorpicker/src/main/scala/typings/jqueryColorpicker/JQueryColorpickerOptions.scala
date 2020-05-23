package typings.jqueryColorpicker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryColorpickerOptions extends js.Object {
  var alpha: js.UndefOr[Boolean] = js.undefined
  var altAlpha: js.UndefOr[Boolean] = js.undefined
  var altField: js.UndefOr[String] = js.undefined
  var altOnChange: js.UndefOr[Boolean] = js.undefined
  var altProperties: js.UndefOr[String] = js.undefined
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  var buttonClass: js.UndefOr[String] = js.undefined
  var buttonColorize: js.UndefOr[Boolean] = js.undefined
  var buttonImage: js.UndefOr[String] = js.undefined
  var buttonImageOnly: js.UndefOr[Boolean] = js.undefined
  var buttonText: js.UndefOr[String] = js.undefined
  // Events
  // TODO: Figure out actual types.
  var cancel: js.UndefOr[js.Function] = js.undefined
  var close: js.UndefOr[js.Function] = js.undefined
  var closeOnEscape: js.UndefOr[Boolean] = js.undefined
  var closeOnOutside: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var colorFormat: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var hsv: js.UndefOr[Boolean] = js.undefined
  var init: js.UndefOr[js.Function] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var inlineFrame: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[StringDictionary[js.Array[Double]]] = js.undefined
  var limit: js.UndefOr[String] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var ok: js.UndefOr[js.Function] = js.undefined
  var okOnEnter: js.UndefOr[Boolean] = js.undefined
  var open: js.UndefOr[js.Function] = js.undefined
  var part: js.UndefOr[js.Any] = js.undefined
  var parts: js.UndefOr[js.Any] = js.undefined
  var regional: js.UndefOr[String] = js.undefined
  var revert: js.UndefOr[Boolean] = js.undefined
  var rgb: js.UndefOr[Boolean] = js.undefined
  var select: js.UndefOr[js.Function] = js.undefined
  var showAnim: js.UndefOr[String] = js.undefined
  var showCancelButton: js.UndefOr[Boolean] = js.undefined
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var showNoneButton: js.UndefOr[Boolean] = js.undefined
  var showOn: js.UndefOr[String] = js.undefined
  var showOptions: js.UndefOr[js.Any] = js.undefined
  var swatches: js.UndefOr[js.Any] = js.undefined
  var swatchesWidth: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object JQueryColorpickerOptions {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Boolean] = js.undefined,
    altAlpha: js.UndefOr[Boolean] = js.undefined,
    altField: String = null,
    altOnChange: js.UndefOr[Boolean] = js.undefined,
    altProperties: String = null,
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    buttonClass: String = null,
    buttonColorize: js.UndefOr[Boolean] = js.undefined,
    buttonImage: String = null,
    buttonImageOnly: js.UndefOr[Boolean] = js.undefined,
    buttonText: String = null,
    cancel: js.Function = null,
    close: js.Function = null,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    closeOnOutside: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    colorFormat: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    duration: String = null,
    format: String = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    hsv: js.UndefOr[Boolean] = js.undefined,
    init: js.Function = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inlineFrame: js.UndefOr[Boolean] = js.undefined,
    layout: StringDictionary[js.Array[Double]] = null,
    limit: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    ok: js.Function = null,
    okOnEnter: js.UndefOr[Boolean] = js.undefined,
    open: js.Function = null,
    part: js.Any = null,
    parts: js.Any = null,
    regional: String = null,
    revert: js.UndefOr[Boolean] = js.undefined,
    rgb: js.UndefOr[Boolean] = js.undefined,
    select: js.Function = null,
    showAnim: String = null,
    showCancelButton: js.UndefOr[Boolean] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showNoneButton: js.UndefOr[Boolean] = js.undefined,
    showOn: String = null,
    showOptions: js.Any = null,
    swatches: js.Any = null,
    swatchesWidth: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): JQueryColorpickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altAlpha)) __obj.updateDynamic("altAlpha")(altAlpha.get.asInstanceOf[js.Any])
    if (altField != null) __obj.updateDynamic("altField")(altField.asInstanceOf[js.Any])
    if (!js.isUndefined(altOnChange)) __obj.updateDynamic("altOnChange")(altOnChange.get.asInstanceOf[js.Any])
    if (altProperties != null) __obj.updateDynamic("altProperties")(altProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.get.asInstanceOf[js.Any])
    if (buttonClass != null) __obj.updateDynamic("buttonClass")(buttonClass.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonColorize)) __obj.updateDynamic("buttonColorize")(buttonColorize.get.asInstanceOf[js.Any])
    if (buttonImage != null) __obj.updateDynamic("buttonImage")(buttonImage.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonImageOnly)) __obj.updateDynamic("buttonImageOnly")(buttonImageOnly.get.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnOutside)) __obj.updateDynamic("closeOnOutside")(closeOnOutside.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorFormat != null) __obj.updateDynamic("colorFormat")(colorFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hsv)) __obj.updateDynamic("hsv")(hsv.get.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineFrame)) __obj.updateDynamic("inlineFrame")(inlineFrame.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    if (!js.isUndefined(okOnEnter)) __obj.updateDynamic("okOnEnter")(okOnEnter.get.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(revert)) __obj.updateDynamic("revert")(revert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rgb)) __obj.updateDynamic("rgb")(rgb.get.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (showAnim != null) __obj.updateDynamic("showAnim")(showAnim.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNoneButton)) __obj.updateDynamic("showNoneButton")(showNoneButton.get.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (showOptions != null) __obj.updateDynamic("showOptions")(showOptions.asInstanceOf[js.Any])
    if (swatches != null) __obj.updateDynamic("swatches")(swatches.asInstanceOf[js.Any])
    if (!js.isUndefined(swatchesWidth)) __obj.updateDynamic("swatchesWidth")(swatchesWidth.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryColorpickerOptions]
  }
}

