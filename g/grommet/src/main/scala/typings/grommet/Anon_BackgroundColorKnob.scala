package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorKnob extends js.Object {
  var background: Anon_DarkLightString
  var color: Anon_DarkLightString
  var knob: Anon_ExtendString
  var radius: String
  var size: String
}

object Anon_BackgroundColorKnob {
  @scala.inline
  def apply(
    background: Anon_DarkLightString,
    color: Anon_DarkLightString,
    knob: Anon_ExtendString,
    radius: String,
    size: String
  ): Anon_BackgroundColorKnob = {
    val __obj = js.Dynamic.literal(background = background, color = color, knob = knob, radius = radius, size = size)
  
    __obj.asInstanceOf[Anon_BackgroundColorKnob]
  }
}

