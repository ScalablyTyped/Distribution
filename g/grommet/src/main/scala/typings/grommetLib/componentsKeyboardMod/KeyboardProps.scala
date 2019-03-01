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
    onBackspace: js.Function1[/* repeated */ js.Any, _] = null,
    onComma: js.Function1[/* repeated */ js.Any, _] = null,
    onDown: js.Function1[/* repeated */ js.Any, _] = null,
    onEnter: js.Function1[/* repeated */ js.Any, _] = null,
    onEsc: js.Function1[/* repeated */ js.Any, _] = null,
    onKeyDown: js.Function1[/* repeated */ js.Any, _] = null,
    onLeft: js.Function1[/* repeated */ js.Any, _] = null,
    onRight: js.Function1[/* repeated */ js.Any, _] = null,
    onShift: js.Function1[/* repeated */ js.Any, _] = null,
    onSpace: js.Function1[/* repeated */ js.Any, _] = null,
    onTab: js.Function1[/* repeated */ js.Any, _] = null,
    onUp: js.Function1[/* repeated */ js.Any, _] = null,
    target: grommetLib.grommetLibStrings.component | grommetLib.grommetLibStrings.document = null
  ): KeyboardProps = {
    val __obj = js.Dynamic.literal()
    if (onBackspace != null) __obj.updateDynamic("onBackspace")(onBackspace)
    if (onComma != null) __obj.updateDynamic("onComma")(onComma)
    if (onDown != null) __obj.updateDynamic("onDown")(onDown)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEsc != null) __obj.updateDynamic("onEsc")(onEsc)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onLeft != null) __obj.updateDynamic("onLeft")(onLeft)
    if (onRight != null) __obj.updateDynamic("onRight")(onRight)
    if (onShift != null) __obj.updateDynamic("onShift")(onShift)
    if (onSpace != null) __obj.updateDynamic("onSpace")(onSpace)
    if (onTab != null) __obj.updateDynamic("onTab")(onTab)
    if (onUp != null) __obj.updateDynamic("onUp")(onUp)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardProps]
  }
}

