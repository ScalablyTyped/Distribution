package typings.handlebars.Handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var ignoreStandalone: js.UndefOr[Boolean] = js.undefined
  var srcName: js.UndefOr[String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(ignoreStandalone: js.UndefOr[Boolean] = js.undefined, srcName: String = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreStandalone)) __obj.updateDynamic("ignoreStandalone")(ignoreStandalone)
    if (srcName != null) __obj.updateDynamic("srcName")(srcName)
    __obj.asInstanceOf[ParseOptions]
  }
}

