package typings.ibmUnderscoreDb.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var conected: js.UndefOr[Boolean] = js.undefined
  var connectTimeout: js.UndefOr[Double | Null] = js.undefined
  var fetchMode: js.UndefOr[Double | Null] = js.undefined
  var odbc: js.UndefOr[ODBC] = js.undefined
  var queue: js.UndefOr[SimpleQueue | js.Array[_]] = js.undefined
  var systemNaming: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    conected: js.UndefOr[Boolean] = js.undefined,
    connectTimeout: Int | Double = null,
    fetchMode: Int | Double = null,
    odbc: ODBC = null,
    queue: SimpleQueue | js.Array[_] = null,
    systemNaming: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(conected)) __obj.updateDynamic("conected")(conected.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (fetchMode != null) __obj.updateDynamic("fetchMode")(fetchMode.asInstanceOf[js.Any])
    if (odbc != null) __obj.updateDynamic("odbc")(odbc.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (!js.isUndefined(systemNaming)) __obj.updateDynamic("systemNaming")(systemNaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

