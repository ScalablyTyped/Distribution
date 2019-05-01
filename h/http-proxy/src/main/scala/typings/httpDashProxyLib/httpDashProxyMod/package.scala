package typings
package httpDashProxyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashProxyMod {
  type ErrorCallback = js.Function4[
    /* err */ stdLib.Error, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* target */ js.UndefOr[ProxyTargetUrl], 
    scala.Unit
  ]
  type ProxyTargetUrl = java.lang.String | nodeLib.urlMod.Url
}
