package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorSide extends js.Object {
  var color: ColorType
  var side: String
}

object Anon_ColorSide {
  @scala.inline
  def apply(color: ColorType, side: String): Anon_ColorSide = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], side = side)
  
    __obj.asInstanceOf[Anon_ColorSide]
  }
}

