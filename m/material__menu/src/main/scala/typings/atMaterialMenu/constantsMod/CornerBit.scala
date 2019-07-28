package typings.atMaterialMenu.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCNumbers
import typings.atMaterialMenu.atMaterialMenuNumbers.`1`
import typings.atMaterialMenu.atMaterialMenuNumbers.`2`
import typings.atMaterialMenu.atMaterialMenuNumbers.`4`
import typings.atMaterialMenu.atMaterialMenuNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CornerBit extends MDCNumbers {
  var BOTTOM: `1`
  var CENTER: `2`
  var FLIP_RTL: `8`
  var RIGHT: `4`
}

object CornerBit {
  @scala.inline
  def apply(
    BOTTOM: `1`,
    CENTER: `2`,
    FLIP_RTL: `8`,
    RIGHT: `4`,
    StringDictionary: StringDictionary[Double] = null
  ): CornerBit = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM, CENTER = CENTER, FLIP_RTL = FLIP_RTL, RIGHT = RIGHT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CornerBit]
  }
}

