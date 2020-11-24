package typings.iron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iron", "generateKey")
@js.native
object generateKey extends js.Object {
  
  def apply(password: String, options: GenerateKeyOptions): js.Promise[Key] = js.native
}
