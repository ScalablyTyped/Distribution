package typings.keystonejsAppNuxt.mod

import typings.keystonejsAppNuxt.anon.Dev
import typings.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/app-nuxt", "NuxtApp")
@js.native
class NuxtApp () extends BaseApp {
  def this(options: NuxtOptions) = this()
  def prepareMiddleware(hasDev: Dev): js.Promise[Unit] = js.native
}

