package typings.hexo.mod.extend.Tag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var ends: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined, ends: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(ends)) __obj.updateDynamic("ends")(ends.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

