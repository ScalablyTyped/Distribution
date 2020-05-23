package typings.iron.mod

import typings.iron.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iron", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(password: String, options: GenerateKeyOptions, data: String): js.Promise[Data] = js.native
}

