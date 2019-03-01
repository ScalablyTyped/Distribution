package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderClasses extends js.Object {
  var `ui-slider`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-slider-handle`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-slider-horizontal`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-slider-range`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-slider-range-max`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-slider-range-min`: js.UndefOr[java.lang.String] = js.undefined
  var `ui-slider-vertical`: js.UndefOr[java.lang.String] = js.undefined
}

object SliderClasses {
  @scala.inline
  def apply(
    `ui-slider`: java.lang.String = null,
    `ui-slider-handle`: java.lang.String = null,
    `ui-slider-horizontal`: java.lang.String = null,
    `ui-slider-range`: java.lang.String = null,
    `ui-slider-range-max`: java.lang.String = null,
    `ui-slider-range-min`: java.lang.String = null,
    `ui-slider-vertical`: java.lang.String = null
  ): SliderClasses = {
    val __obj = js.Dynamic.literal()
    if (`ui-slider` != null) __obj.updateDynamic("ui-slider")(`ui-slider`)
    if (`ui-slider-handle` != null) __obj.updateDynamic("ui-slider-handle")(`ui-slider-handle`)
    if (`ui-slider-horizontal` != null) __obj.updateDynamic("ui-slider-horizontal")(`ui-slider-horizontal`)
    if (`ui-slider-range` != null) __obj.updateDynamic("ui-slider-range")(`ui-slider-range`)
    if (`ui-slider-range-max` != null) __obj.updateDynamic("ui-slider-range-max")(`ui-slider-range-max`)
    if (`ui-slider-range-min` != null) __obj.updateDynamic("ui-slider-range-min")(`ui-slider-range-min`)
    if (`ui-slider-vertical` != null) __obj.updateDynamic("ui-slider-vertical")(`ui-slider-vertical`)
    __obj.asInstanceOf[SliderClasses]
  }
}

