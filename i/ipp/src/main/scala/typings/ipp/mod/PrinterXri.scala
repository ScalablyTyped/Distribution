package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterXri extends js.Object {
  var `xri-authentication`: js.UndefOr[XriAuthentication] = js.undefined
  var `xri-security`: js.UndefOr[XriSecurity] = js.undefined
  var `xri-uri`: js.UndefOr[String] = js.undefined
}

object PrinterXri {
  @scala.inline
  def apply(
    `xri-authentication`: XriAuthentication = null,
    `xri-security`: XriSecurity = null,
    `xri-uri`: String = null
  ): PrinterXri = {
    val __obj = js.Dynamic.literal()
    if (`xri-authentication` != null) __obj.updateDynamic("xri-authentication")(`xri-authentication`.asInstanceOf[js.Any])
    if (`xri-security` != null) __obj.updateDynamic("xri-security")(`xri-security`.asInstanceOf[js.Any])
    if (`xri-uri` != null) __obj.updateDynamic("xri-uri")(`xri-uri`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterXri]
  }
}

