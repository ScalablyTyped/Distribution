package typings
package luscaLib.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Documentation declares that:
  *~ Setting any value to false will disable it.
  */
trait LuscaOptions extends js.Object {
  var csp: js.UndefOr[cspOptions | luscaLib.luscaLibNumbers.`false`] = js.undefined
  var csrf: js.UndefOr[csrfOptions | scala.Boolean] = js.undefined
  var hsts: js.UndefOr[hstsOptions | luscaLib.luscaLibNumbers.`false`] = js.undefined
  var nosniff: js.UndefOr[scala.Boolean] = js.undefined
  var p3p: js.UndefOr[java.lang.String | luscaLib.luscaLibNumbers.`false`] = js.undefined
  var referrerPolicy: js.UndefOr[java.lang.String | luscaLib.luscaLibNumbers.`false`] = js.undefined
  var xframe: js.UndefOr[java.lang.String | luscaLib.luscaLibNumbers.`false`] = js.undefined
  var xssProtection: js.UndefOr[xssProtectionOptions | scala.Boolean] = js.undefined
}

object LuscaOptions {
  @scala.inline
  def apply(
    csp: cspOptions | luscaLib.luscaLibNumbers.`false` = null,
    csrf: csrfOptions | scala.Boolean = null,
    hsts: hstsOptions | luscaLib.luscaLibNumbers.`false` = null,
    nosniff: js.UndefOr[scala.Boolean] = js.undefined,
    p3p: java.lang.String | luscaLib.luscaLibNumbers.`false` = null,
    referrerPolicy: java.lang.String | luscaLib.luscaLibNumbers.`false` = null,
    xframe: java.lang.String | luscaLib.luscaLibNumbers.`false` = null,
    xssProtection: xssProtectionOptions | scala.Boolean = null
  ): LuscaOptions = {
    val __obj = js.Dynamic.literal()
    if (csp != null) __obj.updateDynamic("csp")(csp.asInstanceOf[js.Any])
    if (csrf != null) __obj.updateDynamic("csrf")(csrf.asInstanceOf[js.Any])
    if (hsts != null) __obj.updateDynamic("hsts")(hsts.asInstanceOf[js.Any])
    if (!js.isUndefined(nosniff)) __obj.updateDynamic("nosniff")(nosniff)
    if (p3p != null) __obj.updateDynamic("p3p")(p3p.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (xframe != null) __obj.updateDynamic("xframe")(xframe.asInstanceOf[js.Any])
    if (xssProtection != null) __obj.updateDynamic("xssProtection")(xssProtection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LuscaOptions]
  }
}

