package typings.jose.mod.JWT

import typings.jose.mod.ProduceKeyInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.sign")
@js.native
object sign extends js.Object {
  def apply(payload: js.Object, key: ProduceKeyInput): String = js.native
  def apply(payload: js.Object, key: ProduceKeyInput, options: SignOptions): String = js.native
}

