package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderCheckHover extends js.Object {
  var border: Anon_ColorWidth
  var check: Anon_RadiusThickness
  var hover: Anon_BorderAnonColorAnonDarkLightString
  var size: String
  var toggle: Anon_ColorKnob
}

object Anon_BorderCheckHover {
  @scala.inline
  def apply(
    border: Anon_ColorWidth,
    check: Anon_RadiusThickness,
    hover: Anon_BorderAnonColorAnonDarkLightString,
    size: String,
    toggle: Anon_ColorKnob
  ): Anon_BorderCheckHover = {
    val __obj = js.Dynamic.literal(border = border, check = check, hover = hover, size = size, toggle = toggle)
  
    __obj.asInstanceOf[Anon_BorderCheckHover]
  }
}

