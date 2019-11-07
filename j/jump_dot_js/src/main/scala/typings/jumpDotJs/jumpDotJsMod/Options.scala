package typings.jumpDotJs.jumpDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var a11y: js.UndefOr[Boolean] = js.undefined
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var duration: js.UndefOr[Double | (js.Function1[/* distance */ Double, Double])] = js.undefined
  var easing: js.UndefOr[TransitionFunc] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    a11y: js.UndefOr[Boolean] = js.undefined,
    callback: () => Unit = null,
    duration: Double | (js.Function1[/* distance */ Double, Double]) = null,
    easing: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double = null,
    offset: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(a11y)) __obj.updateDynamic("a11y")(a11y)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction4(easing))
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

