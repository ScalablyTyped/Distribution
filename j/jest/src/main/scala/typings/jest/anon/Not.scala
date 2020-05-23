package typings.jest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Not[T] extends js.Object {
  var not: T
}

object Not {
  @scala.inline
  def apply[T](not: T): Not[T] = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[Not[T]]
  }
}

