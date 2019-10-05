package typings.hibp.hibpMod

import typings.hibp.Anon_ApiKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", "breachedAccount")
@js.native
object breachedAccount extends js.Object {
  def apply(account: String): js.Promise[js.Array[Breach] | Null] = js.native
  def apply(account: String, options: Anon_ApiKey): js.Promise[js.Array[Breach] | Null] = js.native
}

