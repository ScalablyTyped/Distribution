package typings
package grommetLib.componentsKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardProps extends js.Object {
  var onBackspace: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onComma: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onDown: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onEnter: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onEsc: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onLeft: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onRight: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onShift: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSpace: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onTab: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onUp: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var target: js.UndefOr[grommetLib.grommetLibStrings.component | grommetLib.grommetLibStrings.document] = js.undefined
}

object KeyboardProps {
  @scala.inline
  def apply(
    onBackspace: /* repeated */ js.Any => _ = null,
    onComma: /* repeated */ js.Any => _ = null,
    onDown: /* repeated */ js.Any => _ = null,
    onEnter: /* repeated */ js.Any => _ = null,
    onEsc: /* repeated */ js.Any => _ = null,
    onKeyDown: /* repeated */ js.Any => _ = null,
    onLeft: /* repeated */ js.Any => _ = null,
    onRight: /* repeated */ js.Any => _ = null,
    onShift: /* repeated */ js.Any => _ = null,
    onSpace: /* repeated */ js.Any => _ = null,
    onTab: /* repeated */ js.Any => _ = null,
    onUp: /* repeated */ js.Any => _ = null,
    target: grommetLib.grommetLibStrings.component | grommetLib.grommetLibStrings.document = null
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

