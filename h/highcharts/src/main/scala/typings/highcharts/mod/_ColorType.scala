package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ColorType extends js.Object

object _ColorType {
  @scala.inline
  def GradientColorObject(
    stops: js.Array[GradientColorStopObject],
    linearGradient: LinearGradientColorObject = null,
    radialGradient: RadialGradientColorObject = null
  ): _ColorType = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient.asInstanceOf[js.Any])
    if (radialGradient != null) __obj.updateDynamic("radialGradient")(radialGradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorType]
  }
  @scala.inline
  def PatternObject(
    pattern: PatternOptionsObject,
    animation: Boolean | AnimationOptionsObject = null,
    patternIndex: Int | Double = null
  ): _ColorType = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (patternIndex != null) __obj.updateDynamic("patternIndex")(patternIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorType]
  }
}

