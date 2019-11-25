package typings.atIonicCliDashFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadataInput extends js.Object {
  var name: String
  var `private`: js.UndefOr[Boolean] = js.undefined
  var summary: String
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}

object CommandMetadataInput {
  @scala.inline
  def apply(
    name: String,
    summary: String,
    `private`: js.UndefOr[Boolean] = js.undefined,
    validators: js.Array[Validator] = null
  ): CommandMetadataInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataInput]
  }
}

