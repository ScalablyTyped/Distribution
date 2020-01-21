package typings.materialUi.MaterialUI.Switches

import typings.materialUi.materialUiStrings.left
import typings.materialUi.materialUiStrings.right
import typings.react.mod.CSSProperties
import typings.react.mod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonGroupProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defaultSelected: js.UndefOr[js.Any] = js.undefined
  var labelPosition: js.UndefOr[left | right] = js.undefined
  var name: String
  var onChange: js.UndefOr[js.Function2[/* e */ FormEvent[js.Object], /* selected */ String, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var valueSelected: js.UndefOr[js.Any] = js.undefined
}

object RadioButtonGroupProps {
  @scala.inline
  def apply(
    name: String,
    className: String = null,
    defaultSelected: js.Any = null,
    labelPosition: left | right = null,
    onChange: (/* e */ FormEvent[js.Object], /* selected */ String) => Unit = null,
    style: CSSProperties = null,
    valueSelected: js.Any = null
  ): RadioButtonGroupProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (valueSelected != null) __obj.updateDynamic("valueSelected")(valueSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonGroupProps]
  }
}

