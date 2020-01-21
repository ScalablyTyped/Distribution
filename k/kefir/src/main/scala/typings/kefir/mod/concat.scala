package typings.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "concat")
@js.native
object concat extends js.Object {
  def apply[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
}

