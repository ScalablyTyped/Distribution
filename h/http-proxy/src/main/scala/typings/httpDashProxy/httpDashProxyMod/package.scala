package typings.httpDashProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashProxyMod {
  import typings.node.httpMod.IncomingMessage
  import typings.node.httpMod.ServerResponse
  import typings.node.urlMod.Url
  import typings.std.Error

  type ErrorCallback = js.Function4[
    /* err */ Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* target */ js.UndefOr[ProxyTargetUrl], 
    Unit
  ]
  type ProxyTargetUrl = String | Url
}
