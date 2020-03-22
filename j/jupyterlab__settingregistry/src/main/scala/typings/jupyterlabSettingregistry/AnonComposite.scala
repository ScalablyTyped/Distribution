package typings.jupyterlabSettingregistry

import typings.luminoCoreutils.jsonMod.PartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComposite extends js.Object {
  var composite: js.UndefOr[PartialJSONValue] = js.undefined
  var user: js.UndefOr[PartialJSONValue] = js.undefined
}

object AnonComposite {
  @scala.inline
  def apply(composite: PartialJSONValue = null, user: PartialJSONValue = null): AnonComposite = {
    val __obj = js.Dynamic.literal()
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComposite]
  }
}

