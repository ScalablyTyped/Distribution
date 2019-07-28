package typings.joi.joiMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("joi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def allow(value: js.Any, values: js.Any*): Schema = js.native
  def allow(values: js.Array[_]): Schema = js.native
  def alt(types: SchemaLike*): AlternativesSchema = js.native
  def alt(types: js.Array[SchemaLike]): AlternativesSchema = js.native
  def alternatives(types: SchemaLike*): AlternativesSchema = js.native
  def alternatives(types: js.Array[SchemaLike]): AlternativesSchema = js.native
  def any(): AnySchema = js.native
  def array(): ArraySchema = js.native
  def assert(value: js.Any, schema: SchemaLike): Unit = js.native
  def assert(value: js.Any, schema: SchemaLike, message: String): Unit = js.native
  def assert(value: js.Any, schema: SchemaLike, message: Error): Unit = js.native
  def attempt[T](value: T, schema: SchemaLike): T = js.native
  def attempt[T](value: T, schema: SchemaLike, message: String): T = js.native
  def attempt[T](value: T, schema: SchemaLike, message: Error): T = js.native
  def binary(): BinarySchema = js.native
  def bool(): BooleanSchema = js.native
  def boolean(): BooleanSchema = js.native
  def compile(schema: SchemaLike): Schema = js.native
  def concat[T](schema: T): T = js.native
  def date(): DateSchema = js.native
  def defaults(fn: DefaultsFunction): Root = js.native
  def describe(schema: Schema): Description = js.native
  def description(desc: String): Schema = js.native
  def disallow(value: js.Any, values: js.Any*): Schema = js.native
  def disallow(values: js.Array[_]): Schema = js.native
  def empty(): Schema = js.native
  def empty(schema: js.Any): Schema = js.native
  def equal(value: js.Any, values: js.Any*): Schema = js.native
  def equal(values: js.Array[_]): Schema = js.native
  def example(value: js.Any): Schema = js.native
  def exist(): Schema = js.native
  def extend(extension: js.Array[Extension], extensions: (Extension | js.Array[Extension])*): js.Any = js.native
  def extend(extension: Extension, extensions: (Extension | js.Array[Extension])*): js.Any = js.native
  def forbidden(): Schema = js.native
  def func(): FunctionSchema = js.native
  def invalid(value: js.Any, values: js.Any*): Schema = js.native
  def invalid(values: js.Array[_]): Schema = js.native
  def isRef(ref: js.Any): /* is joi.joi.Reference */ Boolean = js.native
  def label(name: String): Schema = js.native
  def `lazy`(cb: js.Function0[Schema]): LazySchema = js.native
  def `lazy`(cb: js.Function0[Schema], options: LazyOptions): LazySchema = js.native
  def meta(meta: js.Object): Schema = js.native
  def not(value: js.Any, values: js.Any*): Schema = js.native
  def not(values: js.Array[_]): Schema = js.native
  def notes(notes: String): Schema = js.native
  def notes(notes: js.Array[String]): Schema = js.native
  def number(): NumberSchema = js.native
  def `object`(): ObjectSchema = js.native
  def `object`(schema: SchemaMap): ObjectSchema = js.native
  def only(value: js.Any, values: js.Any*): Schema = js.native
  def only(values: js.Array[_]): Schema = js.native
  def optional(): Schema = js.native
  def options(options: ValidationOptions): Schema = js.native
  def raw(): Schema = js.native
  def raw(isRaw: Boolean): Schema = js.native
  def reach(schema: ObjectSchema, path: String): Schema = js.native
  def reach(schema: ObjectSchema, path: js.Array[String]): Schema = js.native
  def ref(key: String): Reference = js.native
  def ref(key: String, options: ReferenceOptions): Reference = js.native
  def required(): Schema = js.native
  def strict(): Schema = js.native
  def strict(isStrict: Boolean): Schema = js.native
  def string(): StringSchema = js.native
  def strip(): Schema = js.native
  def symbol(): SymbolSchema = js.native
  def tags(notes: String): Schema = js.native
  def tags(notes: js.Array[String]): Schema = js.native
  def unit(name: String): Schema = js.native
  def valid(value: js.Any, values: js.Any*): Schema = js.native
  def valid(values: js.Array[_]): Schema = js.native
  def validate[T](value: T, schema: SchemaLike): ValidationResult[T] = js.native
  def validate[T](value: T, schema: SchemaLike, options: ValidationOptions): ValidationResult[T] = js.native
  def validate[T, R](value: T, schema: SchemaLike, callback: js.Function2[/* err */ ValidationError, /* value */ T, R]): R = js.native
  def validate[T, R](
    value: T,
    schema: SchemaLike,
    options: ValidationOptions,
    callback: js.Function2[/* err */ ValidationError, /* value */ T, R]
  ): R = js.native
  def when(ref: String, options: WhenOptions): AlternativesSchema = js.native
  def when(ref: Reference, options: WhenOptions): AlternativesSchema = js.native
  def when(ref: Schema, options: WhenSchemaOptions): AlternativesSchema = js.native
}

