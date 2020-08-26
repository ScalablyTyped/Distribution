package typings.jsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.jsonSchemaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchema4
  extends /**
  * @see https://tools.ietf.org/html/draft-zyp-json-schema-04#section-5.6
  */
/* k */ StringDictionary[js.Any] {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchema4Version] = js.native
  /**
    * May only be defined when "items" is defined, and is a tuple of JSONSchemas.
    *
    * This provides a definition for additional items in an array instance
    * when tuple definitions of the items is provided.  This can be false
    * to indicate additional items in the array are not allowed, or it can
    * be a schema that defines the schema of the additional items.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.6
    */
  var additionalItems: js.UndefOr[Boolean | JSONSchema4] = js.native
  /**
    * This attribute defines a schema for all properties that are not
    * explicitly defined in an object type definition. If specified, the
    * value MUST be a schema or a boolean. If false is provided, no
    * additional properties are allowed beyond the properties defined in
    * the schema. The default value is an empty schema which allows any
    * value for additional properties.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.4
    */
  var additionalProperties: js.UndefOr[Boolean | JSONSchema4] = js.native
  var allOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
  var anyOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
  var default: js.UndefOr[JSONSchema4Type] = js.native
  var definitions: js.UndefOr[StringDictionary[JSONSchema4]] = js.native
  var dependencies: js.UndefOr[StringDictionary[JSONSchema4 | js.Array[String]]] = js.native
  /**
    * This attribute is a string that provides a full description of the of
    * purpose the instance property.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.22
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This provides an enumeration of all possible values that are valid
    * for the instance property. This MUST be an array, and each item in
    * the array represents a possible value for the instance value. If
    * this attribute is defined, the instance value MUST be one of the
    * values in the array in order for the schema to be valid.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.19
    */
  var enum: js.UndefOr[js.Array[JSONSchema4Type]] = js.native
  var exclusiveMaximum: js.UndefOr[Boolean] = js.native
  var exclusiveMinimum: js.UndefOr[Boolean] = js.native
  /**
    * The value of this property MUST be another schema which will provide
    * a base schema which the current schema will inherit from.  The
    * inheritance rules are such that any instance that is valid according
    * to the current schema MUST be valid according to the referenced
    * schema.  This MAY also be an array, in which case, the instance MUST
    * be valid for all the schemas in the array.  A schema that extends
    * another schema MAY define additional attributes, constrain existing
    * attributes, or add other constraints.
    *
    * Conceptually, the behavior of extends can be seen as validating an
    * instance against all constraints in the extending schema as well as
    * the extended schema(s).
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.26
    */
  var `extends`: js.UndefOr[String | js.Array[String]] = js.native
  var format: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * This attribute defines the allowed items in an instance array, and
    * MUST be a schema or an array of schemas.  The default value is an
    * empty schema which allows any value for items in the instance array.
    *
    * When this attribute value is a schema and the instance value is an
    * array, then all the items in the array MUST be valid according to the
    * schema.
    *
    * When this attribute value is an array of schemas and the instance
    * value is an array, each position in the instance array MUST conform
    * to the schema in the corresponding position for this array.  This
    * called tuple typing.  When tuple typing is used, additional items are
    * allowed, disallowed, or constrained by the "additionalItems"
    * (Section 5.6) attribute using the same rules as
    * "additionalProperties" (Section 5.4) for objects.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.5
    */
  var items: js.UndefOr[JSONSchema4 | js.Array[JSONSchema4]] = js.native
  var maxItems: js.UndefOr[Double] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var maxProperties: js.UndefOr[Double] = js.native
  var maximum: js.UndefOr[Double] = js.native
  var minItems: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var minProperties: js.UndefOr[Double] = js.native
  var minimum: js.UndefOr[Double] = js.native
  var multipleOf: js.UndefOr[Double] = js.native
  var not: js.UndefOr[JSONSchema4] = js.native
  var oneOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
  var pattern: js.UndefOr[String] = js.native
  /**
    * This attribute is an object that defines the schema for a set of
    * property names of an object instance. The name of each property of
    * this attribute's object is a regular expression pattern in the ECMA
    * 262/Perl 5 format, while the value is a schema. If the pattern
    * matches the name of a property on the instance object, the value of
    * the instance's property MUST be valid against the pattern name's
    * schema value.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.3
    */
  var patternProperties: js.UndefOr[StringDictionary[JSONSchema4]] = js.native
  /**
    * This attribute is an object with property definitions that define the
    * valid values of instance object property values. When the instance
    * value is an object, the property values of the instance object MUST
    * conform to the property definitions in this object. In this object,
    * each property definition's value MUST be a schema, and the property's
    * name MUST be the name of the instance property that it defines.  The
    * instance property value MUST be valid according to the schema from
    * the property definition. Properties are considered unordered, the
    * order of the instance properties MAY be in any order.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.2
    */
  var properties: js.UndefOr[StringDictionary[JSONSchema4]] = js.native
  /**
    * This attribute indicates if the instance must have a value, and not
    * be undefined. This is false by default, making the instance
    * optional.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.7
    */
  var required: js.UndefOr[`false` | js.Array[String]] = js.native
  /**
    * This attribute is a string that provides a short description of the
    * instance property.
    *
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.21
    */
  var title: js.UndefOr[String] = js.native
  /**
    * A single type, or a union of simple types
    */
  var `type`: js.UndefOr[JSONSchema4TypeName | js.Array[JSONSchema4TypeName]] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

