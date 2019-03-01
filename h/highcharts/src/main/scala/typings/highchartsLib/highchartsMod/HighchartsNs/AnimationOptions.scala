package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  /**
    * A callback function to exectute when the animation finishes.
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The animation duration in milliseconds.
    */
  var duration: scala.Double
  /**
    * The name of an easing function as defined on the Math object.
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback function to execute on each step of each attribute or CSS property that's being animated.
    * The first argument contains information about the animation and progress.
    */
  var step: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    duration: scala.Double,
    complete: js.Function0[scala.Unit] = null,
    easing: java.lang.String = null,
    step: js.Function0[scala.Unit] = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (step != null) __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[AnimationOptions]
  }
}

