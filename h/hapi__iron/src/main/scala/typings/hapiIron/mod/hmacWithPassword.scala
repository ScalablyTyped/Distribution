package typings.hapiIron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/iron", "hmacWithPassword")
@js.native
object hmacWithPassword extends js.Object {
  
  def apply(password: Password_, options: GenerateKeyOptions, data: String): js.Promise[HMacResult] = js.native
}
