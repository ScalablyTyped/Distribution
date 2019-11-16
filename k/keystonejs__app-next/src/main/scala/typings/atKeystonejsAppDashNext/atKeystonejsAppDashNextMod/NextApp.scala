package typings.atKeystonejsAppDashNext.atKeystonejsAppDashNextMod

import typings.atKeystonejsAppDashNext.Anon_Dev
import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/app-next", "NextApp")
@js.native
class NextApp () extends BaseApp {
  def this(options: NextOptions) = this()
  def build(): js.Promise[Unit] = js.native
  def prepareMiddleware(hasDev: Anon_Dev): js.Promise[Unit] = js.native
}

