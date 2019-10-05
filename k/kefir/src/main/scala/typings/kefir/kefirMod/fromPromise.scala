package typings.kefir.kefirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "fromPromise")
@js.native
object fromPromise extends js.Object {
  def apply[T, S](promise: js.Promise[T]): Property[T, S] = js.native
}

