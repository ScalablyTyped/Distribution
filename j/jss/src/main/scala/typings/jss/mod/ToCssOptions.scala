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
  def apply(allowEmpty: js.UndefOr[Boolean] = js.undefined, indent: js.UndefOr[Double] = js.undefined): ToCssOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToCssOptions]
  }
}

