package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1SystemTimestamps extends StObject {
  
  /** Creation timestamp of the resource within the given system. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Expiration timestamp of the resource within the given system. Currently only applicable to BigQuery resources. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /**
    * Timestamp of the last modification of the resource or its metadata within a given system. Note: Depending on the source system, not every modification updates this timestamp. For
    * example, BigQuery timestamps every metadata modification but not data or permission changes.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1SystemTimestamps {
  
  inline def apply(): GoogleCloudDatacatalogV1SystemTimestamps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1SystemTimestamps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1SystemTimestamps] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
