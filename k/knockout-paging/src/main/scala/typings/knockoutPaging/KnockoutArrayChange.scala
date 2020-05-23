package typings.knockoutPaging

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
  def apply[T](index: Double, status: String, value: T, moved: js.UndefOr[Double] = js.undefined): KnockoutArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(moved)) __obj.updateDynamic("moved")(moved.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutArrayChange[T]]
  }
}

