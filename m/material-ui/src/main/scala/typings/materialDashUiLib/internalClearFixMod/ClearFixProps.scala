package typings
package materialDashUiLib.internalClearFixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearFixProps
  extends reactLib.reactMod.Props[ClearFix] {
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ClearFixProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[ClearFix] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ClearFixProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ClearFixProps]
  }
}

