package typings
package atMaterialToolbarLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers
  extends atMaterialBaseLib.foundationMod.MDCNumbers {
  var MAX_TITLE_SIZE: atMaterialToolbarLib.atMaterialToolbarLibNumbers.`2DOT125`
  var MIN_TITLE_SIZE: atMaterialToolbarLib.atMaterialToolbarLibNumbers.`1DOT25`
  var TOOLBAR_MOBILE_BREAKPOINT: atMaterialToolbarLib.atMaterialToolbarLibNumbers.`600`
  var TOOLBAR_ROW_HEIGHT: atMaterialToolbarLib.atMaterialToolbarLibNumbers.`64`
  var TOOLBAR_ROW_MOBILE_HEIGHT: atMaterialToolbarLib.atMaterialToolbarLibNumbers.`56`
}

object numbers {
  @scala.inline
  def apply(
    MAX_TITLE_SIZE: atMaterialToolbarLib.atMaterialToolbarLibNumbers.`2DOT125`,
    MIN_TITLE_SIZE: atMaterialToolbarLib.atMaterialToolbarLibNumbers.`1DOT25`,
    TOOLBAR_MOBILE_BREAKPOINT: atMaterialToolbarLib.atMaterialToolbarLibNumbers.`600`,
    TOOLBAR_ROW_HEIGHT: atMaterialToolbarLib.atMaterialToolbarLibNumbers.`64`,
    TOOLBAR_ROW_MOBILE_HEIGHT: atMaterialToolbarLib.atMaterialToolbarLibNumbers.`56`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(MAX_TITLE_SIZE = MAX_TITLE_SIZE, MIN_TITLE_SIZE = MIN_TITLE_SIZE, TOOLBAR_MOBILE_BREAKPOINT = TOOLBAR_MOBILE_BREAKPOINT, TOOLBAR_ROW_HEIGHT = TOOLBAR_ROW_HEIGHT, TOOLBAR_ROW_MOBILE_HEIGHT = TOOLBAR_ROW_MOBILE_HEIGHT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

