package typings.gulpJsonValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpJsonValidatorOptions extends js.Object {
  var allowDuplicatedKeys: js.UndefOr[Boolean] = js.undefined
}

object GulpJsonValidatorOptions {
  @scala.inline
  def apply(allowDuplicatedKeys: js.UndefOr[Boolean] = js.undefined): GulpJsonValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicatedKeys)) __obj.updateDynamic("allowDuplicatedKeys")(allowDuplicatedKeys.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GulpJsonValidatorOptions]
  }
}

