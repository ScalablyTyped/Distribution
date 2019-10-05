package typings.hibp.hibpMod

import typings.hibp.Anon_ApiKeyBaseUrlDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", "search")
@js.native
object search extends js.Object {
  def apply(account: String): js.Promise[SearchResults] = js.native
  def apply(account: String, breachOptions: Anon_ApiKeyBaseUrlDomain): js.Promise[SearchResults] = js.native
}

