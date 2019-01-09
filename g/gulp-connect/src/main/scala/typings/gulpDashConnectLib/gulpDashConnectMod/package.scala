package typings
package gulpDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashConnectMod {
  type ConnectRouteHandler = js.Tuple2[java.lang.String, connectLib.connectMod.createServerNs.HandleFunction]
  type MiddlewareFactory = js.Function2[
    /* connect */ js.Function0[connectLib.connectMod.createServerNs.Server] with gulpDashConnectLib.Anon_CreateServer, 
    /* options */ ConnectAppOptions, 
    js.Array[connectLib.connectMod.createServerNs.HandleFunction | ConnectRouteHandler]
  ]
}
