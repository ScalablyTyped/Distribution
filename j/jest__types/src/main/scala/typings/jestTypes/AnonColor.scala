package typings.jestTypes

import typings.jestTypes.configMod.DisplayNameColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: DisplayNameColor
  var name: String
}

object AnonColor {
  @scala.inline
  def apply(color: DisplayNameColor, name: String): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColor]
  }
}

