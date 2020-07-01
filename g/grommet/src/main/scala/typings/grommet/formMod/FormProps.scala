package typings.grommet.formMod

import typings.grommet.anon.Invalid
import typings.grommet.grommetStrings.blur
import typings.grommet.grommetStrings.submit
import typings.react.mod.FormEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps[T] extends js.Object {
  var errors: js.UndefOr[js.Object] = js.undefined
  var infos: js.UndefOr[js.Object] = js.undefined
  var messages: js.UndefOr[Invalid] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* event */ FormEvent[Element], Unit]] = js.undefined
  var validate: js.UndefOr[blur | submit] = js.undefined
  var value: js.UndefOr[js.Object] = js.undefined
}

object FormProps {
  @scala.inline
  def apply[T](
    errors: js.Object = null,
    infos: js.Object = null,
    messages: Invalid = null,
    onChange: /* value */ T => Unit = null,
    onReset: /* event */ SyntheticEvent[Element, Event] => _ = null,
    onSubmit: /* event */ FormEvent[Element] => Unit = null,
    validate: blur | submit = null,
    value: js.Object = null
  ): FormProps[T] = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (infos != null) __obj.updateDynamic("infos")(infos.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps[T]]
  }
}

