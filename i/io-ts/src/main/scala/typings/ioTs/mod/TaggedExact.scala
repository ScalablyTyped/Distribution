package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type TaggedExact = io-ts.io-ts.ExactType<io-ts.io-ts.Tagged<Tag, any, any>, A, O, unknown>
}}}
to avoid circular code involving: 
- io-ts.io-ts.Tagged
- io-ts.io-ts.TaggedExact
*/
@js.native
trait TaggedExact[Tag /* <: String */, A, O]
  extends ExactType[Tagged[Tag, Any, Any], A, O, Any]
     with _Tagged[Tag, A, O]
