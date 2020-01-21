package typings.ignore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ignorecase: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(ignorecase: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignorecase)) __obj.updateDynamic("ignorecase")(ignorecase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

