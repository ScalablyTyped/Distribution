package typings.materialTopAppBar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCNumbers
import typings.materialTopAppBar.materialTopAppBarNumbers.`100`
import typings.materialTopAppBar.materialTopAppBarNumbers.`128`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers extends MDCNumbers {
  var DEBOUNCE_THROTTLE_RESIZE_TIME_MS: `100`
  var MAX_TOP_APP_BAR_HEIGHT: `128`
}

object numbers {
  @scala.inline
  def apply(
    DEBOUNCE_THROTTLE_RESIZE_TIME_MS: `100`,
    MAX_TOP_APP_BAR_HEIGHT: `128`,
    StringDictionary: StringDictionary[Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(DEBOUNCE_THROTTLE_RESIZE_TIME_MS = DEBOUNCE_THROTTLE_RESIZE_TIME_MS.asInstanceOf[js.Any], MAX_TOP_APP_BAR_HEIGHT = MAX_TOP_APP_BAR_HEIGHT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

