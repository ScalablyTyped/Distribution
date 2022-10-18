package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends undefined ? std.ReadonlyArray<string> | {[methodName: string] : any} : std.ReadonlyArray<keyof T> | {[ P in keyof T ]:? T[P] extends jasmine.jasmine.Func? std.ReturnType<T[P]> : any}
  }}}
  */
@js.native
trait SpyObjMethodNames[T] extends StObject
