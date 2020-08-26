package typings.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kefir", "zip")
@js.native
object zip extends js.Object {
  def apply[T, S, U](obss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.UndefOr[scala.Nothing],
    combinator: js.Function1[/* repeated */ T, U]
  ): Observable[U, S] = js.native
  def apply[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.Array[Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Observable[U, S] = js.native
}

