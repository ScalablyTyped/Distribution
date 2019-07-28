package typings.atMaterialLinearDashProgress.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialLinearDashProgress.atMaterialLinearDashProgressStrings.`mdc-linear-progress--closed`
import typings.atMaterialLinearDashProgress.atMaterialLinearDashProgressStrings.`mdc-linear-progress--indeterminate`
import typings.atMaterialLinearDashProgress.atMaterialLinearDashProgressStrings.`mdc-linear-progress--reversed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var CLOSED_CLASS: `mdc-linear-progress--closed`
  var INDETERMINATE_CLASS: `mdc-linear-progress--indeterminate`
  var REVERSED_CLASS: `mdc-linear-progress--reversed`
}

object cssClasses {
  @scala.inline
  def apply(
    CLOSED_CLASS: `mdc-linear-progress--closed`,
    INDETERMINATE_CLASS: `mdc-linear-progress--indeterminate`,
    REVERSED_CLASS: `mdc-linear-progress--reversed`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(CLOSED_CLASS = CLOSED_CLASS, INDETERMINATE_CLASS = INDETERMINATE_CLASS, REVERSED_CLASS = REVERSED_CLASS)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

