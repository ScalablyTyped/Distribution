package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Obtains the type that a promise-returning function can be rejected with.
  * This is so we can use .and.rejectWith() only for functions that return a promise.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Fn extends (args : ...any): std.PromiseLike<unknown> ? any : never
  }}}
  */
@js.native
trait PromisedRejectType[Fn /* <: js.Function */] extends StObject
