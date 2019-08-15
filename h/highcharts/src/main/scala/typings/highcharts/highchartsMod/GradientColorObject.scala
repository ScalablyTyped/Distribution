package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientColorObject extends _ColorType {
  /**
    * Holds an object that defines the start position and the end position
    * relative to the shape.
    */
  var linearGradient: js.UndefOr[LinearGradientColorObject] = js.undefined
  /**
    * Holds an object that defines the center position and the radius.
    */
  var radialGradient: js.UndefOr[RadialGradientColorObject] = js.undefined
  /**
    * The first item in each tuple is the position in the gradient, where 0 is
    * the start of the gradient and 1 is the end of the gradient. Multiple
    * stops can be applied. The second item is the color for each stop. This
    * color can also be given in the rgba format.
    */
  var stops: js.Array[GradientColorStopObject]
}

object GradientColorObject {
  @scala.inline
  def apply(
    stops: js.Array[GradientColorStopObject],
    linearGradient: LinearGradientColorObject = null,
    radialGradient: RadialGradientColorObject = null
  ): GradientColorObject = {
    val __obj = js.Dynamic.literal(stops = stops)
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient)
    if (radialGradient != null) __obj.updateDynamic("radialGradient")(radialGradient)
    __obj.asInstanceOf[GradientColorObject]
  }
}

