package typings.materialDashUi.underscoreUnderscoreMaterialUINs.ListNs

import typings.react.Event
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectableProps extends js.Object {
  var onChange: js.UndefOr[js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* value */ js.Any, Unit]] = js.undefined
  var selectedItemStyle: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SelectableProps {
  @scala.inline
  def apply(
    onChange: (/* e */ SyntheticEvent[js.Object, Event], /* value */ js.Any) => Unit = null,
    selectedItemStyle: CSSProperties = null,
    value: js.Any = null
  ): SelectableProps = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (selectedItemStyle != null) __obj.updateDynamic("selectedItemStyle")(selectedItemStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SelectableProps]
  }
}

