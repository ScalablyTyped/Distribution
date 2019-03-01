package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutArrayChange[T] extends js.Object {
  var index: scala.Double
  var moved: js.UndefOr[scala.Double] = js.undefined
  var status: knockoutLib.knockoutLibStrings.added | knockoutLib.knockoutLibStrings.deleted | knockoutLib.knockoutLibStrings.retained
  var value: T
}

object KnockoutArrayChange {
  @scala.inline
  def apply[T](
    index: scala.Double,
    status: knockoutLib.knockoutLibStrings.added | knockoutLib.knockoutLibStrings.deleted | knockoutLib.knockoutLibStrings.retained,
    value: T,
    moved: scala.Int | scala.Double = null
  ): KnockoutArrayChange[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (moved != null) __obj.updateDynamic("moved")(moved.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutArrayChange[T]]
  }
}

