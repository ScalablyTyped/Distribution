package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceReference extends StObject {
  
  /** The unique identifier of the Compute Engine instance. */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /** The user-friendly name of the Compute Engine instance. */
  var instanceName: js.UndefOr[String] = js.undefined
  
  /** The public ECIES key used for sharing data with this instance. */
  var publicEciesKey: js.UndefOr[String] = js.undefined
  
  /** The public RSA key used for sharing data with this instance. */
  var publicKey: js.UndefOr[String] = js.undefined
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
    
    inline def setPublicEciesKey(value: String): Self = StObject.set(x, "publicEciesKey", value.asInstanceOf[js.Any])
    
    inline def setPublicEciesKeyUndefined: Self = StObject.set(x, "publicEciesKey", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
  }
}
