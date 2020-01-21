package typings.gulpReplace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var skipBinary: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(skipBinary: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipBinary)) __obj.updateDynamic("skipBinary")(skipBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

