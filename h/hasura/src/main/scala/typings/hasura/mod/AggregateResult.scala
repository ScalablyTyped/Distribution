package typings.hasura.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  hasura.hasura.NumberScalarKeys<T> extends never ? hasura.hasura.BaseAggregateResult<T> : hasura.hasura.NumberAggregateResult<T, hasura.hasura.NumberScalarKeys<T>>
  }}}
  */
@js.native
trait AggregateResult[T] extends StObject
