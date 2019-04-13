package typings
package atMaterialMenuLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Corner
  extends atMaterialBaseLib.foundationMod.MDCNumbers {
  var BOTTOM_END: atMaterialMenuLib.atMaterialMenuLibNumbers.`13`
  var BOTTOM_LEFT: atMaterialMenuLib.atMaterialMenuLibNumbers.`1`
  var BOTTOM_RIGHT: atMaterialMenuLib.atMaterialMenuLibNumbers.`5`
  var BOTTOM_START: atMaterialMenuLib.atMaterialMenuLibNumbers.`9`
  var TOP_END: atMaterialMenuLib.atMaterialMenuLibNumbers.`12`
  var TOP_LEFT: atMaterialMenuLib.atMaterialMenuLibNumbers.`0`
  var TOP_RIGHT: atMaterialMenuLib.atMaterialMenuLibNumbers.`4`
  var TOP_START: atMaterialMenuLib.atMaterialMenuLibNumbers.`8`
}

object Corner {
  @scala.inline
  def apply(
    BOTTOM_END: atMaterialMenuLib.atMaterialMenuLibNumbers.`13`,
    BOTTOM_LEFT: atMaterialMenuLib.atMaterialMenuLibNumbers.`1`,
    BOTTOM_RIGHT: atMaterialMenuLib.atMaterialMenuLibNumbers.`5`,
    BOTTOM_START: atMaterialMenuLib.atMaterialMenuLibNumbers.`9`,
    TOP_END: atMaterialMenuLib.atMaterialMenuLibNumbers.`12`,
    TOP_LEFT: atMaterialMenuLib.atMaterialMenuLibNumbers.`0`,
    TOP_RIGHT: atMaterialMenuLib.atMaterialMenuLibNumbers.`4`,
    TOP_START: atMaterialMenuLib.atMaterialMenuLibNumbers.`8`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): Corner = {
    val __obj = js.Dynamic.literal(BOTTOM_END = BOTTOM_END, BOTTOM_LEFT = BOTTOM_LEFT, BOTTOM_RIGHT = BOTTOM_RIGHT, BOTTOM_START = BOTTOM_START, TOP_END = TOP_END, TOP_LEFT = TOP_LEFT, TOP_RIGHT = TOP_RIGHT, TOP_START = TOP_START)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Corner]
  }
}

