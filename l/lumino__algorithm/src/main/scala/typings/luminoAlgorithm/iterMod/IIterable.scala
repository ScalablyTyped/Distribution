package typings.luminoAlgorithm.iterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def iter(): IIterator[T]
}

object IIterable {
  @scala.inline
  def apply[T](iter: () => IIterator[T]): IIterable[T] = {
    val __obj = js.Dynamic.literal(iter = js.Any.fromFunction0(iter))
    __obj.asInstanceOf[IIterable[T]]
  }
}

