package typings.hibp.mod

import typings.hibp.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", "breach")
@js.native
object breach extends js.Object {
  def apply(breachName: String): js.Promise[Breach_ | Null] = js.native
  def apply(breachName: String, options: BaseUrl): js.Promise[Breach_ | Null] = js.native
}

