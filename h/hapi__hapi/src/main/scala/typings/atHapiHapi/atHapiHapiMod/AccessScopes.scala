package typings.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessScopes extends js.Object {
  var forbidden: js.UndefOr[js.Array[String]] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
  var selection: js.UndefOr[js.Array[String]] = js.undefined
}

object AccessScopes {
  @scala.inline
  def apply(
    forbidden: js.Array[String] = null,
    required: js.Array[String] = null,
    selection: js.Array[String] = null
  ): AccessScopes = {
    val __obj = js.Dynamic.literal()
    if (forbidden != null) __obj.updateDynamic("forbidden")(forbidden)
    if (required != null) __obj.updateDynamic("required")(required)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    __obj.asInstanceOf[AccessScopes]
  }
}

