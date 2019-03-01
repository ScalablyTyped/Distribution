package typings
package jsdomLib.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLoaderConstructorOptions extends js.Object {
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var strictSSL: js.UndefOr[scala.Boolean] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object ResourceLoaderConstructorOptions {
  @scala.inline
  def apply(
    proxy: java.lang.String = null,
    strictSSL: js.UndefOr[scala.Boolean] = js.undefined,
    userAgent: java.lang.String = null
  ): ResourceLoaderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[ResourceLoaderConstructorOptions]
  }
}

