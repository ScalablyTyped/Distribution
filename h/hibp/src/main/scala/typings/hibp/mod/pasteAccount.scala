package typings.hibp.mod

import typings.hibp.anon.UserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hibp", "pasteAccount")
@js.native
object pasteAccount extends js.Object {
  
  def apply(email: String): js.Promise[js.Array[Paste] | Null] = js.native
  def apply(email: String, options: UserAgent): js.Promise[js.Array[Paste] | Null] = js.native
}
