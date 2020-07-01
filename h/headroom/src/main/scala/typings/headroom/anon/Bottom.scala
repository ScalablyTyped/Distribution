package typings.headroom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottom extends js.Object {
  /** when at bottom of scoll area */
  var bottom: js.UndefOr[String] = js.undefined
  /** when frozen method has been called */
  var frozen: js.UndefOr[String] = js.undefined
  /** when element is initialised */
  var initial: js.UndefOr[String] = js.undefined
  /** when not at bottom of scroll area */
  var notBottom: js.UndefOr[String] = js.undefined
  /** when below offset */
  var notTop: js.UndefOr[String] = js.undefined
  /** when scrolling up */
  var pinned: js.UndefOr[String] = js.undefined
  /** when above offset */
  var top: js.UndefOr[String] = js.undefined
  /** when scrolling down */
  var unpinned: js.UndefOr[String] = js.undefined
}

object Bottom {
  @scala.inline
  def apply(
    bottom: String = null,
    frozen: String = null,
    initial: String = null,
    notBottom: String = null,
    notTop: String = null,
    pinned: String = null,
    top: String = null,
    unpinned: String = null
  ): Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (frozen != null) __obj.updateDynamic("frozen")(frozen.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (notBottom != null) __obj.updateDynamic("notBottom")(notBottom.asInstanceOf[js.Any])
    if (notTop != null) __obj.updateDynamic("notTop")(notTop.asInstanceOf[js.Any])
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (unpinned != null) __obj.updateDynamic("unpinned")(unpinned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
}