object JSONSchema4 {
  @scala.inline
  def apply(): JSONSchema4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchema4]
  }
  @scala.inline
  implicit class JSONSchema4Ops[Self <: JSONSchema4] (val x: Self) extends AnyVal {
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
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    @scala.inline
    def set$schema(value: JSONSchema4Version): Self = this.set("$schema", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$schema: Self = this.set("$schema", js.undefined)
    @scala.inline
    def setAdditionalItems(value: Boolean | JSONSchema4): Self = this.set("additionalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalItems: Self = this.set("additionalItems", js.undefined)
    @scala.inline
    def setAdditionalProperties(value: Boolean | JSONSchema4): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setAllOfVarargs(value: JSONSchema4*): Self = this.set("allOf", js.Array(value :_*))
    @scala.inline
    def setAllOf(value: js.Array[JSONSchema4]): Self = this.set("allOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllOf: Self = this.set("allOf", js.undefined)
    @scala.inline
    def setAnyOfVarargs(value: JSONSchema4*): Self = this.set("anyOf", js.Array(value :_*))
    @scala.inline
    def setAnyOf(value: js.Array[JSONSchema4]): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyOf: Self = this.set("anyOf", js.undefined)
    @scala.inline
    def setDefault(value: JSONSchema4Type): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    @scala.inline
    def setDefinitions(value: StringDictionary[JSONSchema4]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    @scala.inline
    def setDependencies(value: StringDictionary[JSONSchema4 | js.Array[String]]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnumVarargs(value: JSONSchema4Type*): Self = this.set("enum", js.Array(value :_*))
    @scala.inline
    def setEnum(value: js.Array[JSONSchema4Type]): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    @scala.inline
    def setExclusiveMaximum(value: Boolean): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMaximum: Self = this.set("exclusiveMaximum", js.undefined)
    @scala.inline
    def setExclusiveMinimum(value: Boolean): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMinimum: Self = this.set("exclusiveMinimum", js.undefined)
    @scala.inline
    def setExtendsVarargs(value: String*): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: String | js.Array[String]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemsVarargs(value: JSONSchema4*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: JSONSchema4 | js.Array[JSONSchema4]): Self = this.set("items", value.asInstanceOf[js.Any])
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
    def setNot(value: JSONSchema4): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    @scala.inline
    def setOneOfVarargs(value: JSONSchema4*): Self = this.set("oneOf", js.Array(value :_*))
    @scala.inline
    def setOneOf(value: js.Array[JSONSchema4]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPatternProperties(value: StringDictionary[JSONSchema4]): Self = this.set("patternProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternProperties: Self = this.set("patternProperties", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[JSONSchema4]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: `false` | js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTypeVarargs(value: JSONSchema4TypeName*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: JSONSchema4TypeName | js.Array[JSONSchema4TypeName]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUniqueItems(value: Boolean): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueItems: Self = this.set("uniqueItems", js.undefined)
  }
  
}

