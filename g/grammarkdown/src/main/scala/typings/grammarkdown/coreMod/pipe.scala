package typings.grammarkdown.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/core", "pipe")
@js.native
object pipe extends js.Object {
  def apply[T, U](result: T, next: js.Function1[/* value */ T, U | js.Promise[U]]): U | js.Promise[U] = js.native
  def apply[T, U](
    result: js.UndefOr[js.Promise[T] | T],
    next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]
  ): U | js.Promise[U] = js.native
  def apply[T, U](result: js.Promise[T], next: js.Function1[/* value */ T, U | js.Promise[U]]): U | js.Promise[U] = js.native
}

