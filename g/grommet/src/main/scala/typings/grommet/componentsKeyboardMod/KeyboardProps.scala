package typings.grommet.componentsKeyboardMod

import typings.grommet.grommetStrings.component
import typings.grommet.grommetStrings.document
import typings.grommet.utilsMod.KeyboardType
import typings.react.reactMod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardProps extends js.Object {
  var onBackspace: js.UndefOr[KeyboardType] = js.undefined
  var onComma: js.UndefOr[KeyboardType] = js.undefined
  var onDown: js.UndefOr[KeyboardType] = js.undefined
  var onEnter: js.UndefOr[KeyboardType] = js.undefined
  var onEsc: js.UndefOr[KeyboardType] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardType] = js.undefined
  var onLeft: js.UndefOr[KeyboardType] = js.undefined
  var onRight: js.UndefOr[KeyboardType] = js.undefined
  var onShift: js.UndefOr[KeyboardType] = js.undefined
  var onSpace: js.UndefOr[KeyboardType] = js.undefined
  var onTab: js.UndefOr[KeyboardType] = js.undefined
  var onUp: js.UndefOr[KeyboardType] = js.undefined
  var target: js.UndefOr[component | document] = js.undefined
}

object KeyboardProps {
  @scala.inline
  def apply(
    onBackspace: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onComma: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onDown: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onEnter: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onEsc: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onKeyDown: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onLeft: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onRight: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onShift: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onSpace: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onTab: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onUp: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    target: component | document = null
  ): KeyboardProps = {
    val __obj = js.Dynamic.literal()
    if (onBackspace != null) __obj.updateDynamic("onBackspace")(js.Any.fromFunction1(onBackspace))
    if (onComma != null) __obj.updateDynamic("onComma")(js.Any.fromFunction1(onComma))
    if (onDown != null) __obj.updateDynamic("onDown")(js.Any.fromFunction1(onDown))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction1(onEsc))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onLeft != null) __obj.updateDynamic("onLeft")(js.Any.fromFunction1(onLeft))
    if (onRight != null) __obj.updateDynamic("onRight")(js.Any.fromFunction1(onRight))
    if (onShift != null) __obj.updateDynamic("onShift")(js.Any.fromFunction1(onShift))
    if (onSpace != null) __obj.updateDynamic("onSpace")(js.Any.fromFunction1(onSpace))
    if (onTab != null) __obj.updateDynamic("onTab")(js.Any.fromFunction1(onTab))
    if (onUp != null) __obj.updateDynamic("onUp")(js.Any.fromFunction1(onUp))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardProps]
  }
}

