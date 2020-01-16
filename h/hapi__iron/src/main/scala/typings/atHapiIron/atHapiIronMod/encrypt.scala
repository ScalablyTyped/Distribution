package typings.atHapiIron.atHapiIronMod

import typings.atHapiIron.Anon_Encrypted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/iron", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(password: Password, options: GenerateKeyOptions, data: String): js.Promise[Anon_Encrypted] = js.native
}

