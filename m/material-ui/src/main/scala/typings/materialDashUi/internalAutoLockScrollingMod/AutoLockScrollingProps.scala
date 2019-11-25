package typings.materialDashUi.internalAutoLockScrollingMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLockScrollingProps extends Props[AutoLockScrolling] {
  var lock: Boolean
}

object AutoLockScrollingProps {
  @scala.inline
  def apply(
    lock: Boolean,
    children: ReactNode = null,
    key: Key = null,
    ref: LegacyRef[AutoLockScrolling] = null
  ): AutoLockScrollingProps = {
    val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoLockScrollingProps]
  }
}

