package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EkmConnection extends StObject {
  
  /** Output only. The time at which the EkmConnection was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. This checksum is computed by the server based on the value of other fields, and may be sent on update requests to ensure the client has an up-to-date value before
    * proceeding.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name for the EkmConnection in the format `projects/ *‍/locations/ *‍/ekmConnections/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** A list of ServiceResolvers where the EKM can be reached. There should be one ServiceResolver per EKM replica. Currently, only a single ServiceResolver is supported. */
  var serviceResolvers: js.UndefOr[js.Array[ServiceResolver]] = js.undefined
}
object EkmConnection {
  
  inline def apply(): EkmConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EkmConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EkmConnection] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceResolvers(value: js.Array[ServiceResolver]): Self = StObject.set(x, "serviceResolvers", value.asInstanceOf[js.Any])
    
    inline def setServiceResolversUndefined: Self = StObject.set(x, "serviceResolvers", js.undefined)
    
    inline def setServiceResolversVarargs(value: ServiceResolver*): Self = StObject.set(x, "serviceResolvers", js.Array(value*))
  }
}
