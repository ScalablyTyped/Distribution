package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1SearchUrisResponseThreatUri extends StObject {
  
  /**
    * The cache lifetime for the returned match. Clients must not cache this response past this timestamp to avoid false positives.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ThreatList this threat belongs to.
    */
  var threatTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudWebriskV1SearchUrisResponseThreatUri {
  
  inline def apply(): SchemaGoogleCloudWebriskV1SearchUrisResponseThreatUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1SearchUrisResponseThreatUri]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1SearchUrisResponseThreatUri](x: Self) {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setThreatTypes(value: js.Array[String]): Self = StObject.set(x, "threatTypes", value.asInstanceOf[js.Any])
    
    inline def setThreatTypesNull: Self = StObject.set(x, "threatTypes", null)
    
    inline def setThreatTypesUndefined: Self = StObject.set(x, "threatTypes", js.undefined)
    
    inline def setThreatTypesVarargs(value: String*): Self = StObject.set(x, "threatTypes", js.Array(value*))
  }
}
