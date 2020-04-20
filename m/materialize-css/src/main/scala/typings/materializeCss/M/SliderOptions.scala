package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends js.Object {
  /**
    * Set the duration of the transition animation in ms
    * @default 500
    */
  var duration: Double
  /**
    * Set height of slider
    * @default 400
    */
  var height: Double
  /**
    * Set to false to hide slide indicators
    * @default true
    */
  var indicators: Boolean
  /**
    * Set the duration between transitions in ms
    * @default 6000
    */
  var interval: Double
}

object SliderOptions {
  @scala.inline
  def apply(duration: Double, height: Double, indicators: Boolean, interval: Double): SliderOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], indicators = indicators.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOptions]
  }
}

