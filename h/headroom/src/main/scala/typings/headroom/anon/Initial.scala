package typings.headroom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initial extends js.Object {
  var initial: js.UndefOr[String] = js.undefined
  var notBottom: js.UndefOr[String] = js.undefined
  var notTop: js.UndefOr[String] = js.undefined
  var pinned: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[String] = js.undefined
  var unpinned: js.UndefOr[String] = js.undefined
}

object Initial {
  @scala.inline
  def apply(
    initial: String = null,
    notBottom: String = null,
    notTop: String = null,
    pinned: String = null,
    top: String = null,
    unpinned: String = null
  ): Initial = {
    val __obj = js.Dynamic.literal()
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (notBottom != null) __obj.updateDynamic("notBottom")(notBottom.asInstanceOf[js.Any])
    if (notTop != null) __obj.updateDynamic("notTop")(notTop.asInstanceOf[js.Any])
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (unpinned != null) __obj.updateDynamic("unpinned")(unpinned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial]
  }
}

