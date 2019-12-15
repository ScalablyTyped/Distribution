package typings.atKeystonejsAppDashStatic.atKeystonejsAppDashStaticMod

import typings.atKeystonejsAppDashStatic.Anon_Dev
import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/app-static", "StaticApp")
@js.native
class StaticApp () extends BaseApp {
  def this(options: StaticOptions) = this()
  def prepareMiddleware(hasDev: Anon_Dev): js.Promise[Unit] = js.native
}

