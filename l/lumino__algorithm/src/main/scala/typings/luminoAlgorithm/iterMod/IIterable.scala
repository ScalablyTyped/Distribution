package typings.luminoAlgorithm.iterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIterable[T] extends js.Object {
  /**
    * Get an iterator over the object's values.
    *
    * @returns An iterator which yields the object's values.
    *
    * #### Notes
    * Depending on the iterable, the returned iterator may or may not be
    * a new object. A collection or other container-like object should
    * typically return a new iterator, while an iterator itself should
    * normally return `this`.
    */
  def iter(): IIterator[T] = js.native
}

object IIterable {
  @scala.inline
  def apply[T](iter: () => IIterator[T]): IIterable[T] = {
    val __obj = js.Dynamic.literal(iter = js.Any.fromFunction0(iter))
    __obj.asInstanceOf[IIterable[T]]
  }
  @scala.inline
  implicit class IIterableOps[Self <: IIterable[_], T] (val x: Self with IIterable[T]) extends AnyVal {
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
    def setIter(value: () => IIterator[T]): Self = this.set("iter", js.Any.fromFunction0(value))
  }
  
}

