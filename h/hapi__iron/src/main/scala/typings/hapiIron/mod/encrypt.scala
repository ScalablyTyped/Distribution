package typings.hapiIron.mod

import typings.hapiIron.anon.Encrypted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/iron", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(password: Password_, options: GenerateKeyOptions, data: String): js.Promise[Encrypted] = js.native
}

