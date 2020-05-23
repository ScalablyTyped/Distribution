package typings.lovefield.mod.schema

import typings.lovefield.mod.raw.BackStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var onUpgrade: js.UndefOr[js.Function1[/* rawDb */ BackStore, js.Promise[Unit]]] = js.undefined
  var storeType: js.UndefOr[DataStoreType] = js.undefined
  var webSqlDbSize: js.UndefOr[Double] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    onUpgrade: /* rawDb */ BackStore => js.Promise[Unit] = null,
    storeType: DataStoreType = null,
    webSqlDbSize: js.UndefOr[Double] = js.undefined
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (onUpgrade != null) __obj.updateDynamic("onUpgrade")(js.Any.fromFunction1(onUpgrade))
    if (storeType != null) __obj.updateDynamic("storeType")(storeType.asInstanceOf[js.Any])
    if (!js.isUndefined(webSqlDbSize)) __obj.updateDynamic("webSqlDbSize")(webSqlDbSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

