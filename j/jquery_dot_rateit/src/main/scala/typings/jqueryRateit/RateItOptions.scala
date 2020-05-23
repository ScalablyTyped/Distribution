package typings.jqueryRateit

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
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    mode: RateItMode = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    resetable: js.UndefOr[Boolean] = js.undefined,
    starheight: js.UndefOr[Double] = js.undefined,
    starwidth: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): RateItOptions = {
    val __obj = js.Dynamic.literal()
    if (backingfld != null) __obj.updateDynamic("backingfld")(backingfld.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(ispreset)) __obj.updateDynamic("ispreset")(ispreset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resetable)) __obj.updateDynamic("resetable")(resetable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(starheight)) __obj.updateDynamic("starheight")(starheight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(starwidth)) __obj.updateDynamic("starwidth")(starwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateItOptions]
  }
}

