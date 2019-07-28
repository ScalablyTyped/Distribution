package typings.atMaterialTextfield.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`mdc-text-field--box`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`mdc-text-field--dense`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`mdc-text-field--disabled`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`mdc-text-field--focused`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`mdc-text-field--invalid`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`mdc-text-field--outlined`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`mdc-text-field--upgraded`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`mdc-text-field`
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
    val __obj = js.Dynamic.literal(BOX = BOX, DENSE = DENSE, DISABLED = DISABLED, FOCUSED = FOCUSED, INVALID = INVALID, OUTLINED = OUTLINED, ROOT = ROOT, UPGRADED = UPGRADED)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

