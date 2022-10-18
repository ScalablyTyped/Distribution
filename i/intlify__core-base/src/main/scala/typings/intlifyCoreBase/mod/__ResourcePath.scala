package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Key extends string ? T[Key] extends std.Record<string, any> ? / * template literal string: ${Key}.${__ResourcePath<T[Key],Exclude<keyofT[Key],keyofany[]>>&string} * / string : never : never
  }}}
  */
@js.native
trait __ResourcePath[T, Key /* <: /* keyof T */ String */] extends StObject
