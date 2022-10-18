package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region subscribables/mappingHelpers.js
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends knockout.knockout.Subscribable<infer R> ? R : T extends std.Record<any, any> ? {[ P in keyof T ]: knockout.knockout.Unwrapped<T[P]>} : T
  }}}
  */
@js.native
trait Unwrapped[T] extends StObject
