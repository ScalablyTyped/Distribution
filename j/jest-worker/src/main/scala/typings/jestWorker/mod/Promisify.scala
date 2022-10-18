package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  std.ReturnType<T> extends std.Promise<infer R> ? (args : std.Parameters<T>): std.Promise<R> : (args : std.Parameters<T>): std.Promise<std.ReturnType<T>>
  }}}
  */
@js.native
trait Promisify[T /* <: FunctionLike */] extends StObject
