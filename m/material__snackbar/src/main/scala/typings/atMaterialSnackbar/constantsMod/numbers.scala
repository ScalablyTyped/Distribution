package typings.atMaterialSnackbar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCNumbers
import typings.atMaterialSnackbar.atMaterialSnackbarNumbers.`2750`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers extends MDCNumbers {
  var MESSAGE_TIMEOUT: `2750`
}

object numbers {
  @scala.inline
  def apply(MESSAGE_TIMEOUT: `2750`, StringDictionary: StringDictionary[Double] = null): numbers = {
    val __obj = js.Dynamic.literal(MESSAGE_TIMEOUT = MESSAGE_TIMEOUT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

