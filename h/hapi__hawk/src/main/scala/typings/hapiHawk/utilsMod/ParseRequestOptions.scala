package typings.hapiHawk.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseRequestOptions extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var hostHeaderName: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object ParseRequestOptions {
  @scala.inline
  def apply(
    host: String = null,
    hostHeaderName: String = null,
    name: String = null,
    port: js.UndefOr[Double] = js.undefined
  ): ParseRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostHeaderName != null) __obj.updateDynamic("hostHeaderName")(hostHeaderName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseRequestOptions]
  }
}

