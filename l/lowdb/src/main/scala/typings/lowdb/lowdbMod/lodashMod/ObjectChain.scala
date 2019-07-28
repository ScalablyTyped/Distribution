package typings.lowdb.lowdbMod.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectChain[T] extends js.Object {
  /**
    * @description Be careful: This function overwrites the whole database.
    */
  def write(): T with js.Promise[T]
}

object ObjectChain {
  @scala.inline
  def apply[T](write: () => T with js.Promise[T]): ObjectChain[T] = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
  
    __obj.asInstanceOf[ObjectChain[T]]
  }
}

