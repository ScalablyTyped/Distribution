package typings.atMaterialSelect.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialSelect.atMaterialSelectStrings.`mdc-select--box`
import typings.atMaterialSelect.atMaterialSelectStrings.`mdc-select--disabled`
import typings.atMaterialSelect.atMaterialSelectStrings.`mdc-select`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var BOX: `mdc-select--box`
  var DISABLED: `mdc-select--disabled`
  var ROOT: `mdc-select`
}

object cssClasses {
  @scala.inline
  def apply(
    BOX: `mdc-select--box`,
    DISABLED: `mdc-select--disabled`,
    ROOT: `mdc-select`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(BOX = BOX, DISABLED = DISABLED, ROOT = ROOT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

