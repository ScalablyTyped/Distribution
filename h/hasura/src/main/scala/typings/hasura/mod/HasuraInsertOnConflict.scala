package typings.hasura.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ oc in OC ]:? {  constraint :string,   update_columns :std.Array<keyof T>,   where :hasura.hasura.WhereBoolExp<T> | undefined}}
  }}}
  */
@js.native
trait HasuraInsertOnConflict[T /* <: Record[String, Any] */, OC /* <: String */] extends StObject
