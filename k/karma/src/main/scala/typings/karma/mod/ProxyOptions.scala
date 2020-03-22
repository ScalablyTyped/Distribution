package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  /**
    * Whether or not the proxy should override the Host header using the host from the target
    * @defult false
    */
  var changeOrigin: js.UndefOr[Boolean] = js.undefined
  /** The target url or path (mandatory) */
  var target: String
}

object ProxyOptions {
  @scala.inline
  def apply(target: String, changeOrigin: js.UndefOr[Boolean] = js.undefined): ProxyOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(changeOrigin)) __obj.updateDynamic("changeOrigin")(changeOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
}

