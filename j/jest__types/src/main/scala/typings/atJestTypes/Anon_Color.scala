package typings.atJestTypes

import typings.atJestTypes.buildConfigMod.DisplayNameColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: DisplayNameColor
  var name: String
}

object Anon_Color {
  @scala.inline
  def apply(color: DisplayNameColor, name: String): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Color]
  }
}

