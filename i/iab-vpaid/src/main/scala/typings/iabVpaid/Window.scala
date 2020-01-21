package typings.iabVpaid

import typings.iabVpaid.iab.vpaid.VpaidCreative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  /** VPAID entry point */
  var getVPAIDAd: js.UndefOr[js.Function0[VpaidCreative]] = js.undefined
}

object Window {
  @scala.inline
  def apply(getVPAIDAd: () => VpaidCreative = null): Window = {
    val __obj = js.Dynamic.literal()
    if (getVPAIDAd != null) __obj.updateDynamic("getVPAIDAd")(js.Any.fromFunction0(getVPAIDAd))
    __obj.asInstanceOf[Window]
  }
}

