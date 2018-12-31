package typings
package luscaLib.luscaMod.luscaNs

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

