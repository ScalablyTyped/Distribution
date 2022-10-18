package typings.ky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionUtilsTypesMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {-readonly [ P in keyof T ]: T[P]}
    }}}
    */
  type Mutable[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.ArrayLike<infer U> ? std.Array<[string, U]> : std.Array<{[ K in keyof T ]: [K, T[K]]}[keyof T]>
    }}}
    */
  @js.native
  trait ObjectEntries[T] extends StObject
}
