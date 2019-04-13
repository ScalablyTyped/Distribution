package typings
package atMaterialRadioLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var DISABLED: atMaterialRadioLib.atMaterialRadioLibStrings.`mdc-radio--disabled`
  var ROOT: atMaterialRadioLib.atMaterialRadioLibStrings.`mdc-radio`
}

object cssClasses {
  @scala.inline
  def apply(
    DISABLED: atMaterialRadioLib.atMaterialRadioLibStrings.`mdc-radio--disabled`,
    ROOT: atMaterialRadioLib.atMaterialRadioLibStrings.`mdc-radio`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(DISABLED = DISABLED, ROOT = ROOT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

