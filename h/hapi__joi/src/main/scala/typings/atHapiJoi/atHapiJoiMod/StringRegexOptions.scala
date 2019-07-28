package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringRegexOptions extends js.Object {
  var invert: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object StringRegexOptions {
  @scala.inline
  def apply(invert: js.UndefOr[Boolean] = js.undefined, name: String = null): StringRegexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[StringRegexOptions]
  }
}

