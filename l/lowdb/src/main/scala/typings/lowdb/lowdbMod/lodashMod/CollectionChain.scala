package typings.lowdb.lowdbMod.lodashMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionChain[T] extends js.Object {
  def write(): ArrayLike[T] with js.Promise[ArrayLike[T]]
}

object CollectionChain {
  @scala.inline
  def apply[T](write: () => ArrayLike[T] with js.Promise[ArrayLike[T]]): CollectionChain[T] = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
  
    __obj.asInstanceOf[CollectionChain[T]]
  }
}

