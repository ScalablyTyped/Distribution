package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderCheck extends js.Object {
  var border: Anon_ColorWidth
  var check: Anon_Extend
  var color: ColorType
  var extend: String
  var hover: Anon_BorderAnonColorColorType
  var icon: Anon_ExtendSize
  var size: String
  var toggle: Anon_BackgroundColorKnob
}

object Anon_BorderCheck {
  @scala.inline
  def apply(
    border: Anon_ColorWidth,
    check: Anon_Extend,
    color: ColorType,
    extend: String,
    hover: Anon_BorderAnonColorColorType,
    icon: Anon_ExtendSize,
    size: String,
    toggle: Anon_BackgroundColorKnob
  ): Anon_BorderCheck = {
    val __obj = js.Dynamic.literal(border = border, check = check, color = color.asInstanceOf[js.Any], extend = extend, hover = hover, icon = icon, size = size, toggle = toggle)
  
    __obj.asInstanceOf[Anon_BorderCheck]
  }
}

