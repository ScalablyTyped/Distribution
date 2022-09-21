package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaggedExact[Tag /* <: String */, A, O]
  extends ExactType[Tagged[Tag, Any, Any], A, O, Any]
     with _Tagged[Tag, A, O]
