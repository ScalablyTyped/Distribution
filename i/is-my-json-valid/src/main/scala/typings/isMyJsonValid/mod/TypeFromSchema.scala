package typings.isMyJsonValid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Schema extends is-my-json-valid.is-my-json-valid.EnumSchema<infer Enum> ? Enum : Schema extends is-my-json-valid.is-my-json-valid.NullSchema ? null : Schema extends is-my-json-valid.is-my-json-valid.BooleanSchema ? boolean : Schema extends is-my-json-valid.is-my-json-valid.NullableBooleanSchema ? boolean | null : Schema extends is-my-json-valid.is-my-json-valid.NumberSchema ? number : Schema extends is-my-json-valid.is-my-json-valid.NullableNumberSchema ? number | null : Schema extends is-my-json-valid.is-my-json-valid.StringSchema ? string : Schema extends is-my-json-valid.is-my-json-valid.NullableStringSchema ? string | null : Schema extends is-my-json-valid.is-my-json-valid.ArraySchema<infer ItemSchema> ? is-my-json-valid.is-my-json-valid.ArrayFromSchema<ItemSchema> : Schema extends is-my-json-valid.is-my-json-valid.NullableArraySchema<infer ItemSchema> ? is-my-json-valid.is-my-json-valid.ArrayFromSchema<ItemSchema> | null : Schema extends is-my-json-valid.is-my-json-valid.ObjectSchema<infer Properties, infer Required> ? is-my-json-valid.is-my-json-valid.ObjectFromSchema<Properties, Required> : Schema extends is-my-json-valid.is-my-json-valid.NullableObjectSchema<infer Properties, infer Required> ? is-my-json-valid.is-my-json-valid.ObjectFromSchema<Properties, Required> | null : Schema extends is-my-json-valid.is-my-json-valid.AllOptionalObjectSchema<infer Properties> ? is-my-json-valid.is-my-json-valid.ObjectFromSchema<Properties, never> : Schema extends is-my-json-valid.is-my-json-valid.NullableAllOptionalObjectSchema<infer Properties> ? is-my-json-valid.is-my-json-valid.ObjectFromSchema<Properties, never> | null : never
  }}}
  */
@js.native
trait TypeFromSchema[Schema /* <: AnySchema */] extends StObject
