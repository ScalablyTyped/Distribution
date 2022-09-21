package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1SearchHashesResponseThreatHash extends StObject {
  
  /**
    * The cache lifetime for the returned match. Clients must not cache this response past this timestamp to avoid false positives.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A 32 byte SHA256 hash. This field is in binary format. For JSON requests, hashes are base64-encoded.
    */
  var hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ThreatList this threat belongs to. This must contain at least one entry.
    */
  var threatTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudWebriskV1SearchHashesResponseThreatHash {
  
  inline def apply(): SchemaGoogleCloudWebriskV1SearchHashesResponseThreatHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1SearchHashesResponseThreatHash]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1SearchHashesResponseThreatHash](x: Self) {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashNull: Self = StObject.set(x, "hash", null)
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setThreatTypes(value: js.Array[String]): Self = StObject.set(x, "threatTypes", value.asInstanceOf[js.Any])
    
    inline def setThreatTypesNull: Self = StObject.set(x, "threatTypes", null)
    
    inline def setThreatTypesUndefined: Self = StObject.set(x, "threatTypes", js.undefined)
    
    inline def setThreatTypesVarargs(value: String*): Self = StObject.set(x, "threatTypes", js.Array(value*))
  }
}
