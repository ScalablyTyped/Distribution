package typings
package grommetLib.componentsDropButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropButtonProps extends js.Object {
  var dropAlign: js.UndefOr[grommetLib.Anon_BottomLeft] = js.undefined
  var dropContent: reactLib.reactMod.Global.JSXNs.Element
  var dropProps: js.UndefOr[grommetLib.componentsDropMod.DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
}

object DropButtonProps {
  @scala.inline
  def apply(
    dropContent: reactLib.reactMod.Global.JSXNs.Element,
    dropAlign: grommetLib.Anon_BottomLeft = null,
    dropProps: grommetLib.componentsDropMod.DropProps = null,
    dropTarget: js.Object = null,
    onClose: /* repeated */ js.Any => _ = null,
    onOpen: /* repeated */ js.Any => _ = null,
    open: js.UndefOr[scala.Boolean] = js.undefined
  ): DropButtonProps = {
    val __obj = js.Dynamic.literal(dropContent = dropContent)
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign)
    if (dropProps != null) __obj.updateDynamic("dropProps")(dropProps)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[DropButtonProps]
  }
}

