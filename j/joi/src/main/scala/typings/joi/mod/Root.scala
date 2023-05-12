package typings.joi.mod

import org.scalablytyped.runtime.Instantiable3
import typings.joi.anon.Alternatives
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
@js.native
trait Root extends StObject {
  
  var ValidationError: Instantiable3[
    /* message */ String, 
    /* details */ js.Array[ValidationErrorItem], 
    /* original */ Any, 
    typings.joi.mod.ValidationError
  ] = js.native
  
  // --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
  // Below are undocumented APIs. use at your own risk
  // --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
  /**
    * Whitelists a value
    */
  def allow(values: Any*): Schema[Any] = js.native
  
  def alt[TSchema](types: SchemaLike*): AlternativesSchema[TSchema] = js.native
  /**
    * Alias for `alternatives`
    */
  def alt[TSchema](types: js.Array[SchemaLike]): AlternativesSchema[TSchema] = js.native
  
  def alternatives[TSchema](types: SchemaLike*): AlternativesSchema[TSchema] = js.native
  /**
    * Generates a type that will match one of the provided alternative schemas
    */
  def alternatives[TSchema](types: js.Array[SchemaLike]): AlternativesSchema[TSchema] = js.native
  
  /**
    * Generates a schema object that matches any data type.
    */
  def any[TSchema](): AnySchema[TSchema] = js.native
  
  /**
    * Generates a schema object that matches an array data type.
    */
  def array[TSchema](): ArraySchema[TSchema] = js.native
  
  /**
    * Validates a value against a schema and throws if validation fails.
    *
    * @param value - the value to validate.
    * @param schema - the schema object.
    * @param message - optional message string prefix added in front of the error message. may also be an Error object.
    */
  def assert(value: Any, schema: Schema[Any]): Unit = js.native
  def assert(value: Any, schema: Schema[Any], message: String): Unit = js.native
  def assert(value: Any, schema: Schema[Any], message: String, options: ValidationOptions): Unit = js.native
  def assert(value: Any, schema: Schema[Any], message: js.Error): Unit = js.native
  def assert(value: Any, schema: Schema[Any], message: js.Error, options: ValidationOptions): Unit = js.native
  def assert(value: Any, schema: Schema[Any], options: ValidationOptions): Unit = js.native
  
  /**
    * Validates a value against a schema, returns valid object, and throws if validation fails.
    *
    * @param value - the value to validate.
    * @param schema - the schema object.
    * @param message - optional message string prefix added in front of the error message. may also be an Error object.
    */
  def attempt[TSchema /* <: Schema[Any] */](value: Any, schema: TSchema): /* import warning: importer.ImportType#apply Failed type conversion: TSchema extends joi.joi.Schema<infer Value> ? Value : never */ js.Any = js.native
  def attempt[TSchema /* <: Schema[Any] */](value: Any, schema: TSchema, message: String): /* import warning: importer.ImportType#apply Failed type conversion: TSchema extends joi.joi.Schema<infer Value> ? Value : never */ js.Any = js.native
  def attempt[TSchema /* <: Schema[Any] */](value: Any, schema: TSchema, message: String, options: ValidationOptions): /* import warning: importer.ImportType#apply Failed type conversion: TSchema extends joi.joi.Schema<infer Value> ? Value : never */ js.Any = js.native
  def attempt[TSchema /* <: Schema[Any] */](value: Any, schema: TSchema, message: js.Error): /* import warning: importer.ImportType#apply Failed type conversion: TSchema extends joi.joi.Schema<infer Value> ? Value : never */ js.Any = js.native
  def attempt[TSchema /* <: Schema[Any] */](value: Any, schema: TSchema, message: js.Error, options: ValidationOptions): /* import warning: importer.ImportType#apply Failed type conversion: TSchema extends joi.joi.Schema<infer Value> ? Value : never */ js.Any = js.native
  def attempt[TSchema /* <: Schema[Any] */](value: Any, schema: TSchema, options: ValidationOptions): /* import warning: importer.ImportType#apply Failed type conversion: TSchema extends joi.joi.Schema<infer Value> ? Value : never */ js.Any = js.native
  
