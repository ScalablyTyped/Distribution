package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDnskeysGet
  extends StObject
     with StandardParameters {
  
  /**
    * For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    */
  var clientOperationId: js.UndefOr[String] = js.undefined
  
  /**
    * An optional comma-separated list of digest types to compute and display for key signing keys. If omitted, the recommended digest type is computed and displayed.
    */
  var digestType: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the requested DnsKey.
    */
  var dnsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    */
  var managedZone: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the project addressed by this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceDnskeysGet {
  
  inline def apply(): ParamsResourceDnskeysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDnskeysGet]
  }
  
  extension [Self <: ParamsResourceDnskeysGet](x: Self) {
    
    inline def setClientOperationId(value: String): Self = StObject.set(x, "clientOperationId", value.asInstanceOf[js.Any])
    
    inline def setClientOperationIdUndefined: Self = StObject.set(x, "clientOperationId", js.undefined)
    
    inline def setDigestType(value: String): Self = StObject.set(x, "digestType", value.asInstanceOf[js.Any])
    
    inline def setDigestTypeUndefined: Self = StObject.set(x, "digestType", js.undefined)
    
    inline def setDnsKeyId(value: String): Self = StObject.set(x, "dnsKeyId", value.asInstanceOf[js.Any])
    
    inline def setDnsKeyIdUndefined: Self = StObject.set(x, "dnsKeyId", js.undefined)
    
    inline def setManagedZone(value: String): Self = StObject.set(x, "managedZone", value.asInstanceOf[js.Any])
    
    inline def setManagedZoneUndefined: Self = StObject.set(x, "managedZone", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
