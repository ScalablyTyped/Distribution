package typings.maskedinput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryMaskedInputOptions extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var autoUnmask: js.UndefOr[Boolean] = js.undefined
  var clearIncomplete: js.UndefOr[Boolean] = js.undefined
  var clearMaskOnLostFocus: js.UndefOr[Boolean] = js.undefined
  var greedy: js.UndefOr[Boolean] = js.undefined
  var isComplete: js.UndefOr[js.Function2[/* buffer */ js.Any, /* options */ js.Any, js.Object]] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var numeric: js.UndefOr[Boolean] = js.undefined
  var onBeforeMask: js.UndefOr[js.Function1[/* initialValue */ js.Any, Unit]] = js.undefined
  var onBeforePaste: js.UndefOr[js.Function1[/* pastedValue */ js.Any, Unit]] = js.undefined
  var onKeyValidation: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
  var onUnMask: js.UndefOr[js.Function2[/* maskedValue */ js.Any, /* unmaskedValue */ js.Any, Unit]] = js.undefined
  var oncleared: js.UndefOr[js.Function0[Unit]] = js.undefined
  var oncomplete: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onincomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var radixPoint: js.UndefOr[String] = js.undefined
  var repeat: js.UndefOr[Double] = js.undefined
  var rightAlignNumerics: js.UndefOr[Boolean] = js.undefined
  var showMaskOnFocus: js.UndefOr[Boolean] = js.undefined
  var showMaskOnHover: js.UndefOr[Boolean] = js.undefined
  var showToolTip: js.UndefOr[Boolean] = js.undefined
  var skipOptionalPartCharacter: js.UndefOr[String] = js.undefined
}

object JQueryMaskedInputOptions {
  @scala.inline
  def apply(
    alias: String = null,
    autoUnmask: js.UndefOr[Boolean] = js.undefined,
    clearIncomplete: js.UndefOr[Boolean] = js.undefined,
    clearMaskOnLostFocus: js.UndefOr[Boolean] = js.undefined,
    greedy: js.UndefOr[Boolean] = js.undefined,
    isComplete: (/* buffer */ js.Any, /* options */ js.Any) => js.Object = null,
    mask: String = null,
    numeric: js.UndefOr[Boolean] = js.undefined,
    onBeforeMask: /* initialValue */ js.Any => Unit = null,
    onBeforePaste: /* pastedValue */ js.Any => Unit = null,
    onKeyValidation: /* result */ js.Any => Unit = null,
    onUnMask: (/* maskedValue */ js.Any, /* unmaskedValue */ js.Any) => Unit = null,
    oncleared: () => Unit = null,
    oncomplete: /* value */ js.UndefOr[js.Any] => Unit = null,
    onincomplete: () => Unit = null,
    placeholder: String = null,
    radixPoint: String = null,
    repeat: Int | Double = null,
    rightAlignNumerics: js.UndefOr[Boolean] = js.undefined,
    showMaskOnFocus: js.UndefOr[Boolean] = js.undefined,
    showMaskOnHover: js.UndefOr[Boolean] = js.undefined,
    showToolTip: js.UndefOr[Boolean] = js.undefined,
    skipOptionalPartCharacter: String = null
  ): JQueryMaskedInputOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(autoUnmask)) __obj.updateDynamic("autoUnmask")(autoUnmask)
    if (!js.isUndefined(clearIncomplete)) __obj.updateDynamic("clearIncomplete")(clearIncomplete)
    if (!js.isUndefined(clearMaskOnLostFocus)) __obj.updateDynamic("clearMaskOnLostFocus")(clearMaskOnLostFocus)
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy)
    if (isComplete != null) __obj.updateDynamic("isComplete")(js.Any.fromFunction2(isComplete))
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (onBeforeMask != null) __obj.updateDynamic("onBeforeMask")(js.Any.fromFunction1(onBeforeMask))
    if (onBeforePaste != null) __obj.updateDynamic("onBeforePaste")(js.Any.fromFunction1(onBeforePaste))
    if (onKeyValidation != null) __obj.updateDynamic("onKeyValidation")(js.Any.fromFunction1(onKeyValidation))
    if (onUnMask != null) __obj.updateDynamic("onUnMask")(js.Any.fromFunction2(onUnMask))
    if (oncleared != null) __obj.updateDynamic("oncleared")(js.Any.fromFunction0(oncleared))
    if (oncomplete != null) __obj.updateDynamic("oncomplete")(js.Any.fromFunction1(oncomplete))
    if (onincomplete != null) __obj.updateDynamic("onincomplete")(js.Any.fromFunction0(onincomplete))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (radixPoint != null) __obj.updateDynamic("radixPoint")(radixPoint)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (!js.isUndefined(rightAlignNumerics)) __obj.updateDynamic("rightAlignNumerics")(rightAlignNumerics)
    if (!js.isUndefined(showMaskOnFocus)) __obj.updateDynamic("showMaskOnFocus")(showMaskOnFocus)
    if (!js.isUndefined(showMaskOnHover)) __obj.updateDynamic("showMaskOnHover")(showMaskOnHover)
    if (!js.isUndefined(showToolTip)) __obj.updateDynamic("showToolTip")(showToolTip)
    if (skipOptionalPartCharacter != null) __obj.updateDynamic("skipOptionalPartCharacter")(skipOptionalPartCharacter)
    __obj.asInstanceOf[JQueryMaskedInputOptions]
  }
}

