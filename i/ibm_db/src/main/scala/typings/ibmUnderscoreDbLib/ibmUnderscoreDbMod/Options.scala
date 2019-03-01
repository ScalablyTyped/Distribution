package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var conected: js.UndefOr[scala.Boolean] = js.undefined
  var connectTimeout: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var fetchMode: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var odbc: js.UndefOr[ODBC] = js.undefined
  var queue: js.UndefOr[SimpleQueue | js.Array[_]] = js.undefined
  var systemNaming: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    conected: js.UndefOr[scala.Boolean] = js.undefined,
    connectTimeout: scala.Int | scala.Double = null,
    fetchMode: scala.Int | scala.Double = null,
    odbc: ODBC = null,
    queue: SimpleQueue | js.Array[_] = null,
    systemNaming: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(conected)) __obj.updateDynamic("conected")(conected)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (fetchMode != null) __obj.updateDynamic("fetchMode")(fetchMode.asInstanceOf[js.Any])
    if (odbc != null) __obj.updateDynamic("odbc")(odbc)
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (!js.isUndefined(systemNaming)) __obj.updateDynamic("systemNaming")(systemNaming)
    __obj.asInstanceOf[Options]
  }
}

