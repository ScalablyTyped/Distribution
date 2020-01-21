package typings.jsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchema7 extends js.Object {
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  @JSName("$id")
  var $id: js.UndefOr[String] = js.native
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchema7Version] = js.native
  var additionalItems: js.UndefOr[JSONSchema7Definition] = js.native
  var additionalProperties: js.UndefOr[JSONSchema7Definition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.7
    */
  var allOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.native
  var anyOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.native
  var const: js.UndefOr[JSONSchema7Type] = js.native
  var contains: js.UndefOr[JSONSchema7] = js.native
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-8
    */
  var contentMediaType: js.UndefOr[String] = js.native
  var default: js.UndefOr[JSONSchema7Type] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-9
    */
  var definitions: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.native
  var dependencies: js.UndefOr[StringDictionary[JSONSchema7Definition | js.Array[String]]] = js.native
  var description: js.UndefOr[String] = js.native
  var `else`: js.UndefOr[JSONSchema7Definition] = js.native
  var enum: js.UndefOr[js.Array[JSONSchema7Type]] = js.native
  var examples: js.UndefOr[JSONSchema7Type] = js.native
  var exclusiveMaximum: js.UndefOr[Double] = js.native
  var exclusiveMinimum: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-7
    */
  var format: js.UndefOr[String] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.6
    */
  var `if`: js.UndefOr[JSONSchema7Definition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.4
    */
  var items: js.UndefOr[JSONSchema7Definition | js.Array[JSONSchema7Definition]] = js.native
  var maxItems: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.3
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.5
    */
  var maxProperties: js.UndefOr[Double] = js.native
  var maximum: js.UndefOr[Double] = js.native
  var minItems: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var minProperties: js.UndefOr[Double] = js.native
  var minimum: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.2
    */
  var multipleOf: js.UndefOr[Double] = js.native
  var not: js.UndefOr[JSONSchema7Definition] = js.native
  var oneOf: js.UndefOr[js.Array[JSONSchema7Definition]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var patternProperties: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.native
  var properties: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.native
  var propertyNames: js.UndefOr[JSONSchema7Definition] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  var `then`: js.UndefOr[JSONSchema7Definition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-10
    */
  var title: js.UndefOr[String] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.1
    */
  var `type`: js.UndefOr[JSONSchema7TypeName | js.Array[JSONSchema7TypeName]] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
  var writeOnly: js.UndefOr[Boolean] = js.native
}

