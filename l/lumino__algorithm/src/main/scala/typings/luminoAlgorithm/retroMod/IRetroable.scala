package typings.luminoAlgorithm.retroMod

import typings.luminoAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRetroable[T] extends js.Object {
  /**
    * Get a reverse iterator over the object's values.
    *
    * @returns An iterator which yields the object's values in reverse.
    */
  def retro(): IIterator[T] = js.native
}

object IRetroable {
  @scala.inline
  def apply[T](retro: () => IIterator[T]): IRetroable[T] = {
    val __obj = js.Dynamic.literal(retro = js.Any.fromFunction0(retro))
    __obj.asInstanceOf[IRetroable[T]]
  }
  @scala.inline
  implicit class IRetroableOps[Self <: IRetroable[_], T] (val x: Self with IRetroable[T]) extends AnyVal {
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
    def setRetro(value: () => IIterator[T]): Self = this.set("retro", js.Any.fromFunction0(value))
  }
  
}

