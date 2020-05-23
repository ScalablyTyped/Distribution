package typings.jupyterlabSettingregistry.anon

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var composite: js.UndefOr[ReadonlyPartialJSONValue] = js.undefined
  var user: js.UndefOr[ReadonlyPartialJSONValue] = js.undefined
}

object User {
  @scala.inline
  def apply(
    composite: js.UndefOr[Null | ReadonlyPartialJSONValue] = js.undefined,
    user: js.UndefOr[Null | ReadonlyPartialJSONValue] = js.undefined
  ): User = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(composite)) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (!js.isUndefined(user)) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