  /**
    * Generates a schema object that matches a Buffer data type (as well as the strings which will be converted to Buffers).
    */
  def binary[TSchema](): BinarySchema[TSchema] = js.native
  
  /**
    * Generates a schema object that matches a boolean data type (as well as the strings 'true', 'false', 'yes', and 'no'). Can also be called via boolean().
    */
  def bool[TSchema](): BooleanSchema[TSchema] = js.native
  
  /**
    * Generates a schema object that matches a boolean data type (as well as the strings 'true', 'false', 'yes', and 'no'). Can also be called via bool().
    */
  def boolean[TSchema](): BooleanSchema[TSchema] = js.native
  
  /**
    * Unsure, maybe alias for `compile`?
    */
  def build(args: Any*): Any = js.native
  
  var cache: CacheConfiguration = js.native
  
  /**
    * Checks if the provided preferences are valid.
    *
    * Throws an exception if the prefs object is invalid.
    *
    * The method is provided to perform inputs validation for the `any.validate()` and `any.validateAsync()` methods.
    * Validation is not performed automatically for performance reasons. Instead, manually validate the preferences passed once and reuse.
    */
  def checkPreferences(prefs: ValidationOptions): Unit = js.native
  
  /**
    * Converts literal schema definition to joi schema object (or returns the same back if already a joi schema object).
    */
  def compile(schema: SchemaLike): Schema[Any] = js.native
  def compile(schema: SchemaLike, options: CompileOptions): Schema[Any] = js.native
  
  /**
    * Creates a custom validation schema.
    */
  def custom(fn: CustomValidator[Any, Any]): Schema[Any] = js.native
  def custom(fn: CustomValidator[Any, Any], description: String): Schema[Any] = js.native
  
  /**
    * Generates a schema object that matches a date type (as well as a JavaScript date string or number of milliseconds).
    */
  def date[TSchema](): DateSchema[TSchema] = js.native
  
  /**
    * Creates a new Joi instance that will apply defaults onto newly created schemas
    * through the use of the fn function that takes exactly one argument, the schema being created.
    *
    * @param fn - The function must always return a schema, even if untransformed.
    */
  def defaults(fn: SchemaFunction): Root = js.native
  
  def disallow(values: Any*): Schema[Any] = js.native
  
  def equal(values: Any*): Schema[Any] = js.native
  
  /**
    * Alias of `required`.
    */
  def exist(): Schema[Any] = js.native
  
  /**
    * Generates a dynamic expression using a template string.
    */
  def expression(template: String): Any = js.native
  def expression(template: String, options: ReferenceOptions): Any = js.native
  
  /**
    * Creates a new Joi instance customized with the extension(s) you provide included.
    */
  def extend(extensions: (Extension | ExtensionFactory)*): Any = js.native
  
  /**
    * Marks a key as forbidden which will not allow any value except undefined. Used to explicitly forbid keys.
    */
  def forbidden(): Schema[Any] = js.native
  
  /**
    * Generates a schema object that matches a function type.
    */
  def func[TSchema](): FunctionSchema[TSchema] = js.native
  
  /**
    * Generates a schema object that matches a function type.
    */
  def function[TSchema](): FunctionSchema[TSchema] = js.native
  
  /**
    * Creates a reference that when resolved, is used as an array of values to match against the rule.
    */
  def in(ref: String): Reference = js.native
  def in(ref: String, options: ReferenceOptions): Reference = js.native
  
  /**
    * Blacklists a value
    */
  def invalid(values: Any*): Schema[Any] = js.native
  
  /**
    * Checks whether or not the provided argument is an instance of ValidationError
    */
  def isError(error: Any): /* is joi.joi.ValidationError */ Boolean = js.native
  
  /**
    * Checks whether or not the provided argument is an expression.
    */
  def isExpression(expression: Any): Boolean = js.native
  
  /**
    * Checks whether or not the provided argument is a reference. It's especially useful if you want to post-process error messages.
    */
  def isRef(ref: Any): /* is joi.joi.Reference */ Boolean = js.native
  
  /**
    * Checks whether or not the provided argument is a joi schema.
    */
  def isSchema(schema: Any): /* is joi.joi.AnySchema<any> */ Boolean = js.native
  def isSchema(schema: Any, options: CompileOptions): /* is joi.joi.AnySchema<any> */ Boolean = js.native
  
