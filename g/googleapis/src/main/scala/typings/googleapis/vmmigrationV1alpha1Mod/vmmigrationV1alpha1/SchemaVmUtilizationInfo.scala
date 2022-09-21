package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmUtilizationInfo extends StObject {
  
  /**
    * Utilization metrics for this VM.
    */
  var utilization: js.UndefOr[SchemaVmUtilizationMetrics] = js.undefined
  
  /**
    * The VM's ID in the source.
    */
  var vmId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of the VM in a Source of type Vmware.
    */
  var vmwareVmDetails: js.UndefOr[SchemaVmwareVmDetails] = js.undefined
}
object SchemaVmUtilizationInfo {
  
  inline def apply(): SchemaVmUtilizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmUtilizationInfo]
  }
  
  extension [Self <: SchemaVmUtilizationInfo](x: Self) {
    
    inline def setUtilization(value: SchemaVmUtilizationMetrics): Self = StObject.set(x, "utilization", value.asInstanceOf[js.Any])
    
    inline def setUtilizationUndefined: Self = StObject.set(x, "utilization", js.undefined)
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdNull: Self = StObject.set(x, "vmId", null)
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
    
    inline def setVmwareVmDetails(value: SchemaVmwareVmDetails): Self = StObject.set(x, "vmwareVmDetails", value.asInstanceOf[js.Any])
    
    inline def setVmwareVmDetailsUndefined: Self = StObject.set(x, "vmwareVmDetails", js.undefined)
  }
}
