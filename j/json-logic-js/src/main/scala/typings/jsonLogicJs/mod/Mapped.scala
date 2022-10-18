package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Count['length'] extends json-logic-js.json-logic-js.MAXIMUM_ALLOWED_BOUNDARY ? Result : Tuple extends [] ? [] : Result extends [] ? json-logic-js.json-logic-js.Mapped<Tuple, Tuple, [...Count, 1]> : json-logic-js.json-logic-js.Mapped<Tuple, Result | [...Result, ...Tuple], [...Count, 1]>
  }}}
  */
@js.native
trait Mapped[Tuple /* <: js.Array[Any] */, Result /* <: js.Array[Any] */, Count /* <: js.Array[Double] */] extends StObject
