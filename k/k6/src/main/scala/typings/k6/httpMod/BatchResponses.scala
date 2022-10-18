package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof Q ]: Q[K] extends k6.k6/http.RefinedBatchRequest<infer RT>? k6.k6/http.RefinedResponse<RT> : never}
  }}}
  */
@js.native
trait BatchResponses[Q] extends StObject
