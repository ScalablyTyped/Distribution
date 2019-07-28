package typings.headroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Initial extends js.Object {
  var initial: js.UndefOr[String] = js.undefined
  var notBottom: js.UndefOr[String] = js.undefined
  var notTop: js.UndefOr[String] = js.undefined
  var pinned: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[String] = js.undefined
  var unpinned: js.UndefOr[String] = js.undefined
}

object Anon_Initial {
  @scala.inline
  def apply(
    initial: String = null,
    notBottom: String = null,
    notTop: String = null,
    pinned: String = null,
    top: String = null,
    unpinned: String = null
  ): Anon_Initial = {
    val __obj = js.Dynamic.literal()
    if (initial != null) __obj.updateDynamic("initial")(initial)
    if (notBottom != null) __obj.updateDynamic("notBottom")(notBottom)
    if (notTop != null) __obj.updateDynamic("notTop")(notTop)
    if (pinned != null) __obj.updateDynamic("pinned")(pinned)
    if (top != null) __obj.updateDynamic("top")(top)
    if (unpinned != null) __obj.updateDynamic("unpinned")(unpinned)
    __obj.asInstanceOf[Anon_Initial]
  }
}

