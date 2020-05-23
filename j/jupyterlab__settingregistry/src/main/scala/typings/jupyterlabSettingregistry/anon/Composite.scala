package typings.jupyterlabSettingregistry.anon

import typings.luminoCoreutils.jsonMod.PartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Composite extends js.Object {
  var composite: js.UndefOr[PartialJSONValue] = js.undefined
  var user: js.UndefOr[PartialJSONValue] = js.undefined
}

object Composite {
  @scala.inline
  def apply(
    composite: js.UndefOr[Null | PartialJSONValue] = js.undefined,
    user: js.UndefOr[Null | PartialJSONValue] = js.undefined
  ): Composite = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(composite)) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (!js.isUndefined(user)) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Composite]
  }
}

