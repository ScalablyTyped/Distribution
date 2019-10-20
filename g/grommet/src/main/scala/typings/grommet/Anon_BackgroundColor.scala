package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var background: BackgroundType
  var color: ColorType
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(background: BackgroundType, color: ColorType): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

