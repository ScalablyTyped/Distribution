package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1IntegratedGradientsAttribution extends StObject {
  
  /**
    * Number of steps for approximating the path integral. A good value to start is 50 and gradually increase until the sum to diff property is met within the desired error range.
    */
  var numIntegralSteps: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudMlV1IntegratedGradientsAttribution {
  
  inline def apply(): SchemaGoogleCloudMlV1IntegratedGradientsAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1IntegratedGradientsAttribution]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1IntegratedGradientsAttribution](x: Self) {
    
    inline def setNumIntegralSteps(value: Double): Self = StObject.set(x, "numIntegralSteps", value.asInstanceOf[js.Any])
    
    inline def setNumIntegralStepsNull: Self = StObject.set(x, "numIntegralSteps", null)
    
    inline def setNumIntegralStepsUndefined: Self = StObject.set(x, "numIntegralSteps", js.undefined)
  }
}
