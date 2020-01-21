package typings.hapiJoi.mod

import typings.hapiJoi.AnonAlternatives
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
@js.native
trait Root extends js.Object {
  var ValidationError: typings.hapiJoi.mod.ValidationError = js.native
  var cache: CacheConfiguration = js.native
  /**
    * A special value used with `any.allow()`, `any.invalid()`, and `any.valid()` as the first value to reset any previously set values.
    */
  var `override`: js.Symbol = js.native
  /**
    * Current version of the joi package.
    */
  var version: String = js.native
  // --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
  // Below are undocumented APIs. use at your own risk
  // --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
  /**
    * Whitelists a value
    */
  def allow(values: js.Any*): Schema = js.native
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
  def any(): AnySchema = js.native
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
  def assert(value: js.Any, schema: SchemaLike): Unit = js.native
  def assert(value: js.Any, schema: SchemaLike, message: String): Unit = js.native
  def assert(value: js.Any, schema: SchemaLike, message: String, options: ValidationOptions): Unit = js.native
  def assert(value: js.Any, schema: SchemaLike, message: Error): Unit = js.native
  def assert(value: js.Any, schema: SchemaLike, message: Error, options: ValidationOptions): Unit = js.native
  def assert(value: js.Any, schema: SchemaLike, options: ValidationOptions): Unit = js.native
  /**
    * Validates a value against a schema, returns valid object, and throws if validation fails.
    *
    * @param value - the value to validate.
    * @param schema - the schema object.
    * @param message - optional message string prefix added in front of the error message. may also be an Error object.
    */
  def attempt(value: js.Any, schema: SchemaLike): js.Any = js.native
  def attempt(value: js.Any, schema: SchemaLike, message: String): js.Any = js.native
  def attempt(value: js.Any, schema: SchemaLike, message: String, options: ValidationOptions): js.Any = js.native
  def attempt(value: js.Any, schema: SchemaLike, message: Error): js.Any = js.native
  def attempt(value: js.Any, schema: SchemaLike, message: Error, options: ValidationOptions): js.Any = js.native
  def attempt(value: js.Any, schema: SchemaLike, options: ValidationOptions): js.Any = js.native
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
  def build(args: js.Any*): js.Any = js.native
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
  def compile(schema: SchemaLike): Schema = js.native
  def compile(schema: SchemaLike, options: CompileOptions): Schema = js.native
  /**
    * Creates a custom validation schema.
    */
  def custom(fn: CustomValidator[_]): Schema = js.native
  def custom(fn: CustomValidator[_], description: String): Schema = js.native
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
  def disallow(values: js.Any*): Schema = js.native
  def equal(values: js.Any*): Schema = js.native
  /**
    * Alias of `required`.
    */
  def exist(): Schema = js.native
  /**
    * Generates a dynamic expression using a template string.
    */
  def expression(template: String): js.Any = js.native
  def expression(template: String, options: ReferenceOptions): js.Any = js.native
  /**
    * Creates a new Joi instance customized with the extension(s) you provide included.
    */
  def extend(extensions: (Extension | ExtensionFactory)*): js.Any = js.native
  /**
    * Marks a key as forbidden which will not allow any value except undefined. Used to explicitly forbid keys.
    */
  def forbidden(): Schema = js.native
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
  def invalid(values: js.Any*): Schema = js.native
  /**
    * Checks whether or not the provided argument is an expression.
    */
  def isExpression(expression: js.Any): Boolean = js.native
  /**
    * Checks whether or not the provided argument is a reference. It's especially useful if you want to post-process error messages.
    */
  def isRef(ref: js.Any): /* is @hapi/joi.@hapi/joi.Reference */ Boolean = js.native
  /**
    * Checks whether or not the provided argument is a joi schema.
    */
  def isSchema(schema: js.Any): Boolean = js.native
  def isSchema(schema: js.Any, options: CompileOptions): Boolean = js.native
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
  def not(values: js.Any*): Schema = js.native
  /**
    * Generates a schema object that matches a number data type (as well as strings that can be converted to numbers).
    */
  def number(): NumberSchema = js.native
  /**
    * Generates a schema object that matches an object data type (as well as JSON strings that have been parsed into objects).
    */
  // tslint:disable-next-line:no-unnecessary-generics
  def `object`[TSchema, T](): ObjectSchema[TSchema] = js.native
  def `object`[TSchema, T](schema: SchemaMap[T]): ObjectSchema[TSchema] = js.native
  /**
    * Marks a key as optional which will allow undefined as values. Used to annotate the schema for readability as all keys are optional by default.
    */
  def optional(): Schema = js.native
  /**
    * Unsure, maybe alias for `preferences`?
    */
  def options(args: js.Any*): js.Any = js.native
  /**
    * Overrides the global validate() options for the current key and any sub-key.
    */
  def preferences(options: ValidationOptions): Schema = js.native
  /**
    * Overrides the global validate() options for the current key and any sub-key.
    */
  def prefs(options: ValidationOptions): Schema = js.native
  /**
    * Generates a reference to the value of the named key.
    */
  def ref(key: String): Reference = js.native
  def ref(key: String, options: ReferenceOptions): Reference = js.native
  /**
    * Marks a key as required which will not allow undefined as value. All keys are optional by default.
    */
  def required(): Schema = js.native
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
  def trace(args: js.Any*): js.Any = js.native
  /**
    * Returns an object where each key is a plain joi schema type.
    * Useful for creating type shortcuts using deconstruction.
    * Note that the types are already formed and do not need to be called as functions (e.g. `string`, not `string()`).
    */
  def types(): AnonAlternatives = js.native
  def untrace(args: js.Any*): js.Any = js.native
  /**
    * Adds the provided values into the allowed whitelist and marks them as the only valid values allowed.
    */
  def valid(values: js.Any*): Schema = js.native
  /**
    * Converts the type into an alternatives type where the conditions are merged into the type definition where:
    */
  def when(ref: String, options: WhenOptions): AlternativesSchema = js.native
  def when(ref: Reference, options: WhenOptions): AlternativesSchema = js.native
  def when(ref: Schema, options: WhenSchemaOptions): AlternativesSchema = js.native
  /**
    * Generates a dynamic expression using a template string.
    */
  def x(template: String): js.Any = js.native
  def x(template: String, options: ReferenceOptions): js.Any = js.native
}

