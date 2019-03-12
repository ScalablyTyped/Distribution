package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.ListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectableProps extends js.Object {
  var onChange: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event], 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var selectedItemStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SelectableProps {
  @scala.inline
  def apply(
    onChange: (/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event], /* value */ js.Any) => scala.Unit = null,
    selectedItemStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: js.Any = null
  ): SelectableProps = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (selectedItemStyle != null) __obj.updateDynamic("selectedItemStyle")(selectedItemStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SelectableProps]
  }
}

