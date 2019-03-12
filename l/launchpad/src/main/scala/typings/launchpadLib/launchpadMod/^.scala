package typings
package launchpadLib.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("launchpad", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def browserstack(
    authCreds: BrowserstackAuth,
    cb: js.Function2[/* err */ js.Any, /* browserstack */ Launcher, scala.Unit]
  ): scala.Unit = js.native
  def local(cb: js.Function2[/* err */ js.Any, /* localBrowsers */ Launcher, scala.Unit]): scala.Unit = js.native
}

