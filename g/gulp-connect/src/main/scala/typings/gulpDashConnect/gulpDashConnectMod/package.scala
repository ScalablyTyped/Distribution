package typings.gulpDashConnect

import typings.connect.connectMod.HandleFunction
import typings.connect.connectMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashConnectMod {
  type ConnectRouteHandler = js.Tuple2[String, HandleFunction]
  type MiddlewareFactory = js.Function2[
    /* connect */ js.Function0[Server], 
    /* options */ ConnectAppOptions, 
    js.Array[HandleFunction | ConnectRouteHandler]
  ]
}
