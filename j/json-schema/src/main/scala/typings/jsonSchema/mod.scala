package typings.jsonSchema

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkPropertyChange(value: Any, schema: JSONSchema4, property: String): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPropertyChange")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  inline def checkPropertyChange(value: Any, schema: JSONSchema6, property: String): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPropertyChange")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  inline def checkPropertyChange(value: Any, schema: JSONSchema7, property: String): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPropertyChange")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  
  inline def mustBeValid(result: ValidationResult): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mustBeValid")(result.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validate(instance: js.Object, schema: JSONSchema4): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(instance.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  inline def validate(instance: js.Object, schema: JSONSchema6): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(instance.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  inline def validate(instance: js.Object, schema: JSONSchema7): ValidationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(instance.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[ValidationResult]
  
  trait JSONSchema4
    extends StObject
       with /**
    * @see https://tools.ietf.org/html/draft-zyp-json-schema-04#section-5.6
    */
  /* k */ StringDictionary[Any] {
    
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
    var required: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
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
    
    inline def apply(): JSONSchema4 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema4]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONSchema4] (val x: Self) extends AnyVal {
      
      inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      inline def set$schema(value: JSONSchema4Version): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setAdditionalItems(value: Boolean | JSONSchema4): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      inline def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      inline def setAdditionalProperties(value: Boolean | JSONSchema4): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      inline def setAllOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      inline def setAllOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "allOf", js.Array(value*))
      
      inline def setAnyOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      inline def setAnyOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "anyOf", js.Array(value*))
      
      inline def setDefault(value: JSONSchema4Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefinitions(value: StringDictionary[JSONSchema4]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      inline def setDependencies(value: StringDictionary[JSONSchema4 | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnum(value: js.Array[JSONSchema4Type]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: JSONSchema4Type*): Self = StObject.set(x, "enum", js.Array(value*))
      
      inline def setExclusiveMaximum(value: Boolean): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      inline def setExclusiveMinimum(value: Boolean): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      inline def setExtends(value: String | js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItems(value: JSONSchema4 | js.Array[JSONSchema4]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: JSONSchema4*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
      
      inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
      
      inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
      
      inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
      
      inline def setNot(value: JSONSchema4): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setOneOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      inline def setOneOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "oneOf", js.Array(value*))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternProperties(value: StringDictionary[JSONSchema4]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setProperties(value: StringDictionary[JSONSchema4]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setRequired(value: Boolean | js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: JSONSchema4TypeName | js.Array[JSONSchema4TypeName]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: JSONSchema4TypeName*): Self = StObject.set(x, "type", js.Array(value*))
      
      inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  type JSONSchema4Array = js.Array[JSONSchema4Type]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONSchema4Object = {[key: string] : json-schema.json-schema.JSONSchema4Type}
  }}}
  to avoid circular code involving: 
  - json-schema.json-schema.JSONSchema4Array
  - json-schema.json-schema.JSONSchema4Object
  - json-schema.json-schema.JSONSchema4Type
  */
  trait JSONSchema4Object
    extends StObject
       with /* key */ StringDictionary[JSONSchema4Type]
  object JSONSchema4Object {
    
    inline def apply(): JSONSchema4Object = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema4Object]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONSchema4Type = string | number | boolean | json-schema.json-schema.JSONSchema4Object | json-schema.json-schema.JSONSchema4Array | null
  }}}
  to avoid circular code involving: 
  - json-schema.json-schema.JSONSchema4Array
  - json-schema.json-schema.JSONSchema4Type
  */
  type JSONSchema4Type = String | Double | Boolean | JSONSchema4Object | Any | Null
  
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
    
    inline def any: typings.jsonSchema.jsonSchemaStrings.any = "any".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.any]
    
    inline def array: typings.jsonSchema.jsonSchemaStrings.array = "array".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.array]
    
    inline def boolean: typings.jsonSchema.jsonSchemaStrings.boolean = "boolean".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.boolean]
    
    inline def integer: typings.jsonSchema.jsonSchemaStrings.integer = "integer".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.integer]
    
    inline def `null`: typings.jsonSchema.jsonSchemaStrings.`null` = "null".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`null`]
    
    inline def number: typings.jsonSchema.jsonSchemaStrings.number = "number".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.number]
    
    inline def `object`: typings.jsonSchema.jsonSchemaStrings.`object` = "object".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`object`]
    
    inline def string: typings.jsonSchema.jsonSchemaStrings.string = "string".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.string]
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
    
    inline def apply(): JSONSchema6 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema6]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONSchema6] (val x: Self) extends AnyVal {
      
      inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
      
      inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      inline def set$schema(value: JSONSchema6Version): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setAdditionalItems(value: JSONSchema6Definition): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      inline def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      inline def setAdditionalProperties(value: JSONSchema6Definition): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      inline def setAllOf(value: js.Array[JSONSchema6Definition]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      inline def setAllOfVarargs(value: JSONSchema6Definition*): Self = StObject.set(x, "allOf", js.Array(value*))
      
      inline def setAnyOf(value: js.Array[JSONSchema6Definition]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      inline def setAnyOfVarargs(value: JSONSchema6Definition*): Self = StObject.set(x, "anyOf", js.Array(value*))
      
      inline def setConst(value: JSONSchema6Type): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      inline def setConstNull: Self = StObject.set(x, "const", null)
      
      inline def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
      
      inline def setContains(value: JSONSchema6Definition): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setDefault(value: JSONSchema6Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefinitions(value: StringDictionary[JSONSchema6Definition]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      inline def setDependencies(value: StringDictionary[JSONSchema6Definition | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnum(value: js.Array[JSONSchema6Type]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: JSONSchema6Type*): Self = StObject.set(x, "enum", js.Array(value*))
      
      inline def setExamples(value: js.Array[JSONSchema6Type]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
      
      inline def setExamplesVarargs(value: JSONSchema6Type*): Self = StObject.set(x, "examples", js.Array(value*))
      
      inline def setExclusiveMaximum(value: Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      inline def setExclusiveMinimum(value: Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setItems(value: JSONSchema6Definition | js.Array[JSONSchema6Definition]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: JSONSchema6Definition*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
      
      inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
      
      inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
      
      inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
      
      inline def setNot(value: JSONSchema6Definition): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setOneOf(value: js.Array[JSONSchema6Definition]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      inline def setOneOfVarargs(value: JSONSchema6Definition*): Self = StObject.set(x, "oneOf", js.Array(value*))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternProperties(value: StringDictionary[JSONSchema6Definition]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setProperties(value: StringDictionary[JSONSchema6Definition]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertyNames(value: JSONSchema6Definition): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      inline def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
      
      inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: JSONSchema6TypeName | js.Array[JSONSchema6TypeName]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: JSONSchema6TypeName*): Self = StObject.set(x, "type", js.Array(value*))
      
      inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  type JSONSchema6Array = js.Array[JSONSchema6Type]
  
  type JSONSchema6Definition = JSONSchema6 | Boolean
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONSchema6Object = {[key: string] : json-schema.json-schema.JSONSchema6Type}
  }}}
  to avoid circular code involving: 
  - json-schema.json-schema.JSONSchema6Array
  - json-schema.json-schema.JSONSchema6Object
  - json-schema.json-schema.JSONSchema6Type
  */
  trait JSONSchema6Object
    extends StObject
       with /* key */ StringDictionary[JSONSchema6Type]
  object JSONSchema6Object {
    
    inline def apply(): JSONSchema6Object = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema6Object]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONSchema6Type = string | number | boolean | json-schema.json-schema.JSONSchema6Object | json-schema.json-schema.JSONSchema6Array | null
  }}}
  to avoid circular code involving: 
  - json-schema.json-schema.JSONSchema6Array
  - json-schema.json-schema.JSONSchema6Type
  */
  type JSONSchema6Type = String | Double | Boolean | JSONSchema6Object | Any | Null
  
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
    
    inline def any: typings.jsonSchema.jsonSchemaStrings.any = "any".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.any]
    
    inline def array: typings.jsonSchema.jsonSchemaStrings.array = "array".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.array]
    
    inline def boolean: typings.jsonSchema.jsonSchemaStrings.boolean = "boolean".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.boolean]
    
    inline def integer: typings.jsonSchema.jsonSchemaStrings.integer = "integer".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.integer]
    
    inline def `null`: typings.jsonSchema.jsonSchemaStrings.`null` = "null".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`null`]
    
    inline def number: typings.jsonSchema.jsonSchemaStrings.number = "number".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.number]
    
    inline def `object`: typings.jsonSchema.jsonSchemaStrings.`object` = "object".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`object`]
    
    inline def string: typings.jsonSchema.jsonSchemaStrings.string = "string".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.string]
  }
  
  type JSONSchema6Version = String
  
  trait JSONSchema7 extends StObject {
    
    var default: js.UndefOr[JSONSchema7Type] = js.undefined
    
    @JSName("$comment")
    var $comment: js.UndefOr[String] = js.undefined
    
    /**
      * @see https://datatracker.ietf.org/doc/html/draft-bhutton-json-schema-00#section-8.2.4
      * @see https://datatracker.ietf.org/doc/html/draft-bhutton-json-schema-validation-00#appendix-A
      */
    @JSName("$defs")
    var $defs: js.UndefOr[StringDictionary[JSONSchema7Definition]] = js.undefined
    
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
    
    inline def apply(): JSONSchema7 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema7]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONSchema7] (val x: Self) extends AnyVal {
      
      inline def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
      
      inline def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
      
      inline def set$defs(value: StringDictionary[JSONSchema7Definition]): Self = StObject.set(x, "$defs", value.asInstanceOf[js.Any])
      
      inline def set$defsUndefined: Self = StObject.set(x, "$defs", js.undefined)
      
      inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
      
      inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      inline def set$schema(value: JSONSchema7Version): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setAdditionalItems(value: JSONSchema7Definition): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      inline def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      inline def setAdditionalProperties(value: JSONSchema7Definition): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      inline def setAllOf(value: js.Array[JSONSchema7Definition]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      inline def setAllOfVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "allOf", js.Array(value*))
      
      inline def setAnyOf(value: js.Array[JSONSchema7Definition]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      inline def setAnyOfVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "anyOf", js.Array(value*))
      
      inline def setConst(value: JSONSchema7Type): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      inline def setConstNull: Self = StObject.set(x, "const", null)
      
      inline def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
      
      inline def setContains(value: JSONSchema7): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      inline def setContentMediaType(value: String): Self = StObject.set(x, "contentMediaType", value.asInstanceOf[js.Any])
      
      inline def setContentMediaTypeUndefined: Self = StObject.set(x, "contentMediaType", js.undefined)
      
      inline def setDefault(value: JSONSchema7Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefinitions(value: StringDictionary[JSONSchema7Definition]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      inline def setDependencies(value: StringDictionary[JSONSchema7Definition | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setElse(value: JSONSchema7Definition): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
      
      inline def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
      
      inline def setEnum(value: js.Array[JSONSchema7Type]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: JSONSchema7Type*): Self = StObject.set(x, "enum", js.Array(value*))
      
      inline def setExamples(value: JSONSchema7Type): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      inline def setExamplesNull: Self = StObject.set(x, "examples", null)
      
      inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
      
      inline def setExclusiveMaximum(value: Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      inline def setExclusiveMinimum(value: Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIf(value: JSONSchema7Definition): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      inline def setItems(value: JSONSchema7Definition | js.Array[JSONSchema7Definition]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
      
      inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
      
      inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
      
      inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
      
      inline def setNot(value: JSONSchema7Definition): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setOneOf(value: js.Array[JSONSchema7Definition]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      inline def setOneOfVarargs(value: JSONSchema7Definition*): Self = StObject.set(x, "oneOf", js.Array(value*))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternProperties(value: StringDictionary[JSONSchema7Definition]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setProperties(value: StringDictionary[JSONSchema7Definition]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertyNames(value: JSONSchema7Definition): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      inline def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
      
      inline def setThen(value: JSONSchema7Definition): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: JSONSchema7TypeName | js.Array[JSONSchema7TypeName]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: JSONSchema7TypeName*): Self = StObject.set(x, "type", js.Array(value*))
      
      inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
      
      inline def setWriteOnly(value: Boolean): Self = StObject.set(x, "writeOnly", value.asInstanceOf[js.Any])
      
      inline def setWriteOnlyUndefined: Self = StObject.set(x, "writeOnly", js.undefined)
    }
  }
  
  type JSONSchema7Array = js.Array[JSONSchema7Type]
  
  type JSONSchema7Definition = JSONSchema7 | Boolean
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONSchema7Object = {[key: string] : json-schema.json-schema.JSONSchema7Type}
  }}}
  to avoid circular code involving: 
  - json-schema.json-schema.JSONSchema7Array
  - json-schema.json-schema.JSONSchema7Object
  - json-schema.json-schema.JSONSchema7Type
  */
  trait JSONSchema7Object
    extends StObject
       with /* key */ StringDictionary[JSONSchema7Type]
  object JSONSchema7Object {
    
    inline def apply(): JSONSchema7Object = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema7Object]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONSchema7Type = string | number | boolean | json-schema.json-schema.JSONSchema7Object | json-schema.json-schema.JSONSchema7Array | null
  }}}
  to avoid circular code involving: 
  - json-schema.json-schema.JSONSchema7Array
  - json-schema.json-schema.JSONSchema7Type
  */
  type JSONSchema7Type = String | Double | Boolean | JSONSchema7Object | Any | Null
  
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
    
    inline def array: typings.jsonSchema.jsonSchemaStrings.array = "array".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.array]
    
    inline def boolean: typings.jsonSchema.jsonSchemaStrings.boolean = "boolean".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.boolean]
    
    inline def integer: typings.jsonSchema.jsonSchemaStrings.integer = "integer".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.integer]
    
    inline def `null`: typings.jsonSchema.jsonSchemaStrings.`null` = "null".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`null`]
    
    inline def number: typings.jsonSchema.jsonSchemaStrings.number = "number".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.number]
    
    inline def `object`: typings.jsonSchema.jsonSchemaStrings.`object` = "object".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.`object`]
    
    inline def string: typings.jsonSchema.jsonSchemaStrings.string = "string".asInstanceOf[typings.jsonSchema.jsonSchemaStrings.string]
  }
  
  type JSONSchema7Version = String
  
  trait ValidationError extends StObject {
    
    var message: String
    
    var property: String
  }
  object ValidationError {
    
    inline def apply(message: String, property: String): ValidationError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationResult extends StObject {
    
    var errors: js.Array[ValidationError]
    
    var valid: Boolean
  }
  object ValidationResult {
    
    inline def apply(errors: js.Array[ValidationError], valid: Boolean): ValidationResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
