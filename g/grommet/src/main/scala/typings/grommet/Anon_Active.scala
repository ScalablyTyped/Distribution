package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: Anon_ColorColorType
  var color: ColorType
  var hover: Anon_ColorColorType
  var side: String
  var size: String
}

object Anon_Active {
  @scala.inline
  def apply(
    active: Anon_ColorColorType,
    color: ColorType,
    hover: Anon_ColorColorType,
    side: String,
    size: String
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(active = active, color = color.asInstanceOf[js.Any], hover = hover, side = side, size = size)
  
    __obj.asInstanceOf[Anon_Active]
  }
}

