package typings
package atMaterialFloatingDashLabelLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var LABEL_FLOAT_ABOVE: atMaterialFloatingDashLabelLib.atMaterialFloatingDashLabelLibStrings.`mdc-floating-label--float-above`
  var LABEL_SHAKE: atMaterialFloatingDashLabelLib.atMaterialFloatingDashLabelLibStrings.`mdc-floating-label--shake`
}

object cssClasses {
  @scala.inline
  def apply(
    LABEL_FLOAT_ABOVE: atMaterialFloatingDashLabelLib.atMaterialFloatingDashLabelLibStrings.`mdc-floating-label--float-above`,
    LABEL_SHAKE: atMaterialFloatingDashLabelLib.atMaterialFloatingDashLabelLibStrings.`mdc-floating-label--shake`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(LABEL_FLOAT_ABOVE = LABEL_FLOAT_ABOVE, LABEL_SHAKE = LABEL_SHAKE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

