package typings.isMyJsonValid.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyAllOptionalObjectSchema = AllOptionalObjectSchema[Record[String, AnySchema]]

type AnyArraySchema = ArraySchema[AnySchema]

type AnyEnumSchema = EnumSchema[Any]

type AnyNullableAllOptionalObjectSchema = NullableAllOptionalObjectSchema[Record[String, AnySchema]]

type AnyNullableArraySchema = NullableArraySchema[AnySchema]

type AnyNullableObjectSchema = NullableObjectSchema[Record[String, AnySchema], String]

type AnyObjectSchema = ObjectSchema[Record[String, AnySchema], String]

/* Rewritten from type alias, can be one of: 
  - typings.isMyJsonValid.mod.NullSchema
  - typings.isMyJsonValid.mod.BooleanSchema
  - typings.isMyJsonValid.mod.NullableBooleanSchema
  - typings.isMyJsonValid.mod.NumberSchema
  - typings.isMyJsonValid.mod.NullableNumberSchema
  - typings.isMyJsonValid.mod.StringSchema
  - typings.isMyJsonValid.mod.NullableStringSchema
  - typings.isMyJsonValid.mod.AnyEnumSchema
  - scala.Any
  - typings.isMyJsonValid.mod.AnyOneOfSchema
*/
type AnySchema = _AnySchema | AnyEnumSchema | Any

type ArrayFromSchema[ItemSchema /* <: AnySchema */] = js.Array[TypeFromSchema[ItemSchema]]

type Filter[Schema /* <: AnySchema */, Output] = js.Function2[/* input */ Output, /* options */ js.UndefOr[Any], Output]

type StringKeys[T] = /* keyof T */ String

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Schema extends is-my-json-valid.is-my-json-valid.EnumSchema<infer Enum> ? Enum : Schema extends is-my-json-valid.is-my-json-valid.NullSchema ? null : Schema extends is-my-json-valid.is-my-json-valid.BooleanSchema ? boolean : Schema extends is-my-json-valid.is-my-json-valid.NullableBooleanSchema ? boolean | null : Schema extends is-my-json-valid.is-my-json-valid.NumberSchema ? number : Schema extends is-my-json-valid.is-my-json-valid.NullableNumberSchema ? number | null : Schema extends is-my-json-valid.is-my-json-valid.StringSchema ? string : Schema extends is-my-json-valid.is-my-json-valid.NullableStringSchema ? string | null : Schema extends is-my-json-valid.is-my-json-valid.ArraySchema<infer ItemSchema> ? is-my-json-valid.is-my-json-valid.ArrayFromSchema<ItemSchema> : Schema extends is-my-json-valid.is-my-json-valid.NullableArraySchema<infer ItemSchema> ? is-my-json-valid.is-my-json-valid.ArrayFromSchema<ItemSchema> | null : Schema extends is-my-json-valid.is-my-json-valid.ObjectSchema<infer Properties, infer Required> ? is-my-json-valid.is-my-json-valid.ObjectFromSchema<Properties, Required> : Schema extends is-my-json-valid.is-my-json-valid.NullableObjectSchema<infer Properties, infer Required> ? is-my-json-valid.is-my-json-valid.ObjectFromSchema<Properties, Required> | null : Schema extends is-my-json-valid.is-my-json-valid.AllOptionalObjectSchema<infer Properties> ? is-my-json-valid.is-my-json-valid.ObjectFromSchema<Properties, never> : Schema extends is-my-json-valid.is-my-json-valid.NullableAllOptionalObjectSchema<infer Properties> ? is-my-json-valid.is-my-json-valid.ObjectFromSchema<Properties, never> | null : never
  }}}
  */
type TypeFromSchema[Schema /* <: AnySchema */] = Null
