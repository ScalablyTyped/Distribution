package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.`feature-state`
import typings.maplibreGl.maplibreGlStrings.`heatmap-density`
import typings.maplibreGl.maplibreGlStrings.`line-progress`
import typings.maplibreGl.maplibreGlStrings.feature_
import typings.maplibreGl.maplibreGlStrings.zoom
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
    
    inline def setParametersVarargs(value: (zoom | feature_ | `feature-state` | `heatmap-density` | `line-progress`)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
