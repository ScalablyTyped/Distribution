package typings.jwtExpress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-express", "create")
@js.native
object create extends js.Object {
  def apply(secret: String, payload: js.Any): JWT = js.native
  def apply(secret: js.Function1[/* payload */ js.Any, String], payload: js.Any): JWT = js.native
}

