package typings.materializeCss

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TapTargetOptions> */
trait PartialTapTargetOptions extends js.Object {
  var onClose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* origin */ Element, Unit]] = js.undefined
  var onOpen: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* origin */ Element, Unit]] = js.undefined
}

object PartialTapTargetOptions {
  @scala.inline
  def apply(
    onClose: js.ThisFunction1[PartialTapTargetOptions, /* origin */ Element, Unit] = null,
    onOpen: js.ThisFunction1[PartialTapTargetOptions, /* origin */ Element, Unit] = null
  ): PartialTapTargetOptions = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTapTargetOptions]
  }
}

