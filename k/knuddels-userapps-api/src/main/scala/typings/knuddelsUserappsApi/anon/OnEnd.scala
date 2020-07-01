package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEnd extends js.Object {
  var onEnd: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.undefined
  var onStart: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.undefined
  var online: js.UndefOr[Boolean] = js.undefined
}

object OnEnd {
  @scala.inline
  def apply(
    onEnd: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit = null,
    onStart: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit = null,
    online: js.UndefOr[Boolean] = js.undefined
  ): OnEnd = {
    val __obj = js.Dynamic.literal()
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction2(onEnd))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (!js.isUndefined(online)) __obj.updateDynamic("online")(online.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEnd]
  }
}

