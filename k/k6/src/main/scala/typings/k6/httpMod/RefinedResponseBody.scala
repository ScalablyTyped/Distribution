package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  RT extends 'binary' ? k6.k6.bytes : RT extends 'none' ? null : RT extends 'text' ? string : RT extends undefined ? string | null : never
  }}}
  */
@js.native
trait RefinedResponseBody[RT /* <: js.UndefOr[ResponseType] */] extends StObject
