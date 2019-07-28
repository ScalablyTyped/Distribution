package typings.lowdb.lowdbMod.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionChain[T] extends js.Object {
  def write(): T with js.Promise[T]
}

object FunctionChain {
  @scala.inline
  def apply[T](write: () => T with js.Promise[T]): FunctionChain[T] = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
  
    __obj.asInstanceOf[FunctionChain[T]]
  }
}

