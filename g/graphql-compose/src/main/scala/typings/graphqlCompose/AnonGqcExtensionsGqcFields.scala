package typings.graphqlCompose

import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfigMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGqcExtensionsGqcFields extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeInputFieldConfigMap] = js.undefined
}

object AnonGqcExtensionsGqcFields {
  @scala.inline
  def apply(_gqcExtensions: Extensions = null, _gqcFields: ComposeInputFieldConfigMap = null): AnonGqcExtensionsGqcFields = {
    val __obj = js.Dynamic.literal()
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGqcExtensionsGqcFields]
  }
}

