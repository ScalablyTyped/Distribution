package typings.ltijs.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  var ignoreRoot: js.UndefOr[Boolean] = js.undefined
  var isNewResource: js.UndefOr[Boolean] = js.undefined
}

object RedirectOptions {
  @scala.inline
  def apply(ignoreRoot: js.UndefOr[Boolean] = js.undefined, isNewResource: js.UndefOr[Boolean] = js.undefined): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreRoot)) __obj.updateDynamic("ignoreRoot")(ignoreRoot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewResource)) __obj.updateDynamic("isNewResource")(isNewResource.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectOptions]
  }
}

