package typings
package atMaterialTextfieldLib.iconConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ICON_EVENT: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.`MDCTextField:icon`
  var ICON_ROLE: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.button
}

object strings {
  @scala.inline
  def apply(
    ICON_EVENT: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.`MDCTextField:icon`,
    ICON_ROLE: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.button,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ICON_EVENT = ICON_EVENT, ICON_ROLE = ICON_ROLE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

