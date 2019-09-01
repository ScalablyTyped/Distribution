package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveBorder extends js.Object {
  var active: Anon_ColorString
  var border: Anon_Active
  var color: String
  var hover: Anon_ColorAnonDarkLightString
  var margin: Anon_Horizontal
  var pad: Anon_BottomString
}

object Anon_ActiveBorder {
  @scala.inline
  def apply(
    active: Anon_ColorString,
    border: Anon_Active,
    color: String,
    hover: Anon_ColorAnonDarkLightString,
    margin: Anon_Horizontal,
    pad: Anon_BottomString
  ): Anon_ActiveBorder = {
    val __obj = js.Dynamic.literal(active = active, border = border, color = color, hover = hover, margin = margin, pad = pad)
  
    __obj.asInstanceOf[Anon_ActiveBorder]
  }
}

