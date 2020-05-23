package typings.materialSwitch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/switch.@material/switch/adapter.MDCSwitchAdapter> */
trait PartialMDCSwitchAdapter extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var setNativeControlAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.undefined
  var setNativeControlChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.undefined
}

object PartialMDCSwitchAdapter {
  @scala.inline
  def apply(
    addClass: /* className */ String => Unit = null,
    removeClass: /* className */ String => Unit = null,
    setNativeControlAttr: (/* attr */ String, /* value */ String) => Unit = null,
    setNativeControlChecked: /* checked */ Boolean => Unit = null,
    setNativeControlDisabled: /* disabled */ Boolean => Unit = null
  ): PartialMDCSwitchAdapter = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1(addClass))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1(removeClass))
    if (setNativeControlAttr != null) __obj.updateDynamic("setNativeControlAttr")(js.Any.fromFunction2(setNativeControlAttr))
    if (setNativeControlChecked != null) __obj.updateDynamic("setNativeControlChecked")(js.Any.fromFunction1(setNativeControlChecked))
    if (setNativeControlDisabled != null) __obj.updateDynamic("setNativeControlDisabled")(js.Any.fromFunction1(setNativeControlDisabled))
    __obj.asInstanceOf[PartialMDCSwitchAdapter]
  }
}

