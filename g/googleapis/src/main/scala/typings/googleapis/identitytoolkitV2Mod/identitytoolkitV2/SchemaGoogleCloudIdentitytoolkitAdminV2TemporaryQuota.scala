package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2TemporaryQuota extends StObject {
  
  /**
    * Corresponds to the 'refill_token_count' field in QuotaServer config
    */
  var quota: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How long this quota will be active for
    */
  var quotaDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When this quota will take affect
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2TemporaryQuota {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2TemporaryQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2TemporaryQuota]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2TemporaryQuota](x: Self) {
    
    inline def setQuota(value: String): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaDuration(value: String): Self = StObject.set(x, "quotaDuration", value.asInstanceOf[js.Any])
    
    inline def setQuotaDurationNull: Self = StObject.set(x, "quotaDuration", null)
    
    inline def setQuotaDurationUndefined: Self = StObject.set(x, "quotaDuration", js.undefined)
    
    inline def setQuotaNull: Self = StObject.set(x, "quota", null)
    
    inline def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
