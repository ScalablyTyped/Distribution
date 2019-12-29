package typings.gulpDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashConnectMod {
  import typings.connect.connectMod.HandleFunction
  import typings.connect.connectMod.Server
  import typings.gulpDashConnect.TypeofconnectModule

  type ConnectRouteHandler = js.Tuple2[String, HandleFunction]
  type MiddlewareFactory = js.Function2[
    /* connect */ js.Function0[Server] with TypeofconnectModule, 
    /* options */ ConnectAppOptions, 
    js.Array[HandleFunction | ConnectRouteHandler]
  ]
}
