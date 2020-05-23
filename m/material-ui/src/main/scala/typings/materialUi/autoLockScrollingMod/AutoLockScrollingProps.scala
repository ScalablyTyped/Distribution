package typings.materialUi.autoLockScrollingMod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
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
    ref: js.UndefOr[Null | LegacyRef[AutoLockScrolling]] = js.undefined
  ): AutoLockScrollingProps = {
    val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoLockScrollingProps]
  }
}

