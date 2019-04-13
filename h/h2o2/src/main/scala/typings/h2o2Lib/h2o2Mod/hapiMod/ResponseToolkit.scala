package typings
package h2o2Lib.h2o2Mod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseToolkit extends js.Object {
  /**
    * Proxies the request to an upstream endpoint. `async`, so you'll need to `await` the `ResponseObject` to work on it before returning it.
    */
  def proxy(options: h2o2Lib.h2o2Mod.ProxyHandlerOptions): js.Promise[hapiLib.hapiMod.ResponseObject]
}

object ResponseToolkit {
  @scala.inline
  def apply(proxy: h2o2Lib.h2o2Mod.ProxyHandlerOptions => js.Promise[hapiLib.hapiMod.ResponseObject]): ResponseToolkit = {
    val __obj = js.Dynamic.literal(proxy = js.Any.fromFunction1(proxy))
  
    __obj.asInstanceOf[ResponseToolkit]
  }
}

