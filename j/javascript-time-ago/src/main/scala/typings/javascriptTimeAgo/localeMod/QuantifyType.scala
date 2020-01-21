package typings.javascriptTimeAgo.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantifyType extends js.Object {
  var few: js.UndefOr[String] = js.undefined
  var one: String
  var other: String
  var two: js.UndefOr[String] = js.undefined
}

object QuantifyType {
  @scala.inline
  def apply(one: String, other: String, few: String = null, two: String = null): QuantifyType = {
    val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantifyType]
  }
}

