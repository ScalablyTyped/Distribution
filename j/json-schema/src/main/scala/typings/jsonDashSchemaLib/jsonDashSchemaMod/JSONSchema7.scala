package typings
package jsonDashSchemaLib.jsonDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchema7 extends js.Object {
  @JSName("$comment")
  var $comment: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$id")
  var $id: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
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
  var contentEncoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-8
    */
  var contentMediaType: js.UndefOr[java.lang.String] = js.undefined
  var default: js.UndefOr[JSONSchema7Type] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-9
    */
  var definitions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[JSONSchema7Definition]] = js.undefined
  var dependencies: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[JSONSchema7Definition | js.Array[java.lang.String]]
  ] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var `else`: js.UndefOr[JSONSchema7Definition] = js.undefined
  var enum: js.UndefOr[js.Array[JSONSchema7Type]] = js.undefined
  var examples: js.UndefOr[JSONSchema7Type] = js.undefined
  var exclusiveMaximum: js.UndefOr[scala.Double] = js.undefined
  var exclusiveMinimum: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-7
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.6
    */
  var `if`: js.UndefOr[JSONSchema7Definition] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.4
    */
  var items: js.UndefOr[JSONSchema7Definition | js.Array[JSONSchema7Definition]] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.3
    */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.5
    */
  var maxProperties: js.UndefOr[scala.Double] = js.undefined
  var maximum: js.UndefOr[scala.Double] = js.undefined
  var minItems: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var minProperties: js.UndefOr[scala.Double] = js.undefined
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.2
    */
  var multipleOf: js.UndefOr[scala.Double] = js.undefined
  var not: js.UndefOr[JSONSchema7Definition] = js.undefined
  var oneOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var patternProperties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[JSONSchema7Definition]] = js.undefined
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[JSONSchema7Definition]] = js.undefined
  var propertyNames: js.UndefOr[JSONSchema7Definition] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `then`: js.UndefOr[JSONSchema7Definition] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-10
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.1
    */
  var `type`: js.UndefOr[JSONSchema7TypeName | js.Array[JSONSchema7TypeName]] = js.undefined
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
  var writeOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object JSONSchema7 {
  @scala.inline
  def apply(
    $comment: java.lang.String = null,
    $id: java.lang.String = null,
    $ref: java.lang.String = null,
    $schema: JSONSchema7Version = null,
    additionalItems: JSONSchema7Definition = null,
    additionalProperties: JSONSchema7Definition = null,
    allOf: js.Array[JSONSchema7Definition] = null,
    anyOf: js.Array[JSONSchema7Definition] = null,
    const: JSONSchema7Type = null,
    contains: JSONSchema7 = null,
    contentEncoding: java.lang.String = null,
    contentMediaType: java.lang.String = null,
    default: JSONSchema7Type = null,
    definitions: org.scalablytyped.runtime.StringDictionary[JSONSchema7Definition] = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[JSONSchema7Definition | js.Array[java.lang.String]] = null,
    description: java.lang.String = null,
    `else`: JSONSchema7Definition = null,
    enum: js.Array[JSONSchema7Type] = null,
    examples: JSONSchema7Type = null,
    exclusiveMaximum: scala.Int | scala.Double = null,
    exclusiveMinimum: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    `if`: JSONSchema7Definition = null,
    items: JSONSchema7Definition | js.Array[JSONSchema7Definition] = null,
    maxItems: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxProperties: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minItems: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    minProperties: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    multipleOf: scala.Int | scala.Double = null,
    not: JSONSchema7Definition = null,
    oneOf: js.Array[JSONSchema7Definition] = null,
    pattern: java.lang.String = null,
    patternProperties: org.scalablytyped.runtime.StringDictionary[JSONSchema7Definition] = null,
    properties: org.scalablytyped.runtime.StringDictionary[JSONSchema7Definition] = null,
    propertyNames: JSONSchema7Definition = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.Array[java.lang.String] = null,
    `then`: JSONSchema7Definition = null,
    title: java.lang.String = null,
    `type`: JSONSchema7TypeName | js.Array[JSONSchema7TypeName] = null,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined,
    writeOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): JSONSchema7 = {
    val __obj = js.Dynamic.literal()
    if ($comment != null) __obj.updateDynamic("$comment")($comment)
    if ($id != null) __obj.updateDynamic("$id")($id)
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if ($schema != null) __obj.updateDynamic("$schema")($schema)
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf)
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf)
    if (const != null) __obj.updateDynamic("const")(const.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentMediaType != null) __obj.updateDynamic("contentMediaType")(contentMediaType)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (`else` != null) __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (exclusiveMaximum != null) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.asInstanceOf[js.Any])
    if (exclusiveMinimum != null) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
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
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (propertyNames != null) __obj.updateDynamic("propertyNames")(propertyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (required != null) __obj.updateDynamic("required")(required)
    if (`then` != null) __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    if (!js.isUndefined(writeOnly)) __obj.updateDynamic("writeOnly")(writeOnly)
    __obj.asInstanceOf[JSONSchema7]
  }
}

