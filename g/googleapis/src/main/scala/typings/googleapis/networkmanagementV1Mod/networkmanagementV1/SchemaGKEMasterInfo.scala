package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGKEMasterInfo extends StObject {
  
  /**
    * URI of a GKE cluster network.
    */
  var clusterNetworkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a GKE cluster.
    */
  var clusterUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * External IP address of a GKE cluster master.
    */
  var externalIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Internal IP address of a GKE cluster master.
    */
  var internalIp: js.UndefOr[String | Null] = js.undefined
}
object SchemaGKEMasterInfo {
  
  inline def apply(): SchemaGKEMasterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGKEMasterInfo]
  }
  
  extension [Self <: SchemaGKEMasterInfo](x: Self) {
    
    inline def setClusterNetworkUri(value: String): Self = StObject.set(x, "clusterNetworkUri", value.asInstanceOf[js.Any])
    
    inline def setClusterNetworkUriNull: Self = StObject.set(x, "clusterNetworkUri", null)
    
    inline def setClusterNetworkUriUndefined: Self = StObject.set(x, "clusterNetworkUri", js.undefined)
    
    inline def setClusterUri(value: String): Self = StObject.set(x, "clusterUri", value.asInstanceOf[js.Any])
    
    inline def setClusterUriNull: Self = StObject.set(x, "clusterUri", null)
    
    inline def setClusterUriUndefined: Self = StObject.set(x, "clusterUri", js.undefined)
    
    inline def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    inline def setExternalIpNull: Self = StObject.set(x, "externalIp", null)
    
    inline def setExternalIpUndefined: Self = StObject.set(x, "externalIp", js.undefined)
    
    inline def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    inline def setInternalIpNull: Self = StObject.set(x, "internalIp", null)
    
    inline def setInternalIpUndefined: Self = StObject.set(x, "internalIp", js.undefined)
  }
}
