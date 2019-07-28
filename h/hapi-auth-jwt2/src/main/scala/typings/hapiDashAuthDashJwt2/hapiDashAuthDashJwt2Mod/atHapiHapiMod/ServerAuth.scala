package typings.hapiDashAuthDashJwt2.hapiDashAuthDashJwt2Mod.atHapiHapiMod

import typings.hapiDashAuthDashJwt2.hapiDashAuthDashJwt2Mod.Options
import typings.hapiDashAuthDashJwt2.hapiDashAuthDashJwt2Strings.jwt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerAuth extends js.Object {
  @JSName("strategy")
  def strategy_jwt(name: String, scheme: jwt): Unit = js.native
  @JSName("strategy")
  def strategy_jwt(name: String, scheme: jwt, options: Options): Unit = js.native
}

