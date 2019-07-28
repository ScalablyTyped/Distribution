package typings.knockout

import typings.knockout.knockoutStrings.added
import typings.knockout.knockoutStrings.deleted
import typings.knockout.knockoutStrings.retained
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutArrayChange[T] extends js.Object {
  var index: Double
  var moved: js.UndefOr[Double] = js.undefined
  var status: added | deleted | retained
  var value: T
}

object KnockoutArrayChange {
  @scala.inline
  def apply[T](index: Double, status: added | deleted | retained, value: T, moved: Int | Double = null): KnockoutArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index, status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (moved != null) __obj.updateDynamic("moved")(moved.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutArrayChange[T]]
  }
}

