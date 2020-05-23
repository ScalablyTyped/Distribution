package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import typings.keystonejsKeystone.anon.ResolvedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ trait SlugOptions[FieldNames /* <: String */] extends BaseFieldOptions {
  var from: String
  // TODO: resolved data is of the same type as the current object list. Investigate if we can at least provide the available keys via a generic.
  def generate(opts: ResolvedData[FieldNames]): String
}

object SlugOptions {
  @scala.inline
  def apply[FieldNames](
    from: String,
    generate: ResolvedData[FieldNames] => String,
    `type`: FieldType,
    access: Access = null,
    defaultValue: Boolean | DefaultValueFunction = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    schemaDoc: String = null
  ): SlugOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (schemaDoc != null) __obj.updateDynamic("schemaDoc")(schemaDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlugOptions[FieldNames]]
  }
}

