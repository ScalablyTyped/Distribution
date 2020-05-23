package typings.hibp.mod

import typings.hibp.anon.Truncate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", "search")
@js.native
object search extends js.Object {
  def apply(account: String): js.Promise[SearchResults] = js.native
  def apply(account: String, breachOptions: Truncate): js.Promise[SearchResults] = js.native
}

