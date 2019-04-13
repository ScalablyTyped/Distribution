package typings
package atMaterialTextfieldLib.helperDashTextConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var HELPER_TEXT_PERSISTENT: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.`mdc-text-field-helper-text--persistent`
  var HELPER_TEXT_VALIDATION_MSG: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.`mdc-text-field-helper-text--validation-msg`
}

object cssClasses {
  @scala.inline
  def apply(
    HELPER_TEXT_PERSISTENT: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.`mdc-text-field-helper-text--persistent`,
    HELPER_TEXT_VALIDATION_MSG: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.`mdc-text-field-helper-text--validation-msg`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(HELPER_TEXT_PERSISTENT = HELPER_TEXT_PERSISTENT, HELPER_TEXT_VALIDATION_MSG = HELPER_TEXT_VALIDATION_MSG)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

