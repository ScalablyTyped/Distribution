package typings
package lowdbLib.lowdbMod.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionChain[T] extends js.Object {
  def write(): stdLib.ArrayLike[T] with js.Promise[stdLib.ArrayLike[T]]
}

object CollectionChain {
  @scala.inline
  def apply[T](write: () => stdLib.ArrayLike[T] with js.Promise[stdLib.ArrayLike[T]]): CollectionChain[T] = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
  
    __obj.asInstanceOf[CollectionChain[T]]
  }
}

