package typings.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToCssOptions extends js.Object {
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
}

object ToCssOptions {
  @scala.inline
  def apply(allowEmpty: js.UndefOr[Boolean] = js.undefined, indent: Int | Double = null): ToCssOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToCssOptions]
  }
}

