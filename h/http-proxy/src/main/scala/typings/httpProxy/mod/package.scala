package typings.httpProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorCallback = js.Function4[
    /* err */ typings.std.Error, 
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    /* target */ js.UndefOr[typings.httpProxy.mod.ProxyTargetUrl], 
    scala.Unit
  ]
  type ProxyTarget = typings.httpProxy.mod.ProxyTargetUrl | typings.httpProxy.mod.ProxyTargetDetailed
  type ProxyTargetUrl = java.lang.String | typings.httpProxy.PartialUrl
}
