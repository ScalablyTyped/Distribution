package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashProxyLib {
  type ErrorCallback = js.Function4[
    /* err */ nodeLib.Error, 
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* target */ js.UndefOr[ProxyTargetUrl], 
    scala.Unit
  ]
  type ProxyTargetUrl = java.lang.String | js.Any
}
