package typings.hapiAuthCookie.mod.hapiAugmentingMod

import typings.hapiAuthCookie.hapiAuthCookieStrings.cookie
import typings.hapiAuthCookie.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_cookie(name: String, scheme: cookie): Unit = js.native
  @JSName("strategy")
  def strategy_cookie(name: String, scheme: cookie, options: Options): Unit = js.native
}

