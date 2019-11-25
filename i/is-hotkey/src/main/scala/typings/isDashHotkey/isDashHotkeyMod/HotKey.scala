package typings.isDashHotkey.isDashHotkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotKey extends js.Object {
  var altKey: Boolean
  var ctrlKey: Boolean
  var key: js.UndefOr[String] = js.undefined
  var metaKey: Boolean
  var shiftKey: Boolean
  var which: js.UndefOr[Double] = js.undefined
}

object HotKey {
  @scala.inline
  def apply(
    altKey: Boolean,
    ctrlKey: Boolean,
    metaKey: Boolean,
    shiftKey: Boolean,
    key: String = null,
    which: Int | Double = null
  ): HotKey = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotKey]
  }
}

