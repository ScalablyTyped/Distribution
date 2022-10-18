package typings.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  true extends joi.joi.IsNonPrimitiveSubsetUnion<std.Exclude<T, undefined | null>> ? joi.joi.AlternativesSchema<any> : T extends joi.joi.NullableType<string> ? joi.joi.StringSchema<string> : T extends joi.joi.NullableType<number> ? joi.joi.NumberSchema<number> : T extends joi.joi.NullableType<bigint> ? joi.joi.NumberSchema<number> : T extends joi.joi.NullableType<boolean> ? joi.joi.BooleanSchema<boolean> : T extends joi.joi.NullableType<std.Date> ? joi.joi.DateSchema<std.Date> : T extends joi.joi.NullableType<std.Array<any>> ? joi.joi.ArraySchema<std.Array<any>> : T extends joi.joi.NullableType<object> ? joi.joi.StrictSchemaMap<T> | joi.joi.ObjectSchema<T> : never
  }}}
  */
@js.native
trait ObjectPropertiesSchema[T] extends StObject
