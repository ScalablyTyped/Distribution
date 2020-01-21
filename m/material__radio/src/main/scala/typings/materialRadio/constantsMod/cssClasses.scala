package typings.materialRadio.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialRadio.materialRadioStrings.`mdc-radio--disabled`
import typings.materialRadio.materialRadioStrings.`mdc-radio`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var DISABLED: `mdc-radio--disabled`
  var ROOT: `mdc-radio`
}

object cssClasses {
  @scala.inline
  def apply(
    DISABLED: `mdc-radio--disabled`,
    ROOT: `mdc-radio`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(DISABLED = DISABLED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

