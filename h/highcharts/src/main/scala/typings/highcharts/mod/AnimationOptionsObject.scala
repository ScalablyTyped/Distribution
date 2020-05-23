package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptionsObject extends js.Object {
  /**
    * A callback function to exectute when the animation finishes.
    */
  var complete: js.UndefOr[js.Function] = js.undefined
  /**
    * The animation duration in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The name of an easing function as defined on the `Math` object.
    */
  var easing: js.UndefOr[String | js.Function] = js.undefined
  /**
    * A callback function to execute on each step of each attribute or CSS
    * property that's being animated. The first argument contains information
    * about the animation and progress.
    */
  var step: js.UndefOr[js.Function] = js.undefined
}

object AnimationOptionsObject {
  @scala.inline
  def apply(
    complete: js.Function = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: String | js.Function = null,
    step: js.Function = null
  ): AnimationOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptionsObject]
  }
}

