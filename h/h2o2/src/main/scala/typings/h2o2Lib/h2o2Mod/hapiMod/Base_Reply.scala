package typings
package h2o2Lib.h2o2Mod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Base_Reply extends js.Object {
  /**
           * Proxies the request to an upstream endpoint
           * @param options  an object including the same keys and restrictions defined by the [route proxy handler options](https://github.com/hapijs/h2o2#options).
           * [see docs](https://github.com/hapijs/h2o2#replyproxyoptions)
           */
  def proxy(options: h2o2Lib.h2o2Mod.H2o2Ns.ProxyHandlerOptions): scala.Unit
}

