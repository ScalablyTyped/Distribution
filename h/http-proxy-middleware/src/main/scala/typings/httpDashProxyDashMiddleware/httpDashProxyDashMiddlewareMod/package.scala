package typings.httpDashProxyDashMiddleware

import typings.connect.connectMod.NextHandleFunction
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashProxyDashMiddlewareMod {
  type Filter = js.Function2[/* pathname */ String, /* req */ IncomingMessage, Boolean]
  type Logger = js.Function1[/* repeated */ js.Any, Unit]
  type Proxy = NextHandleFunction
}
