package typings.ibmDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var connectTimeout: js.UndefOr[Double | Null] = js.undefined
  var connected: js.UndefOr[Boolean] = js.undefined
  var fetchMode: js.UndefOr[Double | Null] = js.undefined
  var odbc: js.UndefOr[ODBC] = js.undefined
  var queue: js.UndefOr[SimpleQueue | js.Array[_]] = js.undefined
  var systemNaming: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    connectTimeout: js.UndefOr[Null | Double] = js.undefined,
    connected: js.UndefOr[Boolean] = js.undefined,
    fetchMode: js.UndefOr[Null | Double] = js.undefined,
    odbc: ODBC = null,
    queue: SimpleQueue | js.Array[_] = null,
    systemNaming: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(connected)) __obj.updateDynamic("connected")(connected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchMode)) __obj.updateDynamic("fetchMode")(fetchMode.asInstanceOf[js.Any])
    if (odbc != null) __obj.updateDynamic("odbc")(odbc.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (!js.isUndefined(systemNaming)) __obj.updateDynamic("systemNaming")(systemNaming.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

