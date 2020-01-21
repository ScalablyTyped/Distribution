package typings.hibp.mod

import typings.hibp.AnonBaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", "breach")
@js.native
object breach extends js.Object {
  def apply(breachName: String): js.Promise[Breach_ | Null] = js.native
  def apply(breachName: String, options: AnonBaseUrl): js.Promise[Breach_ | Null] = js.native
}

