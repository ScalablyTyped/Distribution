package typings
package isDashHotkeyLib.isDashHotkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotKey extends js.Object {
  var altKey: scala.Boolean
  var ctrlKey: scala.Boolean
  var key: js.UndefOr[java.lang.String] = js.undefined
  var metaKey: scala.Boolean
  var shiftKey: scala.Boolean
  var which: js.UndefOr[scala.Double] = js.undefined
}

object HotKey {
  @scala.inline
  def apply(
    altKey: scala.Boolean,
    ctrlKey: scala.Boolean,
    metaKey: scala.Boolean,
    shiftKey: scala.Boolean,
    key: java.lang.String = null,
    which: scala.Int | scala.Double = null
  ): HotKey = {
    val __obj = js.Dynamic.literal(altKey = altKey, ctrlKey = ctrlKey, metaKey = metaKey, shiftKey = shiftKey)
    if (key != null) __obj.updateDynamic("key")(key)
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotKey]
  }
}

