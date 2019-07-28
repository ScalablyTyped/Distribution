package typings.atMaterialTextfield.helperDashTextConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`aria-hidden`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_HIDDEN: `aria-hidden`
  var ROLE: role
}

object strings {
  @scala.inline
  def apply(ARIA_HIDDEN: `aria-hidden`, ROLE: role, StringDictionary: StringDictionary[String] = null): strings = {
    val __obj = js.Dynamic.literal(ARIA_HIDDEN = ARIA_HIDDEN, ROLE = ROLE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

