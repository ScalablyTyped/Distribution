package typings.keystonejsAppNext.mod

import typings.keystonejsAppNext.anon.Dev
import typings.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/app-next", "NextApp")
@js.native
class NextApp () extends BaseApp {
  def this(options: NextOptions) = this()
  def prepareMiddleware(hasDevDistDir: Dev): js.Promise[_] = js.native
}

