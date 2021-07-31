package typings.jsonSchema

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.jsonSchemaBooleans.`false`
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def checkPropertyChange(value: js.Any, schema: JSONSchema4, property: String): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPropertyChange")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  @scala.inline
  def checkPropertyChange(value: js.Any, schema: JSONSchema6, property: String): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPropertyChange")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  @scala.inline
  def checkPropertyChange(value: js.Any, schema: JSONSchema7, property: String): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPropertyChange")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  
  @scala.inline
  def mustBeValid(result: ValidationResult): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mustBeValid")(result.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def validate(instance: js.Object, schema: JSONSchema4): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(instance.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  @scala.inline
  def validate(instance: js.Object, schema: JSONSchema6): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(instance.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  @scala.inline
  def validate(instance: js.Object, schema: JSONSchema7): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(instance.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  
  trait JSONSchema4
    extends StObject
       with /**
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-04#section-5.6
    */
  /* k */ StringDictionary[js.Any] {
    
    var default: js.UndefOr[JSONSchema4Type] = js.undefined
    
    @JSName("$ref")
    var $ref: js.UndefOr[String] = js.undefined
    
    @JSName("$schema")
    var $schema: js.UndefOr[JSONSchema4Version] = js.undefined
    
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
    var additionalItems: js.UndefOr[Boolean | JSONSchema4] = js.undefined
    
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
    var additionalProperties: js.UndefOr[Boolean | JSONSchema4] = js.undefined
    
    var allOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
    
    var anyOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
    
    var definitions: js.UndefOr[StringDictionary[JSONSchema4]] = js.undefined
    
    var dependencies: js.UndefOr[StringDictionary[JSONSchema4 | js.Array[String]]] = js.undefined
    
    /**
      * This attribute is a string that provides a full description of the of
      * purpose the instance property.
      *
      * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.22
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * This provides an enumeration of all possible values that are valid
      * for the instance property. This MUST be an array, and each item in
      * the array represents a possible value for the instance value. If
      * this attribute is defined, the instance value MUST be one of the
      * values in the array in order for the schema to be valid.
      *
      * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.19
      */
    var `enum`: js.UndefOr[js.Array[JSONSchema4Type]] = js.undefined
    
    var exclusiveMaximum: js.UndefOr[Boolean] = js.undefined
    
    var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
    
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
    var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
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
    var items: js.UndefOr[JSONSchema4 | js.Array[JSONSchema4]] = js.undefined
    
    var maxItems: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var maxProperties: js.UndefOr[Double] = js.undefined
    
    var maximum: js.UndefOr[Double] = js.undefined
    
    var minItems: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var minProperties: js.UndefOr[Double] = js.undefined
    
    var minimum: js.UndefOr[Double] = js.undefined
    
    var multipleOf: js.UndefOr[Double] = js.undefined
    
    var not: js.UndefOr[JSONSchema4] = js.undefined
    
    var oneOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
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
    var patternProperties: js.UndefOr[StringDictionary[JSONSchema4]] = js.undefined
    
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
    var properties: js.UndefOr[StringDictionary[JSONSchema4]] = js.undefined
    
    /**
      * This attribute indicates if the instance must have a value, and not
      * be undefined. This is false by default, making the instance
      * optional.
      *
      * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.7
      */
    var required: js.UndefOr[`false` | js.Array[String]] = js.undefined
    
    /**
      * This attribute is a string that provides a short description of the
      * instance property.
      *
      * @see https://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.21
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * A single type, or a union of simple types
      */
    var `type`: js.UndefOr[JSONSchema4TypeName | js.Array[JSONSchema4TypeName]] = js.undefined
    
    var uniqueItems: js.UndefOr[Boolean] = js.undefined
  }
  object JSONSchema4 {
    
    @scala.inline
    def apply(): JSONSchema4 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema4]
    }
    
    @scala.inline
    implicit class JSONSchema4MutableBuilder[Self <: JSONSchema4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      @scala.inline
      def set$schema(value: JSONSchema4Version): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      @scala.inline
      def setAdditionalItems(value: Boolean | JSONSchema4): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      @scala.inline
      def setAdditionalProperties(value: Boolean | JSONSchema4): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setAllOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      @scala.inline
      def setAllOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "allOf", js.Array(value :_*))
      
      @scala.inline
      def setAnyOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      @scala.inline
      def setAnyOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: JSONSchema4Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefinitions(value: StringDictionary[JSONSchema4]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      @scala.inline
      def setDependencies(value: StringDictionary[JSONSchema4 | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnum(value: js.Array[JSONSchema4Type]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: JSONSchema4Type*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setExclusiveMaximum(value: Boolean): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      @scala.inline
      def setExclusiveMinimum(value: Boolean): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      @scala.inline
      def setExtends(value: String | js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      @scala.inline
      def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItems(value: JSONSchema4 | js.Array[JSONSchema4]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: JSONSchema4*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
      
      @scala.inline
      def setNot(value: JSONSchema4): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setOneOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      @scala.inline
      def setOneOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternProperties(value: StringDictionary[JSONSchema4]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setProperties(value: StringDictionary[JSONSchema4]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setRequired(value: `false` | js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: JSONSchema4TypeName | js.Array[JSONSchema4TypeName]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: JSONSchema4TypeName*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  @js.native
  trait JSONSchema4Array
    extends StObject
       with Array[JSONSchema4Type]
       with _JSONSchema4Type
  
  trait JSONSchema4Object
    extends StObject
       with /* key */ StringDictionary[JSONSchema4Type]
       with _JSONSchema4Type
  object JSONSchema4Object {
    
    @scala.inline
    def apply(): JSONSchema4Object = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema4Object]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.jsonSchema.mod.JSONSchema4Object
    - typings.jsonSchema.mod.JSONSchema4Array
    - scala.Null
  */
  type JSONSchema4Type = _JSONSchema4Type | String | Double | Boolean | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonSchema.jsonSchemaStrings.string
    - typings.jsonSchema.jsonSchemaStrings.number
    - typings.jsonSchema.jsonSchemaStrings.integer
    - typings.jsonSchema.jsonSchemaStrings.boolean
    - typings.jsonSchema.jsonSchemaStrings.`object`
    - typings.jsonSchema.jsonSchemaStrings.array
    - typings.jsonSchema.jsonSchemaStrings.`null`
    - typings.jsonSchema.jsonSchemaStrings.any
  */
  trait JSONSchema4TypeName extends StObject
  object JSONSchema4TypeName {
    
    @scala.inline
    def any: typings.jsonSchema.jsonSchemaStrings.any = "any".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.any]
    
    @scala.inline
    def array: typings.jsonSchema.jsonSchemaStrings.array = "array".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.array]
    
    @scala.inline
    def boolean: typings.jsonSchema.jsonSchemaStrings.boolean = "boolean".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.boolean]
    
    @scala.inline
    def integer: typings.jsonSchema.jsonSchemaStrings.integer = "integer".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.integer]
    
    @scala.inline
    def `null`: typings.jsonSchema.jsonSchemaStrings.`null` = "null".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`null`]
    
    @scala.inline
    def number: typings.jsonSchema.jsonSchemaStrings.number = "number".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.number]
    
    @scala.inline
    def `object`: typings.jsonSchema.jsonSchemaStrings.`object` = "object".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`object`]
    
    @scala.inline
    def string: typings.jsonSchema.jsonSchemaStrings.string = "string".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.string]
  }
  
  type JSONSchema4Version = String
  
  trait JSONSchema6 extends StObject {
    
    /**
      * This keyword can be used to supply a default JSON value associated with a particular schema.
      * It is RECOMMENDED that a default value be valid against the associated schema.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.3
      */
    var default: js.UndefOr[JSONSchema6Type] = js.undefined
    
    @JSName("$id")
    var $id: js.UndefOr[String] = js.undefined
    
    @JSName("$ref")
    var $ref: js.UndefOr[String] = js.undefined
    
    @JSName("$schema")
    var $schema: js.UndefOr[JSONSchema6Version] = js.undefined
    
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
      * More readable form of a one-element "enum"
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.24
      */
    var const: js.UndefOr[JSONSchema6Type] = js.undefined
    
    /**
      * An array instance is valid against "contains" if at least one of its elements is valid against the given schema.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.14
      */
    var contains: js.UndefOr[JSONSchema6Definition] = js.undefined
    
    /**
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.1
      */
    var definitions: js.UndefOr[StringDictionary[JSONSchema6Definition]] = js.undefined
    
    /**
      * This keyword specifies rules that are evaluated if the instance is an object and contains a certain property.
      * Each property specifies a dependency.
      * If the dependency value is an array, each element in the array must be unique.
      * Omitting this keyword has the same behavior as an empty object.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.21
      */
    var dependencies: js.UndefOr[StringDictionary[JSONSchema6Definition | js.Array[String]]] = js.undefined
    
    /**
      * This attribute is a string that provides a full description of the of purpose the instance property.
      *
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.2
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * This provides an enumeration of all possible values that are valid
      * for the instance property. This MUST be an array, and each item in
      * the array represents a possible value for the instance value. If
      * this attribute is defined, the instance value MUST be one of the
      * values in the array in order for the schema to be valid.
      *
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.23
      */
    var `enum`: js.UndefOr[js.Array[JSONSchema6Type]] = js.undefined
    
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
    var exclusiveMaximum: js.UndefOr[Double] = js.undefined
    
    /**
      * Representing an exclusive lower limit for a numeric instance.
      * This keyword validates only if the instance is strictly greater than (not equal to) to "exclusiveMinimum".
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.5
      */
    var exclusiveMinimum: js.UndefOr[Double] = js.undefined
    
    /**
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-8
      */
    var format: js.UndefOr[String] = js.undefined
    
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
    var maxItems: js.UndefOr[Double] = js.undefined
    
    /**
      * Must be a non-negative integer.
      * A string instance is valid against this keyword if its length is less than, or equal to, the value of this keyword.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.6
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Must be a non-negative integer.
      * An object instance is valid against "maxProperties" if its number of properties is less than, or equal to, the value of this keyword.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.15
      */
    var maxProperties: js.UndefOr[Double] = js.undefined
    
    /**
      * Representing an inclusive upper limit for a numeric instance.
      * This keyword validates only if the instance is less than or exactly equal to "maximum".
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.2
      */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /**
      * Must be a non-negative integer.
      * An array instance is valid against "maxItems" if its size is greater than, or equal to, the value of this keyword.
      * Omitting this keyword has the same behavior as a value of 0.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.12
      */
    var minItems: js.UndefOr[Double] = js.undefined
    
    /**
      * Must be a non-negative integer.
      * A string instance is valid against this keyword if its length is greater than, or equal to, the value of this keyword.
      * Omitting this keyword has the same behavior as a value of 0.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.7
      */
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Must be a non-negative integer.
      * An object instance is valid against "maxProperties" if its number of properties is greater than,
      * or equal to, the value of this keyword.
      * Omitting this keyword has the same behavior as a value of 0.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.16
      */
    var minProperties: js.UndefOr[Double] = js.undefined
    
    /**
      * Representing an inclusive lower limit for a numeric instance.
      * This keyword validates only if the instance is greater than or exactly equal to "minimum".
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.4
      */
    var minimum: js.UndefOr[Double] = js.undefined
    
    /**
      * Must be strictly greater than 0.
      * A numeric instance is valid only if division by this keyword's value results in an integer.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.1
      */
    var multipleOf: js.UndefOr[Double] = js.undefined
    
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
    var pattern: js.UndefOr[String] = js.undefined
    
    /**
      * This attribute is an object that defines the schema for a set of property names of an object instance.
      * The name of each property of this attribute's object is a regular expression pattern in the ECMA 262, while the value is a schema.
      * If the pattern matches the name of a property on the instance object, the value of the instance's property
      * MUST be valid against the pattern name's schema value.
      * Omitting this keyword has the same behavior as an empty object.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.19
      */
    var patternProperties: js.UndefOr[StringDictionary[JSONSchema6Definition]] = js.undefined
    
    /**
      * This keyword determines how child instances validate for objects, and does not directly validate the immediate instance itself.
      * Validation succeeds if, for each name that appears in both the instance and as a name within this keyword's value,
      * the child instance for that name successfully validates against the corresponding schema.
      * Omitting this keyword has the same behavior as an empty object.
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-6.18
      */
    var properties: js.UndefOr[StringDictionary[JSONSchema6Definition]] = js.undefined
    
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
    var required: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * This attribute is a string that provides a short description of the instance property.
      *
      * @see https://tools.ietf.org/html/draft-wright-json-schema-validation-01#section-7.2
      */
    var title: js.UndefOr[String] = js.undefined
    
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
    var uniqueItems: js.UndefOr[Boolean] = js.undefined
  }
  object JSONSchema6 {
    
    @scala.inline
    def apply(): JSONSchema6 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema6]
    }
    
    @scala.inline
    implicit class JSONSchema6MutableBuilder[Self <: JSONSchema6] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
      
      @scala.inline
      def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      @scala.inline
      def set$schema(value: JSONSchema6Version): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      @scala.inline
      def setAdditionalItems(value: JSONSchema6Definition): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      @scala.inline
      def setAdditionalProperties(value: JSONSchema6Definition): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setAllOf(value: js.Array[JSONSchema6Definition]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      @scala.inline
      def setAllOfVarargs(value: JSONSchema6Definition*): Self = StObject.set(x, "allOf", js.Array(value :_*))
      
      @scala.inline
      def setAnyOf(value: js.Array[JSONSchema6Definition]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      @scala.inline
      def setAnyOfVarargs(value: JSONSchema6Definition*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
      
      @scala.inline
      def setConst(value: JSONSchema6Type): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstNull: Self = StObject.set(x, "const", null)
      
      @scala.inline
      def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
      
      @scala.inline
      def setContains(value: JSONSchema6Definition): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setDefault(value: JSONSchema6Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefinitions(value: StringDictionary[JSONSchema6Definition]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      @scala.inline
      def setDependencies(value: StringDictionary[JSONSchema6Definition | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnum(value: js.Array[JSONSchema6Type]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: JSONSchema6Type*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setExamples(value: js.Array[JSONSchema6Type]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
      
      @scala.inline
      def setExamplesVarargs(value: JSONSchema6Type*): Self = StObject.set(x, "examples", js.Array(value :_*))
      
      @scala.inline
      def setExclusiveMaximum(value: Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      @scala.inline
      def setExclusiveMinimum(value: Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setItems(value: JSONSchema6Definition | js.Array[JSONSchema6Definition]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: JSONSchema6Definition*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
      
      @scala.inline
      def setNot(value: JSONSchema6Definition): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setOneOf(value: js.Array[JSONSchema6Definition]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      @scala.inline
      def setOneOfVarargs(value: JSONSchema6Definition*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternProperties(value: StringDictionary[JSONSchema6Definition]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setProperties(value: StringDictionary[JSONSchema6Definition]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertyNames(value: JSONSchema6Definition): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
      
      @scala.inline
      def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: JSONSchema6TypeName | js.Array[JSONSchema6TypeName]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: JSONSchema6TypeName*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  @js.native
  trait JSONSchema6Array
    extends StObject
       with Array[JSONSchema6Type]
       with _JSONSchema6Type
  
  type JSONSchema6Definition = JSONSchema6 | Boolean
  
  trait JSONSchema6Object
    extends StObject
       with /* key */ StringDictionary[JSONSchema6Type]
       with _JSONSchema6Type
  object JSONSchema6Object {
    
    @scala.inline
    def apply(): JSONSchema6Object = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema6Object]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.jsonSchema.mod.JSONSchema6Object
    - typings.jsonSchema.mod.JSONSchema6Array
    - scala.Null
  */
  type JSONSchema6Type = _JSONSchema6Type | String | Double | Boolean | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonSchema.jsonSchemaStrings.string
    - typings.jsonSchema.jsonSchemaStrings.number
    - typings.jsonSchema.jsonSchemaStrings.integer
    - typings.jsonSchema.jsonSchemaStrings.boolean
    - typings.jsonSchema.jsonSchemaStrings.`object`
    - typings.jsonSchema.jsonSchemaStrings.array
    - typings.jsonSchema.jsonSchemaStrings.`null`
    - typings.jsonSchema.jsonSchemaStrings.any
  */
  trait JSONSchema6TypeName extends StObject
  object JSONSchema6TypeName {
    
    @scala.inline
    def any: typings.jsonSchema.jsonSchemaStrings.any = "any".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.any]
    
    @scala.inline
    def array: typings.jsonSchema.jsonSchemaStrings.array = "array".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.array]
    
    @scala.inline
    def boolean: typings.jsonSchema.jsonSchemaStrings.boolean = "boolean".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.boolean]
    
    @scala.inline
    def integer: typings.jsonSchema.jsonSchemaStrings.integer = "integer".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.integer]
    
    @scala.inline
    def `null`: typings.jsonSchema.jsonSchemaStrings.`null` = "null".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`null`]
    
    @scala.inline
    def number: typings.jsonSchema.jsonSchemaStrings.number = "number".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.number]
    
    @scala.inline
    def `object`: typings.jsonSchema.jsonSchemaStrings.`object` = "object".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`object`]
    
    @scala.inline
    def string: typings.jsonSchema.jsonSchemaStrings.string = "string".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.string]
  }
  
  type JSONSchema6Version = String
  
  trait JSONSchema7 extends StObject {
    
    var default: js.UndefOr[JSONSchema7Type] = js.undefined
    
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
    
    /**
      * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-9
      */
    var definitions: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.undefined
    
    var dependencies: js.UndefOr[StringDictionary[JSONSchema7Definition | js.Array[String]]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var `else`: js.UndefOr[JSONSchema7Definition] = js.undefined
    
    var `enum`: js.UndefOr[js.Array[JSONSchema7Type]] = js.undefined
    
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
    def apply(): JSONSchema7 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema7]
    }
    
    @scala.inline
    implicit class JSONSchema7MutableBuilder[Self <: JSONSchema7] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
      
      @scala.inline
      def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
      
      @scala.inline
      def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      @scala.inline
      def set$schema(value: JSONSchema7Version): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      @scala.inline
      def setAdditionalItems(value: JSONSchema7Definition): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      @scala.inline
      def setAdditionalProperties(value: JSONSchema7Definition): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setAllOf(value: js.Array[JSONSchema7Definition]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      @scala.inline
      def setAllOfVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "allOf", js.Array(value :_*))
      
      @scala.inline
      def setAnyOf(value: js.Array[JSONSchema7Definition]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      @scala.inline
      def setAnyOfVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
      
      @scala.inline
      def setConst(value: JSONSchema7Type): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstNull: Self = StObject.set(x, "const", null)
      
      @scala.inline
      def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
      
      @scala.inline
      def setContains(value: JSONSchema7): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      @scala.inline
      def setContentMediaType(value: String): Self = StObject.set(x, "contentMediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentMediaTypeUndefined: Self = StObject.set(x, "contentMediaType", js.undefined)
      
      @scala.inline
      def setDefault(value: JSONSchema7Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefinitions(value: StringDictionary[JSONSchema7Definition]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      @scala.inline
      def setDependencies(value: StringDictionary[JSONSchema7Definition | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setElse(value: JSONSchema7Definition): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
      
      @scala.inline
      def setEnum(value: js.Array[JSONSchema7Type]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: JSONSchema7Type*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setExamples(value: JSONSchema7Type): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExamplesNull: Self = StObject.set(x, "examples", null)
      
      @scala.inline
      def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
      
      @scala.inline
      def setExclusiveMaximum(value: Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      @scala.inline
      def setExclusiveMinimum(value: Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIf(value: JSONSchema7Definition): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      @scala.inline
      def setItems(value: JSONSchema7Definition | js.Array[JSONSchema7Definition]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
      
      @scala.inline
      def setNot(value: JSONSchema7Definition): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setOneOf(value: js.Array[JSONSchema7Definition]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      @scala.inline
      def setOneOfVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternProperties(value: StringDictionary[JSONSchema7Definition]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setProperties(value: StringDictionary[JSONSchema7Definition]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertyNames(value: JSONSchema7Definition): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      @scala.inline
      def setThen(value: JSONSchema7Definition): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: JSONSchema7TypeName | js.Array[JSONSchema7TypeName]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: JSONSchema7TypeName*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
      
      @scala.inline
      def setWriteOnly(value: Boolean): Self = StObject.set(x, "writeOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteOnlyUndefined: Self = StObject.set(x, "writeOnly", js.undefined)
    }
  }
  
  @js.native
  trait JSONSchema7Array
    extends StObject
       with Array[JSONSchema7Type]
       with _JSONSchema7Type
  
  type JSONSchema7Definition = JSONSchema7 | Boolean
  
  trait JSONSchema7Object
    extends StObject
       with /* key */ StringDictionary[JSONSchema7Type]
       with _JSONSchema7Type
  object JSONSchema7Object {
    
    @scala.inline
    def apply(): JSONSchema7Object = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema7Object]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.jsonSchema.mod.JSONSchema7Object
    - typings.jsonSchema.mod.JSONSchema7Array
    - scala.Null
  */
  type JSONSchema7Type = _JSONSchema7Type | String | Double | Boolean | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonSchema.jsonSchemaStrings.string
    - typings.jsonSchema.jsonSchemaStrings.number
    - typings.jsonSchema.jsonSchemaStrings.integer
    - typings.jsonSchema.jsonSchemaStrings.boolean
    - typings.jsonSchema.jsonSchemaStrings.`object`
    - typings.jsonSchema.jsonSchemaStrings.array
    - typings.jsonSchema.jsonSchemaStrings.`null`
  */
  trait JSONSchema7TypeName extends StObject
  object JSONSchema7TypeName {
    
    @scala.inline
    def array: typings.jsonSchema.jsonSchemaStrings.array = "array".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.array]
    
    @scala.inline
    def boolean: typings.jsonSchema.jsonSchemaStrings.boolean = "boolean".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.boolean]
    
    @scala.inline
    def integer: typings.jsonSchema.jsonSchemaStrings.integer = "integer".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.integer]
    
    @scala.inline
    def `null`: typings.jsonSchema.jsonSchemaStrings.`null` = "null".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`null`]
    
    @scala.inline
    def number: typings.jsonSchema.jsonSchemaStrings.number = "number".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.number]
    
    @scala.inline
    def `object`: typings.jsonSchema.jsonSchemaStrings.`object` = "object".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`object`]
    
    @scala.inline
    def string: typings.jsonSchema.jsonSchemaStrings.string = "string".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.string]
  }
  
  type JSONSchema7Version = String
  
  trait ValidationError extends StObject {
    
    var message: String
    
    var property: String
  }
  object ValidationError {
    
    @scala.inline
    def apply(message: String, property: String): ValidationError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationResult extends StObject {
    
    var errors: js.Array[ValidationError]
    
    var valid: Boolean
  }
  object ValidationResult {
    
    @scala.inline
    def apply(errors: js.Array[ValidationError], valid: Boolean): ValidationResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResult]
    }
    
    @scala.inline
    implicit class ValidationResultMutableBuilder[Self <: ValidationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait _JSONSchema4Type extends StObject
  
  trait _JSONSchema6Type extends StObject
  
  trait _JSONSchema7Type extends StObject
}
