package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaggedIntersection[Tag /* <: String */, A, O]
  extends IntersectionType[TaggedIntersectionArgument[Tag], A, O, js.Any]
     with _Tagged[Tag, A, O]
