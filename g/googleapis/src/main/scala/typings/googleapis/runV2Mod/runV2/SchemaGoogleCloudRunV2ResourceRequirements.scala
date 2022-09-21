package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2ResourceRequirements extends StObject {
  
  /**
    * Determines whether CPU should be throttled or not outside of requests.
    */
  var cpuIdle: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Only memory and CPU are supported. Note: The only supported values for CPU are '1', '2', and '4'. Setting 4 CPU requires at least 2Gi of memory. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var limits: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudRunV2ResourceRequirements {
  
  inline def apply(): SchemaGoogleCloudRunV2ResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2ResourceRequirements]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2ResourceRequirements](x: Self) {
    
    inline def setCpuIdle(value: Boolean): Self = StObject.set(x, "cpuIdle", value.asInstanceOf[js.Any])
    
    inline def setCpuIdleNull: Self = StObject.set(x, "cpuIdle", null)
    
    inline def setCpuIdleUndefined: Self = StObject.set(x, "cpuIdle", js.undefined)
    
    inline def setLimits(value: StringDictionary[String]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsNull: Self = StObject.set(x, "limits", null)
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
  }
}
