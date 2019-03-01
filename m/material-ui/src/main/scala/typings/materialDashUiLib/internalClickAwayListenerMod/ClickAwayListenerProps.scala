package typings
package materialDashUiLib.internalClickAwayListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickAwayListenerProps
  extends reactLib.reactMod.ReactNs.Props[ClickAwayListener] {
  var onClickAway: js.UndefOr[js.Any] = js.undefined
}

object ClickAwayListenerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    onClickAway: js.Any = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[ClickAwayListener] = null
  ): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClickAway != null) __obj.updateDynamic("onClickAway")(onClickAway)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
}

