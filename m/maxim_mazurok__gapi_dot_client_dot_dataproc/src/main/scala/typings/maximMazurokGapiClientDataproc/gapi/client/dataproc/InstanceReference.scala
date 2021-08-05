package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceReference extends StObject {
  
  /** The unique identifier of the Compute Engine instance. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** The user-friendly name of the Compute Engine instance. */
  var instanceName: js.UndefOr[String] = js.undefined
}
object InstanceReference {
  
  inline def apply(): InstanceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceReference]
  }
  
  extension [Self <: InstanceReference](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
  }
}
