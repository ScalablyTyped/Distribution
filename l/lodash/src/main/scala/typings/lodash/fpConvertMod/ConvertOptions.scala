package typings.lodash.fpConvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertOptions extends js.Object {
  var cap: js.UndefOr[Boolean] = js.undefined
  var curry: js.UndefOr[Boolean] = js.undefined
  var fixed: js.UndefOr[Boolean] = js.undefined
  var immutable: js.UndefOr[Boolean] = js.undefined
  var rearg: js.UndefOr[Boolean] = js.undefined
}

object ConvertOptions {
  @scala.inline
  def apply(
    cap: js.UndefOr[Boolean] = js.undefined,
    curry: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Boolean] = js.undefined,
    immutable: js.UndefOr[Boolean] = js.undefined,
    rearg: js.UndefOr[Boolean] = js.undefined
  ): ConvertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cap)) __obj.updateDynamic("cap")(cap)
    if (!js.isUndefined(curry)) __obj.updateDynamic("curry")(curry)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable)
    if (!js.isUndefined(rearg)) __obj.updateDynamic("rearg")(rearg)
    __obj.asInstanceOf[ConvertOptions]
  }
}

