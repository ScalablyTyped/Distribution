package typings.hibp.mod

import typings.hibp.AnonApiKeyBaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", "pasteAccount")
@js.native
object pasteAccount extends js.Object {
  def apply(email: String): js.Promise[js.Array[Paste] | Null] = js.native
  def apply(email: String, options: AnonApiKeyBaseUrl): js.Promise[js.Array[Paste] | Null] = js.native
}

