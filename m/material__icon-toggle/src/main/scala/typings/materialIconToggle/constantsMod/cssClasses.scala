package typings.materialIconToggle.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialIconToggle.materialIconToggleStrings.`mdc-icon-toggle--disabled`
import typings.materialIconToggle.materialIconToggleStrings.`mdc-icon-toggle`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var DISABLED: `mdc-icon-toggle--disabled`
  var ROOT: `mdc-icon-toggle`
}

object cssClasses {
  @scala.inline
  def apply(
    DISABLED: `mdc-icon-toggle--disabled`,
    ROOT: `mdc-icon-toggle`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(DISABLED = DISABLED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

