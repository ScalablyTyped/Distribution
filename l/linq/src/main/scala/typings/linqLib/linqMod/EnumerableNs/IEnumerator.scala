package typings
package linqLib.linqMod.EnumerableNs

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
  def apply[T](current: js.Function0[T], dispose: js.Function0[scala.Unit], moveNext: js.Function0[scala.Boolean]): IEnumerator[T] = {
    val __obj = js.Dynamic.literal(current = current, dispose = dispose, moveNext = moveNext)
  
    __obj.asInstanceOf[IEnumerator[T]]
  }
}

