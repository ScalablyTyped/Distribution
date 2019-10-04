package typings.grommet.componentsKeyboardMod

import typings.grommet.grommetStrings.component
import typings.grommet.grommetStrings.document
import typings.grommet.utilsMod.KeyboardType
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
    onBackspace: KeyboardType = null,
    onComma: KeyboardType = null,
    onDown: KeyboardType = null,
    onEnter: KeyboardType = null,
    onEsc: KeyboardType = null,
    onKeyDown: KeyboardType = null,
    onLeft: KeyboardType = null,
    onRight: KeyboardType = null,
    onShift: KeyboardType = null,
    onSpace: KeyboardType = null,
    onTab: KeyboardType = null,
    onUp: KeyboardType = null,
    target: component | document = null
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

