package typings.googleapis.policysimulatorV1Mod.policysimulatorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata extends StObject {
  
  /**
    * Time when the request was received.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1beta1ReplayOperationMetadata](x: Self) {
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
