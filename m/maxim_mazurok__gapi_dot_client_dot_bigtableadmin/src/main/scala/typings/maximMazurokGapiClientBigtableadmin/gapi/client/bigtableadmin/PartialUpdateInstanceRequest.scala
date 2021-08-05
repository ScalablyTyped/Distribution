package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialUpdateInstanceRequest extends StObject {
  
  /** Required. The Instance which will (partially) replace the current value. */
  var instance: js.UndefOr[Instance] = js.undefined
  
  /** Required. The subset of Instance fields which should be replaced. Must be explicitly set. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object PartialUpdateInstanceRequest {
  
  inline def apply(): PartialUpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUpdateInstanceRequest]
  }
  
  extension [Self <: PartialUpdateInstanceRequest](x: Self) {
    
    inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
