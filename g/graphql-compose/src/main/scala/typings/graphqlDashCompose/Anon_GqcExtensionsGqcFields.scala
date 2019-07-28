package typings.graphqlDashCompose

import typings.graphqlDashCompose.esmInputTypeComposerMod.ComposeInputFieldConfigMap
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcExtensionsGqcFields extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeInputFieldConfigMap] = js.undefined
}

object Anon_GqcExtensionsGqcFields {
  @scala.inline
  def apply(_gqcExtensions: Extensions = null, _gqcFields: ComposeInputFieldConfigMap = null): Anon_GqcExtensionsGqcFields = {
    val __obj = js.Dynamic.literal()
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions)
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields)
    __obj.asInstanceOf[Anon_GqcExtensionsGqcFields]
  }
}

