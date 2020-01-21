package typings.jupyterlabCoreutils

import typings.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompositeUser extends js.Object {
  var composite: ReadonlyJSONValue
  var user: ReadonlyJSONValue
}

object AnonCompositeUser {
  @scala.inline
  def apply(composite: ReadonlyJSONValue = null, user: ReadonlyJSONValue = null): AnonCompositeUser = {
    val __obj = js.Dynamic.literal()
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompositeUser]
  }
}

