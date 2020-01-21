package typings.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnumerator[T] extends js.Object {
  def current(): T
  def dispose(): Unit
  def moveNext(): Boolean
}

object IEnumerator {
  @scala.inline
  def apply[T](current: () => T, dispose: () => Unit, moveNext: () => Boolean): IEnumerator[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), dispose = js.Any.fromFunction0(dispose), moveNext = js.Any.fromFunction0(moveNext))
  
    __obj.asInstanceOf[IEnumerator[T]]
  }
}

