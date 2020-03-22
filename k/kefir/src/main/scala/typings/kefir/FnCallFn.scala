package typings.kefir

import typings.kefir.mod.Stream_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallFn extends js.Object {
  def apply[T](fn: js.Function1[/* callback */ js.Function1[/* value */ T, Unit], Unit]): Stream_[T, scala.Nothing] = js.native
}

