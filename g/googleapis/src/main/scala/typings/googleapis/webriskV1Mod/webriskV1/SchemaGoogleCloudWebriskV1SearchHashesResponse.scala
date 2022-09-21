package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1SearchHashesResponse extends StObject {
  
  /**
    * For requested entities that did not match the threat list, how long to cache the response until.
    */
  var negativeExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full hashes that matched the requested prefixes. The hash will be populated in the key.
    */
  var threats: js.UndefOr[js.Array[SchemaGoogleCloudWebriskV1SearchHashesResponseThreatHash]] = js.undefined
}
object SchemaGoogleCloudWebriskV1SearchHashesResponse {
  
  inline def apply(): SchemaGoogleCloudWebriskV1SearchHashesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1SearchHashesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1SearchHashesResponse](x: Self) {
    
    inline def setNegativeExpireTime(value: String): Self = StObject.set(x, "negativeExpireTime", value.asInstanceOf[js.Any])
    
    inline def setNegativeExpireTimeNull: Self = StObject.set(x, "negativeExpireTime", null)
    
    inline def setNegativeExpireTimeUndefined: Self = StObject.set(x, "negativeExpireTime", js.undefined)
    
    inline def setThreats(value: js.Array[SchemaGoogleCloudWebriskV1SearchHashesResponseThreatHash]): Self = StObject.set(x, "threats", value.asInstanceOf[js.Any])
    
    inline def setThreatsUndefined: Self = StObject.set(x, "threats", js.undefined)
    
    inline def setThreatsVarargs(value: SchemaGoogleCloudWebriskV1SearchHashesResponseThreatHash*): Self = StObject.set(x, "threats", js.Array(value*))
  }
}
