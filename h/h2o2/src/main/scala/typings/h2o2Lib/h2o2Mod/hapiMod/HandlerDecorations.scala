package typings
package h2o2Lib.h2o2Mod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerDecorations extends js.Object {
  /**
    * Proxies the request to an upstream endpoint.
    */
  var proxy: js.UndefOr[h2o2Lib.h2o2Mod.ProxyHandlerOptions] = js.undefined
}

object HandlerDecorations {
  @scala.inline
  def apply(proxy: h2o2Lib.h2o2Mod.ProxyHandlerOptions = null): HandlerDecorations = {
    val __obj = js.Dynamic.literal()
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[HandlerDecorations]
  }
}

