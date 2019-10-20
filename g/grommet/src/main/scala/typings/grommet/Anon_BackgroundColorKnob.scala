package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorKnob extends js.Object {
  var background: BackgroundType
  var color: ColorType
  var knob: Anon_ExtendString
  var radius: String
  var size: String
}

object Anon_BackgroundColorKnob {
  @scala.inline
  def apply(
    background: BackgroundType,
    color: ColorType,
    knob: Anon_ExtendString,
    radius: String,
    size: String
  ): Anon_BackgroundColorKnob = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], knob = knob, radius = radius, size = size)
  
    __obj.asInstanceOf[Anon_BackgroundColorKnob]
  }
}

