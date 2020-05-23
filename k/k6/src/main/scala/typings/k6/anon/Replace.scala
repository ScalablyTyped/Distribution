package typings.k6.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replace extends js.Object {
  var replace: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Replace {
  @scala.inline
  def apply(replace: js.UndefOr[Boolean] = js.undefined, value: String = null): Replace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
}

