package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1SystemTimestamps extends StObject {
  
  /** The creation time of the resource within the given system. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The expiration time of the resource within the given system. Currently only apllicable to BigQuery resources. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** The last-modified time of the resource within the given system. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1SystemTimestamps {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1SystemTimestamps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SystemTimestamps]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SystemTimestampsMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1SystemTimestamps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
