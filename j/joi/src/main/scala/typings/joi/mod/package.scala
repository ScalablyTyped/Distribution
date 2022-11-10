package typings.joi.mod

import typings.joi.joiBooleans.`false`
import typings.joi.joiBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BasicType = Boolean | Double | String | js.Array[Any] | js.Object | Null

type CoerceFunction = js.Function2[/* value */ Any, /* helpers */ CustomHelpers[Any], CoerceResult]

type ComparatorFunction = js.Function2[/* a */ Any, /* b */ Any, Boolean]

type CustomValidator[V] = js.Function2[/* value */ V, /* helpers */ CustomHelpers[Any], V | ErrorReport]

type ExtensionBoundSchema = Schema[Any] & SchemaInternals

type ExtensionFactory = js.Function1[/* joi */ Root, Extension]

type ExternalValidationFunction[V] = js.Function2[/* value */ V, /* helpers */ ExternalHelpers, js.UndefOr[V]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  true extends joi.joi.IsUnion<T, T> ? true extends joi.joi.IsPrimitiveSubset<T> ? false : true : false
  }}}
  */
type IsNonPrimitiveSubsetUnion[T] = `false`

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [T] extends [string] ? true : [T] extends [number] ? true : [T] extends [bigint] ? true : [T] extends [boolean] ? true : [T] extends [symbol] ? true : [T] extends [null] ? true : [T] extends [undefined] ? true : false
  }}}
  */
type IsPrimitiveSubset[T] = `true`

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends unknown ? [U] extends [T] ? false : true : false
  }}}
  */
type IsUnion[T, U /* <: T */] = `false`

type LanguageMessages = Record[String, String]

type NullableType[T] = js.UndefOr[Null | T]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  true extends joi.joi.IsNonPrimitiveSubsetUnion<std.Exclude<T, undefined | null>> ? joi.joi.AlternativesSchema<any> : T extends joi.joi.NullableType<string> ? joi.joi.StringSchema<string> : T extends joi.joi.NullableType<number> ? joi.joi.NumberSchema<number> : T extends joi.joi.NullableType<bigint> ? joi.joi.NumberSchema<number> : T extends joi.joi.NullableType<boolean> ? joi.joi.BooleanSchema<boolean> : T extends joi.joi.NullableType<std.Date> ? joi.joi.DateSchema<std.Date> : T extends joi.joi.NullableType<std.Array<any>> ? joi.joi.ArraySchema<std.Array<any>> : T extends joi.joi.NullableType<object> ? joi.joi.StrictSchemaMap<T> | joi.joi.ObjectSchema<T> : never
  }}}
  */
type ObjectPropertiesSchema[T] = AlternativesSchema[Any]

type SchemaFunction = js.Function1[/* schema */ Schema[Any], Schema[Any]]

type SchemaLike = SchemaLikeWithoutArray | js.Object

type SchemaLikeWithoutArray = String | Double | Boolean | Null | Schema[Any] | (SchemaMap[Any, `false`])

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  isStrict extends true ? joi.joi.StrictSchemaMap<TSchema> : joi.joi.PartialSchemaMap<TSchema>
  }}}
  */
type SchemaMap[TSchema, isStrict] = StrictSchemaMap[TSchema]

type ValidationErrorFunction = js.Function1[/* errors */ js.Array[ErrorReport], String | ValidationErrorItem | js.Error]
