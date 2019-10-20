package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveBorder extends js.Object {
  var active: Anon_ColorColorType
  var border: Anon_Active
  var color: ColorType
  var hover: Anon_ColorColorType
  var margin: Anon_Horizontal
  var pad: Anon_BottomString
}

object Anon_ActiveBorder {
  @scala.inline
  def apply(
    active: Anon_ColorColorType,
    border: Anon_Active,
    color: ColorType,
    hover: Anon_ColorColorType,
    margin: Anon_Horizontal,
    pad: Anon_BottomString
  ): Anon_ActiveBorder = {
    val __obj = js.Dynamic.literal(active = active, border = border, color = color.asInstanceOf[js.Any], hover = hover, margin = margin, pad = pad)
  
    __obj.asInstanceOf[Anon_ActiveBorder]
  }
}

