package typings
package atMaterialIconDashToggleLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var DISABLED: atMaterialIconDashToggleLib.atMaterialIconDashToggleLibStrings.`mdc-icon-toggle--disabled`
  var ROOT: atMaterialIconDashToggleLib.atMaterialIconDashToggleLibStrings.`mdc-icon-toggle`
}

object cssClasses {
  @scala.inline
  def apply(
    DISABLED: atMaterialIconDashToggleLib.atMaterialIconDashToggleLibStrings.`mdc-icon-toggle--disabled`,
    ROOT: atMaterialIconDashToggleLib.atMaterialIconDashToggleLibStrings.`mdc-icon-toggle`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(DISABLED = DISABLED, ROOT = ROOT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

