package typings.jsonschema.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  var additionalItems: js.UndefOr[Boolean | Schema] = js.undefined
  var additionalProperties: js.UndefOr[Boolean | Schema] = js.undefined
  var allOf: js.UndefOr[js.Array[Schema]] = js.undefined
  var anyOf: js.UndefOr[js.Array[Schema]] = js.undefined
  var definitions: js.UndefOr[StringDictionary[Schema]] = js.undefined
  var dependencies: js.UndefOr[StringDictionary[Schema | js.Array[String]]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  var exclusiveMaximum: js.UndefOr[Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[Schema | js.Array[Schema]] = js.undefined
  var maxItems: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var maxProperties: js.UndefOr[Double] = js.undefined
  var maximum: js.UndefOr[Double] = js.undefined
  var minItems: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var minProperties: js.UndefOr[Double] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
  var multipleOf: js.UndefOr[Double] = js.undefined
  var not: js.UndefOr[Schema] = js.undefined
  var oneOf: js.UndefOr[js.Array[Schema]] = js.undefined
  var pattern: js.UndefOr[String | RegExp] = js.undefined
  var patternProperties: js.UndefOr[StringDictionary[Schema]] = js.undefined
  var properties: js.UndefOr[StringDictionary[Schema]] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}

object Schema {
  @scala.inline
  def apply(
    $ref: String = null,
    $schema: String = null,
    additionalItems: Boolean | Schema = null,
    additionalProperties: Boolean | Schema = null,
    allOf: js.Array[Schema] = null,
    anyOf: js.Array[Schema] = null,
    definitions: StringDictionary[Schema] = null,
    dependencies: StringDictionary[Schema | js.Array[String]] = null,
    description: String = null,
    enum: js.Array[_] = null,
    exclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    id: String = null,
    items: Schema | js.Array[Schema] = null,
    maxItems: Int | Double = null,
    maxLength: Int | Double = null,
    maxProperties: Int | Double = null,
    maximum: Int | Double = null,
    minItems: Int | Double = null,
    minLength: Int | Double = null,
    minProperties: Int | Double = null,
    minimum: Int | Double = null,
    multipleOf: Int | Double = null,
    not: Schema = null,
    oneOf: js.Array[Schema] = null,
    pattern: String | RegExp = null,
    patternProperties: StringDictionary[Schema] = null,
    properties: StringDictionary[Schema] = null,
    required: js.Array[String] = null,
    title: String = null,
    `type`: String | js.Array[String] = null,
    uniqueItems: js.UndefOr[Boolean] = js.undefined
  ): Schema = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf.asInstanceOf[js.Any])
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxProperties != null) __obj.updateDynamic("maxProperties")(maxProperties.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minItems != null) __obj.updateDynamic("minItems")(minItems.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minProperties != null) __obj.updateDynamic("minProperties")(minProperties.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (multipleOf != null) __obj.updateDynamic("multipleOf")(multipleOf.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

