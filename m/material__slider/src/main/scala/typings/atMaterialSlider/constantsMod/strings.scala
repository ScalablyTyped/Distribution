package typings.atMaterialSlider.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialSlider.atMaterialSliderStrings.`DOTmdc-slider__pin-value-marker`
import typings.atMaterialSlider.atMaterialSliderStrings.`DOTmdc-slider__thumb-container`
import typings.atMaterialSlider.atMaterialSliderStrings.`DOTmdc-slider__track-marker-container`
import typings.atMaterialSlider.atMaterialSliderStrings.`DOTmdc-slider__track-marker:last-child`
import typings.atMaterialSlider.atMaterialSliderStrings.`DOTmdc-slider__track`
import typings.atMaterialSlider.atMaterialSliderStrings.`MDCSlider:change`
import typings.atMaterialSlider.atMaterialSliderStrings.`MDCSlider:input`
import typings.atMaterialSlider.atMaterialSliderStrings.`aria-disabled`
import typings.atMaterialSlider.atMaterialSliderStrings.`aria-valuemax`
import typings.atMaterialSlider.atMaterialSliderStrings.`aria-valuemin`
import typings.atMaterialSlider.atMaterialSliderStrings.`aria-valuenow`
import typings.atMaterialSlider.atMaterialSliderStrings.`data-step`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_DISABLED: `aria-disabled`
  var ARIA_VALUEMAX: `aria-valuemax`
  var ARIA_VALUEMIN: `aria-valuemin`
  var ARIA_VALUENOW: `aria-valuenow`
  var CHANGE_EVENT: `MDCSlider:change`
  var INPUT_EVENT: `MDCSlider:input`
  var LAST_TRACK_MARKER_SELECTOR: `DOTmdc-slider__track-marker:last-child`
  var PIN_VALUE_MARKER_SELECTOR: `DOTmdc-slider__pin-value-marker`
  var STEP_DATA_ATTR: `data-step`
  var THUMB_CONTAINER_SELECTOR: `DOTmdc-slider__thumb-container`
  var TRACK_MARKER_CONTAINER_SELECTOR: `DOTmdc-slider__track-marker-container`
  var TRACK_SELECTOR: `DOTmdc-slider__track`
}

object strings {
  @scala.inline
  def apply(
    ARIA_DISABLED: `aria-disabled`,
    ARIA_VALUEMAX: `aria-valuemax`,
    ARIA_VALUEMIN: `aria-valuemin`,
    ARIA_VALUENOW: `aria-valuenow`,
    CHANGE_EVENT: `MDCSlider:change`,
    INPUT_EVENT: `MDCSlider:input`,
    LAST_TRACK_MARKER_SELECTOR: `DOTmdc-slider__track-marker:last-child`,
    PIN_VALUE_MARKER_SELECTOR: `DOTmdc-slider__pin-value-marker`,
    STEP_DATA_ATTR: `data-step`,
    THUMB_CONTAINER_SELECTOR: `DOTmdc-slider__thumb-container`,
    TRACK_MARKER_CONTAINER_SELECTOR: `DOTmdc-slider__track-marker-container`,
    TRACK_SELECTOR: `DOTmdc-slider__track`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_DISABLED = ARIA_DISABLED.asInstanceOf[js.Any], ARIA_VALUEMAX = ARIA_VALUEMAX.asInstanceOf[js.Any], ARIA_VALUEMIN = ARIA_VALUEMIN.asInstanceOf[js.Any], ARIA_VALUENOW = ARIA_VALUENOW.asInstanceOf[js.Any], CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], INPUT_EVENT = INPUT_EVENT.asInstanceOf[js.Any], LAST_TRACK_MARKER_SELECTOR = LAST_TRACK_MARKER_SELECTOR.asInstanceOf[js.Any], PIN_VALUE_MARKER_SELECTOR = PIN_VALUE_MARKER_SELECTOR.asInstanceOf[js.Any], STEP_DATA_ATTR = STEP_DATA_ATTR.asInstanceOf[js.Any], THUMB_CONTAINER_SELECTOR = THUMB_CONTAINER_SELECTOR.asInstanceOf[js.Any], TRACK_MARKER_CONTAINER_SELECTOR = TRACK_MARKER_CONTAINER_SELECTOR.asInstanceOf[js.Any], TRACK_SELECTOR = TRACK_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

