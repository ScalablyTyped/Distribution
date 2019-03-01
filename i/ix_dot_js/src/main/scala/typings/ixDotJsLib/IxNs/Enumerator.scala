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
  def apply[T](
    dispose: js.Function0[scala.Unit],
    getCurrent: js.Function0[T],
    moveNext: js.Function0[scala.Boolean]
  ): Enumerator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getCurrent")(getCurrent)
    __obj.updateDynamic("moveNext")(moveNext)
    __obj.asInstanceOf[Enumerator[T]]
  }
}

