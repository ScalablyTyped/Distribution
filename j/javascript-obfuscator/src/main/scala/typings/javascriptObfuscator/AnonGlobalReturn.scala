package typings.javascriptObfuscator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlobalReturn extends js.Object {
  var globalReturn: js.UndefOr[Boolean] = js.undefined
  var impliedStrict: js.UndefOr[Boolean] = js.undefined
  var jsx: js.UndefOr[Boolean] = js.undefined
}

object AnonGlobalReturn {
  @scala.inline
  def apply(
    globalReturn: js.UndefOr[Boolean] = js.undefined,
    impliedStrict: js.UndefOr[Boolean] = js.undefined,
    jsx: js.UndefOr[Boolean] = js.undefined
  ): AnonGlobalReturn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(globalReturn)) __obj.updateDynamic("globalReturn")(globalReturn.asInstanceOf[js.Any])
    if (!js.isUndefined(impliedStrict)) __obj.updateDynamic("impliedStrict")(impliedStrict.asInstanceOf[js.Any])
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobalReturn]
  }
}

