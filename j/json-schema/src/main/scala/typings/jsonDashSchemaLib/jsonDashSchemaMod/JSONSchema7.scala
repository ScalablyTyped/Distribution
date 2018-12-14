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

