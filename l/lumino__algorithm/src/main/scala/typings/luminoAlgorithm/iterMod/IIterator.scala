package typings.luminoAlgorithm.iterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIterator[T] extends IIterable[T] {
  
  /**
    * Get the next value from the iterator.
    *
    * @returns The next value from the iterator, or `undefined`.
    *
    * #### Notes
    * The `undefined` value is used to signal the end of iteration and
    * should therefore not be used as a value in a collection.
    *
    * The use of the `undefined` sentinel is an explicit design choice
    * which favors performance over purity. The ES6 iterator design of
    * returning a `{ value, done }` pair is suboptimal, as it requires
    * an object allocation on each iteration; and an `isDone()` method
    * would increase implementation and runtime complexity.
    */
  def next(): js.UndefOr[T] = js.native
}
object IIterator {
  
  @scala.inline
  def apply[T](iter: () => IIterator[T], next: () => js.UndefOr[T]): IIterator[T] = {
    val __obj = js.Dynamic.literal(iter = js.Any.fromFunction0(iter), next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[IIterator[T]]
  }
  
  @scala.inline
  implicit class IIteratorOps[Self <: IIterator[_], T] (val x: Self with IIterator[T]) extends AnyVal {
    
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
    def setNext(value: () => js.UndefOr[T]): Self = this.set("next", js.Any.fromFunction0(value))
  }
}
