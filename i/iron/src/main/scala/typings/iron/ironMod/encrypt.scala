package typings.iron.ironMod

import typings.iron.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iron", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(password: String, options: GenerateKeyOptions, data: String): js.Promise[Anon_Data] = js.native
}

