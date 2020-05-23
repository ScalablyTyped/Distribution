package typings.jestTypes.anon

import typings.jestTypes.configMod.DisplayNameColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: DisplayNameColor
  var name: String
}

object Color {
  @scala.inline
  def apply(color: DisplayNameColor, name: String): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

