package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: Anon_ColorAnonDarkLightString
  var color: Anon_DarkLightString
  var hover: Anon_ColorAnonDarkLightString
  var side: String
  var size: String
}

object Anon_Active {
  @scala.inline
  def apply(
    active: Anon_ColorAnonDarkLightString,
    color: Anon_DarkLightString,
    hover: Anon_ColorAnonDarkLightString,
    side: String,
    size: String
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(active = active, color = color, hover = hover, side = side, size = size)
  
    __obj.asInstanceOf[Anon_Active]
  }
}

