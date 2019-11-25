package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRequestOptions extends js.Object {
  var proxy: js.UndefOr[String] = js.undefined
  var ssl: js.UndefOr[SSLConfig] = js.undefined
}

object CreateRequestOptions {
  @scala.inline
  def apply(proxy: String = null, ssl: SSLConfig = null): CreateRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRequestOptions]
  }
}

