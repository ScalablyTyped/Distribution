package typings.materialUi.clearFixMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearFixProps extends Props[ClearFix] {
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ClearFixProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    key: Key = null,
    ref: LegacyRef[ClearFix] = null,
    style: CSSProperties = null
  ): ClearFixProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearFixProps]
  }
}

