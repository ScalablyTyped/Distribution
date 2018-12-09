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

