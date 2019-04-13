package typings
package atMaterialSnackbarLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers
  extends atMaterialBaseLib.foundationMod.MDCNumbers {
  var MESSAGE_TIMEOUT: atMaterialSnackbarLib.atMaterialSnackbarLibNumbers.`2750`
}

object numbers {
  @scala.inline
  def apply(
    MESSAGE_TIMEOUT: atMaterialSnackbarLib.atMaterialSnackbarLibNumbers.`2750`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(MESSAGE_TIMEOUT = MESSAGE_TIMEOUT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

