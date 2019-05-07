package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var certificate: js.UndefOr[js.Any] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(certificate: js.Any = null, key: js.Any = null, log: js.Any = null): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate)
    if (key != null) __obj.updateDynamic("key")(key)
    if (log != null) __obj.updateDynamic("log")(log)
    __obj.asInstanceOf[ServerOptions]
  }
}

