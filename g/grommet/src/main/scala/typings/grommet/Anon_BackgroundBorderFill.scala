package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundBorderFill extends js.Object {
  var background: Anon_DarkLightString
  var border: Anon_Side
  var fill: String
  var pad: Anon_HorizontalVertical
}

object Anon_BackgroundBorderFill {
  @scala.inline
  def apply(background: Anon_DarkLightString, border: Anon_Side, fill: String, pad: Anon_HorizontalVertical): Anon_BackgroundBorderFill = {
    val __obj = js.Dynamic.literal(background = background, border = border, fill = fill, pad = pad)
  
    __obj.asInstanceOf[Anon_BackgroundBorderFill]
  }
}

