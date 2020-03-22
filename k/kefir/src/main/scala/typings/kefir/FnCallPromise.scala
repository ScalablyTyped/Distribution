package typings.kefir

import typings.kefir.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPromise extends js.Object {
  def apply[T, S](promise: js.Promise[T]): Property[T, S] = js.native
}

