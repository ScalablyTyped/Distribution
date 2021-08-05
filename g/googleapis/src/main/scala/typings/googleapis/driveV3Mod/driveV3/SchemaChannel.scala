package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An notification channel used to watch for resource changes.
  */
trait SchemaChannel extends StObject {
  
  /**
    * The address where notifications are delivered for this channel.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Date and time of notification channel expiration, expressed as a Unix
    * timestamp, in milliseconds. Optional.
    */
  var expiration: js.UndefOr[String] = js.undefined
  
  /**
    * A UUID or similar unique string that identifies this channel.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies this as a notification channel used to watch for changes to a
    * resource. Value: the fixed string &quot;api#channel&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Additional parameters controlling delivery channel behavior. Optional.
    */
  var params: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * A Boolean value to indicate whether payload is wanted. Optional.
    */
  var payload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An opaque ID that identifies the resource being watched on this channel.
    * Stable across different API versions.
    */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /**
    * A version-specific identifier for the watched resource.
    */
  var resourceUri: js.UndefOr[String] = js.undefined
  
  /**
    * An arbitrary string delivered to the target address with each
    * notification delivered over this channel. Optional.
    */
  var token: js.UndefOr[String] = js.undefined
  
  /**
    * The type of delivery mechanism used for this channel.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaChannel {
  
  inline def apply(): SchemaChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannel]
  }
  
  extension [Self <: SchemaChannel](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
