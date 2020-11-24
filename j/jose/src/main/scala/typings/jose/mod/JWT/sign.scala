package typings.jose.mod.JWT

import typings.jose.mod.ProduceKeyInputWithNone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jose", "JWT.sign")
@js.native
object sign extends js.Object {
  
  def apply(payload: js.Object, key: ProduceKeyInputWithNone): String = js.native
  def apply(payload: js.Object, key: ProduceKeyInputWithNone, options: SignOptions): String = js.native
}
