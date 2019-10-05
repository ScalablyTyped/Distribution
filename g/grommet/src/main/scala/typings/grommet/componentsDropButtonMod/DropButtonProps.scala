package typings.grommet.componentsDropButtonMod

import typings.grommet.Anon_BottomLeft
import typings.grommet.componentsDropMod.DropProps
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropButtonProps extends js.Object {
  var dropAlign: js.UndefOr[Anon_BottomLeft] = js.undefined
  var dropContent: Element
  var dropProps: js.UndefOr[DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
}

object DropButtonProps {
  @scala.inline
  def apply(
    dropContent: Element,
    dropAlign: Anon_BottomLeft = null,
    dropProps: DropProps = null,
    dropTarget: js.Object = null,
    onClose: /* repeated */ js.Any => _ = null,
    onOpen: /* repeated */ js.Any => _ = null,
    open: js.UndefOr[Boolean] = js.undefined
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

