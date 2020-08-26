package typings.jsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchema6 extends js.Object {
  @JSName("$id")
  var $id: js.UndefOr[String] = js.native
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchema6Version] = js.native
  /**
    * This keyword determines how child instances validate for arrays, and does not directly validate the immediate instance itself.
    * If "items" is an array of schemas, validation succeeds if every instance element
    * at a position greater than the size of "items" validates against "additionalItems".
    * Otherwise, "additionalItems" MUST be ignored, as the "items" schema
    * (possibly the default value of an empty schema) is applied to all elements.
    * Omitting this keyword has the same behavior as an empty schema.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.10
    */
  var additionalItems: js.UndefOr[JSONSchema6Definition] = js.native
  /**
    * This attribute defines a schema for all properties that are not explicitly defined in an object type definition.
    * If specified, the value MUST be a schema or a boolean.
    * If false is provided, no additional properties are allowed beyond the properties defined in the schema.
    * The default value is an empty schema which allows any value for additional properties.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.20
    */
  var additionalProperties: js.UndefOr[JSONSchema6Definition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.26
    */
  var allOf: js.UndefOr[js.Array[JSONSchema6Definition]] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.27
    */
  var anyOf: js.UndefOr[js.Array[JSONSchema6Definition]] = js.native
  /**
    * More readible form of a one-element "enum"
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.24
    */
  var const: js.UndefOr[JSONSchema6Type] = js.native
  /**
    * An array instance is valid against "contains" if at least one of its elements is valid against the given schema.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.14
    */
  var contains: js.UndefOr[JSONSchema6Definition] = js.native
  /**
    * This keyword can be used to supply a default JSON value associated with a particular schema.
    * It is RECOMMENDED that a default value be valid against the associated schema.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.3
    */
  var default: js.UndefOr[JSONSchema6Type] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.1
    */
  var definitions: js.UndefOr[StringDictionary[JSONSchema6Definition]] = js.native
  /**
    * This keyword specifies rules that are evaluated if the instance is an object and contains a certain property.
    * Each property specifies a dependency.
    * If the dependency value is an array, each element in the array must be unique.
    * Omitting this keyword has the same behavior as an empty object.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.21
    */
  var dependencies: js.UndefOr[StringDictionary[JSONSchema6Definition | js.Array[String]]] = js.native
  /**
    * This attribute is a string that provides a full description of the of purpose the instance property.
    *
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.2
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This provides an enumeration of all possible values that are valid
    * for the instance property. This MUST be an array, and each item in
    * the array represents a possible value for the instance value. If
    * this attribute is defined, the instance value MUST be one of the
    * values in the array in order for the schema to be valid.
    *
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.23
    */
  var enum: js.UndefOr[js.Array[JSONSchema6Type]] = js.native
  /**
    * Array of examples with no validation effect the value of "default" is usable as an example without repeating it under this keyword
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.4
    */
  var examples: js.UndefOr[js.Array[JSONSchema6Type]] = js.native
  /**
    * Representing an exclusive upper limit for a numeric instance.
    * This keyword validates only if the instance is strictly less than (not equal to) to "exclusiveMaximum".
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.3
    */
  var exclusiveMaximum: js.UndefOr[Double] = js.native
  /**
    * Representing an exclusive lower limit for a numeric instance.
    * This keyword validates only if the instance is strictly greater than (not equal to) to "exclusiveMinimum".
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.5
    */
  var exclusiveMinimum: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-8
    */
  var format: js.UndefOr[String] = js.native
  /**
    * This keyword determines how child instances validate for arrays, and does not directly validate the immediate instance itself.
    * Omitting this keyword has the same behavior as an empty schema.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.9
    */
  var items: js.UndefOr[JSONSchema6Definition | js.Array[JSONSchema6Definition]] = js.native
  /**
    * Must be a non-negative integer.
    * An array instance is valid against "maxItems" if its size is less than, or equal to, the value of this keyword.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.11
    */
  var maxItems: js.UndefOr[Double] = js.native
  /**
    * Must be a non-negative integer.
    * A string instance is valid against this keyword if its length is less than, or equal to, the value of this keyword.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.6
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * Must be a non-negative integer.
    * An object instance is valid against "maxProperties" if its number of properties is less than, or equal to, the value of this keyword.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.15
    */
  var maxProperties: js.UndefOr[Double] = js.native
  /**
    * Representing an inclusive upper limit for a numeric instance.
    * This keyword validates only if the instance is less than or exactly equal to "maximum".
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.2
    */
  var maximum: js.UndefOr[Double] = js.native
  /**
    * Must be a non-negative integer.
    * An array instance is valid against "maxItems" if its size is greater than, or equal to, the value of this keyword.
    * Omitting this keyword has the same behavior as a value of 0.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.12
    */
  var minItems: js.UndefOr[Double] = js.native
  /**
    * Must be a non-negative integer.
    * A string instance is valid against this keyword if its length is greater than, or equal to, the value of this keyword.
    * Omitting this keyword has the same behavior as a value of 0.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.7
    */
  var minLength: js.UndefOr[Double] = js.native
  /**
    * Must be a non-negative integer.
    * An object instance is valid against "maxProperties" if its number of properties is greater than,
    * or equal to, the value of this keyword.
    * Omitting this keyword has the same behavior as a value of 0.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.16
    */
  var minProperties: js.UndefOr[Double] = js.native
  /**
    * Representing an inclusive lower limit for a numeric instance.
    * This keyword validates only if the instance is greater than or exactly equal to "minimum".
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.4
    */
  var minimum: js.UndefOr[Double] = js.native
  /**
    * Must be strictly greater than 0.
    * A numeric instance is valid only if division by this keyword's value results in an integer.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.1
    */
  var multipleOf: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.29
    */
  var not: js.UndefOr[JSONSchema6Definition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.28
    */
  var oneOf: js.UndefOr[js.Array[JSONSchema6Definition]] = js.native
  /**
    * Should be a valid regular expression, according to the ECMA 262 regular expression dialect.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.8
    */
  var pattern: js.UndefOr[String] = js.native
  /**
    * This attribute is an object that defines the schema for a set of property names of an object instance.
    * The name of each property of this attribute's object is a regular expression pattern in the ECMA 262, while the value is a schema.
    * If the pattern matches the name of a property on the instance object, the value of the instance's property
    * MUST be valid against the pattern name's schema value.
    * Omitting this keyword has the same behavior as an empty object.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.19
    */
  var patternProperties: js.UndefOr[StringDictionary[JSONSchema6Definition]] = js.native
  /**
    * This keyword determines how child instances validate for objects, and does not directly validate the immediate instance itself.
    * Validation succeeds if, for each name that appears in both the instance and as a name within this keyword's value,
    * the child instance for that name successfully validates against the corresponding schema.
    * Omitting this keyword has the same behavior as an empty object.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.18
    */
  var properties: js.UndefOr[StringDictionary[JSONSchema6Definition]] = js.native
  /**
    * Takes a schema which validates the names of all properties rather than their values.
    * Note the property name that the schema is testing will always be a string.
    * Omitting this keyword has the same behavior as an empty schema.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.22
    */
  var propertyNames: js.UndefOr[JSONSchema6Definition] = js.native
  /**
    * Elements of this array must be unique.
    * An object instance is valid against this keyword if every item in the array is the name of a property in the instance.
    * Omitting this keyword has the same behavior as an empty array.
    *
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.17
    */
  var required: js.UndefOr[js.Array[String]] = js.native
  /**
    * This attribute is a string that provides a short description of the instance property.
    *
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.2
    */
  var title: js.UndefOr[String] = js.native
  /**
    * A single type, or a union of simple types
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.25
    */
  var `type`: js.UndefOr[JSONSchema6TypeName | js.Array[JSONSchema6TypeName]] = js.native
  /**
    * If this keyword has boolean value false, the instance validates successfully.
    * If it has boolean value true, the instance validates successfully if all of its elements are unique.
    * Omitting this keyword has the same behavior as a value of false.
    * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.13
    */
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

object JSONSchema6 {
  @scala.inline
  def apply(): JSONSchema6 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchema6]
  }
  @scala.inline
  implicit class JSONSchema6Ops[Self <: JSONSchema6] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$id(value: String): Self = this.set("$id", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$id: Self = this.set("$id", js.undefined)
    @scala.inline
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    @scala.inline
    def set$schema(value: JSONSchema6Version): Self = this.set("$schema", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$schema: Self = this.set("$schema", js.undefined)
    @scala.inline
    def setAdditionalItems(value: JSONSchema6Definition): Self = this.set("additionalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalItems: Self = this.set("additionalItems", js.undefined)
    @scala.inline
    def setAdditionalProperties(value: JSONSchema6Definition): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setAllOfVarargs(value: JSONSchema6Definition*): Self = this.set("allOf", js.Array(value :_*))
    @scala.inline
    def setAllOf(value: js.Array[JSONSchema6Definition]): Self = this.set("allOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllOf: Self = this.set("allOf", js.undefined)
    @scala.inline
    def setAnyOfVarargs(value: JSONSchema6Definition*): Self = this.set("anyOf", js.Array(value :_*))
    @scala.inline
    def setAnyOf(value: js.Array[JSONSchema6Definition]): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyOf: Self = this.set("anyOf", js.undefined)
    @scala.inline
    def setConst(value: JSONSchema6Type): Self = this.set("const", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConst: Self = this.set("const", js.undefined)
    @scala.inline
    def setConstNull: Self = this.set("const", null)
    @scala.inline
    def setContains(value: JSONSchema6Definition): Self = this.set("contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setDefault(value: JSONSchema6Type): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    @scala.inline
    def setDefinitions(value: StringDictionary[JSONSchema6Definition]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    @scala.inline
    def setDependencies(value: StringDictionary[JSONSchema6Definition | js.Array[String]]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnumVarargs(value: JSONSchema6Type*): Self = this.set("enum", js.Array(value :_*))
    @scala.inline
    def setEnum(value: js.Array[JSONSchema6Type]): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    @scala.inline
    def setExamplesVarargs(value: JSONSchema6Type*): Self = this.set("examples", js.Array(value :_*))
    @scala.inline
    def setExamples(value: js.Array[JSONSchema6Type]): Self = this.set("examples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    @scala.inline
    def setExclusiveMaximum(value: Double): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMaximum: Self = this.set("exclusiveMaximum", js.undefined)
    @scala.inline
    def setExclusiveMinimum(value: Double): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMinimum: Self = this.set("exclusiveMinimum", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setItemsVarargs(value: JSONSchema6Definition*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: JSONSchema6Definition | js.Array[JSONSchema6Definition]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaxProperties(value: Double): Self = this.set("maxProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxProperties: Self = this.set("maxProperties", js.undefined)
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMinItems(value: Double): Self = this.set("minItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinItems: Self = this.set("minItems", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMinProperties(value: Double): Self = this.set("minProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinProperties: Self = this.set("minProperties", js.undefined)
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setMultipleOf(value: Double): Self = this.set("multipleOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleOf: Self = this.set("multipleOf", js.undefined)
    @scala.inline
    def setNot(value: JSONSchema6Definition): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    @scala.inline
    def setOneOfVarargs(value: JSONSchema6Definition*): Self = this.set("oneOf", js.Array(value :_*))
    @scala.inline
    def setOneOf(value: js.Array[JSONSchema6Definition]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPatternProperties(value: StringDictionary[JSONSchema6Definition]): Self = this.set("patternProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternProperties: Self = this.set("patternProperties", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[JSONSchema6Definition]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setPropertyNames(value: JSONSchema6Definition): Self = this.set("propertyNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyNames: Self = this.set("propertyNames", js.undefined)
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTypeVarargs(value: JSONSchema6TypeName*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: JSONSchema6TypeName | js.Array[JSONSchema6TypeName]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUniqueItems(value: Boolean): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueItems: Self = this.set("uniqueItems", js.undefined)
  }
  
}

