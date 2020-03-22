package typings.materialIconButton

import typings.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/icon-button.@material/icon-button/adapter.MDCIconButtonToggleAdapter> */
trait PartialMDCIconButtonToggl extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
  var notifyChange: js.UndefOr[js.Function1[/* evtData */ MDCIconButtonToggleEventDetail, Unit]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var setAttr: js.UndefOr[js.Function2[/* attrName */ String, /* attrValue */ String, Unit]] = js.undefined
}

object PartialMDCIconButtonToggl {
  @scala.inline
  def apply(
    addClass: /* className */ String => Unit = null,
    hasClass: /* className */ String => Boolean = null,
    notifyChange: /* evtData */ MDCIconButtonToggleEventDetail => Unit = null,
    removeClass: /* className */ String => Unit = null,
    setAttr: (/* attrName */ String, /* attrValue */ String) => Unit = null
  ): PartialMDCIconButtonToggl = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1(addClass))
    if (hasClass != null) __obj.updateDynamic("hasClass")(js.Any.fromFunction1(hasClass))
    if (notifyChange != null) __obj.updateDynamic("notifyChange")(js.Any.fromFunction1(notifyChange))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1(removeClass))
    if (setAttr != null) __obj.updateDynamic("setAttr")(js.Any.fromFunction2(setAttr))
    __obj.asInstanceOf[PartialMDCIconButtonToggl]
  }
}

