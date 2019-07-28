package typings.h2o2.h2o2Mod.hapiMod

import typings.h2o2.h2o2Mod.ProxyHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerDecorations extends js.Object {
  /**
    * Proxies the request to an upstream endpoint.
    */
  var proxy: js.UndefOr[ProxyHandlerOptions] = js.undefined
}

object HandlerDecorations {
  @scala.inline
  def apply(proxy: ProxyHandlerOptions = null): HandlerDecorations = {
    val __obj = js.Dynamic.literal()
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[HandlerDecorations]
  }
}

