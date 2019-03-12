package typings
package lovefieldLib.lovefieldMod.lfNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var onUpgrade: js.UndefOr[
    js.Function1[/* rawDb */ lovefieldLib.lovefieldMod.lfNs.rawNs.BackStore, js.Promise[scala.Unit]]
  ] = js.undefined
  var storeType: js.UndefOr[DataStoreType] = js.undefined
  var webSqlDbSize: js.UndefOr[scala.Double] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    onUpgrade: /* rawDb */ lovefieldLib.lovefieldMod.lfNs.rawNs.BackStore => js.Promise[scala.Unit] = null,
    storeType: DataStoreType = null,
    webSqlDbSize: scala.Int | scala.Double = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (onUpgrade != null) __obj.updateDynamic("onUpgrade")(js.Any.fromFunction1(onUpgrade))
    if (storeType != null) __obj.updateDynamic("storeType")(storeType)
    if (webSqlDbSize != null) __obj.updateDynamic("webSqlDbSize")(webSqlDbSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

