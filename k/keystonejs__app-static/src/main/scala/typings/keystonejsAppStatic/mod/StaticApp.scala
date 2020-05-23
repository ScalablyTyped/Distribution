package typings.keystonejsAppStatic.mod

import typings.keystonejsAppStatic.anon.Dev
import typings.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/app-static", "StaticApp")
@js.native
class StaticApp () extends BaseApp {
  def this(options: StaticOptions) = this()
  def prepareMiddleware(hasDev: Dev): js.Promise[Unit] = js.native
}

