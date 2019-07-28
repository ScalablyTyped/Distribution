package typings.materialDashUi.internalClearFixMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
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
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ClearFixProps]
  }
}

