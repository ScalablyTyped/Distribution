package typings.lowercaseObjectKeys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Object */](`object`: T): LowercaseObjectKeysResult[T] = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[LowercaseObjectKeysResult[T]]
  
  @JSImport("lowercase-object-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T as K extends string? std.Lowercase<K> : K ]: T[K]}
    }}}
    */
  @js.native
  trait LowercaseObjectKeysResult[T /* <: js.Object */] extends StObject
}
