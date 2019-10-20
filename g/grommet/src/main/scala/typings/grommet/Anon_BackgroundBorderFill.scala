package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundBorderFill extends js.Object {
  var background: BackgroundType
  var border: Anon_Side
  var fill: String
  var pad: Anon_HorizontalVertical
}

object Anon_BackgroundBorderFill {
  @scala.inline
  def apply(background: BackgroundType, border: Anon_Side, fill: String, pad: Anon_HorizontalVertical): Anon_BackgroundBorderFill = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border, fill = fill, pad = pad)
  
    __obj.asInstanceOf[Anon_BackgroundBorderFill]
  }
}

