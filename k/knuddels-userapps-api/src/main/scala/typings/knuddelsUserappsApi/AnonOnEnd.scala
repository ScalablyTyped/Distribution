package typings.knuddelsUserappsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnEnd extends js.Object {
  var onEnd: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.undefined
  var onStart: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.undefined
}

object AnonOnEnd {
  @scala.inline
  def apply(
    onEnd: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit = null,
    onStart: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit = null
  ): AnonOnEnd = {
    val __obj = js.Dynamic.literal()
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction2(onEnd))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    __obj.asInstanceOf[AnonOnEnd]
  }
}

