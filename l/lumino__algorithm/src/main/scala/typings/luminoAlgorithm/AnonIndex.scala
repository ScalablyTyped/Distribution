package typings.luminoAlgorithm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex[T] extends js.Object {
  var index: Double
  var value: js.UndefOr[T] = js.undefined
}

object AnonIndex {
  @scala.inline
  def apply[T](index: Double, value: T = null): AnonIndex[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex[T]]
  }
}

