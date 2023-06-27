package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Evaluate = (b : @maplibre/maplibre-gl-style-spec.@maplibre/maplibre-gl-style-spec.EvaluationContext, a : std.Array<@maplibre/maplibre-gl-style-spec.@maplibre/maplibre-gl-style-spec.Expression>): @maplibre/maplibre-gl-style-spec.@maplibre/maplibre-gl-style-spec.Value
}}}
to avoid circular code involving: 
- @maplibre/maplibre-gl-style-spec.@maplibre/maplibre-gl-style-spec.Definition
- @maplibre/maplibre-gl-style-spec.@maplibre/maplibre-gl-style-spec.Evaluate
- @maplibre/maplibre-gl-style-spec.@maplibre/maplibre-gl-style-spec.Value
*/
@js.native
trait Evaluate extends StObject {
  
  def apply(b: EvaluationContext, a: js.Array[Expression_]): Value = js.native
}
