package typings.jupyterlabSettingregistry

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUser extends js.Object {
  var composite: js.UndefOr[ReadonlyPartialJSONValue] = js.undefined
  var user: js.UndefOr[ReadonlyPartialJSONValue] = js.undefined
}

object AnonUser {
  @scala.inline
  def apply(composite: ReadonlyPartialJSONValue = null, user: ReadonlyPartialJSONValue = null): AnonUser = {
    val __obj = js.Dynamic.literal()
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUser]
  }
}

