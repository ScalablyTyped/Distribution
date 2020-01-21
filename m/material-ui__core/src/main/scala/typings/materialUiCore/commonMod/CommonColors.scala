package typings.materialUiCore.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonColors extends js.Object {
  var black: String = js.native
  var white: String = js.native
}

object CommonColors {
  @scala.inline
  def apply(black: String, white: String): CommonColors = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommonColors]
  }
}

