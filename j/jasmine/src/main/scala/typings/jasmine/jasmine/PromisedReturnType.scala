package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Obtains the promised type that a promise-returning function resolves to.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Fn extends (args : ...any): std.PromiseLike<infer TResult> ? TResult : never
  }}}
  */
@js.native
trait PromisedReturnType[Fn /* <: Func */] extends StObject
