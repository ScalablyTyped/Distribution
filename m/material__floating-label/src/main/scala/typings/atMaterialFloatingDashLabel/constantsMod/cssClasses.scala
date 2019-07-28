package typings.atMaterialFloatingDashLabel.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialFloatingDashLabel.atMaterialFloatingDashLabelStrings.`mdc-floating-label--float-above`
import typings.atMaterialFloatingDashLabel.atMaterialFloatingDashLabelStrings.`mdc-floating-label--shake`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var LABEL_FLOAT_ABOVE: `mdc-floating-label--float-above`
  var LABEL_SHAKE: `mdc-floating-label--shake`
}

object cssClasses {
  @scala.inline
  def apply(
    LABEL_FLOAT_ABOVE: `mdc-floating-label--float-above`,
    LABEL_SHAKE: `mdc-floating-label--shake`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(LABEL_FLOAT_ABOVE = LABEL_FLOAT_ABOVE, LABEL_SHAKE = LABEL_SHAKE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

