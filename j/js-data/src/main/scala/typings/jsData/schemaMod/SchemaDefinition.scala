package typings.jsData.schemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaDefinition extends js.Object {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  var additionalProperties: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var `extends`: js.UndefOr[SchemaDefinition | Schema] = js.undefined
  var items: js.UndefOr[SchemaDefinition | Schema] = js.undefined
  var properties: js.UndefOr[StringDictionary[PropertyDefinition | js.Any]] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var track: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SchemaDefinition {
  @scala.inline
  def apply(
    $schema: String = null,
    additionalProperties: js.Any = null,
    description: String = null,
    `extends`: SchemaDefinition | Schema = null,
    items: SchemaDefinition | Schema = null,
    properties: StringDictionary[PropertyDefinition | js.Any] = null,
    required: js.Array[String] = null,
    title: String = null,
    track: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDefinition]
  }
}

