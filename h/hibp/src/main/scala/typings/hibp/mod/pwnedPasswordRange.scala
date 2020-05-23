package typings.hibp.mod

import typings.hibp.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", "pwnedPasswordRange")
@js.native
object pwnedPasswordRange extends js.Object {
  def apply(prefix: String): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
  def apply(prefix: String, options: BaseUrl): js.Promise[js.Array[PwnedPasswordSuffix]] = js.native
}

