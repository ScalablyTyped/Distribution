package typings
package isDashOnlineLib.isDashOnlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-online", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Check if the internet connection is up.
    *
    * The following checks are run in parallel:
    * - Retrieve [icanhazip.com](https://github.com/major/icanhaz) via HTTPS
    * - Query `myip.opendns.com` on OpenDNS (Node.js only)
    * - Retrieve Apple's Captive Portal test page (Node.js only)
    *
    * When the first check succeeds, the returned Promise is resolved to `true`.
    */
  def apply(): js.Promise[scala.Boolean] = js.native
  def apply(options: isDashOnlineLib.isDashOnlineMod.isOnlineNs.Options): js.Promise[scala.Boolean] = js.native
}

