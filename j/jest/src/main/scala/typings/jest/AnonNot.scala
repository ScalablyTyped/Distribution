package typings.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNot[T] extends js.Object {
  var not: T
}

object AnonNot {
  @scala.inline
  def apply[T](not: T): AnonNot[T] = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNot[T]]
  }
}

