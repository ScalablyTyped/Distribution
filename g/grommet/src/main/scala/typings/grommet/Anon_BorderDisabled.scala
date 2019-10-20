package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderDisabled extends js.Object {
  var border: Anon_Radius
  var disabled: Anon_Opacity
  var maxWidth: String
  var minWidth: String
  var padding: Anon_Horizontal
  var primary: ColorType
}

object Anon_BorderDisabled {
  @scala.inline
  def apply(
    border: Anon_Radius,
    disabled: Anon_Opacity,
    maxWidth: String,
    minWidth: String,
    padding: Anon_Horizontal,
    primary: ColorType
  ): Anon_BorderDisabled = {
    val __obj = js.Dynamic.literal(border = border, disabled = disabled, maxWidth = maxWidth, minWidth = minWidth, padding = padding, primary = primary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BorderDisabled]
  }
}

