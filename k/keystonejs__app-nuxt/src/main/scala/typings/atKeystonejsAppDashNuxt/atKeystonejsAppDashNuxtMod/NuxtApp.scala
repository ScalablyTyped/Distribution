package typings.atKeystonejsAppDashNuxt.atKeystonejsAppDashNuxtMod

import typings.atKeystonejsAppDashNuxt.Anon_Dev
import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/app-nuxt", "NuxtApp")
@js.native
class NuxtApp () extends BaseApp {
  def this(options: NuxtOptions) = this()
  def prepareMiddleware(hasDev: Anon_Dev): js.Promise[Unit] = js.native
}

