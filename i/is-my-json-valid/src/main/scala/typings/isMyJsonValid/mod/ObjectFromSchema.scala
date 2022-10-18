package typings.isMyJsonValid.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ Key in keyof Properties ]: Key extends Required? is-my-json-valid.is-my-json-valid.TypeFromSchema<Properties[Key]> : is-my-json-valid.is-my-json-valid.TypeFromSchema<Properties[Key]> | undefined}
  }}}
  */
@js.native
trait ObjectFromSchema[Properties /* <: Record[String, AnySchema] */, Required /* <: StringKeys[Properties] */] extends StObject
