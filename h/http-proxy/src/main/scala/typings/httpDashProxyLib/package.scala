package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashProxyLib {
  type ErrorCallback = js.Function4[
    /* err */ nodeLib.Error, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify http.IncomingMessage */ /* req */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify http.ServerResponse */ /* res */ js.Any, 
    /* target */ js.UndefOr[ProxyTargetUrl], 
    scala.Unit
  ]
  type ProxyTargetUrl = java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify url.Url */ js.Any)
}
