package typings
package atMaterialSliderLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ACTIVE: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--active`
  var DISABLED: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--disabled`
  var DISCRETE: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--discrete`
  var FOCUS: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--focus`
  var HAS_TRACK_MARKER: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--display-markers`
  var IN_TRANSIT: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--in-transit`
  var IS_DISCRETE: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--discrete`
}

object cssClasses {
  @scala.inline
  def apply(
    ACTIVE: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--active`,
    DISABLED: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--disabled`,
    DISCRETE: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--discrete`,
    FOCUS: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--focus`,
    HAS_TRACK_MARKER: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--display-markers`,
    IN_TRANSIT: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--in-transit`,
    IS_DISCRETE: atMaterialSliderLib.atMaterialSliderLibStrings.`mdc-slider--discrete`
  ): cssClasses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACTIVE")(ACTIVE)
    __obj.updateDynamic("DISABLED")(DISABLED)
    __obj.updateDynamic("DISCRETE")(DISCRETE)
    __obj.updateDynamic("FOCUS")(FOCUS)
    __obj.updateDynamic("HAS_TRACK_MARKER")(HAS_TRACK_MARKER)
    __obj.updateDynamic("IN_TRANSIT")(IN_TRANSIT)
    __obj.updateDynamic("IS_DISCRETE")(IS_DISCRETE)
    __obj.asInstanceOf[cssClasses]
  }
}

