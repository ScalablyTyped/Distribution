package typings.atMaterialSlider.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialSlider.atMaterialSliderStrings.`mdc-slider--active`
import typings.atMaterialSlider.atMaterialSliderStrings.`mdc-slider--disabled`
import typings.atMaterialSlider.atMaterialSliderStrings.`mdc-slider--discrete`
import typings.atMaterialSlider.atMaterialSliderStrings.`mdc-slider--display-markers`
import typings.atMaterialSlider.atMaterialSliderStrings.`mdc-slider--focus`
import typings.atMaterialSlider.atMaterialSliderStrings.`mdc-slider--in-transit`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var ACTIVE: `mdc-slider--active`
  var DISABLED: `mdc-slider--disabled`
  var DISCRETE: `mdc-slider--discrete`
  var FOCUS: `mdc-slider--focus`
  var HAS_TRACK_MARKER: `mdc-slider--display-markers`
  var IN_TRANSIT: `mdc-slider--in-transit`
  var IS_DISCRETE: `mdc-slider--discrete`
}

object cssClasses {
  @scala.inline
  def apply(
    ACTIVE: `mdc-slider--active`,
    DISABLED: `mdc-slider--disabled`,
    DISCRETE: `mdc-slider--discrete`,
    FOCUS: `mdc-slider--focus`,
    HAS_TRACK_MARKER: `mdc-slider--display-markers`,
    IN_TRANSIT: `mdc-slider--in-transit`,
    IS_DISCRETE: `mdc-slider--discrete`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE, DISABLED = DISABLED, DISCRETE = DISCRETE, FOCUS = FOCUS, HAS_TRACK_MARKER = HAS_TRACK_MARKER, IN_TRANSIT = IN_TRANSIT, IS_DISCRETE = IS_DISCRETE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

