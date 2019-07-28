package typings.atMaterialFormDashField.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialFormDashField.atMaterialFormDashFieldStrings.`mdc-form-field`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var ROOT: `mdc-form-field`
}

object cssClasses {
  @scala.inline
  def apply(ROOT: `mdc-form-field`, StringDictionary: StringDictionary[String] = null): cssClasses = {
    val __obj = js.Dynamic.literal(ROOT = ROOT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

