package typings.launchpad.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("launchpad", "browserstack")
@js.native
object browserstack extends js.Object {
  def apply(authCreds: BrowserstackAuth, cb: js.Function2[/* err */ js.Any, /* browserstack */ Launcher, Unit]): Unit = js.native
}

