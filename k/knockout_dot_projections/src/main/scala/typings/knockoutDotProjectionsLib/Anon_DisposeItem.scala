package typings
package knockoutDotProjectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisposeItem[T, TResult] extends js.Object {
  var disposeItem: js.UndefOr[js.Function1[/* mappedItem */ TResult, scala.Unit]] = js.undefined
  def mapping(value: T): TResult
}

object Anon_DisposeItem {
  @scala.inline
  def apply[T, TResult](
    mapping: js.Function1[T, TResult],
    disposeItem: js.Function1[/* mappedItem */ TResult, scala.Unit] = null
  ): Anon_DisposeItem[T, TResult] = {
    val __obj = js.Dynamic.literal(mapping = mapping)
    if (disposeItem != null) __obj.updateDynamic("disposeItem")(disposeItem)
    __obj.asInstanceOf[Anon_DisposeItem[T, TResult]]
  }
}