  /**
    * Links to another schema node and reuses it for validation, typically for creative recursive schemas.
    *
    * @param ref - the reference to the linked schema node.
    * Cannot reference itself or its children as well as other links.
    * Links can be expressed in relative terms like value references (`Joi.link('...')`),
    * in absolute terms from the schema run-time root (`Joi.link('/a')`),
    * or using schema ids implicitly using object keys or explicitly using `any.id()` (`Joi.link('#a.b.c')`).
    */
  def link[TSchema](): LinkSchema[TSchema] = js.native
  def link[TSchema](ref: String): LinkSchema[TSchema] = js.native
  
  def not(values: Any*): Schema[Any] = js.native
  
  /**
    * Generates a schema object that matches a number data type (as well as strings that can be converted to numbers).
    */
  def number[TSchema](): NumberSchema[TSchema] = js.native
  
  /**
    * Generates a schema object that matches an object data type (as well as JSON strings that have been parsed into objects).
    */
  // tslint:disable-next-line:no-unnecessary-generics
  def `object`[TSchema, isStrict, T](): ObjectSchema[TSchema] = js.native
  def `object`[TSchema, isStrict, T](schema: SchemaMap[T, isStrict]): ObjectSchema[TSchema] = js.native
  
  /**
    * Marks a key as optional which will allow undefined as values. Used to annotate the schema for readability as all keys are optional by default.
    */
  def optional(): Schema[Any] = js.native
  
  /**
    * Unsure, maybe alias for `preferences`?
    */
  def options(args: Any*): Any = js.native
  
  /**
    * A special value used with `any.allow()`, `any.invalid()`, and `any.valid()` as the first value to reset any previously set values.
    */
  var `override`: js.Symbol = js.native
  
  /**
    * Overrides the global validate() options for the current key and any sub-key.
    */
  def preferences(options: ValidationOptions): Schema[Any] = js.native
  
  /**
    * Overrides the global validate() options for the current key and any sub-key.
    */
  def prefs(options: ValidationOptions): Schema[Any] = js.native
  
  /**
    * Generates a reference to the value of the named key.
    */
  def ref(key: String): Reference = js.native
  def ref(key: String, options: ReferenceOptions): Reference = js.native
  
  /**
    * Marks a key as required which will not allow undefined as value. All keys are optional by default.
    */
  def required(): Schema[Any] = js.native
  
  /**
    * Generates a schema object that matches a string data type. Note that empty strings are not allowed by default and must be enabled with allow('').
    */
  def string[TSchema](): StringSchema[TSchema] = js.native
  
  /**
    * Generates a schema object that matches any symbol.
    */
  def symbol[TSchema](): SymbolSchema[TSchema] = js.native
  
  /**
    * Unsure, maybe leaked from `@hapi/lab/coverage/initialize`
    */
  def trace(args: Any*): Any = js.native
  
  /**
    * Returns an object where each key is a plain joi schema type.
    * Useful for creating type shortcuts using deconstruction.
    * Note that the types are already formed and do not need to be called as functions (e.g. `string`, not `string()`).
    */
  def types(): Alternatives = js.native
  
  def untrace(args: Any*): Any = js.native
  
  /**
    * Adds the provided values into the allowed whitelist and marks them as the only valid values allowed.
    */
  def valid(values: Any*): Schema[Any] = js.native
  
  /**
    * Current version of the joi package.
    */
  var version: String = js.native
  
  def when(ref: String, options: js.Array[WhenOptions]): AlternativesSchema[Any] = js.native
  /**
    * Converts the type into an alternatives type where the conditions are merged into the type definition where:
    */
  def when(ref: String, options: WhenOptions): AlternativesSchema[Any] = js.native
  def when(ref: Reference, options: js.Array[WhenOptions]): AlternativesSchema[Any] = js.native
  def when(ref: Reference, options: WhenOptions): AlternativesSchema[Any] = js.native
  def when(ref: Schema[Any], options: WhenSchemaOptions): AlternativesSchema[Any] = js.native
  
  /**
    * Generates a dynamic expression using a template string.
    */
  def x(template: String): Any = js.native
  def x(template: String, options: ReferenceOptions): Any = js.native
}
