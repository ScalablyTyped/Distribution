package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterMetadata extends StObject {
  
  /** The time at which the operation failed or was completed successfully. */
  var finishTime: js.UndefOr[String] = js.undefined
  
  /** The request that prompted the initiation of this UpdateCluster operation. */
  var originalRequest: js.UndefOr[Cluster] = js.undefined
  
  /** The time at which the original request was received. */
  var requestTime: js.UndefOr[String] = js.undefined
}
object UpdateClusterMetadata {
  
  inline def apply(): UpdateClusterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateClusterMetadata] (val x: Self) extends AnyVal {
    
    inline def setFinishTime(value: String): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeUndefined: Self = StObject.set(x, "finishTime", js.undefined)
    
    inline def setOriginalRequest(value: Cluster): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    inline def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
  }
}
