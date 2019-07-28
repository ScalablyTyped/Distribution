package typings.knockoutDashPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutArrayChange[T] extends js.Object {
  var index: Double
  var moved: js.UndefOr[Double] = js.undefined
  var status: String
  var value: T
}

object KnockoutArrayChange {
  @scala.inline
  def apply[T](index: Double, status: String, value: T, moved: Int | Double = null): KnockoutArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index, status = status, value = value.asInstanceOf[js.Any])
    if (moved != null) __obj.updateDynamic("moved")(moved.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutArrayChange[T]]
  }
}

