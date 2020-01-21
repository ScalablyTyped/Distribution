package typings.ldapjsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  var tlsOptions: js.UndefOr[js.Object] = js.undefined
  var url: String
}

object ClientOptions {
  @scala.inline
  def apply(url: String, timeout: Int | Double = null, tlsOptions: js.Object = null): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

