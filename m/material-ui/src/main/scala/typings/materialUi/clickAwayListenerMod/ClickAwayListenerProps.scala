package typings.materialUi.clickAwayListenerMod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickAwayListenerProps extends Props[ClickAwayListener] {
  var onClickAway: js.UndefOr[js.Any] = js.undefined
}

object ClickAwayListenerProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    key: Key = null,
    onClickAway: js.Any = null,
    ref: LegacyRef[ClickAwayListener] = null
  ): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClickAway != null) __obj.updateDynamic("onClickAway")(onClickAway.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
}

