package typings
package ixDotJsLib.IxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enumerator[T] extends Disposable {
  def getCurrent(): T
  def moveNext(): scala.Boolean
}

object Enumerator {
  @scala.inline
  def apply[T](dispose: () => scala.Unit, getCurrent: () => T, moveNext: () => scala.Boolean): Enumerator[T] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getCurrent = js.Any.fromFunction0(getCurrent), moveNext = js.Any.fromFunction0(moveNext))
  
    __obj.asInstanceOf[Enumerator[T]]
  }
}

