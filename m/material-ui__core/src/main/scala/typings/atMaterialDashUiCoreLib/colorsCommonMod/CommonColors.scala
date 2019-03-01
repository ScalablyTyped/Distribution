package typings
package atMaterialDashUiCoreLib.colorsCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonColors extends js.Object {
  var black: java.lang.String
  var white: java.lang.String
}

object CommonColors {
  @scala.inline
  def apply(black: java.lang.String, white: java.lang.String): CommonColors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("black")(black)
    __obj.updateDynamic("white")(white)
    __obj.asInstanceOf[CommonColors]
  }
}

