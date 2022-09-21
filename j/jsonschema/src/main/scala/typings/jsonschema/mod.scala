package typings.jsonschema

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonschema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsonschema", "SchemaError")
  @js.native
  open class SchemaError protected ()
    extends StObject
       with Error {
    def this(msg: String, schema: Schema) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var schema: Schema = js.native
  }
  
  @JSImport("jsonschema", "ValidationError")
  @js.native
  open class ValidationError protected () extends StObject {
    def this(
      message: js.UndefOr[String],
      instance: js.UndefOr[Any],
      schema: js.UndefOr[Schema],
      propertyPath: js.UndefOr[Any],
      name: js.UndefOr[String],
      argument: js.UndefOr[Any]
    ) = this()
    
    var argument: Any = js.native
    
    var instance: Any = js.native
    
    var message: String = js.native
    
    var name: String = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var property: String = js.native
    
    var schema: String | Schema = js.native
    
    var stack: String = js.native
  }
  
  @JSImport("jsonschema", "Validator")
  @js.native
  open class Validator () extends StObject {
    
    def addSchema(): Schema | Unit = js.native
    def addSchema(schema: Unit, uri: String): Schema | Unit = js.native
    def addSchema(schema: Schema): Schema | Unit = js.native
    def addSchema(schema: Schema, uri: String): Schema | Unit = js.native
    
    var attributes: StringDictionary[CustomProperty] = js.native
    
    var customFormats: StringDictionary[CustomFormat] = js.native
    
    var schemas: StringDictionary[Schema] = js.native
    
    var unresolvedRefs: js.Array[String] = js.native
    
    def validate(instance: Any, schema: Schema): ValidatorResult = js.native
    def validate(instance: Any, schema: Schema, options: Unit, ctx: SchemaContext): ValidatorResult = js.native
    def validate(instance: Any, schema: Schema, options: Options): ValidatorResult = js.native
    def validate(instance: Any, schema: Schema, options: Options, ctx: SchemaContext): ValidatorResult = js.native
  }
  
  @JSImport("jsonschema", "ValidatorResult")
  @js.native
  open class ValidatorResult protected () extends StObject {
    def this(instance: Any, schema: Schema, options: Options, ctx: SchemaContext) = this()
    
    def addError(detail: String): ValidationError = js.native
    def addError(detail: ErrorDetail): ValidationError = js.native
    
    var disableFormat: Boolean = js.native
    
    var errors: js.Array[ValidationError] = js.native
    
    var instance: Any = js.native
    
    var propertyPath: String = js.native
    
    var schema: Schema = js.native
    
    var throwError: Boolean = js.native
    
    var valid: Boolean = js.native
  }
  
  inline def validate(instance: Any, schema: Any): ValidatorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(instance.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[ValidatorResult]
  inline def validate(instance: Any, schema: Any, options: Options): ValidatorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(instance.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ValidatorResult]
  
  type CustomFormat = js.Function1[/* input */ Any, Boolean]
  
  type CustomProperty = js.Function4[
    /* instance */ Any, 
    /* schema */ Schema, 
    /* options */ Options, 
    /* ctx */ SchemaContext, 
    String | ValidatorResult
  ]
  
  trait ErrorDetail extends StObject {
    
    var argument: String
    
    var message: String
    
    var name: String
  }
  object ErrorDetail {
    
    inline def apply(argument: String, message: String, name: String): ErrorDetail = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorDetail]
    }
    
    extension [Self <: ErrorDetail](x: Self) {
      
      inline def setArgument(value: String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var allowUnknownAttributes: js.UndefOr[Boolean] = js.undefined
    
    var base: js.UndefOr[String] = js.undefined
    
    var nestedErrors: js.UndefOr[Boolean] = js.undefined
    
    var preValidateProperty: js.UndefOr[PreValidatePropertyFunction] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var rewrite: js.UndefOr[RewriteFunction] = js.undefined
    
    var skipAttributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var throwAll: js.UndefOr[Boolean] = js.undefined
    
    var throwError: js.UndefOr[Boolean] = js.undefined
    
    var throwFirst: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowUnknownAttributes(value: Boolean): Self = StObject.set(x, "allowUnknownAttributes", value.asInstanceOf[js.Any])
      
      inline def setAllowUnknownAttributesUndefined: Self = StObject.set(x, "allowUnknownAttributes", js.undefined)
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setNestedErrors(value: Boolean): Self = StObject.set(x, "nestedErrors", value.asInstanceOf[js.Any])
      
      inline def setNestedErrorsUndefined: Self = StObject.set(x, "nestedErrors", js.undefined)
      
      inline def setPreValidateProperty(
        value: (/* instance */ Any, /* key */ String, /* schema */ Schema, /* options */ Options, /* ctx */ SchemaContext) => Any
      ): Self = StObject.set(x, "preValidateProperty", js.Any.fromFunction5(value))
      
      inline def setPreValidatePropertyUndefined: Self = StObject.set(x, "preValidateProperty", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRewrite(
        value: (/* instance */ Any, /* schema */ Schema, /* options */ Options, /* ctx */ SchemaContext) => Any
      ): Self = StObject.set(x, "rewrite", js.Any.fromFunction4(value))
      
      inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      inline def setSkipAttributes(value: js.Array[String]): Self = StObject.set(x, "skipAttributes", value.asInstanceOf[js.Any])
      
      inline def setSkipAttributesUndefined: Self = StObject.set(x, "skipAttributes", js.undefined)
      
      inline def setSkipAttributesVarargs(value: String*): Self = StObject.set(x, "skipAttributes", js.Array(value*))
      
      inline def setThrowAll(value: Boolean): Self = StObject.set(x, "throwAll", value.asInstanceOf[js.Any])
      
      inline def setThrowAllUndefined: Self = StObject.set(x, "throwAll", js.undefined)
      
      inline def setThrowError(value: Boolean): Self = StObject.set(x, "throwError", value.asInstanceOf[js.Any])
      
      inline def setThrowErrorUndefined: Self = StObject.set(x, "throwError", js.undefined)
      
      inline def setThrowFirst(value: Boolean): Self = StObject.set(x, "throwFirst", value.asInstanceOf[js.Any])
      
      inline def setThrowFirstUndefined: Self = StObject.set(x, "throwFirst", js.undefined)
    }
  }
  
  type PreValidatePropertyFunction = js.Function5[
    /* instance */ Any, 
    /* key */ String, 
    /* schema */ Schema, 
    /* options */ Options, 
    /* ctx */ SchemaContext, 
    Any
  ]
  
  type RewriteFunction = js.Function4[
    /* instance */ Any, 
    /* schema */ Schema, 
    /* options */ Options, 
    /* ctx */ SchemaContext, 
    Any
  ]
  
  trait Schema extends StObject {
    
    @JSName("$id")
    var $id: js.UndefOr[String] = js.undefined
    
    @JSName("$ref")
    var $ref: js.UndefOr[String] = js.undefined
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.undefined
    
    var additionalItems: js.UndefOr[Boolean | Schema] = js.undefined
    
    var additionalProperties: js.UndefOr[Boolean | Schema] = js.undefined
    
    var allOf: js.UndefOr[js.Array[Schema]] = js.undefined
    
    var anyOf: js.UndefOr[js.Array[Schema]] = js.undefined
    
    var const: js.UndefOr[Any] = js.undefined
    
    var definitions: js.UndefOr[StringDictionary[Schema]] = js.undefined
    
    var dependencies: js.UndefOr[StringDictionary[Schema | js.Array[String]]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var `else`: js.UndefOr[Schema] = js.undefined
    
    var `enum`: js.UndefOr[js.Array[Any]] = js.undefined
    
    var exclusiveMaximum: js.UndefOr[Double | Boolean] = js.undefined
    
    var exclusiveMinimum: js.UndefOr[Double | Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `if`: js.UndefOr[Schema] = js.undefined
    
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
    
    var pattern: js.UndefOr[String | js.RegExp] = js.undefined
    
    var patternProperties: js.UndefOr[StringDictionary[Schema]] = js.undefined
    
    var properties: js.UndefOr[StringDictionary[Schema]] = js.undefined
    
    var required: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    var `then`: js.UndefOr[Schema] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var uniqueItems: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(): Schema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
      
      inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setAdditionalItems(value: Boolean | Schema): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      inline def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      inline def setAdditionalProperties(value: Boolean | Schema): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      inline def setAllOf(value: js.Array[Schema]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      inline def setAllOfVarargs(value: Schema*): Self = StObject.set(x, "allOf", js.Array(value*))
      
      inline def setAnyOf(value: js.Array[Schema]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      inline def setAnyOfVarargs(value: Schema*): Self = StObject.set(x, "anyOf", js.Array(value*))
      
      inline def setConst(value: Any): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      inline def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
      
      inline def setDefinitions(value: StringDictionary[Schema]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      inline def setDependencies(value: StringDictionary[Schema | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setElse(value: Schema): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
      
      inline def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
      
      inline def setEnum(value: js.Array[Any]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: Any*): Self = StObject.set(x, "enum", js.Array(value*))
      
      inline def setExclusiveMaximum(value: Double | Boolean): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      inline def setExclusiveMinimum(value: Double | Boolean): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIf(value: Schema): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      inline def setItems(value: Schema | js.Array[Schema]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Schema*): Self = StObject.set(x, "items", js.Array(value*))
      
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
      
      inline def setNot(value: Schema): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      inline def setOneOf(value: js.Array[Schema]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      inline def setOneOfVarargs(value: Schema*): Self = StObject.set(x, "oneOf", js.Array(value*))
      
      inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternProperties(value: StringDictionary[Schema]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setProperties(value: StringDictionary[Schema]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setRequired(value: js.Array[String] | Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
      
      inline def setThen(value: Schema): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
      
      inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  trait SchemaContext extends StObject {
    
    var base: String
    
    def makeChild(schema: Schema, key: String): SchemaContext
    
    var options: Options
    
    var propertyPath: String
    
    var schema: Schema
    
    var schemas: StringDictionary[Schema]
  }
  object SchemaContext {
    
    inline def apply(
      base: String,
      makeChild: (Schema, String) => SchemaContext,
      options: Options,
      propertyPath: String,
      schema: Schema,
      schemas: StringDictionary[Schema]
    ): SchemaContext = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], makeChild = js.Any.fromFunction2(makeChild), options = options.asInstanceOf[js.Any], propertyPath = propertyPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaContext]
    }
    
    extension [Self <: SchemaContext](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setMakeChild(value: (Schema, String) => SchemaContext): Self = StObject.set(x, "makeChild", js.Any.fromFunction2(value))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPropertyPath(value: String): Self = StObject.set(x, "propertyPath", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemas(value: StringDictionary[Schema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    }
  }
}
