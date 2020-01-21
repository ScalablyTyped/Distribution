package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFieldOptions
  extends AllFieldsOptions[js.Any] {
  var access: js.UndefOr[Access] = js.undefined
  var defaultValue: js.UndefOr[Boolean | DefaultValueFunction] = js.undefined
  var hooks: js.UndefOr[Hooks] = js.undefined
  var isRequired: js.UndefOr[Boolean] = js.undefined
  var isUnique: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var schemaDoc: js.UndefOr[String] = js.undefined
  var `type`: FieldType
}

object BaseFieldOptions {
  @scala.inline
  def apply(
    `type`: FieldType,
    access: Access = null,
    defaultValue: Boolean | DefaultValueFunction = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    schemaDoc: String = null
  ): BaseFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (schemaDoc != null) __obj.updateDynamic("schemaDoc")(schemaDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldOptions]
  }
}

