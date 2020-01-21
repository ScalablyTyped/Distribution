package typings.hapiIron.mod

import typings.hapiIron.mod.password.Secret
import typings.hapiIron.mod.password.Specific
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/iron", "seal")
@js.native
object seal extends js.Object {
  def apply(`object`: js.Any, password: Password_, options: SealOptions): js.Promise[String] = js.native
  def apply(`object`: js.Any, password: Secret, options: SealOptions): js.Promise[String] = js.native
  def apply(`object`: js.Any, password: Specific, options: SealOptions): js.Promise[String] = js.native
}

