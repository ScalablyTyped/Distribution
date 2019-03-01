package typings
package headroomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Initial extends js.Object {
  var initial: js.UndefOr[java.lang.String] = js.undefined
  var notBottom: js.UndefOr[java.lang.String] = js.undefined
  var notTop: js.UndefOr[java.lang.String] = js.undefined
  var pinned: js.UndefOr[java.lang.String] = js.undefined
  var top: js.UndefOr[java.lang.String] = js.undefined
  var unpinned: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Initial {
  @scala.inline
  def apply(
    initial: java.lang.String = null,
    notBottom: java.lang.String = null,
    notTop: java.lang.String = null,
    pinned: java.lang.String = null,
    top: java.lang.String = null,
    unpinned: java.lang.String = null
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

