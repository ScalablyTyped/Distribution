package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1XraiAttribution extends StObject {
  
  /**
    * Number of steps for approximating the path integral. A good value to start is 50 and gradually increase until the sum to diff property is met within the desired error range.
    */
  var numIntegralSteps: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudMlV1XraiAttribution {
  
  inline def apply(): SchemaGoogleCloudMlV1XraiAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1XraiAttribution]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1XraiAttribution](x: Self) {
    
    inline def setNumIntegralSteps(value: Double): Self = StObject.set(x, "numIntegralSteps", value.asInstanceOf[js.Any])
    
    inline def setNumIntegralStepsNull: Self = StObject.set(x, "numIntegralSteps", null)
    
    inline def setNumIntegralStepsUndefined: Self = StObject.set(x, "numIntegralSteps", js.undefined)
  }
}
