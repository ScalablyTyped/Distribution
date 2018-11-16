package typings
package jsonDashSchemaLib.jsonDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSONSchema6 extends js.Object {
  @JSName("$id")
  var $id: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
  @JSName("$schema")
  var $schema: js.UndefOr[
    jsonDashSchemaLib.jsonDashSchemaLibStrings.`http://json-schemaDOTorg/schema#` | jsonDashSchemaLib.jsonDashSchemaLibStrings.`http://json-schemaDOTorg/hyper-schema#` | jsonDashSchemaLib.jsonDashSchemaLibStrings.`http://json-schemaDOTorg/draft-06/schema#` | jsonDashSchemaLib.jsonDashSchemaLibStrings.`http://json-schemaDOTorg/draft-06/hyper-schema#`
  ] = js.undefined
  /**
       * This keyword determines how child instances validate for arrays, and does not directly validate the immediate instance itself.
       * If "items" is an array of schemas, validation succeeds if every instance element
       * at a position greater than the size of "items" validates against "additionalItems".
       * Otherwise, "additionalItems" MUST be ignored, as the "items" schema
       * (possibly the default value of an empty schema) is applied to all elements.
       * Omitting this keyword has the same behavior as an empty schema.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.10
       */
  var additionalItems: js.UndefOr[JSONSchema6Definition] = js.undefined
  /**
       * This attribute defines a schema for all properties that are not explicitly defined in an object type definition.
       * If specified, the value MUST be a schema or a boolean.
       * If false is provided, no additional properties are allowed beyond the properties defined in the schema.
       * The default value is an empty schema which allows any value for additional properties.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.20
       */
  var additionalProperties: js.UndefOr[JSONSchema6Definition] = js.undefined
  /**
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.26
       */
  var allOf: js.UndefOr[js.Array[JSONSchema6Definition]] = js.undefined
  /**
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.27
       */
  var anyOf: js.UndefOr[js.Array[JSONSchema6Definition]] = js.undefined
  /**
       * More readible form of a one-element "enum"
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.24
       */
  var const: js.UndefOr[JSONSchema6Type] = js.undefined
  /**
       * An array instance is valid against "contains" if at least one of its elements is valid against the given schema.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.14
       */
  var contains: js.UndefOr[JSONSchema6Definition] = js.undefined
  /**
       * This keyword can be used to supply a default JSON value associated with a particular schema.
       * It is RECOMMENDED that a default value be valid against the associated schema.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.3
       */
  var default: js.UndefOr[JSONSchema6Type] = js.undefined
  /**
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.1
       */
  var definitions: js.UndefOr[ScalablyTyped.runtime.StringDictionary[JSONSchema6Definition]] = js.undefined
  /**
       * This keyword specifies rules that are evaluated if the instance is an object and contains a certain property.
       * Each property specifies a dependency.
       * If the dependency value is an array, each element in the array must be unique.
       * Omitting this keyword has the same behavior as an empty object.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.21
       */
  var dependencies: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[JSONSchema6Definition | js.Array[java.lang.String]]
  ] = js.undefined
  /**
       * This attribute is a string that provides a full description of the of purpose the instance property.
       *
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.2
       */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
       * This provides an enumeration of all possible values that are valid
       * for the instance property. This MUST be an array, and each item in
       * the array represents a possible value for the instance value. If
       * this attribute is defined, the instance value MUST be one of the
       * values in the array in order for the schema to be valid.
       *
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.23
       */
  var enum: js.UndefOr[js.Array[JSONSchema6Type]] = js.undefined
  /**
       * Array of examples with no validation effect the value of "default" is usable as an example without repeating it under this keyword
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.4
       */
  var examples: js.UndefOr[js.Array[JSONSchema6Type]] = js.undefined
  /**
       * Representing an exclusive upper limit for a numeric instance.
       * This keyword validates only if the instance is strictly less than (not equal to) to "exclusiveMaximum".
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.3
       */
  var exclusiveMaximum: js.UndefOr[scala.Double] = js.undefined
  /**
       * Representing an exclusive lower limit for a numeric instance.
       * This keyword validates only if the instance is strictly greater than (not equal to) to "exclusiveMinimum".
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.5
       */
  var exclusiveMinimum: js.UndefOr[scala.Double] = js.undefined
  /**
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-8
       */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
       * This keyword determines how child instances validate for arrays, and does not directly validate the immediate instance itself.
       * Omitting this keyword has the same behavior as an empty schema.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.9
       */
  var items: js.UndefOr[JSONSchema6Definition | js.Array[JSONSchema6Definition]] = js.undefined
  /**
       * Must be a non-negative integer.
       * An array instance is valid against "maxItems" if its size is less than, or equal to, the value of this keyword.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.11
       */
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  /**
       * Must be a non-negative integer.
       * A string instance is valid against this keyword if its length is less than, or equal to, the value of this keyword.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.6
       */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /**
       * Must be a non-negative integer.
       * An object instance is valid against "maxProperties" if its number of properties is less than, or equal to, the value of this keyword.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.15
       */
  var maxProperties: js.UndefOr[scala.Double] = js.undefined
  /**
       * Representing an inclusive upper limit for a numeric instance.
       * This keyword validates only if the instance is less than or exactly equal to "maximum".
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.2
       */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /**
       * Must be a non-negative integer.
       * An array instance is valid against "maxItems" if its size is greater than, or equal to, the value of this keyword.
       * Omitting this keyword has the same behavior as a value of 0.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.12
       */
  var minItems: js.UndefOr[scala.Double] = js.undefined
  /**
       * Must be a non-negative integer.
       * A string instance is valid against this keyword if its length is greater than, or equal to, the value of this keyword.
       * Omitting this keyword has the same behavior as a value of 0.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.7
       */
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /**
       * Must be a non-negative integer.
       * An object instance is valid against "maxProperties" if its number of properties is greater than,
       * or equal to, the value of this keyword.
       * Omitting this keyword has the same behavior as a value of 0.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.16
       */
  var minProperties: js.UndefOr[scala.Double] = js.undefined
  /**
       * Representing an inclusive lower limit for a numeric instance.
       * This keyword validates only if the instance is greater than or exactly equal to "minimum".
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.4
       */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /**
       * Must be strictly greater than 0.
       * A numeric instance is valid only if division by this keyword's value results in an integer.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.1
       */
  var multipleOf: js.UndefOr[scala.Double] = js.undefined
  /**
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.29
       */
  var not: js.UndefOr[JSONSchema6Definition] = js.undefined
  /**
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.28
       */
  var oneOf: js.UndefOr[js.Array[JSONSchema6Definition]] = js.undefined
  /**
       * Should be a valid regular expression, according to the ECMA 262 regular expression dialect.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.8
       */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /**
       * This attribute is an object that defines the schema for a set of property names of an object instance.
       * The name of each property of this attribute's object is a regular expression pattern in the ECMA 262, while the value is a schema.
       * If the pattern matches the name of a property on the instance object, the value of the instance's property
       * MUST be valid against the pattern name's schema value.
       * Omitting this keyword has the same behavior as an empty object.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.19
       */
  var patternProperties: js.UndefOr[ScalablyTyped.runtime.StringDictionary[JSONSchema6Definition]] = js.undefined
  /**
       * This keyword determines how child instances validate for objects, and does not directly validate the immediate instance itself.
       * Validation succeeds if, for each name that appears in both the instance and as a name within this keyword's value,
       * the child instance for that name successfully validates against the corresponding schema.
       * Omitting this keyword has the same behavior as an empty object.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.18
       */
  var properties: js.UndefOr[ScalablyTyped.runtime.StringDictionary[JSONSchema6Definition]] = js.undefined
  /**
       * Takes a schema which validates the names of all properties rather than their values.
       * Note the property name that the schema is testing will always be a string.
       * Omitting this keyword has the same behavior as an empty schema.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.22
       */
  var propertyNames: js.UndefOr[JSONSchema6Definition] = js.undefined
  /**
       * Elements of this array must be unique.
       * An object instance is valid against this keyword if every item in the array is the name of a property in the instance.
       * Omitting this keyword has the same behavior as an empty array.
       *
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.17
       */
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * This attribute is a string that provides a short description of the instance property.
       *
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.2
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A single type, or a union of simple types
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.25
       */
  var `type`: js.UndefOr[JSONSchema6TypeName | js.Array[JSONSchema6TypeName]] = js.undefined
  /**
       * If this keyword has boolean value false, the instance validates successfully.
       * If it has boolean value true, the instance validates successfully if all of its elements are unique.
       * Omitting this keyword has the same behavior as a value of false.
       * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.13
       */
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
}

