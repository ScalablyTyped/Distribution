package typings
package ldapjsDashClientLib.ldapjsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var tlsOptions: js.UndefOr[js.Object] = js.undefined
  var url: java.lang.String
}

object ClientOptions {
  @scala.inline
  def apply(url: java.lang.String, timeout: scala.Int | scala.Double = null, tlsOptions: js.Object = null): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions)
    __obj.asInstanceOf[ClientOptions]
  }
}

