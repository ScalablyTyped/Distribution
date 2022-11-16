package typings.inferno.distCoreTypesMod.Inferno

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type InfernoNodeArray = std.Array<inferno.inferno/dist/core/types.Inferno.InfernoNode>
}}}
to avoid circular code involving: 
- inferno.inferno/dist/core/types.<global>.JSX.Element
- inferno.inferno/dist/core/types.Inferno.InfernoFragment
- inferno.inferno/dist/core/types.Inferno.InfernoNode
- inferno.inferno/dist/core/types.Inferno.InfernoNodeArray
*/
@js.native
trait InfernoNodeArray
  extends StObject
     with Array[InfernoNode]
