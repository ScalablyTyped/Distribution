package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1SampledShapleyAttribution extends StObject {
  
  /**
    * The number of feature permutations to consider when approximating the Shapley values.
    */
  var numPaths: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudMlV1SampledShapleyAttribution {
  
  inline def apply(): SchemaGoogleCloudMlV1SampledShapleyAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1SampledShapleyAttribution]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1SampledShapleyAttribution](x: Self) {
    
    inline def setNumPaths(value: Double): Self = StObject.set(x, "numPaths", value.asInstanceOf[js.Any])
    
    inline def setNumPathsNull: Self = StObject.set(x, "numPaths", null)
    
    inline def setNumPathsUndefined: Self = StObject.set(x, "numPaths", js.undefined)
  }
}
