package typings.jwtDashThen.jwtDashThenMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-then", "verify")
@js.native
object verify extends js.Object {
  def apply(token: String, secretOrPublicKey: String): js.Promise[js.Object | String] = js.native
  def apply(token: String, secretOrPublicKey: Buffer): js.Promise[js.Object | String] = js.native
}

