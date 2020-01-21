package typings.hapiIron.mod

import typings.hapiIron.mod.password.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/iron", "unseal")
@js.native
object unseal extends js.Object {
  def apply(`sealed`: String, password: Password_): js.Promise[_] = js.native
  def apply(`sealed`: String, password: Password_, options: SealOptions): js.Promise[_] = js.native
  def apply(`sealed`: String, password: Hash): js.Promise[_] = js.native
  def apply(`sealed`: String, password: Hash, options: SealOptions): js.Promise[_] = js.native
}

