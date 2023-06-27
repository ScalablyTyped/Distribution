package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`feature-state`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`heatmap-density`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`line-progress`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.feature
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionSpecificationDefinition extends StObject {
  
  var interpolated: Boolean
  
  var parameters: ExpressionParameters
}
object ExpressionSpecificationDefinition {
  
  inline def apply(interpolated: Boolean, parameters: ExpressionParameters): ExpressionSpecificationDefinition = {
    val __obj = js.Dynamic.literal(interpolated = interpolated.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionSpecificationDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpressionSpecificationDefinition] (val x: Self) extends AnyVal {
    
    inline def setInterpolated(value: Boolean): Self = StObject.set(x, "interpolated", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ExpressionParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (zoom | feature | `feature-state` | `heatmap-density` | `line-progress`)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
