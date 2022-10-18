package typings.hasura.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ key in keyof T ]:? hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSON<T[key]>> extends true? T[key] : hasura.hasura.Equals<T[key], hasura.hasura.ScalarJSONB<T[key]>> extends true? T[key] : T[key] extends hasura.hasura.ObjectType? hasura.hasura.HasuraInsertInputSingle<T[key], 'data', 'on_conflict'> : T[key] extends std.Array<hasura.hasura.ObjectType>? hasura.hasura.HasuraInsertInput<T[key][0], 'data', 'on_conflict'> : T[key]}
  }}}
  */
@js.native
trait HasuraInsertInputObject[T /* <: Record[String, Any] */] extends StObject
