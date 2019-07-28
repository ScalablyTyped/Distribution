package typings.grommet.componentsFormMod

import typings.grommet.Anon_Invalid
import typings.react.Element
import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends js.Object {
  var errors: js.UndefOr[js.Object] = js.undefined
  var messages: js.UndefOr[Anon_Invalid] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var value: js.UndefOr[js.Object] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    errors: js.Object = null,
    messages: Anon_Invalid = null,
    onChange: /* repeated */ js.Any => _ = null,
    onReset: /* event */ SyntheticEvent[Element, Event] => _ = null,
    onSubmit: /* repeated */ js.Any => _ = null,
    value: js.Object = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FormProps]
  }
}

