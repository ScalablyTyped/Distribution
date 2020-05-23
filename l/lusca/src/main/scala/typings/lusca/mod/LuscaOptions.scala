package typings.lusca.mod

import typings.lusca.luscaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Documentation declares that:
  *~ Setting any value to false will disable it.
  */
trait LuscaOptions extends js.Object {
  var csp: js.UndefOr[cspOptions | `false`] = js.undefined
  var csrf: js.UndefOr[csrfOptions | Boolean] = js.undefined
  var hsts: js.UndefOr[hstsOptions | `false`] = js.undefined
  var nosniff: js.UndefOr[Boolean] = js.undefined
  var p3p: js.UndefOr[String | `false`] = js.undefined
  var referrerPolicy: js.UndefOr[String | `false`] = js.undefined
  var xframe: js.UndefOr[String | `false`] = js.undefined
  var xssProtection: js.UndefOr[xssProtectionOptions | Boolean] = js.undefined
}

object LuscaOptions {
  @scala.inline
  def apply(
    csp: cspOptions | `false` = null,
    csrf: csrfOptions | Boolean = null,
    hsts: hstsOptions | `false` = null,
    nosniff: js.UndefOr[Boolean] = js.undefined,
    p3p: String | `false` = null,
    referrerPolicy: String | `false` = null,
    xframe: String | `false` = null,
    xssProtection: xssProtectionOptions | Boolean = null
  ): LuscaOptions = {
    val __obj = js.Dynamic.literal()
    if (csp != null) __obj.updateDynamic("csp")(csp.asInstanceOf[js.Any])
    if (csrf != null) __obj.updateDynamic("csrf")(csrf.asInstanceOf[js.Any])
    if (hsts != null) __obj.updateDynamic("hsts")(hsts.asInstanceOf[js.Any])
    if (!js.isUndefined(nosniff)) __obj.updateDynamic("nosniff")(nosniff.get.asInstanceOf[js.Any])
    if (p3p != null) __obj.updateDynamic("p3p")(p3p.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (xframe != null) __obj.updateDynamic("xframe")(xframe.asInstanceOf[js.Any])
    if (xssProtection != null) __obj.updateDynamic("xssProtection")(xssProtection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LuscaOptions]
  }
}

