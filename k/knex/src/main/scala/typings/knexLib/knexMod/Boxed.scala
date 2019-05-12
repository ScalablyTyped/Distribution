package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boxed[T] extends js.Object {
  var _value: T
}

object Boxed {
  @scala.inline
  def apply[T](_value: T): Boxed[T] = {
    val __obj = js.Dynamic.literal(_value = _value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Boxed[T]]
  }
}

