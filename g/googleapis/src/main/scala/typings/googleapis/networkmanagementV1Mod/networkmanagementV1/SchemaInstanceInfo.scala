package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceInfo extends StObject {
  
  /**
    * Name of a Compute Engine instance.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * External IP address of the network interface.
    */
  var externalIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the network interface of a Compute Engine instance.
    */
  var interface: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Internal IP address of the network interface.
    */
  var internalIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network tags configured on the instance.
    */
  var networkTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * URI of a Compute Engine network.
    */
  var networkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Service account authorized for the instance.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a Compute Engine instance.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceInfo {
  
  inline def apply(): SchemaInstanceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceInfo]
  }
  
  extension [Self <: SchemaInstanceInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    inline def setExternalIpNull: Self = StObject.set(x, "externalIp", null)
    
    inline def setExternalIpUndefined: Self = StObject.set(x, "externalIp", js.undefined)
    
    inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNull: Self = StObject.set(x, "interface", null)
    
    inline def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
    
    inline def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    inline def setInternalIpNull: Self = StObject.set(x, "internalIp", null)
    
    inline def setInternalIpUndefined: Self = StObject.set(x, "internalIp", js.undefined)
    
    inline def setNetworkTags(value: js.Array[String]): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsNull: Self = StObject.set(x, "networkTags", null)
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
    
    inline def setNetworkTagsVarargs(value: String*): Self = StObject.set(x, "networkTags", js.Array(value*))
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriNull: Self = StObject.set(x, "networkUri", null)
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
