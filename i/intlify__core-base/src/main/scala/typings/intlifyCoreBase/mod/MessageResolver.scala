package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type MessageResolver = (obj : unknown, path : @intlify/core-base.@intlify/core-base.Path): @intlify/core-base.@intlify/core-base.PathValue
}}}
to avoid circular code involving: 
- @intlify/core-base.@intlify/core-base.MessageResolver
- @intlify/core-base.@intlify/core-base.PathValue
*/
@js.native
trait MessageResolver extends StObject {
  
  def apply(obj: Any, path: Path): PathValue = js.native
}
