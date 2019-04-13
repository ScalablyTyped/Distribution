package typings
package materialDashUiLib.internalAutoLockScrollingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLockScrollingProps
  extends reactLib.reactMod.Props[AutoLockScrolling] {
  var lock: scala.Boolean
}

object AutoLockScrollingProps {
  @scala.inline
  def apply(
    lock: scala.Boolean,
    children: reactLib.reactMod.ReactNode = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[AutoLockScrolling] = null
  ): AutoLockScrollingProps = {
    val __obj = js.Dynamic.literal(lock = lock)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoLockScrollingProps]
  }
}

