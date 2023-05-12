package typings.inferno.distCoreTypesMod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type InfernoNodeArray = std.Array<inferno.inferno/dist/core/types.InfernoNode>
}}}
to avoid circular code involving: 
- inferno.inferno/dist/core/types.InfernoFragment
- inferno.inferno/dist/core/types.InfernoNode
- inferno.inferno/dist/core/types.InfernoNodeArray
*/
@js.native
trait InfernoNodeArray
  extends StObject
     with Array[InfernoNode]
