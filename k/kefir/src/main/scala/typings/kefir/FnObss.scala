package typings.kefir

import typings.kefir.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnObss extends js.Object {
  def apply[T, S](obss: js.Array[Observable[T, S]]): Observable[T, S] = js.native
}

