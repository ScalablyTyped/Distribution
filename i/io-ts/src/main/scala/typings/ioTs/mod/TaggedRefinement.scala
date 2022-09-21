package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaggedRefinement[Tag /* <: String */, A, O]
  extends RefinementType[Tagged[Tag, Any, Any], A, O, Any]
     with _Tagged[Tag, A, O]
