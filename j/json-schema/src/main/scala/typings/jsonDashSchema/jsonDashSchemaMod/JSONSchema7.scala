package typings.jsonDashSchema.jsonDashSchemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchema7 extends js.Object {
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.undefined
  @JSName("$id")
  var $id: js.UndefOr[String] = js.undefined
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchema7Version] = js.undefined
  var additionalItems: js.UndefOr[JSONSchema7Definition] = js.undefined
  var additionalProperties: js.UndefOr[JSONSchema7Definition] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.7
    */
  var allOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.undefined
  var anyOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.undefined
  var const: js.UndefOr[JSONSchema7Type] = js.undefined
  var contains: js.UndefOr[JSONSchema7] = js.undefined
  var contentEncoding: js.UndefOr[String] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-8
    */
  var contentMediaType: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[JSONSchema7Type] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-9
    */
  var definitions: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.undefined
  var dependencies: js.UndefOr[StringDictionary[JSONSchema7Definition | js.Array[String]]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var `else`: js.UndefOr[JSONSchema7Definition] = js.undefined
  var enum: js.UndefOr[js.Array[JSONSchema7Type]] = js.undefined
  var examples: js.UndefOr[JSONSchema7Type] = js.undefined
  var exclusiveMaximum: js.UndefOr[Double] = js.undefined
  var exclusiveMinimum: js.UndefOr[Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-7
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.6
    */
  var `if`: js.UndefOr[JSONSchema7Definition] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.4
    */
  var items: js.UndefOr[JSONSchema7Definition | js.Array[JSONSchema7Definition]] = js.undefined
  var maxItems: js.UndefOr[Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.3
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.5
    */
  var maxProperties: js.UndefOr[Double] = js.undefined
  var maximum: js.UndefOr[Double] = js.undefined
  var minItems: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var minProperties: js.UndefOr[Double] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.2
    */
  var multipleOf: js.UndefOr[Double] = js.undefined
  var not: js.UndefOr[JSONSchema7Definition] = js.undefined
  var oneOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var patternProperties: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.undefined
  var properties: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.undefined
  var propertyNames: js.UndefOr[JSONSchema7Definition] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
  var `then`: js.UndefOr[JSONSchema7Definition] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-10
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.1
    */
  var `type`: js.UndefOr[JSONSchema7TypeName | js.Array[JSONSchema7TypeName]] = js.undefined
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
  var writeOnly: js.UndefOr[Boolean] = js.undefined
}

object JSONSchema7 {
  @scala.inline
  def apply(
    $comment: String = null,
    $id: String = null,
    $ref: String = null,
    $schema: JSONSchema7Version = null,
    additionalItems: JSONSchema7Definition = null,
    additionalProperties: JSONSchema7Definition = null,
    allOf: js.Array[JSONSchema7Definition] = null,
    anyOf: js.Array[JSONSchema7Definition] = null,
    const: JSONSchema7Type = null,
    contains: JSONSchema7 = null,
    contentEncoding: String = null,
    contentMediaType: String = null,
    default: JSONSchema7Type = null,
    definitions: StringDictionary[JSONSchema7Definition] = null,
    dependencies: StringDictionary[JSONSchema7Definition | js.Array[String]] = null,
    description: String = null,
    `else`: JSONSchema7Definition = null,
    enum: js.Array[JSONSchema7Type] = null,
    examples: JSONSchema7Type = null,
    exclusiveMaximum: Int | Double = null,
    exclusiveMinimum: Int | Double = null,
    format: String = null,
    `if`: JSONSchema7Definition = null,
    items: JSONSchema7Definition | js.Array[JSONSchema7Definition] = null,
    maxItems: Int | Double = null,
    maxLength: Int | Double = null,
    maxProperties: Int | Double = null,
    maximum: Int | Double = null,
    minItems: Int | Double = null,
    minLength: Int | Double = null,
    minProperties: Int | Double = null,
    minimum: Int | Double = null,
    multipleOf: Int | Double = null,
    not: JSONSchema7Definition = null,
    oneOf: js.Array[JSONSchema7Definition] = null,
    pattern: String = null,
    patternProperties: StringDictionary[JSONSchema7Definition] = null,
    properties: StringDictionary[JSONSchema7Definition] = null,
    propertyNames: JSONSchema7Definition = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.Array[String] = null,
    `then`: JSONSchema7Definition = null,
    title: String = null,
    `type`: JSONSchema7TypeName | js.Array[JSONSchema7TypeName] = null,
    uniqueItems: js.UndefOr[Boolean] = js.undefined,
    writeOnly: js.UndefOr[Boolean] = js.undefined
  ): JSONSchema7 = {
    val __obj = js.Dynamic.literal()
    if ($comment != null) __obj.updateDynamic("$comment")($comment.asInstanceOf[js.Any])
    if ($id != null) __obj.updateDynamic("$id")($id.asInstanceOf[js.Any])
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf.asInstanceOf[js.Any])
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf.asInstanceOf[js.Any])
    if (const != null) __obj.updateDynamic("const")(const.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentMediaType != null) __obj.updateDynamic("contentMediaType")(contentMediaType.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (`else` != null) __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (exclusiveMaximum != null) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.asInstanceOf[js.Any])
    if (exclusiveMinimum != null) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
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
    if (propertyNames != null) __obj.updateDynamic("propertyNames")(propertyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (`then` != null) __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems.asInstanceOf[js.Any])
    if (!js.isUndefined(writeOnly)) __obj.updateDynamic("writeOnly")(writeOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchema7]
  }
}

