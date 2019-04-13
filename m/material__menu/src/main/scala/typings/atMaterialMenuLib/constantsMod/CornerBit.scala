package typings
package atMaterialMenuLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CornerBit
  extends atMaterialBaseLib.foundationMod.MDCNumbers {
  var BOTTOM: atMaterialMenuLib.atMaterialMenuLibNumbers.`1`
  var CENTER: atMaterialMenuLib.atMaterialMenuLibNumbers.`2`
  var FLIP_RTL: atMaterialMenuLib.atMaterialMenuLibNumbers.`8`
  var RIGHT: atMaterialMenuLib.atMaterialMenuLibNumbers.`4`
}

object CornerBit {
  @scala.inline
  def apply(
    BOTTOM: atMaterialMenuLib.atMaterialMenuLibNumbers.`1`,
    CENTER: atMaterialMenuLib.atMaterialMenuLibNumbers.`2`,
    FLIP_RTL: atMaterialMenuLib.atMaterialMenuLibNumbers.`8`,
    RIGHT: atMaterialMenuLib.atMaterialMenuLibNumbers.`4`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): CornerBit = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM, CENTER = CENTER, FLIP_RTL = FLIP_RTL, RIGHT = RIGHT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CornerBit]
  }
}

