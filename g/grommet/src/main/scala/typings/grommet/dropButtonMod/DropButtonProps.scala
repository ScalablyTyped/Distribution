package typings.grommet.dropButtonMod

import typings.grommet.anon.Bottom
import typings.grommet.dropMod.DropProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropButtonProps extends js.Object {
  var dropAlign: js.UndefOr[Bottom] = js.undefined
  var dropContent: Element
  var dropProps: js.UndefOr[DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
}

object DropButtonProps {
  @scala.inline
  def apply(
    dropContent: Element,
    dropAlign: Bottom = null,
    dropProps: DropProps = null,
    dropTarget: js.Object = null,
    onClose: /* repeated */ js.Any => Unit = null,
    onOpen: /* repeated */ js.Any => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined
  ): DropButtonProps = {
    val __obj = js.Dynamic.literal(dropContent = dropContent.asInstanceOf[js.Any])
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign.asInstanceOf[js.Any])
    if (dropProps != null) __obj.updateDynamic("dropProps")(dropProps.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropButtonProps]
  }
}

