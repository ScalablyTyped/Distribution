package typings
package atMaterialTopDashAppDashBarLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers
  extends atMaterialBaseLib.foundationMod.MDCNumbers {
  var DEBOUNCE_THROTTLE_RESIZE_TIME_MS: atMaterialTopDashAppDashBarLib.atMaterialTopDashAppDashBarLibNumbers.`100`
  var MAX_TOP_APP_BAR_HEIGHT: atMaterialTopDashAppDashBarLib.atMaterialTopDashAppDashBarLibNumbers.`128`
}

object numbers {
  @scala.inline
  def apply(
    DEBOUNCE_THROTTLE_RESIZE_TIME_MS: atMaterialTopDashAppDashBarLib.atMaterialTopDashAppDashBarLibNumbers.`100`,
    MAX_TOP_APP_BAR_HEIGHT: atMaterialTopDashAppDashBarLib.atMaterialTopDashAppDashBarLibNumbers.`128`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(DEBOUNCE_THROTTLE_RESIZE_TIME_MS = DEBOUNCE_THROTTLE_RESIZE_TIME_MS, MAX_TOP_APP_BAR_HEIGHT = MAX_TOP_APP_BAR_HEIGHT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

