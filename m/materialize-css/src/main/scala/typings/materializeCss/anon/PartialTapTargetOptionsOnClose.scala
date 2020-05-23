package typings.materializeCss.anon

import typings.materializeCss.M.TapTarget
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TapTargetOptions> */
trait PartialTapTargetOptionsOnClose extends js.Object {
  var onClose: js.UndefOr[js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]] = js.undefined
  var onOpen: js.UndefOr[js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]] = js.undefined
}

object PartialTapTargetOptionsOnClose {
  @scala.inline
  def apply(
    onClose: js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit] = null,
    onOpen: js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit] = null
  ): PartialTapTargetOptionsOnClose = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTapTargetOptionsOnClose]
  }
}

