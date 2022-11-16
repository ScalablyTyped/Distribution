package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type TaggedRefinement = io-ts.io-ts.RefinementType<io-ts.io-ts.Tagged<Tag, any, any>, A, O, unknown>
}}}
to avoid circular code involving: 
- io-ts.io-ts.Tagged
- io-ts.io-ts.TaggedExact
- io-ts.io-ts.TaggedIntersection
- io-ts.io-ts.TaggedIntersectionArgument
- io-ts.io-ts.TaggedRefinement
*/
@js.native
trait TaggedRefinement[Tag /* <: String */, A, O]
  extends RefinementType[Tagged[Tag, Any, Any], A, O, Any]
     with _Tagged[Tag, A, O]
