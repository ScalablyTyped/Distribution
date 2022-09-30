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
  
  def alt(types: SchemaLike*): AlternativesSchema = js.native
  /**
    * Alias for `alternatives`
    */
  def alt(types: js.Array[SchemaLike]): AlternativesSchema = js.native
  
  def alternatives(types: SchemaLike*): AlternativesSchema = js.native
  /**
    * Generates a type that will match one of the provided alternative schemas
    */
  def alternatives(types: js.Array[SchemaLike]): AlternativesSchema = js.native
  
  /**
    * Generates a schema object that matches any data type.
    */
  def any(): AnySchema[Any] = js.native
  
  /**
    * Generates a schema object that matches an array data type.
    */
  def array(): ArraySchema = js.native
  
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
  
  def attempt(value: Any, schema: AlternativesSchema): Any = js.native
  def attempt(value: Any, schema: AlternativesSchema, message: String): Any = js.native
  def attempt(value: Any, schema: AlternativesSchema, message: String, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: AlternativesSchema, message: js.Error): Any = js.native
  def attempt(value: Any, schema: AlternativesSchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: AlternativesSchema, options: ValidationOptions): Any = js.native
  /**
    * Validates a value against a schema, returns valid object, and throws if validation fails.
    *
    * @param value - the value to validate.
    * @param schema - the schema object.
    * @param message - optional message string prefix added in front of the error message. may also be an Error object.
    */
  def attempt(value: Any, schema: ArraySchema): Any = js.native
  def attempt(value: Any, schema: ArraySchema, message: String): Any = js.native
  def attempt(value: Any, schema: ArraySchema, message: String, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: ArraySchema, message: js.Error): Any = js.native
  def attempt(value: Any, schema: ArraySchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: ArraySchema, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: BinarySchema): Any = js.native
  def attempt(value: Any, schema: BinarySchema, message: String): Any = js.native
  def attempt(value: Any, schema: BinarySchema, message: String, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: BinarySchema, message: js.Error): Any = js.native
  def attempt(value: Any, schema: BinarySchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: BinarySchema, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: BooleanSchema): Any = js.native
  def attempt(value: Any, schema: BooleanSchema, message: String): Any = js.native
  def attempt(value: Any, schema: BooleanSchema, message: String, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: BooleanSchema, message: js.Error): Any = js.native
  def attempt(value: Any, schema: BooleanSchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: BooleanSchema, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: DateSchema): Any = js.native
  def attempt(value: Any, schema: DateSchema, message: String): Any = js.native
  def attempt(value: Any, schema: DateSchema, message: String, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: DateSchema, message: js.Error): Any = js.native
  def attempt(value: Any, schema: DateSchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: DateSchema, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: FunctionSchema): Any = js.native
  def attempt(value: Any, schema: FunctionSchema, message: String): Any = js.native
  def attempt(value: Any, schema: FunctionSchema, message: String, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: FunctionSchema, message: js.Error): Any = js.native
  def attempt(value: Any, schema: FunctionSchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: FunctionSchema, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: LinkSchema): Any = js.native
  def attempt(value: Any, schema: LinkSchema, message: String): Any = js.native
  def attempt(value: Any, schema: LinkSchema, message: String, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: LinkSchema, message: js.Error): Any = js.native
  def attempt(value: Any, schema: LinkSchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: LinkSchema, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: NumberSchema): Any = js.native
  def attempt(value: Any, schema: NumberSchema, message: String): Any = js.native
  def attempt(value: Any, schema: NumberSchema, message: String, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: NumberSchema, message: js.Error): Any = js.native
  def attempt(value: Any, schema: NumberSchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: NumberSchema, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: StringSchema): Any = js.native
  def attempt(value: Any, schema: StringSchema, message: String): Any = js.native
  def attempt(value: Any, schema: StringSchema, message: String, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: StringSchema, message: js.Error): Any = js.native
  def attempt(value: Any, schema: StringSchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: StringSchema, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: SymbolSchema): Any = js.native
  def attempt(value: Any, schema: SymbolSchema, message: String): Any = js.native
  def attempt(value: Any, schema: SymbolSchema, message: String, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: SymbolSchema, message: js.Error): Any = js.native
  def attempt(value: Any, schema: SymbolSchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt(value: Any, schema: SymbolSchema, options: ValidationOptions): Any = js.native
  def attempt[TSchema /* <: AnySchema[Any] | ObjectSchema[Any] */](value: Any, schema: TSchema): Any = js.native
  def attempt[TSchema /* <: AnySchema[Any] | ObjectSchema[Any] */](value: Any, schema: TSchema, message: String): Any = js.native
  def attempt[TSchema /* <: AnySchema[Any] | ObjectSchema[Any] */](value: Any, schema: TSchema, message: String, options: ValidationOptions): Any = js.native
  def attempt[TSchema /* <: AnySchema[Any] | ObjectSchema[Any] */](value: Any, schema: TSchema, message: js.Error): Any = js.native
  def attempt[TSchema /* <: AnySchema[Any] | ObjectSchema[Any] */](value: Any, schema: TSchema, message: js.Error, options: ValidationOptions): Any = js.native
  def attempt[TSchema /* <: AnySchema[Any] | ObjectSchema[Any] */](value: Any, schema: TSchema, options: ValidationOptions): Any = js.native
  
  /**
    * Generates a schema object that matches a Buffer data type (as well as the strings which will be converted to Buffers).
    */
  def binary(): BinarySchema = js.native
  
  /**
    * Generates a schema object that matches a boolean data type (as well as the strings 'true', 'false', 'yes', and 'no'). Can also be called via bool().
    */
  def bool(): BooleanSchema = js.native
  
  /**
    * Generates a schema object that matches a boolean data type (as well as the strings 'true', 'false', 'yes', and 'no'). Can also be called via bool().
    */
  def boolean(): BooleanSchema = js.native
  
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
  def custom(fn: CustomValidator[Any]): Schema[Any] = js.native
  def custom(fn: CustomValidator[Any], description: String): Schema[Any] = js.native
  
  /**
    * Generates a schema object that matches a date type (as well as a JavaScript date string or number of milliseconds).
    */
  def date(): DateSchema = js.native
  
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
  def func(): FunctionSchema = js.native
  
  /**
    * Generates a schema object that matches a function type.
    */
  def function(): FunctionSchema = js.native
  
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
  def link(): LinkSchema = js.native
  def link(ref: String): LinkSchema = js.native
  
  def not(values: Any*): Schema[Any] = js.native
  
  /**
    * Generates a schema object that matches a number data type (as well as strings that can be converted to numbers).
    */
  def number(): NumberSchema = js.native
  
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
  def string(): StringSchema = js.native
  
  /**
    * Generates a schema object that matches any symbol.
    */
  def symbol(): SymbolSchema = js.native
  
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
  
  def when(ref: String, options: js.Array[WhenOptions]): AlternativesSchema = js.native
  /**
    * Converts the type into an alternatives type where the conditions are merged into the type definition where:
    */
  def when(ref: String, options: WhenOptions): AlternativesSchema = js.native
  def when(ref: Reference, options: js.Array[WhenOptions]): AlternativesSchema = js.native
  def when(ref: Reference, options: WhenOptions): AlternativesSchema = js.native
  def when(ref: Schema[Any], options: WhenSchemaOptions): AlternativesSchema = js.native
  
  /**
    * Generates a dynamic expression using a template string.
    */
  def x(template: String): Any = js.native
  def x(template: String, options: ReferenceOptions): Any = js.native
}
