package typings
package httpDashProxyDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashProxyDashMiddlewareMod {
  type Filter = js.Function2[
    /* pathname */ java.lang.String, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    scala.Boolean
  ]
  type Logger = js.Function1[/* repeated */ js.Any, scala.Unit]
  type Proxy = connectLib.connectMod.NextHandleFunction
}
