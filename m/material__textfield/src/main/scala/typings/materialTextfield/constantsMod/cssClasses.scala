package typings.materialTextfield.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialTextfield.materialTextfieldStrings.`mdc-text-field--box`
import typings.materialTextfield.materialTextfieldStrings.`mdc-text-field--dense`
import typings.materialTextfield.materialTextfieldStrings.`mdc-text-field--disabled`
import typings.materialTextfield.materialTextfieldStrings.`mdc-text-field--focused`
import typings.materialTextfield.materialTextfieldStrings.`mdc-text-field--invalid`
import typings.materialTextfield.materialTextfieldStrings.`mdc-text-field--outlined`
import typings.materialTextfield.materialTextfieldStrings.`mdc-text-field--upgraded`
import typings.materialTextfield.materialTextfieldStrings.`mdc-text-field`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var BOX: `mdc-text-field--box`
  var DENSE: `mdc-text-field--dense`
  var DISABLED: `mdc-text-field--disabled`
  var FOCUSED: `mdc-text-field--focused`
  var INVALID: `mdc-text-field--invalid`
  var OUTLINED: `mdc-text-field--outlined`
  var ROOT: `mdc-text-field`
  var UPGRADED: `mdc-text-field--upgraded`
}

object cssClasses {
  @scala.inline
  def apply(
    BOX: `mdc-text-field--box`,
    DENSE: `mdc-text-field--dense`,
    DISABLED: `mdc-text-field--disabled`,
    FOCUSED: `mdc-text-field--focused`,
    INVALID: `mdc-text-field--invalid`,
    OUTLINED: `mdc-text-field--outlined`,
    ROOT: `mdc-text-field`,
    UPGRADED: `mdc-text-field--upgraded`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(BOX = BOX.asInstanceOf[js.Any], DENSE = DENSE.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], FOCUSED = FOCUSED.asInstanceOf[js.Any], INVALID = INVALID.asInstanceOf[js.Any], OUTLINED = OUTLINED.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], UPGRADED = UPGRADED.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

