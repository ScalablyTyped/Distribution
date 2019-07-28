package typings.jqueryDotRateit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateItOptions extends js.Object {
  var backingfld: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var ispreset: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[RateItMode] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var resetable: js.UndefOr[Boolean] = js.undefined
  var starheight: js.UndefOr[Double] = js.undefined
  var starwidth: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object RateItOptions {
  @scala.inline
  def apply(
    backingfld: String = null,
    icon: String = null,
    ispreset: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    mode: RateItMode = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    resetable: js.UndefOr[Boolean] = js.undefined,
    starheight: Int | Double = null,
    starwidth: Int | Double = null,
    step: Int | Double = null,
    value: Int | Double = null
  ): RateItOptions = {
    val __obj = js.Dynamic.literal()
    if (backingfld != null) __obj.updateDynamic("backingfld")(backingfld)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(ispreset)) __obj.updateDynamic("ispreset")(ispreset)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (!js.isUndefined(resetable)) __obj.updateDynamic("resetable")(resetable)
    if (starheight != null) __obj.updateDynamic("starheight")(starheight.asInstanceOf[js.Any])
    if (starwidth != null) __obj.updateDynamic("starwidth")(starwidth.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateItOptions]
  }
}

