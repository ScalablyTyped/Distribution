package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  /** When set to false, no animation happens */
  var animate: js.UndefOr[Boolean] = js.undefined
  /** Number in milliseconds */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * A function taking a time in the range 0..1 and returning a number where 0 is the initial
    * state and 1 is the final state.
    */
  var easing: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.undefined
  /** If `true`, then the animation is considered essential and will not be affected by `prefers-reduced-motion`.
    * Otherwise, the transition will happen instantly if the user has enabled the `reduced motion` accesibility feature in their operating system.
    */
  var essential: js.UndefOr[Boolean] = js.undefined
  /** point, origin of movement relative to map center */
  var offset: js.UndefOr[PointLike] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: /* time */ Double => Double = null,
    essential: js.UndefOr[Boolean] = js.undefined,
    offset: PointLike = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(essential)) __obj.updateDynamic("essential")(essential.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

