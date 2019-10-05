package typings.atHapiIron.atHapiIronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/iron", "hmacWithPassword")
@js.native
object hmacWithPassword extends js.Object {
  def apply(password: String, options: GenerateKeyOptions, data: String): js.Promise[HMacResult] = js.native
}

