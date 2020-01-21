package typings.jsdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLoaderConstructorOptions extends js.Object {
  var proxy: js.UndefOr[String] = js.undefined
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object ResourceLoaderConstructorOptions {
  @scala.inline
  def apply(proxy: String = null, strictSSL: js.UndefOr[Boolean] = js.undefined, userAgent: String = null): ResourceLoaderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLoaderConstructorOptions]
  }
}

