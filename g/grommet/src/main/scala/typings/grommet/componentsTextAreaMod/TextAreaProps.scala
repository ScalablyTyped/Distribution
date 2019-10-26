package typings.grommet.componentsTextAreaMod

import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.vertical
import typings.grommet.grommetStrings.xlarge
import typings.react.reactMod.ChangeEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps extends js.Object {
  var fill: js.UndefOr[Boolean] = js.undefined
  var focusIndicator: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[Element], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[vertical | horizontal | Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TextAreaProps {
  @scala.inline
  def apply(
    fill: js.UndefOr[Boolean] = js.undefined,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    onChange: /* event */ ChangeEvent[Element] => Unit = null,
    placeholder: String = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    resize: vertical | horizontal | Boolean = null,
    size: small | medium | large | xlarge | String = null,
    value: String = null
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextAreaProps]
  }
}

