package typings.atMaterialIconDashToggle.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialIconDashToggle.atMaterialIconDashToggleStrings.`mdc-icon-toggle--disabled`
import typings.atMaterialIconDashToggle.atMaterialIconDashToggleStrings.`mdc-icon-toggle`
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
    val __obj = js.Dynamic.literal(DISABLED = DISABLED, ROOT = ROOT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

