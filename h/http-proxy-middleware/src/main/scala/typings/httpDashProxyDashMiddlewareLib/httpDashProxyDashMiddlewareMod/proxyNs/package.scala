package typings
package httpDashProxyDashMiddlewareLib.httpDashProxyDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object proxyNs {
  type Filter = js.Function2[
    /* pathanme */ java.lang.String, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    scala.Boolean
  ]
  type Logger = js.Function1[/* repeated */js.Any, scala.Unit]
  type Proxy = connectLib.connectMod.createServerNs.NextHandleFunction
}
