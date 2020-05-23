package typings.knockoutProjections.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisposeItem[T, TResult] extends js.Object {
  var disposeItem: js.UndefOr[js.Function1[/* mappedItem */ TResult, Unit]] = js.undefined
  def mapping(value: T): TResult
}

object DisposeItem {
  @scala.inline
  def apply[T, TResult](mapping: T => TResult, disposeItem: /* mappedItem */ TResult => Unit = null): DisposeItem[T, TResult] = {
    val __obj = js.Dynamic.literal(mapping = js.Any.fromFunction1(mapping))
    if (disposeItem != null) __obj.updateDynamic("disposeItem")(js.Any.fromFunction1(disposeItem))
    __obj.asInstanceOf[DisposeItem[T, TResult]]
  }
}

