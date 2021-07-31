package typings.jsonschema

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonschema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jsonschema", "SchemaError")
  @js.native
  class SchemaError protected ()
    extends StObject
       with Error {
    def this(msg: String, schema: Schema) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var schema: Schema = js.native
  }
  
  @JSImport("jsonschema", "ValidationError")
  @js.native
  class ValidationError protected () extends StObject {
    def this(
      message: js.UndefOr[String],
      instance: js.UndefOr[js.Any],
      schema: js.UndefOr[Schema],
      propertyPath: js.UndefOr[js.Any],
      name: js.UndefOr[String],
      argument: js.UndefOr[js.Any]
    ) = this()
    
    var argument: js.Any = js.native
    
    var instance: js.Any = js.native
    
    var message: String = js.native
    
    var name: String = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var property: String = js.native
    
    var schema: String | Schema = js.native
    
    var stack: String = js.native
  }
  
  @JSImport("jsonschema", "Validator")
  @js.native
  class Validator () extends StObject {
    
    def addSchema(): Schema | Unit = js.native
    def addSchema(schema: Unit, uri: String): Schema | Unit = js.native
    def addSchema(schema: Schema): Schema | Unit = js.native
    def addSchema(schema: Schema, uri: String): Schema | Unit = js.native
    
    var attributes: StringDictionary[CustomProperty] = js.native
    
    var customFormats: StringDictionary[CustomFormat] = js.native
    
    var schemas: StringDictionary[Schema] = js.native
    
    var unresolvedRefs: js.Array[String] = js.native
    
    def validate(instance: js.Any, schema: Schema): ValidatorResult = js.native
    def validate(instance: js.Any, schema: Schema, options: Unit, ctx: SchemaContext): ValidatorResult = js.native
    def validate(instance: js.Any, schema: Schema, options: Options): ValidatorResult = js.native
    def validate(instance: js.Any, schema: Schema, options: Options, ctx: SchemaContext): ValidatorResult = js.native
  }
  
  @JSImport("jsonschema", "ValidatorResult")
  @js.native
  class ValidatorResult protected () extends StObject {
    def this(instance: js.Any, schema: Schema, options: Options, ctx: SchemaContext) = this()
    
    def addError(detail: String): ValidationError = js.native
    def addError(detail: ErrorDetail): ValidationError = js.native
    
    var disableFormat: Boolean = js.native
    
    var errors: js.Array[ValidationError] = js.native
    
    var instance: js.Any = js.native
    
    var propertyPath: String = js.native
    
    var schema: Schema = js.native
    
    var throwError: Boolean = js.native
    
    var valid: Boolean = js.native
  }
  
  @scala.inline
  def validate(instance: js.Any, schema: js.Any): ValidatorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(instance.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[ValidatorResult]
  @scala.inline
  def validate(instance: js.Any, schema: js.Any, options: Options): ValidatorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(instance.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ValidatorResult]
  
  type CustomFormat = js.Function1[/* input */ js.Any, Boolean]
  
  type CustomProperty = js.Function4[
    /* instance */ js.Any, 
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
    
    @scala.inline
    def apply(argument: String, message: String, name: String): ErrorDetail = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorDetail]
    }
    
    @scala.inline
    implicit class ErrorDetailMutableBuilder[Self <: ErrorDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgument(value: String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var allowUnknownAttributes: js.UndefOr[Boolean] = js.undefined
    
    var base: js.UndefOr[String] = js.undefined
    
    var nestedErrors: js.UndefOr[Boolean] = js.undefined
    
    var preValidateProperty: js.UndefOr[PreValidatePropertyFunction] = js.undefined
    
    var rewrite: js.UndefOr[RewriteFunction] = js.undefined
    
    var skipAttributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var throwAll: js.UndefOr[Boolean] = js.undefined
    
    var throwError: js.UndefOr[Boolean] = js.undefined
    
    var throwFirst: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnknownAttributes(value: Boolean): Self = StObject.set(x, "allowUnknownAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnknownAttributesUndefined: Self = StObject.set(x, "allowUnknownAttributes", js.undefined)
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setNestedErrors(value: Boolean): Self = StObject.set(x, "nestedErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedErrorsUndefined: Self = StObject.set(x, "nestedErrors", js.undefined)
      
      @scala.inline
      def setPreValidateProperty(
        value: (/* instance */ js.Any, /* key */ String, /* schema */ Schema, /* options */ Options, /* ctx */ SchemaContext) => js.Any
      ): Self = StObject.set(x, "preValidateProperty", js.Any.fromFunction5(value))
      
      @scala.inline
      def setPreValidatePropertyUndefined: Self = StObject.set(x, "preValidateProperty", js.undefined)
      
      @scala.inline
      def setRewrite(
        value: (/* instance */ js.Any, /* schema */ Schema, /* options */ Options, /* ctx */ SchemaContext) => js.Any
      ): Self = StObject.set(x, "rewrite", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      @scala.inline
      def setSkipAttributes(value: js.Array[String]): Self = StObject.set(x, "skipAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipAttributesUndefined: Self = StObject.set(x, "skipAttributes", js.undefined)
      
      @scala.inline
      def setSkipAttributesVarargs(value: String*): Self = StObject.set(x, "skipAttributes", js.Array(value :_*))
      
      @scala.inline
      def setThrowAll(value: Boolean): Self = StObject.set(x, "throwAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowAllUndefined: Self = StObject.set(x, "throwAll", js.undefined)
      
      @scala.inline
      def setThrowError(value: Boolean): Self = StObject.set(x, "throwError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowErrorUndefined: Self = StObject.set(x, "throwError", js.undefined)
      
      @scala.inline
      def setThrowFirst(value: Boolean): Self = StObject.set(x, "throwFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowFirstUndefined: Self = StObject.set(x, "throwFirst", js.undefined)
    }
  }
  
  type PreValidatePropertyFunction = js.Function5[
    /* instance */ js.Any, 
    /* key */ String, 
    /* schema */ Schema, 
    /* options */ Options, 
    /* ctx */ SchemaContext, 
    js.Any
  ]
  
  type RewriteFunction = js.Function4[
    /* instance */ js.Any, 
    /* schema */ Schema, 
    /* options */ Options, 
    /* ctx */ SchemaContext, 
    js.Any
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
    
    var const: js.UndefOr[js.Any] = js.undefined
    
    var definitions: js.UndefOr[StringDictionary[Schema]] = js.undefined
    
    var dependencies: js.UndefOr[StringDictionary[Schema | js.Array[String]]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var `else`: js.UndefOr[Schema] = js.undefined
    
    var `enum`: js.UndefOr[js.Array[js.Any]] = js.undefined
    
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
    
    var pattern: js.UndefOr[String | RegExp] = js.undefined
    
    var patternProperties: js.UndefOr[StringDictionary[Schema]] = js.undefined
    
    var properties: js.UndefOr[StringDictionary[Schema]] = js.undefined
    
    var required: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    var `then`: js.UndefOr[Schema] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var uniqueItems: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    @scala.inline
    def apply(): Schema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
      
      @scala.inline
      def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      @scala.inline
      def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      @scala.inline
      def setAdditionalItems(value: Boolean | Schema): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      @scala.inline
      def setAdditionalProperties(value: Boolean | Schema): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setAllOf(value: js.Array[Schema]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      @scala.inline
      def setAllOfVarargs(value: Schema*): Self = StObject.set(x, "allOf", js.Array(value :_*))
      
      @scala.inline
      def setAnyOf(value: js.Array[Schema]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      @scala.inline
      def setAnyOfVarargs(value: Schema*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
      
      @scala.inline
      def setConst(value: js.Any): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
      
      @scala.inline
      def setDefinitions(value: StringDictionary[Schema]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      @scala.inline
      def setDependencies(value: StringDictionary[Schema | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setElse(value: Schema): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
      
      @scala.inline
      def setEnum(value: js.Array[js.Any]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: js.Any*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setExclusiveMaximum(value: Double | Boolean): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      @scala.inline
      def setExclusiveMinimum(value: Double | Boolean): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIf(value: Schema): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      @scala.inline
      def setItems(value: Schema | js.Array[Schema]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: Schema*): Self = StObject.set(x, "items", js.Array(value :_*))
      
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
      def setNot(value: Schema): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setOneOf(value: js.Array[Schema]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      @scala.inline
      def setOneOfVarargs(value: Schema*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
      
      @scala.inline
      def setPattern(value: String | RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternProperties(value: StringDictionary[Schema]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setProperties(value: StringDictionary[Schema]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setRequired(value: js.Array[String] | Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      @scala.inline
      def setThen(value: Schema): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  trait SchemaContext extends StObject {
    
    var base: String
    
    var options: Options
    
    var propertyPath: String
    
    var schema: Schema
    
    var schemas: StringDictionary[Schema]
  }
  object SchemaContext {
    
    @scala.inline
    def apply(
      base: String,
      options: Options,
      propertyPath: String,
      schema: Schema,
      schemas: StringDictionary[Schema]
    ): SchemaContext = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyPath = propertyPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaContext]
    }
    
    @scala.inline
    implicit class SchemaContextMutableBuilder[Self <: SchemaContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyPath(value: String): Self = StObject.set(x, "propertyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemas(value: StringDictionary[Schema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    }
  }
}
