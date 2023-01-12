package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulPolicyPreservedState extends StObject {
  
  /** Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks. */
  var disks: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.StatefulPolicyPreservedStateDiskDevice} */ js.Any
  ] = js.undefined
}
object StatefulPolicyPreservedState {
  
  inline def apply(): StatefulPolicyPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPolicyPreservedState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatefulPolicyPreservedState] (val x: Self) extends AnyVal {
    
    inline def setDisks(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.StatefulPolicyPreservedStateDiskDevice} */ js.Any
    ): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
  }
}
