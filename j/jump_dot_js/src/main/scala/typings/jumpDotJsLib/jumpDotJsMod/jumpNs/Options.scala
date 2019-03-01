package typings
package jumpDotJsLib.jumpDotJsMod.jumpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var a11y: js.UndefOr[scala.Boolean] = js.undefined
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[TransitionFunc] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    a11y: js.UndefOr[scala.Boolean] = js.undefined,
    callback: js.Function0[scala.Unit] = null,
    duration: scala.Int | scala.Double = null,
    easing: TransitionFunc = null,
    offset: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(a11y)) __obj.updateDynamic("a11y")(a11y)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

