package typings
package jqueryDotColorpickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryColorpickerOptions extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  var altAlpha: js.UndefOr[scala.Boolean] = js.undefined
  var altField: js.UndefOr[java.lang.String] = js.undefined
  var altOnChange: js.UndefOr[scala.Boolean] = js.undefined
  var altProperties: js.UndefOr[java.lang.String] = js.undefined
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  var buttonClass: js.UndefOr[java.lang.String] = js.undefined
  var buttonColorize: js.UndefOr[scala.Boolean] = js.undefined
  var buttonImage: js.UndefOr[java.lang.String] = js.undefined
  var buttonImageOnly: js.UndefOr[scala.Boolean] = js.undefined
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  // Events
  // TODO: Figure out actual types.
  var cancel: js.UndefOr[js.Function] = js.undefined
  var close: js.UndefOr[js.Function] = js.undefined
  var closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnOutside: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var colorFormat: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  var hsv: js.UndefOr[scala.Boolean] = js.undefined
  var init: js.UndefOr[js.Function] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var inlineFrame: js.UndefOr[scala.Boolean] = js.undefined
  var layout: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]] = js.undefined
  var limit: js.UndefOr[java.lang.String] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var ok: js.UndefOr[js.Function] = js.undefined
  var okOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  var open: js.UndefOr[js.Function] = js.undefined
  var part: js.UndefOr[js.Any] = js.undefined
  var parts: js.UndefOr[js.Any] = js.undefined
  var regional: js.UndefOr[java.lang.String] = js.undefined
  var revert: js.UndefOr[scala.Boolean] = js.undefined
  var rgb: js.UndefOr[scala.Boolean] = js.undefined
  var select: js.UndefOr[js.Function] = js.undefined
  var showAnim: js.UndefOr[java.lang.String] = js.undefined
  var showCancelButton: js.UndefOr[scala.Boolean] = js.undefined
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  var showNoneButton: js.UndefOr[scala.Boolean] = js.undefined
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  var showOptions: js.UndefOr[js.Any] = js.undefined
  var swatches: js.UndefOr[js.Any] = js.undefined
  var swatchesWidth: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object JQueryColorpickerOptions {
  @scala.inline
  def apply(
    alpha: js.UndefOr[scala.Boolean] = js.undefined,
    altAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    altField: java.lang.String = null,
    altOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    altProperties: java.lang.String = null,
    autoOpen: js.UndefOr[scala.Boolean] = js.undefined,
    buttonClass: java.lang.String = null,
    buttonColorize: js.UndefOr[scala.Boolean] = js.undefined,
    buttonImage: java.lang.String = null,
    buttonImageOnly: js.UndefOr[scala.Boolean] = js.undefined,
    buttonText: java.lang.String = null,
    cancel: js.Function = null,
    close: js.Function = null,
    closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnOutside: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    colorFormat: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    duration: java.lang.String = null,
    format: java.lang.String = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    hsv: js.UndefOr[scala.Boolean] = js.undefined,
    init: js.Function = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    inlineFrame: js.UndefOr[scala.Boolean] = js.undefined,
    layout: org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]] = null,
    limit: java.lang.String = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    mode: java.lang.String = null,
    ok: js.Function = null,
    okOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    open: js.Function = null,
    part: js.Any = null,
    parts: js.Any = null,
    regional: java.lang.String = null,
    revert: js.UndefOr[scala.Boolean] = js.undefined,
    rgb: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.Function = null,
    showAnim: java.lang.String = null,
    showCancelButton: js.UndefOr[scala.Boolean] = js.undefined,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    showNoneButton: js.UndefOr[scala.Boolean] = js.undefined,
    showOn: java.lang.String = null,
    showOptions: js.Any = null,
    swatches: js.Any = null,
    swatchesWidth: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): JQueryColorpickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha)
    if (!js.isUndefined(altAlpha)) __obj.updateDynamic("altAlpha")(altAlpha)
    if (altField != null) __obj.updateDynamic("altField")(altField)
    if (!js.isUndefined(altOnChange)) __obj.updateDynamic("altOnChange")(altOnChange)
    if (altProperties != null) __obj.updateDynamic("altProperties")(altProperties)
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    if (buttonClass != null) __obj.updateDynamic("buttonClass")(buttonClass)
    if (!js.isUndefined(buttonColorize)) __obj.updateDynamic("buttonColorize")(buttonColorize)
    if (buttonImage != null) __obj.updateDynamic("buttonImage")(buttonImage)
    if (!js.isUndefined(buttonImageOnly)) __obj.updateDynamic("buttonImageOnly")(buttonImageOnly)
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (close != null) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (!js.isUndefined(closeOnOutside)) __obj.updateDynamic("closeOnOutside")(closeOnOutside)
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorFormat != null) __obj.updateDynamic("colorFormat")(colorFormat)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(hsv)) __obj.updateDynamic("hsv")(hsv)
    if (init != null) __obj.updateDynamic("init")(init)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(inlineFrame)) __obj.updateDynamic("inlineFrame")(inlineFrame)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (ok != null) __obj.updateDynamic("ok")(ok)
    if (!js.isUndefined(okOnEnter)) __obj.updateDynamic("okOnEnter")(okOnEnter)
    if (open != null) __obj.updateDynamic("open")(open)
    if (part != null) __obj.updateDynamic("part")(part)
    if (parts != null) __obj.updateDynamic("parts")(parts)
    if (regional != null) __obj.updateDynamic("regional")(regional)
    if (!js.isUndefined(revert)) __obj.updateDynamic("revert")(revert)
    if (!js.isUndefined(rgb)) __obj.updateDynamic("rgb")(rgb)
    if (select != null) __obj.updateDynamic("select")(select)
    if (showAnim != null) __obj.updateDynamic("showAnim")(showAnim)
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(showNoneButton)) __obj.updateDynamic("showNoneButton")(showNoneButton)
    if (showOn != null) __obj.updateDynamic("showOn")(showOn)
    if (showOptions != null) __obj.updateDynamic("showOptions")(showOptions)
    if (swatches != null) __obj.updateDynamic("swatches")(swatches)
    if (swatchesWidth != null) __obj.updateDynamic("swatchesWidth")(swatchesWidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[JQueryColorpickerOptions]
  }
}

