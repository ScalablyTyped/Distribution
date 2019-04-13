package typings
package linqLib.linqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnumerator[T] extends js.Object {
  def current(): T
  def dispose(): scala.Unit
  def moveNext(): scala.Boolean
}

object IEnumerator {
  @scala.inline
  def apply[T](current: () => T, dispose: () => scala.Unit, moveNext: () => scala.Boolean): IEnumerator[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), dispose = js.Any.fromFunction0(dispose), moveNext = js.Any.fromFunction0(moveNext))
  
    __obj.asInstanceOf[IEnumerator[T]]
  }
}

