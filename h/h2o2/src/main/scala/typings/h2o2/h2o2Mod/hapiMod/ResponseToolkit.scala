package typings.h2o2.h2o2Mod.hapiMod

import typings.h2o2.h2o2Mod.ProxyHandlerOptions
import typings.hapi.hapiMod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseToolkit extends js.Object {
  /**
    * Proxies the request to an upstream endpoint. `async`, so you'll need to `await` the `ResponseObject` to work on it before returning it.
    */
  def proxy(options: ProxyHandlerOptions): js.Promise[ResponseObject]
}

object ResponseToolkit {
  @scala.inline
  def apply(proxy: ProxyHandlerOptions => js.Promise[ResponseObject]): ResponseToolkit = {
    val __obj = js.Dynamic.literal(proxy = js.Any.fromFunction1(proxy))
  
    __obj.asInstanceOf[ResponseToolkit]
  }
}

