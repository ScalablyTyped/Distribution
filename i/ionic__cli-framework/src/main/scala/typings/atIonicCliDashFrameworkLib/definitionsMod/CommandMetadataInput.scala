package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadataInput extends js.Object {
  var name: java.lang.String
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var summary: java.lang.String
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}

object CommandMetadataInput {
  @scala.inline
  def apply(
    name: java.lang.String,
    summary: java.lang.String,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    validators: js.Array[Validator] = null
  ): CommandMetadataInput = {
    val __obj = js.Dynamic.literal(name = name, summary = summary)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[CommandMetadataInput]
  }
}

