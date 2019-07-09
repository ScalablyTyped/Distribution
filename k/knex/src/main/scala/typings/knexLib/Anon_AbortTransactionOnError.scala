package typings
package knexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbortTransactionOnError extends js.Object {
  var abortTransactionOnError: js.UndefOr[scala.Boolean] = js.undefined
  var appName: js.UndefOr[java.lang.String] = js.undefined
  var encrypt: js.UndefOr[scala.Boolean] = js.undefined
  var instanceName: js.UndefOr[java.lang.String] = js.undefined
  var tdsVersion: js.UndefOr[java.lang.String] = js.undefined
  var trustedConnection: js.UndefOr[scala.Boolean] = js.undefined
  var useUTC: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AbortTransactionOnError {
  @scala.inline
  def apply(
    abortTransactionOnError: js.UndefOr[scala.Boolean] = js.undefined,
    appName: java.lang.String = null,
    encrypt: js.UndefOr[scala.Boolean] = js.undefined,
    instanceName: java.lang.String = null,
    tdsVersion: java.lang.String = null,
    trustedConnection: js.UndefOr[scala.Boolean] = js.undefined,
    useUTC: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AbortTransactionOnError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortTransactionOnError)) __obj.updateDynamic("abortTransactionOnError")(abortTransactionOnError)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt)
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName)
    if (tdsVersion != null) __obj.updateDynamic("tdsVersion")(tdsVersion)
    if (!js.isUndefined(trustedConnection)) __obj.updateDynamic("trustedConnection")(trustedConnection)
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC)
    __obj.asInstanceOf[Anon_AbortTransactionOnError]
  }
}

