package typings.atHapiIron.atHapiIronMod

import typings.atHapiIron.atHapiIronMod.password.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/iron", "unseal")
@js.native
object unseal extends js.Object {
  def apply(`sealed`: String, password: Password): js.Promise[_] = js.native
  def apply(`sealed`: String, password: Password, options: SealOptions): js.Promise[_] = js.native
  def apply(`sealed`: String, password: Hash): js.Promise[_] = js.native
  def apply(`sealed`: String, password: Hash, options: SealOptions): js.Promise[_] = js.native
}

