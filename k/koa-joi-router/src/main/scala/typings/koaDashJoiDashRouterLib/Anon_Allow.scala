package typings
package koaDashJoiDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Allow extends js.Object {
  val version: java.lang.String = js.native
  def allow(value: js.Any, values: js.Any*): joiLib.joiMod.Schema = js.native
  def allow(values: js.Array[_]): joiLib.joiMod.Schema = js.native
  def alt(types: joiLib.joiMod.SchemaLike*): joiLib.joiMod.AlternativesSchema = js.native
  def alt(types: js.Array[joiLib.joiMod.SchemaLike]): joiLib.joiMod.AlternativesSchema = js.native
  def alternatives(types: joiLib.joiMod.SchemaLike*): joiLib.joiMod.AlternativesSchema = js.native
  def alternatives(types: js.Array[joiLib.joiMod.SchemaLike]): joiLib.joiMod.AlternativesSchema = js.native
  def any(): joiLib.joiMod.AnySchema = js.native
  def array(): joiLib.joiMod.ArraySchema = js.native
  def assert(value: js.Any, schema: joiLib.joiMod.SchemaLike): scala.Unit = js.native
  def assert(value: js.Any, schema: joiLib.joiMod.SchemaLike, message: java.lang.String): scala.Unit = js.native
  def assert(value: js.Any, schema: joiLib.joiMod.SchemaLike, message: stdLib.Error): scala.Unit = js.native
  def attempt[T](value: T, schema: joiLib.joiMod.SchemaLike): T = js.native
  def attempt[T](value: T, schema: joiLib.joiMod.SchemaLike, message: java.lang.String): T = js.native
  def attempt[T](value: T, schema: joiLib.joiMod.SchemaLike, message: stdLib.Error): T = js.native
  def binary(): joiLib.joiMod.BinarySchema = js.native
  def bool(): joiLib.joiMod.BooleanSchema = js.native
  def boolean(): joiLib.joiMod.BooleanSchema = js.native
  def compile(schema: joiLib.joiMod.SchemaLike): joiLib.joiMod.Schema = js.native
  def concat[T](schema: T): T = js.native
  def date(): joiLib.joiMod.DateSchema = js.native
  def defaults(fn: joiLib.joiMod.DefaultsFunction): joiLib.joiMod.Root = js.native
  def describe(schema: joiLib.joiMod.Schema): joiLib.joiMod.Description = js.native
  def description(desc: java.lang.String): joiLib.joiMod.Schema = js.native
  def disallow(value: js.Any, values: js.Any*): joiLib.joiMod.Schema = js.native
  def disallow(values: js.Array[_]): joiLib.joiMod.Schema = js.native
  def empty(): joiLib.joiMod.Schema = js.native
  def empty(schema: js.Any): joiLib.joiMod.Schema = js.native
  def equal(value: js.Any, values: js.Any*): joiLib.joiMod.Schema = js.native
  def equal(values: js.Array[_]): joiLib.joiMod.Schema = js.native
  def example(value: js.Any): joiLib.joiMod.Schema = js.native
  def exist(): joiLib.joiMod.Schema = js.native
  def extend(
    extension: joiLib.joiMod.Extension,
    extensions: (joiLib.joiMod.Extension | js.Array[joiLib.joiMod.Extension])*
  ): js.Any = js.native
  def extend(
    extension: js.Array[joiLib.joiMod.Extension],
    extensions: (joiLib.joiMod.Extension | js.Array[joiLib.joiMod.Extension])*
  ): js.Any = js.native
  def forbidden(): joiLib.joiMod.Schema = js.native
  def func(): joiLib.joiMod.FunctionSchema = js.native
  def invalid(value: js.Any, values: js.Any*): joiLib.joiMod.Schema = js.native
  def invalid(values: js.Array[_]): joiLib.joiMod.Schema = js.native
  def isRef(ref: js.Any): /* is joi.joi.Reference */ scala.Boolean = js.native
  def label(name: java.lang.String): joiLib.joiMod.Schema = js.native
  def `lazy`(cb: js.Function0[joiLib.joiMod.Schema]): joiLib.joiMod.LazySchema = js.native
  def `lazy`(cb: js.Function0[joiLib.joiMod.Schema], options: joiLib.joiMod.LazyOptions): joiLib.joiMod.LazySchema = js.native
  def meta(meta: js.Object): joiLib.joiMod.Schema = js.native
  def not(value: js.Any, values: js.Any*): joiLib.joiMod.Schema = js.native
  def not(values: js.Array[_]): joiLib.joiMod.Schema = js.native
  def notes(notes: java.lang.String): joiLib.joiMod.Schema = js.native
  def notes(notes: js.Array[java.lang.String]): joiLib.joiMod.Schema = js.native
  def number(): joiLib.joiMod.NumberSchema = js.native
  def `object`(): joiLib.joiMod.ObjectSchema = js.native
  def `object`(schema: joiLib.joiMod.SchemaMap): joiLib.joiMod.ObjectSchema = js.native
  def only(value: js.Any, values: js.Any*): joiLib.joiMod.Schema = js.native
  def only(values: js.Array[_]): joiLib.joiMod.Schema = js.native
  def optional(): joiLib.joiMod.Schema = js.native
  def options(options: joiLib.joiMod.ValidationOptions): joiLib.joiMod.Schema = js.native
  def raw(): joiLib.joiMod.Schema = js.native
  def raw(isRaw: scala.Boolean): joiLib.joiMod.Schema = js.native
  def reach(schema: joiLib.joiMod.ObjectSchema, path: java.lang.String): joiLib.joiMod.Schema = js.native
  def reach(schema: joiLib.joiMod.ObjectSchema, path: js.Array[java.lang.String]): joiLib.joiMod.Schema = js.native
  def ref(key: java.lang.String): joiLib.joiMod.Reference = js.native
  def ref(key: java.lang.String, options: joiLib.joiMod.ReferenceOptions): joiLib.joiMod.Reference = js.native
  def required(): joiLib.joiMod.Schema = js.native
  def strict(): joiLib.joiMod.Schema = js.native
  def strict(isStrict: scala.Boolean): joiLib.joiMod.Schema = js.native
  def string(): joiLib.joiMod.StringSchema = js.native
  def strip(): joiLib.joiMod.Schema = js.native
  def symbol(): joiLib.joiMod.SymbolSchema = js.native
  def tags(notes: java.lang.String): joiLib.joiMod.Schema = js.native
  def tags(notes: js.Array[java.lang.String]): joiLib.joiMod.Schema = js.native
  def unit(name: java.lang.String): joiLib.joiMod.Schema = js.native
  def valid(value: js.Any, values: js.Any*): joiLib.joiMod.Schema = js.native
  def valid(values: js.Array[_]): joiLib.joiMod.Schema = js.native
  def validate[T](value: T, schema: joiLib.joiMod.SchemaLike): joiLib.joiMod.ValidationResult[T] = js.native
  def validate[T](value: T, schema: joiLib.joiMod.SchemaLike, options: joiLib.joiMod.ValidationOptions): joiLib.joiMod.ValidationResult[T] = js.native
  def validate[T, R](
    value: T,
    schema: joiLib.joiMod.SchemaLike,
    callback: js.Function2[/* err */ joiLib.joiMod.ValidationError, /* value */ T, R]
  ): R = js.native
  def validate[T, R](
    value: T,
    schema: joiLib.joiMod.SchemaLike,
    options: joiLib.joiMod.ValidationOptions,
    callback: js.Function2[/* err */ joiLib.joiMod.ValidationError, /* value */ T, R]
  ): R = js.native
  def when(ref: java.lang.String, options: joiLib.joiMod.WhenOptions): joiLib.joiMod.AlternativesSchema = js.native
  def when(ref: joiLib.joiMod.Reference, options: joiLib.joiMod.WhenOptions): joiLib.joiMod.AlternativesSchema = js.native
  def when(ref: joiLib.joiMod.Schema, options: joiLib.joiMod.WhenSchemaOptions): joiLib.joiMod.AlternativesSchema = js.native
}

