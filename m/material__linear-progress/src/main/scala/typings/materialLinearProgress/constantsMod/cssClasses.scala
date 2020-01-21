package typings.materialLinearProgress.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialLinearProgress.materialLinearProgressStrings.`mdc-linear-progress--closed`
import typings.materialLinearProgress.materialLinearProgressStrings.`mdc-linear-progress--indeterminate`
import typings.materialLinearProgress.materialLinearProgressStrings.`mdc-linear-progress--reversed`
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
    val __obj = js.Dynamic.literal(CLOSED_CLASS = CLOSED_CLASS.asInstanceOf[js.Any], INDETERMINATE_CLASS = INDETERMINATE_CLASS.asInstanceOf[js.Any], REVERSED_CLASS = REVERSED_CLASS.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

