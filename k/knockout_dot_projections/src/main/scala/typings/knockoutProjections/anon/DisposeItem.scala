package typings.knockoutProjections.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisposeItem[T, TResult] extends js.Object {
  var disposeItem: js.UndefOr[js.Function1[/* mappedItem */ TResult, Unit]] = js.native
  def mapping(value: T): TResult = js.native
}

object DisposeItem {
  @scala.inline
  def apply[T, TResult](mapping: T => TResult): DisposeItem[T, TResult] = {
    val __obj = js.Dynamic.literal(mapping = js.Any.fromFunction1(mapping))
    __obj.asInstanceOf[DisposeItem[T, TResult]]
  }
  @scala.inline
  implicit class DisposeItemOps[Self <: DisposeItem[_, _], T, TResult] (val x: Self with (DisposeItem[T, TResult])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMapping(value: T => TResult): Self = this.set("mapping", js.Any.fromFunction1(value))
    @scala.inline
    def setDisposeItem(value: /* mappedItem */ TResult => Unit): Self = this.set("disposeItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisposeItem: Self = this.set("disposeItem", js.undefined)
  }
  
}

