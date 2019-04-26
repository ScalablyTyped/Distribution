package typings
package atHapiH2o2Lib.atHapiH2o2Mod.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseToolkit extends js.Object {
  /**
    * Proxies the request to an upstream endpoint. `async`, so you'll need to `await` the `ResponseObject` to work on it before returning it.
    */
  def proxy(options: atHapiH2o2Lib.atHapiH2o2Mod.ProxyHandlerOptions): js.Promise[atHapiHapiLib.atHapiHapiMod.ResponseObject]
}

object ResponseToolkit {
  @scala.inline
  def apply(
    proxy: atHapiH2o2Lib.atHapiH2o2Mod.ProxyHandlerOptions => js.Promise[atHapiHapiLib.atHapiHapiMod.ResponseObject]
  ): ResponseToolkit = {
    val __obj = js.Dynamic.literal(proxy = js.Any.fromFunction1(proxy))
  
    __obj.asInstanceOf[ResponseToolkit]
  }
}

