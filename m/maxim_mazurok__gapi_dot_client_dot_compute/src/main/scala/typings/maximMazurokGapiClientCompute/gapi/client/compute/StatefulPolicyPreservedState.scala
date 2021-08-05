package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulPolicyPreservedState extends StObject {
  
  /** Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks. */
  var disks: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.StatefulPolicyPreservedStateDiskDevice}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.StatefulPolicyPreservedState & TopLevel[js.Any]
  ] = js.undefined
}
object StatefulPolicyPreservedState {
  
  inline def apply(): StatefulPolicyPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPolicyPreservedState]
  }
  
  extension [Self <: StatefulPolicyPreservedState](x: Self) {
    
    inline def setDisks(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.StatefulPolicyPreservedStateDiskDevice}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.StatefulPolicyPreservedState & TopLevel[js.Any]
    ): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
  }
}
